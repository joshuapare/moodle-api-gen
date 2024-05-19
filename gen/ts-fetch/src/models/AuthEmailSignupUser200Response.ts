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

/**
 * 
 * @export
 * @interface AuthEmailSignupUser200Response
 */
export interface AuthEmailSignupUser200Response {
    /**
     * True if the user was created false otherwise
     * @type {boolean}
     * @memberof AuthEmailSignupUser200Response
     */
    Success: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof AuthEmailSignupUser200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the AuthEmailSignupUser200Response interface.
 */
export function instanceOfAuthEmailSignupUser200Response(value: object): boolean {
    if (!('Success' in value)) return false;
    return true;
}

export function AuthEmailSignupUser200ResponseFromJSON(json: any): AuthEmailSignupUser200Response {
    return AuthEmailSignupUser200ResponseFromJSONTyped(json, false);
}

export function AuthEmailSignupUser200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): AuthEmailSignupUser200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Success': json['success'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function AuthEmailSignupUser200ResponseToJSON(value?: AuthEmailSignupUser200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'success': value['Success'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

