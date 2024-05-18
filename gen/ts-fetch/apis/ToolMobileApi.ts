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
  ToolMobileCallExternalFunctions200Response,
  ToolMobileCallExternalFunctionsRequest,
  ToolMobileGetAutologinKey200Response,
  ToolMobileGetAutologinKeyRequest,
  ToolMobileGetConfig200Response,
  ToolMobileGetConfigRequest,
  ToolMobileGetContent200Response,
  ToolMobileGetContentRequest,
  ToolMobileGetPluginsSupportingMobile200Response,
  ToolMobileGetPublicConfig200Response,
  ToolMobileGetTokensForQrLogin200Response,
  ToolMobileGetTokensForQrLoginRequest,
  ToolMobileValidateSubscriptionKey200Response,
  ToolMobileValidateSubscriptionKeyRequest,
} from '../models/index';
import {
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    ToolMobileCallExternalFunctions200ResponseFromJSON,
    ToolMobileCallExternalFunctions200ResponseToJSON,
    ToolMobileCallExternalFunctionsRequestFromJSON,
    ToolMobileCallExternalFunctionsRequestToJSON,
    ToolMobileGetAutologinKey200ResponseFromJSON,
    ToolMobileGetAutologinKey200ResponseToJSON,
    ToolMobileGetAutologinKeyRequestFromJSON,
    ToolMobileGetAutologinKeyRequestToJSON,
    ToolMobileGetConfig200ResponseFromJSON,
    ToolMobileGetConfig200ResponseToJSON,
    ToolMobileGetConfigRequestFromJSON,
    ToolMobileGetConfigRequestToJSON,
    ToolMobileGetContent200ResponseFromJSON,
    ToolMobileGetContent200ResponseToJSON,
    ToolMobileGetContentRequestFromJSON,
    ToolMobileGetContentRequestToJSON,
    ToolMobileGetPluginsSupportingMobile200ResponseFromJSON,
    ToolMobileGetPluginsSupportingMobile200ResponseToJSON,
    ToolMobileGetPublicConfig200ResponseFromJSON,
    ToolMobileGetPublicConfig200ResponseToJSON,
    ToolMobileGetTokensForQrLogin200ResponseFromJSON,
    ToolMobileGetTokensForQrLogin200ResponseToJSON,
    ToolMobileGetTokensForQrLoginRequestFromJSON,
    ToolMobileGetTokensForQrLoginRequestToJSON,
    ToolMobileValidateSubscriptionKey200ResponseFromJSON,
    ToolMobileValidateSubscriptionKey200ResponseToJSON,
    ToolMobileValidateSubscriptionKeyRequestFromJSON,
    ToolMobileValidateSubscriptionKeyRequestToJSON,
} from '../models/index';

export interface ToolMobileCallExternalFunctionsOperationRequest {
    toolMobileCallExternalFunctionsRequest: ToolMobileCallExternalFunctionsRequest;
}

export interface ToolMobileGetAutologinKeyOperationRequest {
    toolMobileGetAutologinKeyRequest: ToolMobileGetAutologinKeyRequest;
}

export interface ToolMobileGetConfigOperationRequest {
    toolMobileGetConfigRequest: ToolMobileGetConfigRequest;
}

export interface ToolMobileGetContentOperationRequest {
    toolMobileGetContentRequest: ToolMobileGetContentRequest;
}

export interface ToolMobileGetTokensForQrLoginOperationRequest {
    toolMobileGetTokensForQrLoginRequest: ToolMobileGetTokensForQrLoginRequest;
}

export interface ToolMobileValidateSubscriptionKeyOperationRequest {
    toolMobileValidateSubscriptionKeyRequest: ToolMobileValidateSubscriptionKeyRequest;
}

/**
 * 
 */
export class ToolMobileApi extends runtime.BaseAPI {

