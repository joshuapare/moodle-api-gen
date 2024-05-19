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
 * @interface ModLessonGetQuestionsAttemptsRequest
 */
export interface ModLessonGetQuestionsAttemptsRequest {
    /**
     * lesson attempt number
     * @type {number}
     * @memberof ModLessonGetQuestionsAttemptsRequest
     */
    Attempt: number;
    /**
     * only fetch correct attempts
     * @type {boolean}
     * @memberof ModLessonGetQuestionsAttemptsRequest
     */
    Correct?: boolean;
    /**
     * lesson instance id
     * @type {number}
     * @memberof ModLessonGetQuestionsAttemptsRequest
     */
    Lessonid: number;
    /**
     * only fetch attempts at the given page
     * @type {number}
     * @memberof ModLessonGetQuestionsAttemptsRequest
     */
    Pageid?: number;
    /**
     * only fetch attempts of the given user
     * @type {number}
     * @memberof ModLessonGetQuestionsAttemptsRequest
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModLessonGetQuestionsAttemptsRequest interface.
 */
export function instanceOfModLessonGetQuestionsAttemptsRequest(value: object): boolean {
    if (!('Attempt' in value)) return false;
    if (!('Lessonid' in value)) return false;
    return true;
}

export function ModLessonGetQuestionsAttemptsRequestFromJSON(json: any): ModLessonGetQuestionsAttemptsRequest {
    return ModLessonGetQuestionsAttemptsRequestFromJSONTyped(json, false);
}

export function ModLessonGetQuestionsAttemptsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetQuestionsAttemptsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Attempt': json['attempt'],
        'Correct': json['correct'] == null ? undefined : json['correct'],
        'Lessonid': json['lessonid'],
        'Pageid': json['pageid'] == null ? undefined : json['pageid'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModLessonGetQuestionsAttemptsRequestToJSON(value?: ModLessonGetQuestionsAttemptsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempt': value['Attempt'],
        'correct': value['Correct'],
        'lessonid': value['Lessonid'],
        'pageid': value['Pageid'],
        'userid': value['Userid'],
    };
}

