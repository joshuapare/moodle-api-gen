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
 * @interface CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails
 */
export interface CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails {
    /**
     * Criteria description
     * @type {string}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails
     */
    criteria: string;
    /**
     * Requirement description
     * @type {string}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails
     */
    requirement: string;
    /**
     * Status description, can be anything
     * @type {string}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails
     */
    status: string;
    /**
     * Type description
     * @type {string}
     * @memberof CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails
     */
    type: string;
}

/**
 * Check if a given object implements the CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails interface.
 */
export function instanceOfCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails(value: object): boolean {
    if (!('criteria' in value)) return false;
    if (!('requirement' in value)) return false;
    if (!('status' in value)) return false;
    if (!('type' in value)) return false;
    return true;
}

export function CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsFromJSON(json: any): CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails {
    return CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsFromJSONTyped(json, false);
}

export function CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails {
    if (json == null) {
        return json;
    }
    return {
        
        'criteria': json['criteria'],
        'requirement': json['requirement'],
        'status': json['status'],
        'type': json['type'],
    };
}

export function CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetailsToJSON(value?: CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'criteria': value['criteria'],
        'requirement': value['requirement'],
        'status': value['status'],
        'type': value['type'],
    };
}

