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
 * @interface ModChatSendChatMessageRequest
 */
export interface ModChatSendChatMessageRequest {
    /**
     * the beep id
     * @type {string}
     * @memberof ModChatSendChatMessageRequest
     */
    Beepid?: string;
    /**
     * chat session id (obtained via mod_chat_login_user)
     * @type {string}
     * @memberof ModChatSendChatMessageRequest
     */
    Chatsid: string;
    /**
     * the message text
     * @type {string}
     * @memberof ModChatSendChatMessageRequest
     */
    Messagetext: string;
}

/**
 * Check if a given object implements the ModChatSendChatMessageRequest interface.
 */
export function instanceOfModChatSendChatMessageRequest(value: object): boolean {
    if (!('Chatsid' in value)) return false;
    if (!('Messagetext' in value)) return false;
    return true;
}

export function ModChatSendChatMessageRequestFromJSON(json: any): ModChatSendChatMessageRequest {
    return ModChatSendChatMessageRequestFromJSONTyped(json, false);
}

export function ModChatSendChatMessageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChatSendChatMessageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Beepid': json['beepid'] == null ? undefined : json['beepid'],
        'Chatsid': json['chatsid'],
        'Messagetext': json['messagetext'],
    };
}

export function ModChatSendChatMessageRequestToJSON(value?: ModChatSendChatMessageRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'beepid': value['Beepid'],
        'chatsid': value['Chatsid'],
        'messagetext': value['Messagetext'],
    };
}

