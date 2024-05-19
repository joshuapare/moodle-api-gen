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
import type { ModQuizGetAttemptReview200ResponseQuestionsInner } from './ModQuizGetAttemptReview200ResponseQuestionsInner';
import {
    ModQuizGetAttemptReview200ResponseQuestionsInnerFromJSON,
    ModQuizGetAttemptReview200ResponseQuestionsInnerFromJSONTyped,
    ModQuizGetAttemptReview200ResponseQuestionsInnerToJSON,
} from './ModQuizGetAttemptReview200ResponseQuestionsInner';

/**
 * 
 * @export
 * @interface ModQuizGetAttemptSummary200Response
 */
export interface ModQuizGetAttemptSummary200Response {
    /**
     * 
     * @type {Array<ModQuizGetAttemptReview200ResponseQuestionsInner>}
     * @memberof ModQuizGetAttemptSummary200Response
     */
    Questions: Array<ModQuizGetAttemptReview200ResponseQuestionsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModQuizGetAttemptSummary200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModQuizGetAttemptSummary200Response interface.
 */
export function instanceOfModQuizGetAttemptSummary200Response(value: object): boolean {
    if (!('Questions' in value)) return false;
    return true;
}

export function ModQuizGetAttemptSummary200ResponseFromJSON(json: any): ModQuizGetAttemptSummary200Response {
    return ModQuizGetAttemptSummary200ResponseFromJSONTyped(json, false);
}

export function ModQuizGetAttemptSummary200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetAttemptSummary200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Questions': ((json['questions'] as Array<any>).map(ModQuizGetAttemptReview200ResponseQuestionsInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModQuizGetAttemptSummary200ResponseToJSON(value?: ModQuizGetAttemptSummary200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'questions': ((value['Questions'] as Array<any>).map(ModQuizGetAttemptReview200ResponseQuestionsInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

