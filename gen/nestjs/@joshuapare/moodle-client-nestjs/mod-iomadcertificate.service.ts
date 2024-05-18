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
import { ModChatGetChatsByCoursesRequest } from '../model/mod-chat-get-chats-by-courses-request';
import { ModIomadcertificateGetIomadcertificatesByCourses200Response } from '../model/mod-iomadcertificate-get-iomadcertificates-by-courses200-response';
import { ModIomadcertificateGetIssuedIomadcertificates200Response } from '../model/mod-iomadcertificate-get-issued-iomadcertificates200-response';
import { ModIomadcertificateGetIssuedIomadcertificatesRequest } from '../model/mod-iomadcertificate-get-issued-iomadcertificates-request';
import { ModIomadcertificateIssueIomadcertificate200Response } from '../model/mod-iomadcertificate-issue-iomadcertificate200-response';
import { ModIomadcertificateIssueIomadcertificateRequest } from '../model/mod-iomadcertificate-issue-iomadcertificate-request';
import { Configuration } from '../configuration';


@Injectable()
export class ModIomadcertificateService {

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
     * Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
     * Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
     * @param modChatGetChatsByCoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modIomadcertificateGetIomadcertificatesByCourses(modChatGetChatsByCoursesRequest: ModChatGetChatsByCoursesRequest, ): Observable<AxiosResponse<ModIomadcertificateGetIomadcertificatesByCourses200Response>>;
    public modIomadcertificateGetIomadcertificatesByCourses(modChatGetChatsByCoursesRequest: ModChatGetChatsByCoursesRequest, ): Observable<any> {

        if (modChatGetChatsByCoursesRequest === null || modChatGetChatsByCoursesRequest === undefined) {
            throw new Error('Required parameter modChatGetChatsByCoursesRequest was null or undefined when calling modIomadcertificateGetIomadcertificatesByCourses.');
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
        return this.httpClient.post<ModIomadcertificateGetIomadcertificatesByCourses200Response>(`${this.basePath}/mod_iomadcertificate_get_iomadcertificates_by_courses`,
            modChatGetChatsByCoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get the list of issued iomadcertificates for the current user.
     * Get the list of issued iomadcertificates for the current user.
     * @param modIomadcertificateGetIssuedIomadcertificatesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modIomadcertificateGetIssuedIomadcertificates(modIomadcertificateGetIssuedIomadcertificatesRequest: ModIomadcertificateGetIssuedIomadcertificatesRequest, ): Observable<AxiosResponse<ModIomadcertificateGetIssuedIomadcertificates200Response>>;
    public modIomadcertificateGetIssuedIomadcertificates(modIomadcertificateGetIssuedIomadcertificatesRequest: ModIomadcertificateGetIssuedIomadcertificatesRequest, ): Observable<any> {

        if (modIomadcertificateGetIssuedIomadcertificatesRequest === null || modIomadcertificateGetIssuedIomadcertificatesRequest === undefined) {
            throw new Error('Required parameter modIomadcertificateGetIssuedIomadcertificatesRequest was null or undefined when calling modIomadcertificateGetIssuedIomadcertificates.');
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
        return this.httpClient.post<ModIomadcertificateGetIssuedIomadcertificates200Response>(`${this.basePath}/mod_iomadcertificate_get_issued_iomadcertificates`,
            modIomadcertificateGetIssuedIomadcertificatesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Create new iomadcertificate record, or return existing record for the current user.
     * Create new iomadcertificate record, or return existing record for the current user.
     * @param modIomadcertificateIssueIomadcertificateRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modIomadcertificateIssueIomadcertificate(modIomadcertificateIssueIomadcertificateRequest: ModIomadcertificateIssueIomadcertificateRequest, ): Observable<AxiosResponse<ModIomadcertificateIssueIomadcertificate200Response>>;
    public modIomadcertificateIssueIomadcertificate(modIomadcertificateIssueIomadcertificateRequest: ModIomadcertificateIssueIomadcertificateRequest, ): Observable<any> {

        if (modIomadcertificateIssueIomadcertificateRequest === null || modIomadcertificateIssueIomadcertificateRequest === undefined) {
            throw new Error('Required parameter modIomadcertificateIssueIomadcertificateRequest was null or undefined when calling modIomadcertificateIssueIomadcertificate.');
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
        return this.httpClient.post<ModIomadcertificateIssueIomadcertificate200Response>(`${this.basePath}/mod_iomadcertificate_issue_iomadcertificate`,
            modIomadcertificateIssueIomadcertificateRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Trigger the course module viewed event and update the module completion status.
     * Trigger the course module viewed event and update the module completion status.
     * @param modIomadcertificateIssueIomadcertificateRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modIomadcertificateViewIomadcertificate(modIomadcertificateIssueIomadcertificateRequest: ModIomadcertificateIssueIomadcertificateRequest, ): Observable<AxiosResponse<CoreCalendarDeleteSubscription200Response>>;
    public modIomadcertificateViewIomadcertificate(modIomadcertificateIssueIomadcertificateRequest: ModIomadcertificateIssueIomadcertificateRequest, ): Observable<any> {

        if (modIomadcertificateIssueIomadcertificateRequest === null || modIomadcertificateIssueIomadcertificateRequest === undefined) {
            throw new Error('Required parameter modIomadcertificateIssueIomadcertificateRequest was null or undefined when calling modIomadcertificateViewIomadcertificate.');
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
        return this.httpClient.post<CoreCalendarDeleteSubscription200Response>(`${this.basePath}/mod_iomadcertificate_view_iomadcertificate`,
            modIomadcertificateIssueIomadcertificateRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}