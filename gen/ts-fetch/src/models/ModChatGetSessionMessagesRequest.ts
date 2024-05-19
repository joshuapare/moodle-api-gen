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
    Chatid: number;
    /**
     * Get messages from users in this group.
     *                                                 0 means that the function will determine the user group
     * @type {number}
     * @memberof ModChatGetSessionMessagesRequest
     */
    Groupid?: number;
    /**
     * The session end time (timestamp).
     * @type {number}
     * @memberof ModChatGetSessionMessagesRequest
     */
    Sessionend: number;
    /**
     * The session start time (timestamp).
     * @type {number}
     * @memberof ModChatGetSessionMessagesRequest
     */
    Sessionstart: number;
}

/**
 * Check if a given object implements the ModChatGetSessionMessagesRequest interface.
 */
export function instanceOfModChatGetSessionMessagesRequest(value: object): boolean {
    if (!('Chatid' in value)) return false;
    if (!('Sessionend' in value)) return false;
    if (!('Sessionstart' in value)) return false;
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
        
        'Chatid': json['chatid'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Sessionend': json['sessionend'],
        'Sessionstart': json['sessionstart'],
    };
}

export function ModChatGetSessionMessagesRequestToJSON(value?: ModChatGetSessionMessagesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'chatid': value['Chatid'],
        'groupid': value['Groupid'],
        'sessionend': value['Sessionend'],
        'sessionstart': value['Sessionstart'],
    };
}
