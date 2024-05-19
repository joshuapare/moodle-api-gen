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
/**
 * 
 * @export
 * @interface ModChatViewChatRequest
 */
export interface ModChatViewChatRequest {
    /**
     * chat instance id
     * @type {number}
     * @memberof ModChatViewChatRequest
     */
    Chatid: number;
}

/**
 * Check if a given object implements the ModChatViewChatRequest interface.
 */
export function instanceOfModChatViewChatRequest(value: object): boolean {
    if (!('Chatid' in value)) return false;
    return true;
}

export function ModChatViewChatRequestFromJSON(json: any): ModChatViewChatRequest {
    return ModChatViewChatRequestFromJSONTyped(json, false);
}

export function ModChatViewChatRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChatViewChatRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Chatid': json['chatid'],
    };
}

export function ModChatViewChatRequestToJSON(value?: ModChatViewChatRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'chatid': value['Chatid'],
    };
}

