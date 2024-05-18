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
 * @interface ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner
 */
export interface ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
    /**
     * user mapping id
     * @type {number}
     * @memberof ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner
     */
    id?: number;
    /**
     * student id
     * @type {number}
     * @memberof ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner
     */
    userid?: number;
}

/**
 * Check if a given object implements the ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner interface.
 */
export function instanceOfModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner(value: object): boolean {
    return true;
}

export function ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerFromJSON(json: any): ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
    return ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerFromJSONTyped(json, false);
}

export function ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInnerToJSON(value?: ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'userid': value['userid'],
    };
}

