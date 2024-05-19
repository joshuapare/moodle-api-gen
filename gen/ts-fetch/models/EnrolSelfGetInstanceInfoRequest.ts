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
 * @interface EnrolSelfGetInstanceInfoRequest
 */
export interface EnrolSelfGetInstanceInfoRequest {
    /**
     * instance id of self enrolment plugin.
     * @type {number}
     * @memberof EnrolSelfGetInstanceInfoRequest
     */
    instanceid: number;
}

/**
 * Check if a given object implements the EnrolSelfGetInstanceInfoRequest interface.
 */
export function instanceOfEnrolSelfGetInstanceInfoRequest(value: object): boolean {
    if (!('instanceid' in value)) return false;
    return true;
}

export function EnrolSelfGetInstanceInfoRequestFromJSON(json: any): EnrolSelfGetInstanceInfoRequest {
    return EnrolSelfGetInstanceInfoRequestFromJSONTyped(json, false);
}

export function EnrolSelfGetInstanceInfoRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrolSelfGetInstanceInfoRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'instanceid': json['instanceid'],
    };
}

export function EnrolSelfGetInstanceInfoRequestToJSON(value?: EnrolSelfGetInstanceInfoRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'instanceid': value['instanceid'],
    };
}

