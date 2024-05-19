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
import type { ModQuizGetUserAttempts200ResponseAttemptsInner } from './ModQuizGetUserAttempts200ResponseAttemptsInner';
import {
    ModQuizGetUserAttempts200ResponseAttemptsInnerFromJSON,
    ModQuizGetUserAttempts200ResponseAttemptsInnerFromJSONTyped,
    ModQuizGetUserAttempts200ResponseAttemptsInnerToJSON,
} from './ModQuizGetUserAttempts200ResponseAttemptsInner';

/**
 * 
 * @export
 * @interface ModQuizGetUserAttempts200Response
 */
export interface ModQuizGetUserAttempts200Response {
    /**
     * 
     * @type {Array<ModQuizGetUserAttempts200ResponseAttemptsInner>}
     * @memberof ModQuizGetUserAttempts200Response
     */
    Attempts: Array<ModQuizGetUserAttempts200ResponseAttemptsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModQuizGetUserAttempts200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModQuizGetUserAttempts200Response interface.
 */
export function instanceOfModQuizGetUserAttempts200Response(value: object): boolean {
    if (!('Attempts' in value)) return false;
    return true;
}

export function ModQuizGetUserAttempts200ResponseFromJSON(json: any): ModQuizGetUserAttempts200Response {
    return ModQuizGetUserAttempts200ResponseFromJSONTyped(json, false);
}

export function ModQuizGetUserAttempts200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetUserAttempts200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Attempts': ((json['attempts'] as Array<any>).map(ModQuizGetUserAttempts200ResponseAttemptsInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModQuizGetUserAttempts200ResponseToJSON(value?: ModQuizGetUserAttempts200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempts': ((value['Attempts'] as Array<any>).map(ModQuizGetUserAttempts200ResponseAttemptsInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

