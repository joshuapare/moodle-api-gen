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
import type { ModAssignGetUserFlags200ResponseAssignmentsInner } from './ModAssignGetUserFlags200ResponseAssignmentsInner';
import {
    ModAssignGetUserFlags200ResponseAssignmentsInnerFromJSON,
    ModAssignGetUserFlags200ResponseAssignmentsInnerFromJSONTyped,
    ModAssignGetUserFlags200ResponseAssignmentsInnerToJSON,
} from './ModAssignGetUserFlags200ResponseAssignmentsInner';
import type { ModAssignGetUserFlags200ResponseWarningsInner } from './ModAssignGetUserFlags200ResponseWarningsInner';
import {
    ModAssignGetUserFlags200ResponseWarningsInnerFromJSON,
    ModAssignGetUserFlags200ResponseWarningsInnerFromJSONTyped,
    ModAssignGetUserFlags200ResponseWarningsInnerToJSON,
} from './ModAssignGetUserFlags200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface ModAssignGetUserFlags200Response
 */
export interface ModAssignGetUserFlags200Response {
    /**
     * 
     * @type {Array<ModAssignGetUserFlags200ResponseAssignmentsInner>}
     * @memberof ModAssignGetUserFlags200Response
     */
    assignments: Array<ModAssignGetUserFlags200ResponseAssignmentsInner>;
    /**
     * 
     * @type {Array<ModAssignGetUserFlags200ResponseWarningsInner>}
     * @memberof ModAssignGetUserFlags200Response
     */
    warnings?: Array<ModAssignGetUserFlags200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModAssignGetUserFlags200Response interface.
 */
export function instanceOfModAssignGetUserFlags200Response(value: object): boolean {
    if (!('assignments' in value)) return false;
    return true;
}

export function ModAssignGetUserFlags200ResponseFromJSON(json: any): ModAssignGetUserFlags200Response {
    return ModAssignGetUserFlags200ResponseFromJSONTyped(json, false);
}

export function ModAssignGetUserFlags200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetUserFlags200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'assignments': ((json['assignments'] as Array<any>).map(ModAssignGetUserFlags200ResponseAssignmentsInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(ModAssignGetUserFlags200ResponseWarningsInnerFromJSON)),
    };
}

export function ModAssignGetUserFlags200ResponseToJSON(value?: ModAssignGetUserFlags200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignments': ((value['assignments'] as Array<any>).map(ModAssignGetUserFlags200ResponseAssignmentsInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(ModAssignGetUserFlags200ResponseWarningsInnerToJSON)),
    };
}

