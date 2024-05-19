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
  CoreCohortAddCohortMembers200Response,
  ErrorResponse,
  ReportInsightsActionExecutedRequest,
  ReportInsightsSetFixedPrediction200Response,
  ReportInsightsSetFixedPredictionRequest,
  ReportInsightsSetNotusefulPrediction200Response,
  ReportInsightsSetNotusefulPredictionRequest,
} from '../models/index';
import {
    CoreCohortAddCohortMembers200ResponseFromJSON,
    CoreCohortAddCohortMembers200ResponseToJSON,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    ReportInsightsActionExecutedRequestFromJSON,
    ReportInsightsActionExecutedRequestToJSON,
    ReportInsightsSetFixedPrediction200ResponseFromJSON,
    ReportInsightsSetFixedPrediction200ResponseToJSON,
    ReportInsightsSetFixedPredictionRequestFromJSON,
    ReportInsightsSetFixedPredictionRequestToJSON,
    ReportInsightsSetNotusefulPrediction200ResponseFromJSON,
    ReportInsightsSetNotusefulPrediction200ResponseToJSON,
    ReportInsightsSetNotusefulPredictionRequestFromJSON,
    ReportInsightsSetNotusefulPredictionRequestToJSON,
} from '../models/index';

export interface ReportInsightsActionExecutedOperationRequest {
    reportInsightsActionExecutedRequest: ReportInsightsActionExecutedRequest;
}

export interface ReportInsightsSetFixedPredictionOperationRequest {
    reportInsightsSetFixedPredictionRequest: ReportInsightsSetFixedPredictionRequest;
}

export interface ReportInsightsSetNotusefulPredictionOperationRequest {
    reportInsightsSetNotusefulPredictionRequest: ReportInsightsSetNotusefulPredictionRequest;
}

/**
 * 
 */
export class ReportInsightsApi extends runtime.BaseAPI {

    /**
     * Stores an action executed over a group of predictions.
     * Stores an action executed over a group of predictions.
     */
    async reportInsightsActionExecutedRaw(requestParameters: ReportInsightsActionExecutedOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CoreCohortAddCohortMembers200Response>> {
        if (requestParameters['reportInsightsActionExecutedRequest'] == null) {
            throw new runtime.RequiredError(
                'reportInsightsActionExecutedRequest',
                'Required parameter "reportInsightsActionExecutedRequest" was null or undefined when calling reportInsightsActionExecuted().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/report_insights_action_executed`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ReportInsightsActionExecutedRequestToJSON(requestParameters['reportInsightsActionExecutedRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CoreCohortAddCohortMembers200ResponseFromJSON(jsonValue));
    }

    /**
     * Stores an action executed over a group of predictions.
     * Stores an action executed over a group of predictions.
     */
    async reportInsightsActionExecuted(requestParameters: ReportInsightsActionExecutedOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CoreCohortAddCohortMembers200Response> {
        const response = await this.reportInsightsActionExecutedRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Flags a prediction as fixed.
     * Flags a prediction as fixed.
     */
    async reportInsightsSetFixedPredictionRaw(requestParameters: ReportInsightsSetFixedPredictionOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ReportInsightsSetFixedPrediction200Response>> {
        if (requestParameters['reportInsightsSetFixedPredictionRequest'] == null) {
            throw new runtime.RequiredError(
                'reportInsightsSetFixedPredictionRequest',
                'Required parameter "reportInsightsSetFixedPredictionRequest" was null or undefined when calling reportInsightsSetFixedPrediction().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/report_insights_set_fixed_prediction`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ReportInsightsSetFixedPredictionRequestToJSON(requestParameters['reportInsightsSetFixedPredictionRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ReportInsightsSetFixedPrediction200ResponseFromJSON(jsonValue));
    }

    /**
     * Flags a prediction as fixed.
     * Flags a prediction as fixed.
     */
    async reportInsightsSetFixedPrediction(requestParameters: ReportInsightsSetFixedPredictionOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ReportInsightsSetFixedPrediction200Response> {
        const response = await this.reportInsightsSetFixedPredictionRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Flags the prediction as not useful.
     * Flags the prediction as not useful.
     */
    async reportInsightsSetNotusefulPredictionRaw(requestParameters: ReportInsightsSetNotusefulPredictionOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ReportInsightsSetNotusefulPrediction200Response>> {
        if (requestParameters['reportInsightsSetNotusefulPredictionRequest'] == null) {
            throw new runtime.RequiredError(
                'reportInsightsSetNotusefulPredictionRequest',
                'Required parameter "reportInsightsSetNotusefulPredictionRequest" was null or undefined when calling reportInsightsSetNotusefulPrediction().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/report_insights_set_notuseful_prediction`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ReportInsightsSetNotusefulPredictionRequestToJSON(requestParameters['reportInsightsSetNotusefulPredictionRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ReportInsightsSetNotusefulPrediction200ResponseFromJSON(jsonValue));
    }

    /**
     * Flags the prediction as not useful.
     * Flags the prediction as not useful.
     */
    async reportInsightsSetNotusefulPrediction(requestParameters: ReportInsightsSetNotusefulPredictionOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ReportInsightsSetNotusefulPrediction200Response> {
        const response = await this.reportInsightsSetNotusefulPredictionRaw(requestParameters, initOverrides);
        return await response.value();
    }

}