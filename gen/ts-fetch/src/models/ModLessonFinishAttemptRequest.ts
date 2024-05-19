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
 * @interface ModLessonFinishAttemptRequest
 */
export interface ModLessonFinishAttemptRequest {
    /**
     * Lesson instance id.
     * @type {number}
     * @memberof ModLessonFinishAttemptRequest
     */
    Lessonid: number;
    /**
     * If the user run out of time.
     * @type {boolean}
     * @memberof ModLessonFinishAttemptRequest
     */
    Outoftime?: boolean;
    /**
     * Optional password (the lesson may be protected).
     * @type {string}
     * @memberof ModLessonFinishAttemptRequest
     */
    Password?: string;
    /**
     * If we want to review just after finishing (1 hour margin).
     * @type {boolean}
     * @memberof ModLessonFinishAttemptRequest
     */
    Review?: boolean;
}

/**
 * Check if a given object implements the ModLessonFinishAttemptRequest interface.
 */
export function instanceOfModLessonFinishAttemptRequest(value: object): boolean {
    if (!('Lessonid' in value)) return false;
    return true;
}

export function ModLessonFinishAttemptRequestFromJSON(json: any): ModLessonFinishAttemptRequest {
    return ModLessonFinishAttemptRequestFromJSONTyped(json, false);
}

export function ModLessonFinishAttemptRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonFinishAttemptRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Lessonid': json['lessonid'],
        'Outoftime': json['outoftime'] == null ? undefined : json['outoftime'],
        'Password': json['password'] == null ? undefined : json['password'],
        'Review': json['review'] == null ? undefined : json['review'],
    };
}

export function ModLessonFinishAttemptRequestToJSON(value?: ModLessonFinishAttemptRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lessonid': value['Lessonid'],
        'outoftime': value['Outoftime'],
        'password': value['Password'],
        'review': value['Review'],
    };
}
