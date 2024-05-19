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
import type { CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails } from './CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails';
import {
    CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsFromJSON,
    CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsFromJSONTyped,
    CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsToJSON,
} from './CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails';

/**
 * Completions
 * @export
 * @interface CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner
 */
export interface CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner {
    /**
     * Completion status (true/false)
     * @type {boolean}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner
     */
    Complete?: boolean;
    /**
     * 
     * @type {CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner
     */
    Details?: CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails;
    /**
     * Completion status (Yes/No) a % or number
     * @type {string}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner
     */
    Status?: string;
    /**
     * Timestamp for criteria completetion
     * @type {number}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner
     */
    Timecompleted?: number;
    /**
     * Completion criteria Title
     * @type {string}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner
     */
    Title?: string;
    /**
     * Completion criteria type
     * @type {number}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner
     */
    Type?: number;
}

/**
 * Check if a given object implements the CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner interface.
 */
export function instanceOfCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner(value: object): boolean {
    return true;
}

export function CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerFromJSON(json: any): CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner {
    return CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerFromJSONTyped(json, false);
}

export function CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Complete': json['complete'] == null ? undefined : json['complete'],
        'Details': json['details'] == null ? undefined : CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsFromJSON(json['details']),
        'Status': json['status'] == null ? undefined : json['status'],
        'Timecompleted': json['timecompleted'] == null ? undefined : json['timecompleted'],
        'Title': json['title'] == null ? undefined : json['title'],
        'Type': json['type'] == null ? undefined : json['type'],
    };
}

export function CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerToJSON(value?: CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'complete': value['Complete'],
        'details': CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsToJSON(value['Details']),
        'status': value['Status'],
        'timecompleted': value['Timecompleted'],
        'title': value['Title'],
        'type': value['Type'],
    };
}
