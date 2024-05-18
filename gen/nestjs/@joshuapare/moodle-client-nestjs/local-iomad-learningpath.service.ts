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
import { LocalIomadLearningpathActivateRequest } from '../model/local-iomad-learningpath-activate-request';
import { LocalIomadLearningpathAddcoursesRequest } from '../model/local-iomad-learningpath-addcourses-request';
import { LocalIomadLearningpathAddusersRequest } from '../model/local-iomad-learningpath-addusers-request';
import { LocalIomadLearningpathCopypathRequest } from '../model/local-iomad-learningpath-copypath-request';
import { LocalIomadLearningpathGetcoursesRequest } from '../model/local-iomad-learningpath-getcourses-request';
import { LocalIomadLearningpathGetprospectivecoursesRequest } from '../model/local-iomad-learningpath-getprospectivecourses-request';
import { LocalIomadLearningpathGetprospectiveusersRequest } from '../model/local-iomad-learningpath-getprospectiveusers-request';
import { LocalIomadLearningpathGetusersRequest } from '../model/local-iomad-learningpath-getusers-request';
import { LocalIomadLearningpathOrdercoursesRequest } from '../model/local-iomad-learningpath-ordercourses-request';
import { LocalIomadLearningpathRemovecoursesRequest } from '../model/local-iomad-learningpath-removecourses-request';
import { LocalIomadLearningpathRemoveusersRequest } from '../model/local-iomad-learningpath-removeusers-request';
import { Configuration } from '../configuration';


