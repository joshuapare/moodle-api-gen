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
import { ModScormGetScormAccessInformation200Response } from '../model/mod-scorm-get-scorm-access-information200-response';
import { ModScormGetScormAccessInformationRequest } from '../model/mod-scorm-get-scorm-access-information-request';
import { ModScormGetScormAttemptCount200Response } from '../model/mod-scorm-get-scorm-attempt-count200-response';
import { ModScormGetScormAttemptCountRequest } from '../model/mod-scorm-get-scorm-attempt-count-request';
import { ModScormGetScormScoTracks200Response } from '../model/mod-scorm-get-scorm-sco-tracks200-response';
import { ModScormGetScormScoTracksRequest } from '../model/mod-scorm-get-scorm-sco-tracks-request';
import { ModScormGetScormScoes200Response } from '../model/mod-scorm-get-scorm-scoes200-response';
import { ModScormGetScormScoesRequest } from '../model/mod-scorm-get-scorm-scoes-request';
import { ModScormGetScormUserData200Response } from '../model/mod-scorm-get-scorm-user-data200-response';
import { ModScormGetScormUserDataRequest } from '../model/mod-scorm-get-scorm-user-data-request';
import { ModScormGetScormsByCourses200Response } from '../model/mod-scorm-get-scorms-by-courses200-response';
import { ModScormInsertScormTracks200Response } from '../model/mod-scorm-insert-scorm-tracks200-response';
import { ModScormInsertScormTracksRequest } from '../model/mod-scorm-insert-scorm-tracks-request';
import { ModScormLaunchScoRequest } from '../model/mod-scorm-launch-sco-request';
import { ModScormViewScormRequest } from '../model/mod-scorm-view-scorm-request';
import { Configuration } from '../configuration';


