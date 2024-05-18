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
 * @interface ModFeedbackGetLastCompleted200ResponseCompleted
 */
export interface ModFeedbackGetLastCompleted200ResponseCompleted {
    /**
     * Whether is an anonymous response.
     * @type {number}
     * @memberof ModFeedbackGetLastCompleted200ResponseCompleted
     */
    anonymousResponse: number;
    /**
     * The course id where the feedback was completed.
     * @type {number}
     * @memberof ModFeedbackGetLastCompleted200ResponseCompleted
     */
    courseid: number;
    /**
     * The feedback instance id this records belongs to.
     * @type {number}
     * @memberof ModFeedbackGetLastCompleted200ResponseCompleted
     */
    feedback: number;
    /**
     * The record id.
     * @type {number}
     * @memberof ModFeedbackGetLastCompleted200ResponseCompleted
     */
    id: number;
    /**
     * The response number (used when shuffling anonymous responses).
     * @type {number}
     * @memberof ModFeedbackGetLastCompleted200ResponseCompleted
     */
    randomResponse: number;
    /**
     * The last time the feedback was completed.
     * @type {number}
     * @memberof ModFeedbackGetLastCompleted200ResponseCompleted
     */
    timemodified: number;
    /**
     * The user who completed the feedback (0 for anonymous).
     * @type {number}
     * @memberof ModFeedbackGetLastCompleted200ResponseCompleted
     */
    userid: number;
}

/**
 * Check if a given object implements the ModFeedbackGetLastCompleted200ResponseCompleted interface.
 */
export function instanceOfModFeedbackGetLastCompleted200ResponseCompleted(value: object): boolean {
    if (!('anonymousResponse' in value)) return false;
    if (!('courseid' in value)) return false;
    if (!('feedback' in value)) return false;
    if (!('id' in value)) return false;
    if (!('randomResponse' in value)) return false;
    if (!('timemodified' in value)) return false;
    if (!('userid' in value)) return false;
    return true;
}

export function ModFeedbackGetLastCompleted200ResponseCompletedFromJSON(json: any): ModFeedbackGetLastCompleted200ResponseCompleted {
    return ModFeedbackGetLastCompleted200ResponseCompletedFromJSONTyped(json, false);
}

export function ModFeedbackGetLastCompleted200ResponseCompletedFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetLastCompleted200ResponseCompleted {
    if (json == null) {
        return json;
    }
    return {
        
        'anonymousResponse': json['anonymous_response'],
        'courseid': json['courseid'],
        'feedback': json['feedback'],
        'id': json['id'],
        'randomResponse': json['random_response'],
        'timemodified': json['timemodified'],
        'userid': json['userid'],
    };
}

export function ModFeedbackGetLastCompleted200ResponseCompletedToJSON(value?: ModFeedbackGetLastCompleted200ResponseCompleted | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'anonymous_response': value['anonymousResponse'],
        'courseid': value['courseid'],
        'feedback': value['feedback'],
        'id': value['id'],
        'random_response': value['randomResponse'],
        'timemodified': value['timemodified'],
        'userid': value['userid'],
    };
}

