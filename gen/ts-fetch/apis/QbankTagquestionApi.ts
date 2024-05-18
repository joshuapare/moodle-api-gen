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
  CoreQuestionSubmitTagsForm200Response,
  ErrorResponse,
  QbankTagquestionSubmitTagsFormRequest,
} from '../models/index';
import {
    CoreQuestionSubmitTagsForm200ResponseFromJSON,
    CoreQuestionSubmitTagsForm200ResponseToJSON,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    QbankTagquestionSubmitTagsFormRequestFromJSON,
    QbankTagquestionSubmitTagsFormRequestToJSON,
} from '../models/index';

export interface QbankTagquestionSubmitTagsFormOperationRequest {
    qbankTagquestionSubmitTagsFormRequest: QbankTagquestionSubmitTagsFormRequest;
}

/**
 * 
 */
export class QbankTagquestionApi extends runtime.BaseAPI {

    /**
     * Update the question tags.
     * Update the question tags.
     */
    async qbankTagquestionSubmitTagsFormRaw(requestParameters: QbankTagquestionSubmitTagsFormOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CoreQuestionSubmitTagsForm200Response>> {
        if (requestParameters['qbankTagquestionSubmitTagsFormRequest'] == null) {
            throw new runtime.RequiredError(
                'qbankTagquestionSubmitTagsFormRequest',
                'Required parameter "qbankTagquestionSubmitTagsFormRequest" was null or undefined when calling qbankTagquestionSubmitTagsForm().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/qbank_tagquestion_submit_tags_form`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: QbankTagquestionSubmitTagsFormRequestToJSON(requestParameters['qbankTagquestionSubmitTagsFormRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CoreQuestionSubmitTagsForm200ResponseFromJSON(jsonValue));
    }

    /**
     * Update the question tags.
     * Update the question tags.
     */
    async qbankTagquestionSubmitTagsForm(requestParameters: QbankTagquestionSubmitTagsFormOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CoreQuestionSubmitTagsForm200Response> {
        const response = await this.qbankTagquestionSubmitTagsFormRaw(requestParameters, initOverrides);
        return await response.value();
    }

}