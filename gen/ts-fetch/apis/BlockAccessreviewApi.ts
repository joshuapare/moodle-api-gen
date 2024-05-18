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
  BlockAccessreviewGetModuleDataRequest,
  BlockAccessreviewGetSectionDataRequest,
  ErrorResponse,
} from '../models/index';
import {
    BlockAccessreviewGetModuleDataRequestFromJSON,
    BlockAccessreviewGetModuleDataRequestToJSON,
    BlockAccessreviewGetSectionDataRequestFromJSON,
    BlockAccessreviewGetSectionDataRequestToJSON,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
} from '../models/index';

export interface BlockAccessreviewGetModuleDataOperationRequest {
    blockAccessreviewGetModuleDataRequest: BlockAccessreviewGetModuleDataRequest;
}

export interface BlockAccessreviewGetSectionDataOperationRequest {
    blockAccessreviewGetSectionDataRequest: BlockAccessreviewGetSectionDataRequest;
}

/**
 * 
 */
export class BlockAccessreviewApi extends runtime.BaseAPI {

    /**
     * Gets error data for course modules.
     * Gets error data for course modules.
     */
    async blockAccessreviewGetModuleDataRaw(requestParameters: BlockAccessreviewGetModuleDataOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<object>> {
        if (requestParameters['blockAccessreviewGetModuleDataRequest'] == null) {
            throw new runtime.RequiredError(
                'blockAccessreviewGetModuleDataRequest',
                'Required parameter "blockAccessreviewGetModuleDataRequest" was null or undefined when calling blockAccessreviewGetModuleData().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/block_accessreview_get_module_data`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: BlockAccessreviewGetModuleDataRequestToJSON(requestParameters['blockAccessreviewGetModuleDataRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Gets error data for course modules.
     * Gets error data for course modules.
     */
    async blockAccessreviewGetModuleData(requestParameters: BlockAccessreviewGetModuleDataOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<object> {
        const response = await this.blockAccessreviewGetModuleDataRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Gets error data for course sections.
     * Gets error data for course sections.
     */
    async blockAccessreviewGetSectionDataRaw(requestParameters: BlockAccessreviewGetSectionDataOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<object>> {
        if (requestParameters['blockAccessreviewGetSectionDataRequest'] == null) {
            throw new runtime.RequiredError(
                'blockAccessreviewGetSectionDataRequest',
                'Required parameter "blockAccessreviewGetSectionDataRequest" was null or undefined when calling blockAccessreviewGetSectionData().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/block_accessreview_get_section_data`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: BlockAccessreviewGetSectionDataRequestToJSON(requestParameters['blockAccessreviewGetSectionDataRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Gets error data for course sections.
     * Gets error data for course sections.
     */
    async blockAccessreviewGetSectionData(requestParameters: BlockAccessreviewGetSectionDataOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<object> {
        const response = await this.blockAccessreviewGetSectionDataRaw(requestParameters, initOverrides);
        return await response.value();
    }

}