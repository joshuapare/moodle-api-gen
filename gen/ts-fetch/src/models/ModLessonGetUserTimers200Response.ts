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
import type { ModLessonGetUserTimers200ResponseTimersInner } from './ModLessonGetUserTimers200ResponseTimersInner';
import {
    ModLessonGetUserTimers200ResponseTimersInnerFromJSON,
    ModLessonGetUserTimers200ResponseTimersInnerFromJSONTyped,
    ModLessonGetUserTimers200ResponseTimersInnerToJSON,
} from './ModLessonGetUserTimers200ResponseTimersInner';

/**
 * 
 * @export
 * @interface ModLessonGetUserTimers200Response
 */
export interface ModLessonGetUserTimers200Response {
    /**
     * 
     * @type {Array<ModLessonGetUserTimers200ResponseTimersInner>}
     * @memberof ModLessonGetUserTimers200Response
     */
    Timers: Array<ModLessonGetUserTimers200ResponseTimersInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModLessonGetUserTimers200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModLessonGetUserTimers200Response interface.
 */
export function instanceOfModLessonGetUserTimers200Response(value: object): boolean {
    if (!('Timers' in value)) return false;
    return true;
}

export function ModLessonGetUserTimers200ResponseFromJSON(json: any): ModLessonGetUserTimers200Response {
    return ModLessonGetUserTimers200ResponseFromJSONTyped(json, false);
}

export function ModLessonGetUserTimers200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetUserTimers200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Timers': ((json['timers'] as Array<any>).map(ModLessonGetUserTimers200ResponseTimersInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModLessonGetUserTimers200ResponseToJSON(value?: ModLessonGetUserTimers200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'timers': ((value['Timers'] as Array<any>).map(ModLessonGetUserTimers200ResponseTimersInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

