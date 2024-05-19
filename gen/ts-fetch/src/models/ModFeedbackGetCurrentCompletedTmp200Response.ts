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
import type { ModFeedbackGetCurrentCompletedTmp200ResponseFeedback } from './ModFeedbackGetCurrentCompletedTmp200ResponseFeedback';
import {
    ModFeedbackGetCurrentCompletedTmp200ResponseFeedbackFromJSON,
    ModFeedbackGetCurrentCompletedTmp200ResponseFeedbackFromJSONTyped,
    ModFeedbackGetCurrentCompletedTmp200ResponseFeedbackToJSON,
} from './ModFeedbackGetCurrentCompletedTmp200ResponseFeedback';

/**
 * 
 * @export
 * @interface ModFeedbackGetCurrentCompletedTmp200Response
 */
export interface ModFeedbackGetCurrentCompletedTmp200Response {
    /**
     * 
     * @type {ModFeedbackGetCurrentCompletedTmp200ResponseFeedback}
     * @memberof ModFeedbackGetCurrentCompletedTmp200Response
     */
    Feedback: ModFeedbackGetCurrentCompletedTmp200ResponseFeedback;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModFeedbackGetCurrentCompletedTmp200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModFeedbackGetCurrentCompletedTmp200Response interface.
 */
export function instanceOfModFeedbackGetCurrentCompletedTmp200Response(value: object): boolean {
    if (!('Feedback' in value)) return false;
    return true;
}

export function ModFeedbackGetCurrentCompletedTmp200ResponseFromJSON(json: any): ModFeedbackGetCurrentCompletedTmp200Response {
    return ModFeedbackGetCurrentCompletedTmp200ResponseFromJSONTyped(json, false);
}

export function ModFeedbackGetCurrentCompletedTmp200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetCurrentCompletedTmp200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Feedback': ModFeedbackGetCurrentCompletedTmp200ResponseFeedbackFromJSON(json['feedback']),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModFeedbackGetCurrentCompletedTmp200ResponseToJSON(value?: ModFeedbackGetCurrentCompletedTmp200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feedback': ModFeedbackGetCurrentCompletedTmp200ResponseFeedbackToJSON(value['Feedback']),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

