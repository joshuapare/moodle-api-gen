/* tslint:disable */
/* eslint-disable */
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


import * as runtime from '../runtime';
import type {
  CoreCalendarDeleteSubscription200Response,
  ErrorResponse,
  ModChatGetChatsByCoursesRequest,
  ModIomadcertificateGetIomadcertificatesByCourses200Response,
  ModIomadcertificateGetIssuedIomadcertificates200Response,
  ModIomadcertificateGetIssuedIomadcertificatesRequest,
  ModIomadcertificateIssueIomadcertificate200Response,
  ModIomadcertificateIssueIomadcertificateRequest,
} from '../models/index';
import {
    CoreCalendarDeleteSubscription200ResponseFromJSON,
    CoreCalendarDeleteSubscription200ResponseToJSON,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    ModChatGetChatsByCoursesRequestFromJSON,
    ModChatGetChatsByCoursesRequestToJSON,
    ModIomadcertificateGetIomadcertificatesByCourses200ResponseFromJSON,
    ModIomadcertificateGetIomadcertificatesByCourses200ResponseToJSON,
    ModIomadcertificateGetIssuedIomadcertificates200ResponseFromJSON,
    ModIomadcertificateGetIssuedIomadcertificates200ResponseToJSON,
    ModIomadcertificateGetIssuedIomadcertificatesRequestFromJSON,
    ModIomadcertificateGetIssuedIomadcertificatesRequestToJSON,
    ModIomadcertificateIssueIomadcertificate200ResponseFromJSON,
    ModIomadcertificateIssueIomadcertificate200ResponseToJSON,
    ModIomadcertificateIssueIomadcertificateRequestFromJSON,
    ModIomadcertificateIssueIomadcertificateRequestToJSON,
} from '../models/index';

export interface ModIomadcertificateGetIomadcertificatesByCoursesRequest {
    modChatGetChatsByCoursesRequest: ModChatGetChatsByCoursesRequest;
}

export interface ModIomadcertificateGetIssuedIomadcertificatesOperationRequest {
    modIomadcertificateGetIssuedIomadcertificatesRequest: ModIomadcertificateGetIssuedIomadcertificatesRequest;
}

export interface ModIomadcertificateIssueIomadcertificateOperationRequest {
    modIomadcertificateIssueIomadcertificateRequest: ModIomadcertificateIssueIomadcertificateRequest;
}

export interface ModIomadcertificateViewIomadcertificateRequest {
    modIomadcertificateIssueIomadcertificateRequest: ModIomadcertificateIssueIomadcertificateRequest;
}

/**
 * 
 */
export class ModIomadcertificateApi extends runtime.BaseAPI {