    /**
     * Call multiple external functions and return all responses.
     * Call multiple external functions and return all responses.
     */
    async toolMobileCallExternalFunctionsRaw(requestParameters: ToolMobileCallExternalFunctionsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileCallExternalFunctions200Response>> {
        if (requestParameters['toolMobileCallExternalFunctionsRequest'] == null) {
            throw new runtime.RequiredError(
                'toolMobileCallExternalFunctionsRequest',
                'Required parameter "toolMobileCallExternalFunctionsRequest" was null or undefined when calling toolMobileCallExternalFunctions().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_call_external_functions`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolMobileCallExternalFunctionsRequestToJSON(requestParameters['toolMobileCallExternalFunctionsRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileCallExternalFunctions200ResponseFromJSON(jsonValue));
    }

    /**
     * Call multiple external functions and return all responses.
     * Call multiple external functions and return all responses.
     */
    async toolMobileCallExternalFunctions(requestParameters: ToolMobileCallExternalFunctionsOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileCallExternalFunctions200Response> {
        const response = await this.toolMobileCallExternalFunctionsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
     * Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
     */
    async toolMobileGetAutologinKeyRaw(requestParameters: ToolMobileGetAutologinKeyOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileGetAutologinKey200Response>> {
        if (requestParameters['toolMobileGetAutologinKeyRequest'] == null) {
            throw new runtime.RequiredError(
                'toolMobileGetAutologinKeyRequest',
                'Required parameter "toolMobileGetAutologinKeyRequest" was null or undefined when calling toolMobileGetAutologinKey().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_get_autologin_key`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolMobileGetAutologinKeyRequestToJSON(requestParameters['toolMobileGetAutologinKeyRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileGetAutologinKey200ResponseFromJSON(jsonValue));
    }

    /**
     * Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
     * Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
     */
    async toolMobileGetAutologinKey(requestParameters: ToolMobileGetAutologinKeyOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileGetAutologinKey200Response> {
        const response = await this.toolMobileGetAutologinKeyRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns a list of the site configurations, filtering by section.
     * Returns a list of the site configurations, filtering by section.
     */
    async toolMobileGetConfigRaw(requestParameters: ToolMobileGetConfigOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileGetConfig200Response>> {
        if (requestParameters['toolMobileGetConfigRequest'] == null) {
            throw new runtime.RequiredError(
                'toolMobileGetConfigRequest',
                'Required parameter "toolMobileGetConfigRequest" was null or undefined when calling toolMobileGetConfig().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_get_config`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolMobileGetConfigRequestToJSON(requestParameters['toolMobileGetConfigRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileGetConfig200ResponseFromJSON(jsonValue));
    }

    /**
     * Returns a list of the site configurations, filtering by section.
     * Returns a list of the site configurations, filtering by section.
     */
    async toolMobileGetConfig(requestParameters: ToolMobileGetConfigOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileGetConfig200Response> {
        const response = await this.toolMobileGetConfigRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns a piece of content to be displayed in the Mobile app.
     * Returns a piece of content to be displayed in the Mobile app.
     */
    async toolMobileGetContentRaw(requestParameters: ToolMobileGetContentOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileGetContent200Response>> {
        if (requestParameters['toolMobileGetContentRequest'] == null) {
            throw new runtime.RequiredError(
                'toolMobileGetContentRequest',
                'Required parameter "toolMobileGetContentRequest" was null or undefined when calling toolMobileGetContent().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_get_content`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolMobileGetContentRequestToJSON(requestParameters['toolMobileGetContentRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileGetContent200ResponseFromJSON(jsonValue));
    }

    /**
     * Returns a piece of content to be displayed in the Mobile app.
     * Returns a piece of content to be displayed in the Mobile app.
     */
    async toolMobileGetContent(requestParameters: ToolMobileGetContentOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileGetContent200Response> {
        const response = await this.toolMobileGetContentRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns a list of Moodle plugins supporting the mobile app.
     * Returns a list of Moodle plugins supporting the mobile app.
     */
    async toolMobileGetPluginsSupportingMobileRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileGetPluginsSupportingMobile200Response>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_get_plugins_supporting_mobile`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileGetPluginsSupportingMobile200ResponseFromJSON(jsonValue));
    }

    /**
     * Returns a list of Moodle plugins supporting the mobile app.
     * Returns a list of Moodle plugins supporting the mobile app.
     */
    async toolMobileGetPluginsSupportingMobile(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileGetPluginsSupportingMobile200Response> {
        const response = await this.toolMobileGetPluginsSupportingMobileRaw(initOverrides);
        return await response.value();
    }

    /**
     * Returns a list of the site public settings, those not requiring authentication.
     * Returns a list of the site public settings, those not requiring authentication.
     */
    async toolMobileGetPublicConfigRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileGetPublicConfig200Response>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_get_public_config`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileGetPublicConfig200ResponseFromJSON(jsonValue));
    }

    /**
     * Returns a list of the site public settings, those not requiring authentication.
     * Returns a list of the site public settings, those not requiring authentication.
     */
    async toolMobileGetPublicConfig(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileGetPublicConfig200Response> {
        const response = await this.toolMobileGetPublicConfigRaw(initOverrides);
        return await response.value();
    }

    /**
     * Returns a WebService token (and private token) for QR login.
     * Returns a WebService token (and private token) for QR login.
     */
    async toolMobileGetTokensForQrLoginRaw(requestParameters: ToolMobileGetTokensForQrLoginOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileGetTokensForQrLogin200Response>> {
        if (requestParameters['toolMobileGetTokensForQrLoginRequest'] == null) {
            throw new runtime.RequiredError(
                'toolMobileGetTokensForQrLoginRequest',
                'Required parameter "toolMobileGetTokensForQrLoginRequest" was null or undefined when calling toolMobileGetTokensForQrLogin().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_get_tokens_for_qr_login`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolMobileGetTokensForQrLoginRequestToJSON(requestParameters['toolMobileGetTokensForQrLoginRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileGetTokensForQrLogin200ResponseFromJSON(jsonValue));
    }

    /**
     * Returns a WebService token (and private token) for QR login.
     * Returns a WebService token (and private token) for QR login.
     */
    async toolMobileGetTokensForQrLogin(requestParameters: ToolMobileGetTokensForQrLoginOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileGetTokensForQrLogin200Response> {
        const response = await this.toolMobileGetTokensForQrLoginRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Check if the given site subscription key is valid.
     * Check if the given site subscription key is valid.
     */
    async toolMobileValidateSubscriptionKeyRaw(requestParameters: ToolMobileValidateSubscriptionKeyOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ToolMobileValidateSubscriptionKey200Response>> {
        if (requestParameters['toolMobileValidateSubscriptionKeyRequest'] == null) {
            throw new runtime.RequiredError(
                'toolMobileValidateSubscriptionKeyRequest',
                'Required parameter "toolMobileValidateSubscriptionKeyRequest" was null or undefined when calling toolMobileValidateSubscriptionKey().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["Authorization"] = await this.configuration.apiKey("Authorization"); // apiKey authentication
        }

        const response = await this.request({
            path: `/tool_mobile_validate_subscription_key`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ToolMobileValidateSubscriptionKeyRequestToJSON(requestParameters['toolMobileValidateSubscriptionKeyRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ToolMobileValidateSubscriptionKey200ResponseFromJSON(jsonValue));
    }

    /**
     * Check if the given site subscription key is valid.
     * Check if the given site subscription key is valid.
     */
    async toolMobileValidateSubscriptionKey(requestParameters: ToolMobileValidateSubscriptionKeyOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ToolMobileValidateSubscriptionKey200Response> {
        const response = await this.toolMobileValidateSubscriptionKeyRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
