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
 * @interface CoreMoodlenetGetSharedCourseInfoRequest
 */
export interface CoreMoodlenetGetSharedCourseInfoRequest {
    /**
     * The course id
     * @type {number}
     * @memberof CoreMoodlenetGetSharedCourseInfoRequest
     */
    Courseid: number;
}

/**
 * Check if a given object implements the CoreMoodlenetGetSharedCourseInfoRequest interface.
 */
export function instanceOfCoreMoodlenetGetSharedCourseInfoRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    return true;
}

export function CoreMoodlenetGetSharedCourseInfoRequestFromJSON(json: any): CoreMoodlenetGetSharedCourseInfoRequest {
    return CoreMoodlenetGetSharedCourseInfoRequestFromJSONTyped(json, false);
}

export function CoreMoodlenetGetSharedCourseInfoRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMoodlenetGetSharedCourseInfoRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
    };
}

export function CoreMoodlenetGetSharedCourseInfoRequestToJSON(value?: CoreMoodlenetGetSharedCourseInfoRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
    };
}