@Injectable()
export class ModScormService {

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
     * Return capabilities information for a given scorm.
     * Return capabilities information for a given scorm.
     * @param modScormGetScormAccessInformationRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormGetScormAccessInformation(modScormGetScormAccessInformationRequest: ModScormGetScormAccessInformationRequest, ): Observable<AxiosResponse<ModScormGetScormAccessInformation200Response>>;
    public modScormGetScormAccessInformation(modScormGetScormAccessInformationRequest: ModScormGetScormAccessInformationRequest, ): Observable<any> {

        if (modScormGetScormAccessInformationRequest === null || modScormGetScormAccessInformationRequest === undefined) {
            throw new Error('Required parameter modScormGetScormAccessInformationRequest was null or undefined when calling modScormGetScormAccessInformation.');
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
        return this.httpClient.post<ModScormGetScormAccessInformation200Response>(`${this.basePath}/mod_scorm_get_scorm_access_information`,
            modScormGetScormAccessInformationRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Return the number of attempts done by a user in the given SCORM.
     * Return the number of attempts done by a user in the given SCORM.
     * @param modScormGetScormAttemptCountRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormGetScormAttemptCount(modScormGetScormAttemptCountRequest: ModScormGetScormAttemptCountRequest, ): Observable<AxiosResponse<ModScormGetScormAttemptCount200Response>>;
    public modScormGetScormAttemptCount(modScormGetScormAttemptCountRequest: ModScormGetScormAttemptCountRequest, ): Observable<any> {

        if (modScormGetScormAttemptCountRequest === null || modScormGetScormAttemptCountRequest === undefined) {
            throw new Error('Required parameter modScormGetScormAttemptCountRequest was null or undefined when calling modScormGetScormAttemptCount.');
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
        return this.httpClient.post<ModScormGetScormAttemptCount200Response>(`${this.basePath}/mod_scorm_get_scorm_attempt_count`,
            modScormGetScormAttemptCountRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Retrieves SCO tracking data for the given user id and attempt number
     * Retrieves SCO tracking data for the given user id and attempt number
     * @param modScormGetScormScoTracksRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormGetScormScoTracks(modScormGetScormScoTracksRequest: ModScormGetScormScoTracksRequest, ): Observable<AxiosResponse<ModScormGetScormScoTracks200Response>>;
    public modScormGetScormScoTracks(modScormGetScormScoTracksRequest: ModScormGetScormScoTracksRequest, ): Observable<any> {

        if (modScormGetScormScoTracksRequest === null || modScormGetScormScoTracksRequest === undefined) {
            throw new Error('Required parameter modScormGetScormScoTracksRequest was null or undefined when calling modScormGetScormScoTracks.');
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
        return this.httpClient.post<ModScormGetScormScoTracks200Response>(`${this.basePath}/mod_scorm_get_scorm_sco_tracks`,
            modScormGetScormScoTracksRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Returns a list containing all the scoes data related to the given scorm id
     * Returns a list containing all the scoes data related to the given scorm id
     * @param modScormGetScormScoesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormGetScormScoes(modScormGetScormScoesRequest: ModScormGetScormScoesRequest, ): Observable<AxiosResponse<ModScormGetScormScoes200Response>>;
    public modScormGetScormScoes(modScormGetScormScoesRequest: ModScormGetScormScoesRequest, ): Observable<any> {

        if (modScormGetScormScoesRequest === null || modScormGetScormScoesRequest === undefined) {
            throw new Error('Required parameter modScormGetScormScoesRequest was null or undefined when calling modScormGetScormScoes.');
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
        return this.httpClient.post<ModScormGetScormScoes200Response>(`${this.basePath}/mod_scorm_get_scorm_scoes`,
            modScormGetScormScoesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Retrieves user tracking and SCO data and default SCORM values
     * Retrieves user tracking and SCO data and default SCORM values
     * @param modScormGetScormUserDataRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormGetScormUserData(modScormGetScormUserDataRequest: ModScormGetScormUserDataRequest, ): Observable<AxiosResponse<ModScormGetScormUserData200Response>>;
    public modScormGetScormUserData(modScormGetScormUserDataRequest: ModScormGetScormUserDataRequest, ): Observable<any> {

        if (modScormGetScormUserDataRequest === null || modScormGetScormUserDataRequest === undefined) {
            throw new Error('Required parameter modScormGetScormUserDataRequest was null or undefined when calling modScormGetScormUserData.');
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
        return this.httpClient.post<ModScormGetScormUserData200Response>(`${this.basePath}/mod_scorm_get_scorm_user_data`,
            modScormGetScormUserDataRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
     * Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
     * @param modChatGetChatsByCoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormGetScormsByCourses(modChatGetChatsByCoursesRequest: ModChatGetChatsByCoursesRequest, ): Observable<AxiosResponse<ModScormGetScormsByCourses200Response>>;
    public modScormGetScormsByCourses(modChatGetChatsByCoursesRequest: ModChatGetChatsByCoursesRequest, ): Observable<any> {

        if (modChatGetChatsByCoursesRequest === null || modChatGetChatsByCoursesRequest === undefined) {
            throw new Error('Required parameter modChatGetChatsByCoursesRequest was null or undefined when calling modScormGetScormsByCourses.');
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
        return this.httpClient.post<ModScormGetScormsByCourses200Response>(`${this.basePath}/mod_scorm_get_scorms_by_courses`,
            modChatGetChatsByCoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
     * Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
     * @param modScormInsertScormTracksRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormInsertScormTracks(modScormInsertScormTracksRequest: ModScormInsertScormTracksRequest, ): Observable<AxiosResponse<ModScormInsertScormTracks200Response>>;
    public modScormInsertScormTracks(modScormInsertScormTracksRequest: ModScormInsertScormTracksRequest, ): Observable<any> {

        if (modScormInsertScormTracksRequest === null || modScormInsertScormTracksRequest === undefined) {
            throw new Error('Required parameter modScormInsertScormTracksRequest was null or undefined when calling modScormInsertScormTracks.');
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
        return this.httpClient.post<ModScormInsertScormTracks200Response>(`${this.basePath}/mod_scorm_insert_scorm_tracks`,
            modScormInsertScormTracksRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Trigger the SCO launched event.
     * Trigger the SCO launched event.
     * @param modScormLaunchScoRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormLaunchSco(modScormLaunchScoRequest: ModScormLaunchScoRequest, ): Observable<AxiosResponse<CoreCalendarDeleteSubscription200Response>>;
    public modScormLaunchSco(modScormLaunchScoRequest: ModScormLaunchScoRequest, ): Observable<any> {

        if (modScormLaunchScoRequest === null || modScormLaunchScoRequest === undefined) {
            throw new Error('Required parameter modScormLaunchScoRequest was null or undefined when calling modScormLaunchSco.');
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
        return this.httpClient.post<CoreCalendarDeleteSubscription200Response>(`${this.basePath}/mod_scorm_launch_sco`,
            modScormLaunchScoRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Trigger the course module viewed event.
     * Trigger the course module viewed event.
     * @param modScormViewScormRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modScormViewScorm(modScormViewScormRequest: ModScormViewScormRequest, ): Observable<AxiosResponse<CoreCalendarDeleteSubscription200Response>>;
    public modScormViewScorm(modScormViewScormRequest: ModScormViewScormRequest, ): Observable<any> {

        if (modScormViewScormRequest === null || modScormViewScormRequest === undefined) {
            throw new Error('Required parameter modScormViewScormRequest was null or undefined when calling modScormViewScorm.');
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
        return this.httpClient.post<CoreCalendarDeleteSubscription200Response>(`${this.basePath}/mod_scorm_view_scorm`,
            modScormViewScormRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
