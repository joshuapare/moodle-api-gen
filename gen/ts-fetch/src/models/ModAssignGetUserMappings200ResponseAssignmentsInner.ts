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
import type { ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner } from './ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner';
import {
    ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerFromJSON,
    ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerFromJSONTyped,
    ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerToJSON,
} from './ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner';

/**
 * 
 * @export
 * @interface ModAssignGetUserMappings200ResponseAssignmentsInner
 */
export interface ModAssignGetUserMappings200ResponseAssignmentsInner {
    /**
     * assignment id
     * @type {number}
     * @memberof ModAssignGetUserMappings200ResponseAssignmentsInner
     */
    Assignmentid?: number;
    /**
     * 
     * @type {Array<ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner>}
     * @memberof ModAssignGetUserMappings200ResponseAssignmentsInner
     */
    Mappings?: Array<ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner>;
}

/**
 * Check if a given object implements the ModAssignGetUserMappings200ResponseAssignmentsInner interface.
 */
export function instanceOfModAssignGetUserMappings200ResponseAssignmentsInner(value: object): boolean {
    return true;
}

export function ModAssignGetUserMappings200ResponseAssignmentsInnerFromJSON(json: any): ModAssignGetUserMappings200ResponseAssignmentsInner {
    return ModAssignGetUserMappings200ResponseAssignmentsInnerFromJSONTyped(json, false);
}

export function ModAssignGetUserMappings200ResponseAssignmentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetUserMappings200ResponseAssignmentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignmentid': json['assignmentid'] == null ? undefined : json['assignmentid'],
        'Mappings': json['mappings'] == null ? undefined : ((json['mappings'] as Array<any>).map(ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerFromJSON)),
    };
}

export function ModAssignGetUserMappings200ResponseAssignmentsInnerToJSON(value?: ModAssignGetUserMappings200ResponseAssignmentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignmentid': value['Assignmentid'],
        'mappings': value['Mappings'] == null ? undefined : ((value['Mappings'] as Array<any>).map(ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerToJSON)),
    };
}
