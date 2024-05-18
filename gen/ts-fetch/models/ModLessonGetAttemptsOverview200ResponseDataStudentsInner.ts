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
import type { ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner } from './ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner';
import {
    ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerFromJSON,
    ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerFromJSONTyped,
    ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerToJSON,
} from './ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner';

/**
 * 
 * @export
 * @interface ModLessonGetAttemptsOverview200ResponseDataStudentsInner
 */
export interface ModLessonGetAttemptsOverview200ResponseDataStudentsInner {
    /**
     * 
     * @type {Array<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner>}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInner
     */
    attempts?: Array<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner>;
    /**
     * Best grade.
     * @type {number}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInner
     */
    bestgrade?: number;
    /**
     * User full name.
     * @type {string}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInner
     */
    fullname?: string;
    /**
     * User id.
     * @type {number}
     * @memberof ModLessonGetAttemptsOverview200ResponseDataStudentsInner
     */
    id?: number;
}

/**
 * Check if a given object implements the ModLessonGetAttemptsOverview200ResponseDataStudentsInner interface.
 */
export function instanceOfModLessonGetAttemptsOverview200ResponseDataStudentsInner(value: object): boolean {
    return true;
}

export function ModLessonGetAttemptsOverview200ResponseDataStudentsInnerFromJSON(json: any): ModLessonGetAttemptsOverview200ResponseDataStudentsInner {
    return ModLessonGetAttemptsOverview200ResponseDataStudentsInnerFromJSONTyped(json, false);
}

export function ModLessonGetAttemptsOverview200ResponseDataStudentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetAttemptsOverview200ResponseDataStudentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'attempts': json['attempts'] == null ? undefined : ((json['attempts'] as Array<any>).map(ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerFromJSON)),
        'bestgrade': json['bestgrade'] == null ? undefined : json['bestgrade'],
        'fullname': json['fullname'] == null ? undefined : json['fullname'],
        'id': json['id'] == null ? undefined : json['id'],
    };
}

export function ModLessonGetAttemptsOverview200ResponseDataStudentsInnerToJSON(value?: ModLessonGetAttemptsOverview200ResponseDataStudentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempts': value['attempts'] == null ? undefined : ((value['attempts'] as Array<any>).map(ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInnerToJSON)),
        'bestgrade': value['bestgrade'],
        'fullname': value['fullname'],
        'id': value['id'],
    };
}
