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
  TinyEquationFilter200Response,
  TinyEquationFilterRequest,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    TinyEquationFilter200ResponseFromJSON,
    TinyEquationFilter200ResponseToJSON,
    TinyEquationFilterRequestFromJSON,
    TinyEquationFilterRequestToJSON,
} from '../models/index';

export interface TinyEquationFilterOperationRequest {
    tinyEquationFilterRequest: TinyEquationFilterRequest;
}

/**
 * 
 */
export class TinyEquationApi extends runtime.BaseAPI {

    /**
     * Filter the equation
     * Filter the equation
     */
    async tinyEquationFilterRaw(requestParameters: TinyEquationFilterOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<TinyEquationFilter200Response>> {
        if (requestParameters['tinyEquationFilterRequest'] == null) {
            throw new runtime.RequiredError(
                'tinyEquationFilterRequest',
                'Required parameter "tinyEquationFilterRequest" was null or undefined when calling tinyEquationFilter().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tiny_equation_filter`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: TinyEquationFilterRequestToJSON(requestParameters['tinyEquationFilterRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => TinyEquationFilter200ResponseFromJSON(jsonValue));
    }

    /**
     * Filter the equation
     * Filter the equation
     */
    async tinyEquationFilter(requestParameters: TinyEquationFilterOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<TinyEquationFilter200Response> {
        const response = await this.tinyEquationFilterRaw(requestParameters, initOverrides);
        return await response.value();
    }

}