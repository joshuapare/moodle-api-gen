/**
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle\'s Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable } from 'rxjs';
import { ErrorResponse } from '../model/error-response';
import { ToolXmldbInvokeMoveActionRequest } from '../model/tool-xmldb-invoke-move-action-request';
import { Configuration } from '../configuration';


@Injectable()
export class ToolXmldbService {

    protected basePath = 'https://localhost/webservice/rest/server.php';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * moves element up/down
     * moves element up/down
     * @param toolXmldbInvokeMoveActionRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public toolXmldbInvokeMoveAction(toolXmldbInvokeMoveActionRequest: ToolXmldbInvokeMoveActionRequest, ): Observable<AxiosResponse<object>>;
    public toolXmldbInvokeMoveAction(toolXmldbInvokeMoveActionRequest: ToolXmldbInvokeMoveActionRequest, ): Observable<any> {

        if (toolXmldbInvokeMoveActionRequest === null || toolXmldbInvokeMoveActionRequest === undefined) {
            throw new Error('Required parameter toolXmldbInvokeMoveActionRequest was null or undefined when calling toolXmldbInvokeMoveAction.');
        }

        let headers = {...this.defaultHeaders};

        // authentication (apiKey) required
        if (this.configuration.apiKeys?.["Authorization"]) {
            headers['Authorization'] = this.configuration.apiKeys["Authorization"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<object>(`${this.basePath}/tool_xmldb_invoke_move_action`,
            toolXmldbInvokeMoveActionRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}