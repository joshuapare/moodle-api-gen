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
 * @interface ModChatGetSessionMessagesRequest
 */
export interface ModChatGetSessionMessagesRequest {
    /**
     * Chat instance id.
     * @type {number}
     * @memberof ModChatGetSessionMessagesRequest
     */
    chatid: number;
    /**
     * Get messages from users in this group.
     *                                                 0 means that the function will determine the user group
     * @type {number}
     * @memberof ModChatGetSessionMessagesRequest
     */
    groupid?: number;
    /**
     * The session end time (timestamp).
     * @type {number}
     * @memberof ModChatGetSessionMessagesRequest
     */
    sessionend: number;
    /**
     * The session start time (timestamp).
     * @type {number}
     * @memberof ModChatGetSessionMessagesRequest
     */
    sessionstart: number;
}

/**
 * Check if a given object implements the ModChatGetSessionMessagesRequest interface.
 */
export function instanceOfModChatGetSessionMessagesRequest(value: object): boolean {
    if (!('chatid' in value)) return false;
    if (!('sessionend' in value)) return false;
    if (!('sessionstart' in value)) return false;
    return true;
}

export function ModChatGetSessionMessagesRequestFromJSON(json: any): ModChatGetSessionMessagesRequest {
    return ModChatGetSessionMessagesRequestFromJSONTyped(json, false);
}

export function ModChatGetSessionMessagesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChatGetSessionMessagesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'chatid': json['chatid'],
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'sessionend': json['sessionend'],
        'sessionstart': json['sessionstart'],
    };
}

export function ModChatGetSessionMessagesRequestToJSON(value?: ModChatGetSessionMessagesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'chatid': value['chatid'],
        'groupid': value['groupid'],
        'sessionend': value['sessionend'],
        'sessionstart': value['sessionstart'],
    };
}
