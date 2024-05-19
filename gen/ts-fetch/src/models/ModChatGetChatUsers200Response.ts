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
import type { ModChatGetChatUsers200ResponseUsersInner } from './ModChatGetChatUsers200ResponseUsersInner';
import {
    ModChatGetChatUsers200ResponseUsersInnerFromJSON,
    ModChatGetChatUsers200ResponseUsersInnerFromJSONTyped,
    ModChatGetChatUsers200ResponseUsersInnerToJSON,
} from './ModChatGetChatUsers200ResponseUsersInner';

/**
 * 
 * @export
 * @interface ModChatGetChatUsers200Response
 */
export interface ModChatGetChatUsers200Response {
    /**
     * 
     * @type {Array<ModChatGetChatUsers200ResponseUsersInner>}
     * @memberof ModChatGetChatUsers200Response
     */
    Users: Array<ModChatGetChatUsers200ResponseUsersInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModChatGetChatUsers200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModChatGetChatUsers200Response interface.
 */
export function instanceOfModChatGetChatUsers200Response(value: object): boolean {
    if (!('Users' in value)) return false;
    return true;
}

export function ModChatGetChatUsers200ResponseFromJSON(json: any): ModChatGetChatUsers200Response {
    return ModChatGetChatUsers200ResponseFromJSONTyped(json, false);
}

export function ModChatGetChatUsers200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChatGetChatUsers200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Users': ((json['users'] as Array<any>).map(ModChatGetChatUsers200ResponseUsersInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModChatGetChatUsers200ResponseToJSON(value?: ModChatGetChatUsers200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'users': ((value['Users'] as Array<any>).map(ModChatGetChatUsers200ResponseUsersInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
