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
import { CoreCalendarDeleteSubscription200Response } from '../model/core-calendar-delete-subscription200-response';
import { ErrorResponse } from '../model/error-response';
import { ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest } from '../model/mod-bigbluebuttonbn-get-bigbluebuttonbns-by-courses-request';
import { ModResourceGetResourcesByCourses200Response } from '../model/mod-resource-get-resources-by-courses200-response';
import { ModResourceViewResourceRequest } from '../model/mod-resource-view-resource-request';
import { Configuration } from '../configuration';


@Injectable()
export class ModResourceService {

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
     * Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
     * Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
     * @param modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modResourceGetResourcesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest: ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, ): Observable<AxiosResponse<ModResourceGetResourcesByCourses200Response>>;
    public modResourceGetResourcesByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest: ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, ): Observable<any> {

        if (modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest === null || modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest === undefined) {
            throw new Error('Required parameter modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest was null or undefined when calling modResourceGetResourcesByCourses.');
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
        return this.httpClient.post<ModResourceGetResourcesByCourses200Response>(`${this.basePath}/mod_resource_get_resources_by_courses`,
            modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Simulate the view.php web interface resource: trigger events, completion, etc...
     * Simulate the view.php web interface resource: trigger events, completion, etc...
     * @param modResourceViewResourceRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modResourceViewResource(modResourceViewResourceRequest: ModResourceViewResourceRequest, ): Observable<AxiosResponse<CoreCalendarDeleteSubscription200Response>>;
    public modResourceViewResource(modResourceViewResourceRequest: ModResourceViewResourceRequest, ): Observable<any> {

        if (modResourceViewResourceRequest === null || modResourceViewResourceRequest === undefined) {
            throw new Error('Required parameter modResourceViewResourceRequest was null or undefined when calling modResourceViewResource.');
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
        return this.httpClient.post<CoreCalendarDeleteSubscription200Response>(`${this.basePath}/mod_resource_view_resource`,
            modResourceViewResourceRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
