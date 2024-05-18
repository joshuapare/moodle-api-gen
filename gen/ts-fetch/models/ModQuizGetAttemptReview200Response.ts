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
import type { ModQuizGetAttemptReview200ResponseAdditionaldataInner } from './ModQuizGetAttemptReview200ResponseAdditionaldataInner';
import {
    ModQuizGetAttemptReview200ResponseAdditionaldataInnerFromJSON,
    ModQuizGetAttemptReview200ResponseAdditionaldataInnerFromJSONTyped,
    ModQuizGetAttemptReview200ResponseAdditionaldataInnerToJSON,
} from './ModQuizGetAttemptReview200ResponseAdditionaldataInner';
import type { ModQuizGetAttemptReview200ResponseAttempt } from './ModQuizGetAttemptReview200ResponseAttempt';
import {
    ModQuizGetAttemptReview200ResponseAttemptFromJSON,
    ModQuizGetAttemptReview200ResponseAttemptFromJSONTyped,
    ModQuizGetAttemptReview200ResponseAttemptToJSON,
} from './ModQuizGetAttemptReview200ResponseAttempt';
import type { ModQuizGetAttemptReview200ResponseQuestionsInner } from './ModQuizGetAttemptReview200ResponseQuestionsInner';
import {
    ModQuizGetAttemptReview200ResponseQuestionsInnerFromJSON,
    ModQuizGetAttemptReview200ResponseQuestionsInnerFromJSONTyped,
    ModQuizGetAttemptReview200ResponseQuestionsInnerToJSON,
} from './ModQuizGetAttemptReview200ResponseQuestionsInner';

/**
 * 
 * @export
 * @interface ModQuizGetAttemptReview200Response
 */
export interface ModQuizGetAttemptReview200Response {
    /**
     * 
     * @type {Array<ModQuizGetAttemptReview200ResponseAdditionaldataInner>}
     * @memberof ModQuizGetAttemptReview200Response
     */
    additionaldata: Array<ModQuizGetAttemptReview200ResponseAdditionaldataInner>;
    /**
     * 
     * @type {ModQuizGetAttemptReview200ResponseAttempt}
     * @memberof ModQuizGetAttemptReview200Response
     */
    attempt: ModQuizGetAttemptReview200ResponseAttempt;
    /**
     * grade for the quiz (or empty or "notyetgraded")
     * @type {string}
     * @memberof ModQuizGetAttemptReview200Response
     */
    grade: string;
    /**
     * 
     * @type {Array<ModQuizGetAttemptReview200ResponseQuestionsInner>}
     * @memberof ModQuizGetAttemptReview200Response
     */
    questions: Array<ModQuizGetAttemptReview200ResponseQuestionsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModQuizGetAttemptReview200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModQuizGetAttemptReview200Response interface.
 */
export function instanceOfModQuizGetAttemptReview200Response(value: object): boolean {
    if (!('additionaldata' in value)) return false;
    if (!('attempt' in value)) return false;
    if (!('grade' in value)) return false;
    if (!('questions' in value)) return false;
    return true;
}

export function ModQuizGetAttemptReview200ResponseFromJSON(json: any): ModQuizGetAttemptReview200Response {
    return ModQuizGetAttemptReview200ResponseFromJSONTyped(json, false);
}

export function ModQuizGetAttemptReview200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetAttemptReview200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'additionaldata': ((json['additionaldata'] as Array<any>).map(ModQuizGetAttemptReview200ResponseAdditionaldataInnerFromJSON)),
        'attempt': ModQuizGetAttemptReview200ResponseAttemptFromJSON(json['attempt']),
        'grade': json['grade'],
        'questions': ((json['questions'] as Array<any>).map(ModQuizGetAttemptReview200ResponseQuestionsInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModQuizGetAttemptReview200ResponseToJSON(value?: ModQuizGetAttemptReview200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'additionaldata': ((value['additionaldata'] as Array<any>).map(ModQuizGetAttemptReview200ResponseAdditionaldataInnerToJSON)),
        'attempt': ModQuizGetAttemptReview200ResponseAttemptToJSON(value['attempt']),
        'grade': value['grade'],
        'questions': ((value['questions'] as Array<any>).map(ModQuizGetAttemptReview200ResponseQuestionsInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