    /**
     * Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
     * Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
     */
    async modIomadcertificateGetIomadcertificatesByCoursesRaw(requestParameters: ModIomadcertificateGetIomadcertificatesByCoursesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ModIomadcertificateGetIomadcertificatesByCourses200Response>> {
        if (requestParameters['modChatGetChatsByCoursesRequest'] == null) {
            throw new runtime.RequiredError(
                'modChatGetChatsByCoursesRequest',
                'Required parameter "modChatGetChatsByCoursesRequest" was null or undefined when calling modIomadcertificateGetIomadcertificatesByCourses().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/mod_iomadcertificate_get_iomadcertificates_by_courses`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ModChatGetChatsByCoursesRequestToJSON(requestParameters['modChatGetChatsByCoursesRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ModIomadcertificateGetIomadcertificatesByCourses200ResponseFromJSON(jsonValue));
    }

    /**
     * Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
     * Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
     */
    async modIomadcertificateGetIomadcertificatesByCourses(requestParameters: ModIomadcertificateGetIomadcertificatesByCoursesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ModIomadcertificateGetIomadcertificatesByCourses200Response> {
        const response = await this.modIomadcertificateGetIomadcertificatesByCoursesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get the list of issued iomadcertificates for the current user.
     * Get the list of issued iomadcertificates for the current user.
     */
    async modIomadcertificateGetIssuedIomadcertificatesRaw(requestParameters: ModIomadcertificateGetIssuedIomadcertificatesOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ModIomadcertificateGetIssuedIomadcertificates200Response>> {
        if (requestParameters['modIomadcertificateGetIssuedIomadcertificatesRequest'] == null) {
            throw new runtime.RequiredError(
                'modIomadcertificateGetIssuedIomadcertificatesRequest',
                'Required parameter "modIomadcertificateGetIssuedIomadcertificatesRequest" was null or undefined when calling modIomadcertificateGetIssuedIomadcertificates().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/mod_iomadcertificate_get_issued_iomadcertificates`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ModIomadcertificateGetIssuedIomadcertificatesRequestToJSON(requestParameters['modIomadcertificateGetIssuedIomadcertificatesRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ModIomadcertificateGetIssuedIomadcertificates200ResponseFromJSON(jsonValue));
    }

    /**
     * Get the list of issued iomadcertificates for the current user.
     * Get the list of issued iomadcertificates for the current user.
     */
    async modIomadcertificateGetIssuedIomadcertificates(requestParameters: ModIomadcertificateGetIssuedIomadcertificatesOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ModIomadcertificateGetIssuedIomadcertificates200Response> {
        const response = await this.modIomadcertificateGetIssuedIomadcertificatesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Create new iomadcertificate record, or return existing record for the current user.
     * Create new iomadcertificate record, or return existing record for the current user.
     */
    async modIomadcertificateIssueIomadcertificateRaw(requestParameters: ModIomadcertificateIssueIomadcertificateOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ModIomadcertificateIssueIomadcertificate200Response>> {
        if (requestParameters['modIomadcertificateIssueIomadcertificateRequest'] == null) {
            throw new runtime.RequiredError(
                'modIomadcertificateIssueIomadcertificateRequest',
                'Required parameter "modIomadcertificateIssueIomadcertificateRequest" was null or undefined when calling modIomadcertificateIssueIomadcertificate().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/mod_iomadcertificate_issue_iomadcertificate`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ModIomadcertificateIssueIomadcertificateRequestToJSON(requestParameters['modIomadcertificateIssueIomadcertificateRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ModIomadcertificateIssueIomadcertificate200ResponseFromJSON(jsonValue));
    }

    /**
     * Create new iomadcertificate record, or return existing record for the current user.
     * Create new iomadcertificate record, or return existing record for the current user.
     */
    async modIomadcertificateIssueIomadcertificate(requestParameters: ModIomadcertificateIssueIomadcertificateOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ModIomadcertificateIssueIomadcertificate200Response> {
        const response = await this.modIomadcertificateIssueIomadcertificateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Trigger the course module viewed event and update the module completion status.
     * Trigger the course module viewed event and update the module completion status.
     */
    async modIomadcertificateViewIomadcertificateRaw(requestParameters: ModIomadcertificateViewIomadcertificateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CoreCalendarDeleteSubscription200Response>> {
        if (requestParameters['modIomadcertificateIssueIomadcertificateRequest'] == null) {
            throw new runtime.RequiredError(
                'modIomadcertificateIssueIomadcertificateRequest',
                'Required parameter "modIomadcertificateIssueIomadcertificateRequest" was null or undefined when calling modIomadcertificateViewIomadcertificate().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/mod_iomadcertificate_view_iomadcertificate`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ModIomadcertificateIssueIomadcertificateRequestToJSON(requestParameters['modIomadcertificateIssueIomadcertificateRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CoreCalendarDeleteSubscription200ResponseFromJSON(jsonValue));
    }

    /**
     * Trigger the course module viewed event and update the module completion status.
     * Trigger the course module viewed event and update the module completion status.
     */
    async modIomadcertificateViewIomadcertificate(requestParameters: ModIomadcertificateViewIomadcertificateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CoreCalendarDeleteSubscription200Response> {
        const response = await this.modIomadcertificateViewIomadcertificateRaw(requestParameters, initOverrides);
        return await response.value();
    }

}