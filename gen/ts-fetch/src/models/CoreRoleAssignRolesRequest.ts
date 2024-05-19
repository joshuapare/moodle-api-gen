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
import type { CoreRoleAssignRolesRequestAssignmentsInner } from './CoreRoleAssignRolesRequestAssignmentsInner';
import {
    CoreRoleAssignRolesRequestAssignmentsInnerFromJSON,
    CoreRoleAssignRolesRequestAssignmentsInnerFromJSONTyped,
    CoreRoleAssignRolesRequestAssignmentsInnerToJSON,
} from './CoreRoleAssignRolesRequestAssignmentsInner';

/**
 * 
 * @export
 * @interface CoreRoleAssignRolesRequest
 */
export interface CoreRoleAssignRolesRequest {
    /**
     * 
     * @type {Array<CoreRoleAssignRolesRequestAssignmentsInner>}
     * @memberof CoreRoleAssignRolesRequest
     */
    Assignments: Array<CoreRoleAssignRolesRequestAssignmentsInner>;
}

/**
 * Check if a given object implements the CoreRoleAssignRolesRequest interface.
 */
export function instanceOfCoreRoleAssignRolesRequest(value: object): boolean {
    if (!('Assignments' in value)) return false;
    return true;
}

export function CoreRoleAssignRolesRequestFromJSON(json: any): CoreRoleAssignRolesRequest {
    return CoreRoleAssignRolesRequestFromJSONTyped(json, false);
}

export function CoreRoleAssignRolesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreRoleAssignRolesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignments': ((json['assignments'] as Array<any>).map(CoreRoleAssignRolesRequestAssignmentsInnerFromJSON)),
    };
}

export function CoreRoleAssignRolesRequestToJSON(value?: CoreRoleAssignRolesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignments': ((value['Assignments'] as Array<any>).map(CoreRoleAssignRolesRequestAssignmentsInnerToJSON)),
    };
}
