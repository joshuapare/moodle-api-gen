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
 * @interface ModH5pactivityGetH5pactivityAccessInformationRequest
 */
export interface ModH5pactivityGetH5pactivityAccessInformationRequest {
    /**
     * h5p activity instance id
     * @type {number}
     * @memberof ModH5pactivityGetH5pactivityAccessInformationRequest
     */
    H5pactivityid: number;
}

/**
 * Check if a given object implements the ModH5pactivityGetH5pactivityAccessInformationRequest interface.
 */
export function instanceOfModH5pactivityGetH5pactivityAccessInformationRequest(value: object): boolean {
    if (!('H5pactivityid' in value)) return false;
    return true;
}

export function ModH5pactivityGetH5pactivityAccessInformationRequestFromJSON(json: any): ModH5pactivityGetH5pactivityAccessInformationRequest {
    return ModH5pactivityGetH5pactivityAccessInformationRequestFromJSONTyped(json, false);
}

export function ModH5pactivityGetH5pactivityAccessInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetH5pactivityAccessInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'H5pactivityid': json['h5pactivityid'],
    };
}

export function ModH5pactivityGetH5pactivityAccessInformationRequestToJSON(value?: ModH5pactivityGetH5pactivityAccessInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'h5pactivityid': value['H5pactivityid'],
    };
}

