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
import type { ModSurveyGetQuestions200ResponseQuestionsInner } from './ModSurveyGetQuestions200ResponseQuestionsInner';
import {
    ModSurveyGetQuestions200ResponseQuestionsInnerFromJSON,
    ModSurveyGetQuestions200ResponseQuestionsInnerFromJSONTyped,
    ModSurveyGetQuestions200ResponseQuestionsInnerToJSON,
} from './ModSurveyGetQuestions200ResponseQuestionsInner';

/**
 * 
 * @export
 * @interface ModSurveyGetQuestions200Response
 */
export interface ModSurveyGetQuestions200Response {
    /**
     * 
     * @type {Array<ModSurveyGetQuestions200ResponseQuestionsInner>}
     * @memberof ModSurveyGetQuestions200Response
     */
    questions: Array<ModSurveyGetQuestions200ResponseQuestionsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModSurveyGetQuestions200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModSurveyGetQuestions200Response interface.
 */
export function instanceOfModSurveyGetQuestions200Response(value: object): boolean {
    if (!('questions' in value)) return false;
    return true;
}

export function ModSurveyGetQuestions200ResponseFromJSON(json: any): ModSurveyGetQuestions200Response {
    return ModSurveyGetQuestions200ResponseFromJSONTyped(json, false);
}

export function ModSurveyGetQuestions200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModSurveyGetQuestions200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'questions': ((json['questions'] as Array<any>).map(ModSurveyGetQuestions200ResponseQuestionsInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModSurveyGetQuestions200ResponseToJSON(value?: ModSurveyGetQuestions200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'questions': ((value['questions'] as Array<any>).map(ModSurveyGetQuestions200ResponseQuestionsInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

