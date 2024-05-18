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
 * @interface ModAssignGetGradesRequest
 */
export interface ModAssignGetGradesRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof ModAssignGetGradesRequest
     */
    assignmentids: Array<object>;
    /**
     * timestamp, only return records where timemodified >= since
     * @type {number}
     * @memberof ModAssignGetGradesRequest
     */
    since?: number;
}

/**
 * Check if a given object implements the ModAssignGetGradesRequest interface.
 */
export function instanceOfModAssignGetGradesRequest(value: object): boolean {
    if (!('assignmentids' in value)) return false;
    return true;
}

export function ModAssignGetGradesRequestFromJSON(json: any): ModAssignGetGradesRequest {
    return ModAssignGetGradesRequestFromJSONTyped(json, false);
}

export function ModAssignGetGradesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetGradesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'assignmentids': json['assignmentids'],
        'since': json['since'] == null ? undefined : json['since'],
    };
}

export function ModAssignGetGradesRequestToJSON(value?: ModAssignGetGradesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignmentids': value['assignmentids'],
        'since': value['since'],
    };
}
