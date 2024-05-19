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
 * @interface ModH5pactivityViewH5pactivityRequest
 */
export interface ModH5pactivityViewH5pactivityRequest {
    /**
     * H5P activity instance id
     * @type {number}
     * @memberof ModH5pactivityViewH5pactivityRequest
     */
    H5pactivityid: number;
}

/**
 * Check if a given object implements the ModH5pactivityViewH5pactivityRequest interface.
 */
export function instanceOfModH5pactivityViewH5pactivityRequest(value: object): boolean {
    if (!('H5pactivityid' in value)) return false;
    return true;
}

export function ModH5pactivityViewH5pactivityRequestFromJSON(json: any): ModH5pactivityViewH5pactivityRequest {
    return ModH5pactivityViewH5pactivityRequestFromJSONTyped(json, false);
}

export function ModH5pactivityViewH5pactivityRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityViewH5pactivityRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'H5pactivityid': json['h5pactivityid'],
    };
}

export function ModH5pactivityViewH5pactivityRequestToJSON(value?: ModH5pactivityViewH5pactivityRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'h5pactivityid': value['H5pactivityid'],
    };
}

