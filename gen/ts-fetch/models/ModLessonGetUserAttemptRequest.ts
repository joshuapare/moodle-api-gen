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
 * @interface ModLessonGetUserAttemptRequest
 */
export interface ModLessonGetUserAttemptRequest {
    /**
     * The attempt number.
     * @type {number}
     * @memberof ModLessonGetUserAttemptRequest
     */
    lessonattempt: number;
    /**
     * Lesson instance id.
     * @type {number}
     * @memberof ModLessonGetUserAttemptRequest
     */
    lessonid: number;
    /**
     * The user id. 0 for current user.
     * @type {number}
     * @memberof ModLessonGetUserAttemptRequest
     */
    userid: number;
}

/**
 * Check if a given object implements the ModLessonGetUserAttemptRequest interface.
 */
export function instanceOfModLessonGetUserAttemptRequest(value: object): boolean {
    if (!('lessonattempt' in value)) return false;
    if (!('lessonid' in value)) return false;
    if (!('userid' in value)) return false;
    return true;
}

export function ModLessonGetUserAttemptRequestFromJSON(json: any): ModLessonGetUserAttemptRequest {
    return ModLessonGetUserAttemptRequestFromJSONTyped(json, false);
}

export function ModLessonGetUserAttemptRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetUserAttemptRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'lessonattempt': json['lessonattempt'],
        'lessonid': json['lessonid'],
        'userid': json['userid'],
    };
}

export function ModLessonGetUserAttemptRequestToJSON(value?: ModLessonGetUserAttemptRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lessonattempt': value['lessonattempt'],
        'lessonid': value['lessonid'],
        'userid': value['userid'],
    };
}

