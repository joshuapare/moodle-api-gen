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
/**
 * 
 * @export
 * @interface ModLessonGetUserAttemptGradeRequest
 */
export interface ModLessonGetUserAttemptGradeRequest {
    /**
     * lesson attempt number
     * @type {number}
     * @memberof ModLessonGetUserAttemptGradeRequest
     */
    lessonattempt: number;
    /**
     * lesson instance id
     * @type {number}
     * @memberof ModLessonGetUserAttemptGradeRequest
     */
    lessonid: number;
    /**
     * the user id (empty for current user)
     * @type {number}
     * @memberof ModLessonGetUserAttemptGradeRequest
     */
    userid?: number;
}

/**
 * Check if a given object implements the ModLessonGetUserAttemptGradeRequest interface.
 */
export function instanceOfModLessonGetUserAttemptGradeRequest(value: object): boolean {
    if (!('lessonattempt' in value)) return false;
    if (!('lessonid' in value)) return false;
    return true;
}

export function ModLessonGetUserAttemptGradeRequestFromJSON(json: any): ModLessonGetUserAttemptGradeRequest {
    return ModLessonGetUserAttemptGradeRequestFromJSONTyped(json, false);
}

export function ModLessonGetUserAttemptGradeRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetUserAttemptGradeRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'lessonattempt': json['lessonattempt'],
        'lessonid': json['lessonid'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModLessonGetUserAttemptGradeRequestToJSON(value?: ModLessonGetUserAttemptGradeRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lessonattempt': value['lessonattempt'],
        'lessonid': value['lessonid'],
        'userid': value['userid'],
    };
}

