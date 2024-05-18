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
 * @interface ModFeedbackGetUnfinishedResponses200ResponseResponsesInner
 */
export interface ModFeedbackGetUnfinishedResponses200ResponseResponsesInner {
    /**
     * Reference to the feedback_completedtmp table.
     * @type {number}
     * @memberof ModFeedbackGetUnfinishedResponses200ResponseResponsesInner
     */
    completed?: number;
    /**
     * The course id this record belongs to.
     * @type {number}
     * @memberof ModFeedbackGetUnfinishedResponses200ResponseResponsesInner
     */
    courseId?: number;
    /**
     * The record id.
     * @type {number}
     * @memberof ModFeedbackGetUnfinishedResponses200ResponseResponsesInner
     */
    id?: number;
    /**
     * The item id that was responded.
     * @type {number}
     * @memberof ModFeedbackGetUnfinishedResponses200ResponseResponsesInner
     */
    item?: number;
    /**
     * Old field - not used anymore.
     * @type {number}
     * @memberof ModFeedbackGetUnfinishedResponses200ResponseResponsesInner
     */
    tmpCompleted?: number;
    /**
     * The response value.
     * @type {string}
     * @memberof ModFeedbackGetUnfinishedResponses200ResponseResponsesInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModFeedbackGetUnfinishedResponses200ResponseResponsesInner interface.
 */
export function instanceOfModFeedbackGetUnfinishedResponses200ResponseResponsesInner(value: object): boolean {
    return true;
}

export function ModFeedbackGetUnfinishedResponses200ResponseResponsesInnerFromJSON(json: any): ModFeedbackGetUnfinishedResponses200ResponseResponsesInner {
    return ModFeedbackGetUnfinishedResponses200ResponseResponsesInnerFromJSONTyped(json, false);
}

export function ModFeedbackGetUnfinishedResponses200ResponseResponsesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetUnfinishedResponses200ResponseResponsesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'completed': json['completed'] == null ? undefined : json['completed'],
        'courseId': json['course_id'] == null ? undefined : json['course_id'],
        'id': json['id'] == null ? undefined : json['id'],
        'item': json['item'] == null ? undefined : json['item'],
        'tmpCompleted': json['tmp_completed'] == null ? undefined : json['tmp_completed'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModFeedbackGetUnfinishedResponses200ResponseResponsesInnerToJSON(value?: ModFeedbackGetUnfinishedResponses200ResponseResponsesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'completed': value['completed'],
        'course_id': value['courseId'],
        'id': value['id'],
        'item': value['item'],
        'tmp_completed': value['tmpCompleted'],
        'value': value['value'],
    };
}

