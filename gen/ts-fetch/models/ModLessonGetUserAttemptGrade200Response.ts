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
import type { ModLessonGetUserAttemptGrade200ResponseGrade } from './ModLessonGetUserAttemptGrade200ResponseGrade';
import {
    ModLessonGetUserAttemptGrade200ResponseGradeFromJSON,
    ModLessonGetUserAttemptGrade200ResponseGradeFromJSONTyped,
    ModLessonGetUserAttemptGrade200ResponseGradeToJSON,
} from './ModLessonGetUserAttemptGrade200ResponseGrade';

/**
 * 
 * @export
 * @interface ModLessonGetUserAttemptGrade200Response
 */
export interface ModLessonGetUserAttemptGrade200Response {
    /**
     * 
     * @type {ModLessonGetUserAttemptGrade200ResponseGrade}
     * @memberof ModLessonGetUserAttemptGrade200Response
     */
    grade: ModLessonGetUserAttemptGrade200ResponseGrade;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModLessonGetUserAttemptGrade200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModLessonGetUserAttemptGrade200Response interface.
 */
export function instanceOfModLessonGetUserAttemptGrade200Response(value: object): boolean {
    if (!('grade' in value)) return false;
    return true;
}

export function ModLessonGetUserAttemptGrade200ResponseFromJSON(json: any): ModLessonGetUserAttemptGrade200Response {
    return ModLessonGetUserAttemptGrade200ResponseFromJSONTyped(json, false);
}

export function ModLessonGetUserAttemptGrade200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetUserAttemptGrade200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'grade': ModLessonGetUserAttemptGrade200ResponseGradeFromJSON(json['grade']),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModLessonGetUserAttemptGrade200ResponseToJSON(value?: ModLessonGetUserAttemptGrade200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'grade': ModLessonGetUserAttemptGrade200ResponseGradeToJSON(value['grade']),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
