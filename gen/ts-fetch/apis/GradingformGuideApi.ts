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
  CoreGradesGraderGradingpanelScaleFetchRequest,
  CoreGradesGraderGradingpanelScaleStoreRequest,
  ErrorResponse,
  GradingformGuideGraderGradingpanelFetch200Response,
  GradingformGuideGraderGradingpanelStore200Response,
} from '../models/index';
import {
    CoreGradesGraderGradingpanelScaleFetchRequestFromJSON,
    CoreGradesGraderGradingpanelScaleFetchRequestToJSON,
    CoreGradesGraderGradingpanelScaleStoreRequestFromJSON,
    CoreGradesGraderGradingpanelScaleStoreRequestToJSON,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    GradingformGuideGraderGradingpanelFetch200ResponseFromJSON,
    GradingformGuideGraderGradingpanelFetch200ResponseToJSON,
    GradingformGuideGraderGradingpanelStore200ResponseFromJSON,
    GradingformGuideGraderGradingpanelStore200ResponseToJSON,
} from '../models/index';

export interface GradingformGuideGraderGradingpanelFetchRequest {
    coreGradesGraderGradingpanelScaleFetchRequest: CoreGradesGraderGradingpanelScaleFetchRequest;
}

export interface GradingformGuideGraderGradingpanelStoreRequest {
    coreGradesGraderGradingpanelScaleStoreRequest: CoreGradesGraderGradingpanelScaleStoreRequest;
}

/**
 * 
 */
export class GradingformGuideApi extends runtime.BaseAPI {

    /**
     * Fetch the data required to display the grader grading panel, creating the grade item if required
     * Fetch the data required to display the grader grading panel, creating the grade item if required
     */
    async gradingformGuideGraderGradingpanelFetchRaw(requestParameters: GradingformGuideGraderGradingpanelFetchRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GradingformGuideGraderGradingpanelFetch200Response>> {
        if (requestParameters['coreGradesGraderGradingpanelScaleFetchRequest'] == null) {
            throw new runtime.RequiredError(
                'coreGradesGraderGradingpanelScaleFetchRequest',
                'Required parameter "coreGradesGraderGradingpanelScaleFetchRequest" was null or undefined when calling gradingformGuideGraderGradingpanelFetch().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/gradingform_guide_grader_gradingpanel_fetch`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CoreGradesGraderGradingpanelScaleFetchRequestToJSON(requestParameters['coreGradesGraderGradingpanelScaleFetchRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GradingformGuideGraderGradingpanelFetch200ResponseFromJSON(jsonValue));
    }

    /**
     * Fetch the data required to display the grader grading panel, creating the grade item if required
     * Fetch the data required to display the grader grading panel, creating the grade item if required
     */
    async gradingformGuideGraderGradingpanelFetch(requestParameters: GradingformGuideGraderGradingpanelFetchRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GradingformGuideGraderGradingpanelFetch200Response> {
        const response = await this.gradingformGuideGraderGradingpanelFetchRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Store the grading data for a user from the grader grading panel.
     * Store the grading data for a user from the grader grading panel.
     */
    async gradingformGuideGraderGradingpanelStoreRaw(requestParameters: GradingformGuideGraderGradingpanelStoreRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GradingformGuideGraderGradingpanelStore200Response>> {
        if (requestParameters['coreGradesGraderGradingpanelScaleStoreRequest'] == null) {
            throw new runtime.RequiredError(
                'coreGradesGraderGradingpanelScaleStoreRequest',
                'Required parameter "coreGradesGraderGradingpanelScaleStoreRequest" was null or undefined when calling gradingformGuideGraderGradingpanelStore().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/gradingform_guide_grader_gradingpanel_store`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CoreGradesGraderGradingpanelScaleStoreRequestToJSON(requestParameters['coreGradesGraderGradingpanelScaleStoreRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GradingformGuideGraderGradingpanelStore200ResponseFromJSON(jsonValue));
    }

    /**
     * Store the grading data for a user from the grader grading panel.
     * Store the grading data for a user from the grader grading panel.
     */
    async gradingformGuideGraderGradingpanelStore(requestParameters: GradingformGuideGraderGradingpanelStoreRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GradingformGuideGraderGradingpanelStore200Response> {
        const response = await this.gradingformGuideGraderGradingpanelStoreRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
