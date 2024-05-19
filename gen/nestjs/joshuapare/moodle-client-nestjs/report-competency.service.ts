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
import { ReportCompetencyDataForReport200Response } from '../model/report-competency-data-for-report200-response';
import { ReportCompetencyDataForReportRequest } from '../model/report-competency-data-for-report-request';
import { Configuration } from '../configuration';


@Injectable()
export class ReportCompetencyService {

    protected basePath = 'https://localhost/webservice/restful/server.php';
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
     * Load the data for the competency report in a course.
     * Load the data for the competency report in a course.
     * @param reportCompetencyDataForReportRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public reportCompetencyDataForReport(reportCompetencyDataForReportRequest: ReportCompetencyDataForReportRequest, ): Observable<AxiosResponse<ReportCompetencyDataForReport200Response>>;
    public reportCompetencyDataForReport(reportCompetencyDataForReportRequest: ReportCompetencyDataForReportRequest, ): Observable<any> {

        if (reportCompetencyDataForReportRequest === null || reportCompetencyDataForReportRequest === undefined) {
            throw new Error('Required parameter reportCompetencyDataForReportRequest was null or undefined when calling reportCompetencyDataForReport.');
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
        return this.httpClient.post<ReportCompetencyDataForReport200Response>(`${this.basePath}/report_competency_data_for_report`,
            reportCompetencyDataForReportRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
