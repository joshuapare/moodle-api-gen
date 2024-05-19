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
  QuizaccessSebValidateQuizKeys200Response,
  QuizaccessSebValidateQuizKeysRequest,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    QuizaccessSebValidateQuizKeys200ResponseFromJSON,
    QuizaccessSebValidateQuizKeys200ResponseToJSON,
    QuizaccessSebValidateQuizKeysRequestFromJSON,
    QuizaccessSebValidateQuizKeysRequestToJSON,
} from '../models/index';

export interface QuizaccessSebValidateQuizKeysOperationRequest {
    quizaccessSebValidateQuizKeysRequest: QuizaccessSebValidateQuizKeysRequest;
}

/**
 * 
 */
export class QuizaccessSebApi extends runtime.BaseAPI {

    /**
     * Validate a Safe Exam Browser config key or a browser exam key.
     * Validate a Safe Exam Browser config key or a browser exam key.
     */
    async quizaccessSebValidateQuizKeysRaw(requestParameters: QuizaccessSebValidateQuizKeysOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<QuizaccessSebValidateQuizKeys200Response>> {
        if (requestParameters['quizaccessSebValidateQuizKeysRequest'] == null) {
            throw new runtime.RequiredError(
                'quizaccessSebValidateQuizKeysRequest',
                'Required parameter "quizaccessSebValidateQuizKeysRequest" was null or undefined when calling quizaccessSebValidateQuizKeys().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/quizaccess_seb_validate_quiz_keys`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: QuizaccessSebValidateQuizKeysRequestToJSON(requestParameters['quizaccessSebValidateQuizKeysRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => QuizaccessSebValidateQuizKeys200ResponseFromJSON(jsonValue));
    }

    /**
     * Validate a Safe Exam Browser config key or a browser exam key.
     * Validate a Safe Exam Browser config key or a browser exam key.
     */
    async quizaccessSebValidateQuizKeys(requestParameters: QuizaccessSebValidateQuizKeysOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<QuizaccessSebValidateQuizKeys200Response> {
        const response = await this.quizaccessSebValidateQuizKeysRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
