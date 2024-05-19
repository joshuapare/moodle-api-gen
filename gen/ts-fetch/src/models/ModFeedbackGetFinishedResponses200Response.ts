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

import { mapValues } from '../runtime';
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';
import type { ModFeedbackGetFinishedResponses200ResponseResponsesInner } from './ModFeedbackGetFinishedResponses200ResponseResponsesInner';
import {
    ModFeedbackGetFinishedResponses200ResponseResponsesInnerFromJSON,
    ModFeedbackGetFinishedResponses200ResponseResponsesInnerFromJSONTyped,
    ModFeedbackGetFinishedResponses200ResponseResponsesInnerToJSON,
} from './ModFeedbackGetFinishedResponses200ResponseResponsesInner';

/**
 * 
 * @export
 * @interface ModFeedbackGetFinishedResponses200Response
 */
export interface ModFeedbackGetFinishedResponses200Response {
    /**
     * 
     * @type {Array<ModFeedbackGetFinishedResponses200ResponseResponsesInner>}
     * @memberof ModFeedbackGetFinishedResponses200Response
     */
    Responses: Array<ModFeedbackGetFinishedResponses200ResponseResponsesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModFeedbackGetFinishedResponses200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModFeedbackGetFinishedResponses200Response interface.
 */
export function instanceOfModFeedbackGetFinishedResponses200Response(value: object): boolean {
    if (!('Responses' in value)) return false;
    return true;
}

export function ModFeedbackGetFinishedResponses200ResponseFromJSON(json: any): ModFeedbackGetFinishedResponses200Response {
    return ModFeedbackGetFinishedResponses200ResponseFromJSONTyped(json, false);
}

export function ModFeedbackGetFinishedResponses200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetFinishedResponses200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Responses': ((json['responses'] as Array<any>).map(ModFeedbackGetFinishedResponses200ResponseResponsesInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModFeedbackGetFinishedResponses200ResponseToJSON(value?: ModFeedbackGetFinishedResponses200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'responses': ((value['Responses'] as Array<any>).map(ModFeedbackGetFinishedResponses200ResponseResponsesInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

