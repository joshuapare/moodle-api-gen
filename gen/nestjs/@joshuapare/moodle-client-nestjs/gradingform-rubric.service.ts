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
import { CoreGradesGraderGradingpanelScaleFetchRequest } from '../model/core-grades-grader-gradingpanel-scale-fetch-request';
import { CoreGradesGraderGradingpanelScaleStoreRequest } from '../model/core-grades-grader-gradingpanel-scale-store-request';
import { ErrorResponse } from '../model/error-response';
import { GradingformRubricGraderGradingpanelFetch200Response } from '../model/gradingform-rubric-grader-gradingpanel-fetch200-response';
import { GradingformRubricGraderGradingpanelStore200Response } from '../model/gradingform-rubric-grader-gradingpanel-store200-response';
import { Configuration } from '../configuration';


@Injectable()
export class GradingformRubricService {

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
     * Fetch the data required to display the grader grading panel, creating the grade item if required
     * Fetch the data required to display the grader grading panel, creating the grade item if required
     * @param coreGradesGraderGradingpanelScaleFetchRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public gradingformRubricGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest: CoreGradesGraderGradingpanelScaleFetchRequest, ): Observable<AxiosResponse<GradingformRubricGraderGradingpanelFetch200Response>>;
    public gradingformRubricGraderGradingpanelFetch(coreGradesGraderGradingpanelScaleFetchRequest: CoreGradesGraderGradingpanelScaleFetchRequest, ): Observable<any> {

        if (coreGradesGraderGradingpanelScaleFetchRequest === null || coreGradesGraderGradingpanelScaleFetchRequest === undefined) {
            throw new Error('Required parameter coreGradesGraderGradingpanelScaleFetchRequest was null or undefined when calling gradingformRubricGraderGradingpanelFetch.');
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
        return this.httpClient.post<GradingformRubricGraderGradingpanelFetch200Response>(`${this.basePath}/gradingform_rubric_grader_gradingpanel_fetch`,
            coreGradesGraderGradingpanelScaleFetchRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Store the grading data for a user from the grader grading panel.
     * Store the grading data for a user from the grader grading panel.
     * @param coreGradesGraderGradingpanelScaleStoreRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public gradingformRubricGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest: CoreGradesGraderGradingpanelScaleStoreRequest, ): Observable<AxiosResponse<GradingformRubricGraderGradingpanelStore200Response>>;
    public gradingformRubricGraderGradingpanelStore(coreGradesGraderGradingpanelScaleStoreRequest: CoreGradesGraderGradingpanelScaleStoreRequest, ): Observable<any> {

        if (coreGradesGraderGradingpanelScaleStoreRequest === null || coreGradesGraderGradingpanelScaleStoreRequest === undefined) {
            throw new Error('Required parameter coreGradesGraderGradingpanelScaleStoreRequest was null or undefined when calling gradingformRubricGraderGradingpanelStore.');
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
        return this.httpClient.post<GradingformRubricGraderGradingpanelStore200Response>(`${this.basePath}/gradingform_rubric_grader_gradingpanel_store`,
            coreGradesGraderGradingpanelScaleStoreRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
