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
 * @interface EnrolGuestGetInstanceInfoRequest
 */
export interface EnrolGuestGetInstanceInfoRequest {
    /**
     * Instance id of guest enrolment plugin.
     * @type {number}
     * @memberof EnrolGuestGetInstanceInfoRequest
     */
    instanceid: number;
}

/**
 * Check if a given object implements the EnrolGuestGetInstanceInfoRequest interface.
 */
export function instanceOfEnrolGuestGetInstanceInfoRequest(value: object): boolean {
    if (!('instanceid' in value)) return false;
    return true;
}

export function EnrolGuestGetInstanceInfoRequestFromJSON(json: any): EnrolGuestGetInstanceInfoRequest {
    return EnrolGuestGetInstanceInfoRequestFromJSONTyped(json, false);
}

export function EnrolGuestGetInstanceInfoRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrolGuestGetInstanceInfoRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'instanceid': json['instanceid'],
    };
}

export function EnrolGuestGetInstanceInfoRequestToJSON(value?: EnrolGuestGetInstanceInfoRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'instanceid': value['instanceid'],
    };
}