@Injectable()
export class LocalIomadLearningpathService {

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
     * Activates / deactivates learning path
     * Activates / deactivates learning path
     * @param localIomadLearningpathActivateRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathActivate(localIomadLearningpathActivateRequest: LocalIomadLearningpathActivateRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathActivate(localIomadLearningpathActivateRequest: LocalIomadLearningpathActivateRequest, ): Observable<any> {

        if (localIomadLearningpathActivateRequest === null || localIomadLearningpathActivateRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathActivateRequest was null or undefined when calling localIomadLearningpathActivate.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_activate`,
            localIomadLearningpathActivateRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Add courses to learning path
     * Add courses to learning path
     * @param localIomadLearningpathAddcoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathAddcourses(localIomadLearningpathAddcoursesRequest: LocalIomadLearningpathAddcoursesRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathAddcourses(localIomadLearningpathAddcoursesRequest: LocalIomadLearningpathAddcoursesRequest, ): Observable<any> {

        if (localIomadLearningpathAddcoursesRequest === null || localIomadLearningpathAddcoursesRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathAddcoursesRequest was null or undefined when calling localIomadLearningpathAddcourses.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_addcourses`,
            localIomadLearningpathAddcoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Add users to learning path
     * Add users to learning path
     * @param localIomadLearningpathAddusersRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathAddusers(localIomadLearningpathAddusersRequest: LocalIomadLearningpathAddusersRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathAddusers(localIomadLearningpathAddusersRequest: LocalIomadLearningpathAddusersRequest, ): Observable<any> {

        if (localIomadLearningpathAddusersRequest === null || localIomadLearningpathAddusersRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathAddusersRequest was null or undefined when calling localIomadLearningpathAddusers.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_addusers`,
            localIomadLearningpathAddusersRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Copy a learning path
     * Copy a learning path
     * @param localIomadLearningpathCopypathRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathCopypath(localIomadLearningpathCopypathRequest: LocalIomadLearningpathCopypathRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathCopypath(localIomadLearningpathCopypathRequest: LocalIomadLearningpathCopypathRequest, ): Observable<any> {

        if (localIomadLearningpathCopypathRequest === null || localIomadLearningpathCopypathRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathCopypathRequest was null or undefined when calling localIomadLearningpathCopypath.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_copypath`,
            localIomadLearningpathCopypathRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Completely delete a learning path
     * Completely delete a learning path
     * @param localIomadLearningpathCopypathRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathDeletepath(localIomadLearningpathCopypathRequest: LocalIomadLearningpathCopypathRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathDeletepath(localIomadLearningpathCopypathRequest: LocalIomadLearningpathCopypathRequest, ): Observable<any> {

        if (localIomadLearningpathCopypathRequest === null || localIomadLearningpathCopypathRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathCopypathRequest was null or undefined when calling localIomadLearningpathDeletepath.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_deletepath`,
            localIomadLearningpathCopypathRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Read list of courses for given learning
     * Read list of courses for given learning
     * @param localIomadLearningpathGetcoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathGetcourses(localIomadLearningpathGetcoursesRequest: LocalIomadLearningpathGetcoursesRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathGetcourses(localIomadLearningpathGetcoursesRequest: LocalIomadLearningpathGetcoursesRequest, ): Observable<any> {

        if (localIomadLearningpathGetcoursesRequest === null || localIomadLearningpathGetcoursesRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathGetcoursesRequest was null or undefined when calling localIomadLearningpathGetcourses.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_getcourses`,
            localIomadLearningpathGetcoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Read set of filtered courses for given company
     * Read set of filtered courses for given company
     * @param localIomadLearningpathGetprospectivecoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathGetprospectivecourses(localIomadLearningpathGetprospectivecoursesRequest: LocalIomadLearningpathGetprospectivecoursesRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathGetprospectivecourses(localIomadLearningpathGetprospectivecoursesRequest: LocalIomadLearningpathGetprospectivecoursesRequest, ): Observable<any> {

        if (localIomadLearningpathGetprospectivecoursesRequest === null || localIomadLearningpathGetprospectivecoursesRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathGetprospectivecoursesRequest was null or undefined when calling localIomadLearningpathGetprospectivecourses.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_getprospectivecourses`,
            localIomadLearningpathGetprospectivecoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get set of filtered users for given company
     * Get set of filtered users for given company
     * @param localIomadLearningpathGetprospectiveusersRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathGetprospectiveusers(localIomadLearningpathGetprospectiveusersRequest: LocalIomadLearningpathGetprospectiveusersRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathGetprospectiveusers(localIomadLearningpathGetprospectiveusersRequest: LocalIomadLearningpathGetprospectiveusersRequest, ): Observable<any> {

        if (localIomadLearningpathGetprospectiveusersRequest === null || localIomadLearningpathGetprospectiveusersRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathGetprospectiveusersRequest was null or undefined when calling localIomadLearningpathGetprospectiveusers.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_getprospectiveusers`,
            localIomadLearningpathGetprospectiveusersRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get users assigned to path
     * Get users assigned to path
     * @param localIomadLearningpathGetusersRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathGetusers(localIomadLearningpathGetusersRequest: LocalIomadLearningpathGetusersRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathGetusers(localIomadLearningpathGetusersRequest: LocalIomadLearningpathGetusersRequest, ): Observable<any> {

        if (localIomadLearningpathGetusersRequest === null || localIomadLearningpathGetusersRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathGetusersRequest was null or undefined when calling localIomadLearningpathGetusers.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_getusers`,
            localIomadLearningpathGetusersRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Set sequence of courses in learning path
     * Set sequence of courses in learning path
     * @param localIomadLearningpathOrdercoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathOrdercourses(localIomadLearningpathOrdercoursesRequest: LocalIomadLearningpathOrdercoursesRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathOrdercourses(localIomadLearningpathOrdercoursesRequest: LocalIomadLearningpathOrdercoursesRequest, ): Observable<any> {

        if (localIomadLearningpathOrdercoursesRequest === null || localIomadLearningpathOrdercoursesRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathOrdercoursesRequest was null or undefined when calling localIomadLearningpathOrdercourses.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_ordercourses`,
            localIomadLearningpathOrdercoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Remove courses from learning path
     * Remove courses from learning path
     * @param localIomadLearningpathRemovecoursesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathRemovecourses(localIomadLearningpathRemovecoursesRequest: LocalIomadLearningpathRemovecoursesRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathRemovecourses(localIomadLearningpathRemovecoursesRequest: LocalIomadLearningpathRemovecoursesRequest, ): Observable<any> {

        if (localIomadLearningpathRemovecoursesRequest === null || localIomadLearningpathRemovecoursesRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathRemovecoursesRequest was null or undefined when calling localIomadLearningpathRemovecourses.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_removecourses`,
            localIomadLearningpathRemovecoursesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Remove users from learning path
     * Remove users from learning path
     * @param localIomadLearningpathRemoveusersRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public localIomadLearningpathRemoveusers(localIomadLearningpathRemoveusersRequest: LocalIomadLearningpathRemoveusersRequest, ): Observable<AxiosResponse<object>>;
    public localIomadLearningpathRemoveusers(localIomadLearningpathRemoveusersRequest: LocalIomadLearningpathRemoveusersRequest, ): Observable<any> {

        if (localIomadLearningpathRemoveusersRequest === null || localIomadLearningpathRemoveusersRequest === undefined) {
            throw new Error('Required parameter localIomadLearningpathRemoveusersRequest was null or undefined when calling localIomadLearningpathRemoveusers.');
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
        return this.httpClient.post<object>(`${this.basePath}/local_iomad_learningpath_removeusers`,
            localIomadLearningpathRemoveusersRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}