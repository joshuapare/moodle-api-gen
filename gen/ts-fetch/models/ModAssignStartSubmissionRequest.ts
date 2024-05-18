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
 * @interface ModAssignStartSubmissionRequest
 */
export interface ModAssignStartSubmissionRequest {
    /**
     * Assignment instance id
     * @type {number}
     * @memberof ModAssignStartSubmissionRequest
     */
    assignid: number;
}

/**
 * Check if a given object implements the ModAssignStartSubmissionRequest interface.
 */
export function instanceOfModAssignStartSubmissionRequest(value: object): boolean {
    if (!('assignid' in value)) return false;
    return true;
}

export function ModAssignStartSubmissionRequestFromJSON(json: any): ModAssignStartSubmissionRequest {
    return ModAssignStartSubmissionRequestFromJSONTyped(json, false);
}

export function ModAssignStartSubmissionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignStartSubmissionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'assignid': json['assignid'],
    };
}

export function ModAssignStartSubmissionRequestToJSON(value?: ModAssignStartSubmissionRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignid': value['assignid'],
    };
}
