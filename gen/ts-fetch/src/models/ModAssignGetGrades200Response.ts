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
import type { ModAssignGetGrades200ResponseAssignmentsInner } from './ModAssignGetGrades200ResponseAssignmentsInner';
import {
    ModAssignGetGrades200ResponseAssignmentsInnerFromJSON,
    ModAssignGetGrades200ResponseAssignmentsInnerFromJSONTyped,
    ModAssignGetGrades200ResponseAssignmentsInnerToJSON,
} from './ModAssignGetGrades200ResponseAssignmentsInner';
import type { ModAssignGetGrades200ResponseWarningsInner } from './ModAssignGetGrades200ResponseWarningsInner';
import {
    ModAssignGetGrades200ResponseWarningsInnerFromJSON,
    ModAssignGetGrades200ResponseWarningsInnerFromJSONTyped,
    ModAssignGetGrades200ResponseWarningsInnerToJSON,
} from './ModAssignGetGrades200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface ModAssignGetGrades200Response
 */
export interface ModAssignGetGrades200Response {
    /**
     * 
     * @type {Array<ModAssignGetGrades200ResponseAssignmentsInner>}
     * @memberof ModAssignGetGrades200Response
     */
    Assignments: Array<ModAssignGetGrades200ResponseAssignmentsInner>;
    /**
     * 
     * @type {Array<ModAssignGetGrades200ResponseWarningsInner>}
     * @memberof ModAssignGetGrades200Response
     */
    Warnings?: Array<ModAssignGetGrades200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModAssignGetGrades200Response interface.
 */
export function instanceOfModAssignGetGrades200Response(value: object): boolean {
    if (!('Assignments' in value)) return false;
    return true;
}

export function ModAssignGetGrades200ResponseFromJSON(json: any): ModAssignGetGrades200Response {
    return ModAssignGetGrades200ResponseFromJSONTyped(json, false);
}

export function ModAssignGetGrades200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetGrades200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignments': ((json['assignments'] as Array<any>).map(ModAssignGetGrades200ResponseAssignmentsInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(ModAssignGetGrades200ResponseWarningsInnerFromJSON)),
    };
}

export function ModAssignGetGrades200ResponseToJSON(value?: ModAssignGetGrades200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignments': ((value['Assignments'] as Array<any>).map(ModAssignGetGrades200ResponseAssignmentsInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(ModAssignGetGrades200ResponseWarningsInnerToJSON)),
    };
}

