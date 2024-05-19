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
 * @interface ModAssignGetUserFlagsRequest
 */
export interface ModAssignGetUserFlagsRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof ModAssignGetUserFlagsRequest
     */
    Assignmentids: Array<object>;
}

/**
 * Check if a given object implements the ModAssignGetUserFlagsRequest interface.
 */
export function instanceOfModAssignGetUserFlagsRequest(value: object): boolean {
    if (!('Assignmentids' in value)) return false;
    return true;
}

export function ModAssignGetUserFlagsRequestFromJSON(json: any): ModAssignGetUserFlagsRequest {
    return ModAssignGetUserFlagsRequestFromJSONTyped(json, false);
}

export function ModAssignGetUserFlagsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetUserFlagsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignmentids': json['assignmentids'],
    };
}

export function ModAssignGetUserFlagsRequestToJSON(value?: ModAssignGetUserFlagsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignmentids': value['Assignmentids'],
    };
}

