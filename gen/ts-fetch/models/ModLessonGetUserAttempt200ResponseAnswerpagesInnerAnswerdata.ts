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
 * @interface ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
 */
export interface ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata {
    /**
     * 
     * @type {Array<object>}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
     */
    answers?: Array<object>;
    /**
     * The response text.
     * @type {string}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
     */
    response: string;
    /**
     * response. format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
     */
    responseformat: number;
    /**
     * The score (text version).
     * @type {string}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
     */
    score: string;
}

/**
 * Check if a given object implements the ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata interface.
 */
export function instanceOfModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata(value: object): boolean {
    if (!('response' in value)) return false;
    if (!('responseformat' in value)) return false;
    if (!('score' in value)) return false;
    return true;
}

export function ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataFromJSON(json: any): ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata {
    return ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataFromJSONTyped(json, false);
}

export function ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata {
    if (json == null) {
        return json;
    }
    return {
        
        'answers': json['answers'] == null ? undefined : json['answers'],
        'response': json['response'],
        'responseformat': json['responseformat'],
        'score': json['score'],
    };
}

export function ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataToJSON(value?: ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answers': value['answers'],
        'response': value['response'],
        'responseformat': value['responseformat'],
        'score': value['score'],
    };
}

