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
import type { ModH5pactivityGetAttempts200ResponseUsersattemptsInner } from './ModH5pactivityGetAttempts200ResponseUsersattemptsInner';
import {
    ModH5pactivityGetAttempts200ResponseUsersattemptsInnerFromJSON,
    ModH5pactivityGetAttempts200ResponseUsersattemptsInnerFromJSONTyped,
    ModH5pactivityGetAttempts200ResponseUsersattemptsInnerToJSON,
} from './ModH5pactivityGetAttempts200ResponseUsersattemptsInner';

/**
 * 
 * @export
 * @interface ModH5pactivityGetAttempts200Response
 */
export interface ModH5pactivityGetAttempts200Response {
    /**
     * Activity course module ID
     * @type {number}
     * @memberof ModH5pactivityGetAttempts200Response
     */
    activityid: number;
    /**
     * 
     * @type {Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInner>}
     * @memberof ModH5pactivityGetAttempts200Response
     */
    usersattempts: Array<ModH5pactivityGetAttempts200ResponseUsersattemptsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModH5pactivityGetAttempts200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModH5pactivityGetAttempts200Response interface.
 */
export function instanceOfModH5pactivityGetAttempts200Response(value: object): boolean {
    if (!('activityid' in value)) return false;
    if (!('usersattempts' in value)) return false;
    return true;
}

export function ModH5pactivityGetAttempts200ResponseFromJSON(json: any): ModH5pactivityGetAttempts200Response {
    return ModH5pactivityGetAttempts200ResponseFromJSONTyped(json, false);
}

export function ModH5pactivityGetAttempts200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModH5pactivityGetAttempts200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'activityid': json['activityid'],
        'usersattempts': ((json['usersattempts'] as Array<any>).map(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModH5pactivityGetAttempts200ResponseToJSON(value?: ModH5pactivityGetAttempts200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activityid': value['activityid'],
        'usersattempts': ((value['usersattempts'] as Array<any>).map(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

