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
import type { CoreMessageGetBlockedUsers200ResponseUsersInner } from './CoreMessageGetBlockedUsers200ResponseUsersInner';
import {
    CoreMessageGetBlockedUsers200ResponseUsersInnerFromJSON,
    CoreMessageGetBlockedUsers200ResponseUsersInnerFromJSONTyped,
    CoreMessageGetBlockedUsers200ResponseUsersInnerToJSON,
} from './CoreMessageGetBlockedUsers200ResponseUsersInner';

/**
 * 
 * @export
 * @interface CoreMessageGetBlockedUsers200Response
 */
export interface CoreMessageGetBlockedUsers200Response {
    /**
     * 
     * @type {Array<CoreMessageGetBlockedUsers200ResponseUsersInner>}
     * @memberof CoreMessageGetBlockedUsers200Response
     */
    Users: Array<CoreMessageGetBlockedUsers200ResponseUsersInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreMessageGetBlockedUsers200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreMessageGetBlockedUsers200Response interface.
 */
export function instanceOfCoreMessageGetBlockedUsers200Response(value: object): boolean {
    if (!('Users' in value)) return false;
    return true;
}

export function CoreMessageGetBlockedUsers200ResponseFromJSON(json: any): CoreMessageGetBlockedUsers200Response {
    return CoreMessageGetBlockedUsers200ResponseFromJSONTyped(json, false);
}

export function CoreMessageGetBlockedUsers200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetBlockedUsers200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Users': ((json['users'] as Array<any>).map(CoreMessageGetBlockedUsers200ResponseUsersInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreMessageGetBlockedUsers200ResponseToJSON(value?: CoreMessageGetBlockedUsers200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'users': ((value['Users'] as Array<any>).map(CoreMessageGetBlockedUsers200ResponseUsersInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
