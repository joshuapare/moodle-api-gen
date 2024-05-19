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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';
import type { ModScormGetScormsByCourses200ResponseOptionsInner } from './ModScormGetScormsByCourses200ResponseOptionsInner';
import {
    ModScormGetScormsByCourses200ResponseOptionsInnerFromJSON,
    ModScormGetScormsByCourses200ResponseOptionsInnerFromJSONTyped,
    ModScormGetScormsByCourses200ResponseOptionsInnerToJSON,
} from './ModScormGetScormsByCourses200ResponseOptionsInner';
import type { ModScormGetScormsByCourses200ResponseScormsInner } from './ModScormGetScormsByCourses200ResponseScormsInner';
import {
    ModScormGetScormsByCourses200ResponseScormsInnerFromJSON,
    ModScormGetScormsByCourses200ResponseScormsInnerFromJSONTyped,
    ModScormGetScormsByCourses200ResponseScormsInnerToJSON,
} from './ModScormGetScormsByCourses200ResponseScormsInner';

/**
 * 
 * @export
 * @interface ModScormGetScormsByCourses200Response
 */
export interface ModScormGetScormsByCourses200Response {
    /**
     * 
     * @type {Array<ModScormGetScormsByCourses200ResponseOptionsInner>}
     * @memberof ModScormGetScormsByCourses200Response
     */
    Options?: Array<ModScormGetScormsByCourses200ResponseOptionsInner>;
    /**
     * 
     * @type {Array<ModScormGetScormsByCourses200ResponseScormsInner>}
     * @memberof ModScormGetScormsByCourses200Response
     */
    Scorms: Array<ModScormGetScormsByCourses200ResponseScormsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModScormGetScormsByCourses200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModScormGetScormsByCourses200Response interface.
 */
export function instanceOfModScormGetScormsByCourses200Response(value: object): boolean {
    if (!('Scorms' in value)) return false;
    return true;
}

export function ModScormGetScormsByCourses200ResponseFromJSON(json: any): ModScormGetScormsByCourses200Response {
    return ModScormGetScormsByCourses200ResponseFromJSONTyped(json, false);
}

export function ModScormGetScormsByCourses200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormsByCourses200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Options': json['options'] == null ? undefined : ((json['options'] as Array<any>).map(ModScormGetScormsByCourses200ResponseOptionsInnerFromJSON)),
        'Scorms': ((json['scorms'] as Array<any>).map(ModScormGetScormsByCourses200ResponseScormsInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModScormGetScormsByCourses200ResponseToJSON(value?: ModScormGetScormsByCourses200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'options': value['Options'] == null ? undefined : ((value['Options'] as Array<any>).map(ModScormGetScormsByCourses200ResponseOptionsInnerToJSON)),
        'scorms': ((value['Scorms'] as Array<any>).map(ModScormGetScormsByCourses200ResponseScormsInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

