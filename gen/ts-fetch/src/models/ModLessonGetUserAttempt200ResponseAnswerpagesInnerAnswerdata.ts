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
    Answers?: Array<object>;
    /**
     * The response text.
     * @type {string}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
     */
    Response: string;
    /**
     * response. format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
     */
    Responseformat: number;
    /**
     * The score (text version).
     * @type {string}
     * @memberof ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
     */
    Score: string;
}

/**
 * Check if a given object implements the ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata interface.
 */
export function instanceOfModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata(value: object): boolean {
    if (!('Response' in value)) return false;
    if (!('Responseformat' in value)) return false;
    if (!('Score' in value)) return false;
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
        
        'Answers': json['answers'] == null ? undefined : json['answers'],
        'Response': json['response'],
        'Responseformat': json['responseformat'],
        'Score': json['score'],
    };
}

export function ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdataToJSON(value?: ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'answers': value['Answers'],
        'response': value['Response'],
        'responseformat': value['Responseformat'],
        'score': value['Score'],
    };
}

