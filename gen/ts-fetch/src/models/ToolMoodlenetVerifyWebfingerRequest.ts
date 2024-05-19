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
 * @interface ToolMoodlenetVerifyWebfingerRequest
 */
export interface ToolMoodlenetVerifyWebfingerRequest {
    /**
     * The course we are adding to
     * @type {number}
     * @memberof ToolMoodlenetVerifyWebfingerRequest
     */
    Course: number;
    /**
     * The profile url that the user has given us
     * @type {string}
     * @memberof ToolMoodlenetVerifyWebfingerRequest
     */
    Profileurl: string;
    /**
     * The section within the course we are adding to
     * @type {number}
     * @memberof ToolMoodlenetVerifyWebfingerRequest
     */
    Section: number;
}

/**
 * Check if a given object implements the ToolMoodlenetVerifyWebfingerRequest interface.
 */
export function instanceOfToolMoodlenetVerifyWebfingerRequest(value: object): boolean {
    if (!('Course' in value)) return false;
    if (!('Profileurl' in value)) return false;
    if (!('Section' in value)) return false;
    return true;
}

export function ToolMoodlenetVerifyWebfingerRequestFromJSON(json: any): ToolMoodlenetVerifyWebfingerRequest {
    return ToolMoodlenetVerifyWebfingerRequestFromJSONTyped(json, false);
}

export function ToolMoodlenetVerifyWebfingerRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolMoodlenetVerifyWebfingerRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Course': json['course'],
        'Profileurl': json['profileurl'],
        'Section': json['section'],
    };
}

export function ToolMoodlenetVerifyWebfingerRequestToJSON(value?: ToolMoodlenetVerifyWebfingerRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'course': value['Course'],
        'profileurl': value['Profileurl'],
        'section': value['Section'],
    };
}

