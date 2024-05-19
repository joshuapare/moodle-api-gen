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
 * @interface ModFeedbackGetFinishedResponses200ResponseResponsesInner
 */
export interface ModFeedbackGetFinishedResponses200ResponseResponsesInner {
    /**
     * Reference to the feedback_completed table.
     * @type {number}
     * @memberof ModFeedbackGetFinishedResponses200ResponseResponsesInner
     */
    Completed?: number;
    /**
     * The course id this record belongs to.
     * @type {number}
     * @memberof ModFeedbackGetFinishedResponses200ResponseResponsesInner
     */
    CourseId?: number;
    /**
     * The record id.
     * @type {number}
     * @memberof ModFeedbackGetFinishedResponses200ResponseResponsesInner
     */
    Id?: number;
    /**
     * The item id that was responded.
     * @type {number}
     * @memberof ModFeedbackGetFinishedResponses200ResponseResponsesInner
     */
    Item?: number;
    /**
     * Old field - not used anymore.
     * @type {number}
     * @memberof ModFeedbackGetFinishedResponses200ResponseResponsesInner
     */
    TmpCompleted?: number;
    /**
     * The response value.
     * @type {string}
     * @memberof ModFeedbackGetFinishedResponses200ResponseResponsesInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the ModFeedbackGetFinishedResponses200ResponseResponsesInner interface.
 */
export function instanceOfModFeedbackGetFinishedResponses200ResponseResponsesInner(value: object): boolean {
    return true;
}

export function ModFeedbackGetFinishedResponses200ResponseResponsesInnerFromJSON(json: any): ModFeedbackGetFinishedResponses200ResponseResponsesInner {
    return ModFeedbackGetFinishedResponses200ResponseResponsesInnerFromJSONTyped(json, false);
}

export function ModFeedbackGetFinishedResponses200ResponseResponsesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetFinishedResponses200ResponseResponsesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Completed': json['completed'] == null ? undefined : json['completed'],
        'CourseId': json['course_id'] == null ? undefined : json['course_id'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Item': json['item'] == null ? undefined : json['item'],
        'TmpCompleted': json['tmp_completed'] == null ? undefined : json['tmp_completed'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModFeedbackGetFinishedResponses200ResponseResponsesInnerToJSON(value?: ModFeedbackGetFinishedResponses200ResponseResponsesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'completed': value['Completed'],
        'course_id': value['CourseId'],
        'id': value['Id'],
        'item': value['Item'],
        'tmp_completed': value['TmpCompleted'],
        'value': value['Value'],
    };
}

