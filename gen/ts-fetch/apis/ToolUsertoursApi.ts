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
  ErrorResponse,
  ToolUsertoursCompleteTourRequest,
  ToolUsertoursFetchAndStartTour200Response,
  ToolUsertoursFetchAndStartTourRequest,
  ToolUsertoursResetTour200Response,
  ToolUsertoursResetTourRequest,
  ToolUsertoursStepShownRequest,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    ToolUsertoursCompleteTourRequestFromJSON,
    ToolUsertoursCompleteTourRequestToJSON,
    ToolUsertoursFetchAndStartTour200ResponseFromJSON,
    ToolUsertoursFetchAndStartTour200ResponseToJSON,
    ToolUsertoursFetchAndStartTourRequestFromJSON,
    ToolUsertoursFetchAndStartTourRequestToJSON,
    ToolUsertoursResetTour200ResponseFromJSON,
    ToolUsertoursResetTour200ResponseToJSON,
    ToolUsertoursResetTourRequestFromJSON,
    ToolUsertoursResetTourRequestToJSON,
    ToolUsertoursStepShownRequestFromJSON,
    ToolUsertoursStepShownRequestToJSON,
} from '../models/index';

export interface ToolUsertoursCompleteTourOperationRequest {
    toolUsertoursCompleteTourRequest: ToolUsertoursCompleteTourRequest;
}

export interface ToolUsertoursFetchAndStartTourOperationRequest {
    toolUsertoursFetchAndStartTourRequest: ToolUsertoursFetchAndStartTourRequest;
}

export interface ToolUsertoursResetTourOperationRequest {
    toolUsertoursResetTourRequest: ToolUsertoursResetTourRequest;
}

export interface ToolUsertoursStepShownOperationRequest {
    toolUsertoursStepShownRequest: ToolUsertoursStepShownRequest;
}

/**
 * 
 */
export class ToolUsertoursApi extends runtime.BaseAPI {

    /**
     * Mark the specified tour as completed for the current user
     * Mark the specified tour as completed for the current user
     */
    async toolUsertoursCompleteTourRaw(requestParameters: ToolUsertoursCompleteTourOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<object>> {
        if (requestParameters['toolUsertoursCompleteTourRequest'] == null) {
            throw new runtime.RequiredError(
                'toolUsertoursCompleteTourRequest',
                'Required parameter "toolUsertoursCompleteTourRequest" was null or undefined when calling toolUsertoursCompleteTour().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_usertours_complete_tour`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolUsertoursCompleteTourRequestToJSON(requestParameters['toolUsertoursCompleteTourRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Mark the specified tour as completed for the current user
     * Mark the specified tour as completed for the current user
     */
    async toolUsertoursCompleteTour(requestParameters: ToolUsertoursCompleteTourOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<object> {
        const response = await this.toolUsertoursCompleteTourRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Fetch the specified tour
     * Fetch the specified tour
     */
    async toolUsertoursFetchAndStartTourRaw(requestParameters: ToolUsertoursFetchAndStartTourOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolUsertoursFetchAndStartTour200Response>> {
        if (requestParameters['toolUsertoursFetchAndStartTourRequest'] == null) {
            throw new runtime.RequiredError(
                'toolUsertoursFetchAndStartTourRequest',
                'Required parameter "toolUsertoursFetchAndStartTourRequest" was null or undefined when calling toolUsertoursFetchAndStartTour().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_usertours_fetch_and_start_tour`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolUsertoursFetchAndStartTourRequestToJSON(requestParameters['toolUsertoursFetchAndStartTourRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolUsertoursFetchAndStartTour200ResponseFromJSON(jsonValue));
    }

    /**
     * Fetch the specified tour
     * Fetch the specified tour
     */
    async toolUsertoursFetchAndStartTour(requestParameters: ToolUsertoursFetchAndStartTourOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolUsertoursFetchAndStartTour200Response> {
        const response = await this.toolUsertoursFetchAndStartTourRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Remove the specified tour
     * Remove the specified tour
     */
    async toolUsertoursResetTourRaw(requestParameters: ToolUsertoursResetTourOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolUsertoursResetTour200Response>> {
        if (requestParameters['toolUsertoursResetTourRequest'] == null) {
            throw new runtime.RequiredError(
                'toolUsertoursResetTourRequest',
                'Required parameter "toolUsertoursResetTourRequest" was null or undefined when calling toolUsertoursResetTour().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_usertours_reset_tour`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolUsertoursResetTourRequestToJSON(requestParameters['toolUsertoursResetTourRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolUsertoursResetTour200ResponseFromJSON(jsonValue));
    }

    /**
     * Remove the specified tour
     * Remove the specified tour
     */
    async toolUsertoursResetTour(requestParameters: ToolUsertoursResetTourOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolUsertoursResetTour200Response> {
        const response = await this.toolUsertoursResetTourRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Mark the specified step as completed for the current user
     * Mark the specified step as completed for the current user
     */
    async toolUsertoursStepShownRaw(requestParameters: ToolUsertoursStepShownOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<object>> {
        if (requestParameters['toolUsertoursStepShownRequest'] == null) {
            throw new runtime.RequiredError(
                'toolUsertoursStepShownRequest',
                'Required parameter "toolUsertoursStepShownRequest" was null or undefined when calling toolUsertoursStepShown().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_usertours_step_shown`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolUsertoursStepShownRequestToJSON(requestParameters['toolUsertoursStepShownRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Mark the specified step as completed for the current user
     * Mark the specified step as completed for the current user
     */
    async toolUsertoursStepShown(requestParameters: ToolUsertoursStepShownOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<object> {
        const response = await this.toolUsertoursStepShownRaw(requestParameters, initOverrides);
        return await response.value();
    }

}