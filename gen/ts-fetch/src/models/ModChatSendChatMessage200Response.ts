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
 * @interface ModChatSendChatMessage200Response
 */
export interface ModChatSendChatMessage200Response {
    /**
     * message sent id
     * @type {number}
     * @memberof ModChatSendChatMessage200Response
     */
    Messageid: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModChatSendChatMessage200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModChatSendChatMessage200Response interface.
 */
export function instanceOfModChatSendChatMessage200Response(value: object): boolean {
    if (!('Messageid' in value)) return false;
    return true;
}

export function ModChatSendChatMessage200ResponseFromJSON(json: any): ModChatSendChatMessage200Response {
    return ModChatSendChatMessage200ResponseFromJSONTyped(json, false);
}

export function ModChatSendChatMessage200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChatSendChatMessage200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Messageid': json['messageid'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModChatSendChatMessage200ResponseToJSON(value?: ModChatSendChatMessage200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'messageid': value['Messageid'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
