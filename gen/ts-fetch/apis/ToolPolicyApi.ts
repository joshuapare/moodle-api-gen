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
  ToolPolicyGetPolicyVersion200Response,
  ToolPolicyGetPolicyVersionRequest,
  ToolPolicySubmitAcceptOnBehalfRequest,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    ToolPolicyGetPolicyVersion200ResponseFromJSON,
    ToolPolicyGetPolicyVersion200ResponseToJSON,
    ToolPolicyGetPolicyVersionRequestFromJSON,
    ToolPolicyGetPolicyVersionRequestToJSON,
    ToolPolicySubmitAcceptOnBehalfRequestFromJSON,
    ToolPolicySubmitAcceptOnBehalfRequestToJSON,
} from '../models/index';

export interface ToolPolicyGetPolicyVersionOperationRequest {
    toolPolicyGetPolicyVersionRequest: ToolPolicyGetPolicyVersionRequest;
}

export interface ToolPolicySubmitAcceptOnBehalfOperationRequest {
    toolPolicySubmitAcceptOnBehalfRequest: ToolPolicySubmitAcceptOnBehalfRequest;
}

/**
 * 
 */
export class ToolPolicyApi extends runtime.BaseAPI {

    /**
     * Fetch the details of a policy version
     * Fetch the details of a policy version
     */
    async toolPolicyGetPolicyVersionRaw(requestParameters: ToolPolicyGetPolicyVersionOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolPolicyGetPolicyVersion200Response>> {
        if (requestParameters['toolPolicyGetPolicyVersionRequest'] == null) {
            throw new runtime.RequiredError(
                'toolPolicyGetPolicyVersionRequest',
                'Required parameter "toolPolicyGetPolicyVersionRequest" was null or undefined when calling toolPolicyGetPolicyVersion().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_policy_get_policy_version`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolPolicyGetPolicyVersionRequestToJSON(requestParameters['toolPolicyGetPolicyVersionRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolPolicyGetPolicyVersion200ResponseFromJSON(jsonValue));
    }

    /**
     * Fetch the details of a policy version
     * Fetch the details of a policy version
     */
    async toolPolicyGetPolicyVersion(requestParameters: ToolPolicyGetPolicyVersionOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolPolicyGetPolicyVersion200Response> {
        const response = await this.toolPolicyGetPolicyVersionRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Accept policies on behalf of other users
     * Accept policies on behalf of other users
     */
    async toolPolicySubmitAcceptOnBehalfRaw(requestParameters: ToolPolicySubmitAcceptOnBehalfOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<object>> {
        if (requestParameters['toolPolicySubmitAcceptOnBehalfRequest'] == null) {
            throw new runtime.RequiredError(
                'toolPolicySubmitAcceptOnBehalfRequest',
                'Required parameter "toolPolicySubmitAcceptOnBehalfRequest" was null or undefined when calling toolPolicySubmitAcceptOnBehalf().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_policy_submit_accept_on_behalf`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolPolicySubmitAcceptOnBehalfRequestToJSON(requestParameters['toolPolicySubmitAcceptOnBehalfRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Accept policies on behalf of other users
     * Accept policies on behalf of other users
     */
    async toolPolicySubmitAcceptOnBehalf(requestParameters: ToolPolicySubmitAcceptOnBehalfOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<object> {
        const response = await this.toolPolicySubmitAcceptOnBehalfRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
