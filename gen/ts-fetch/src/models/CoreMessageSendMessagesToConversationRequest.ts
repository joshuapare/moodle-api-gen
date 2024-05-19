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
import type { CoreMessageSendMessagesToConversationRequestMessagesInner } from './CoreMessageSendMessagesToConversationRequestMessagesInner';
import {
    CoreMessageSendMessagesToConversationRequestMessagesInnerFromJSON,
    CoreMessageSendMessagesToConversationRequestMessagesInnerFromJSONTyped,
    CoreMessageSendMessagesToConversationRequestMessagesInnerToJSON,
} from './CoreMessageSendMessagesToConversationRequestMessagesInner';

/**
 * 
 * @export
 * @interface CoreMessageSendMessagesToConversationRequest
 */
export interface CoreMessageSendMessagesToConversationRequest {
    /**
     * id of the conversation
     * @type {number}
     * @memberof CoreMessageSendMessagesToConversationRequest
     */
    Conversationid: number;
    /**
     * 
     * @type {Array<CoreMessageSendMessagesToConversationRequestMessagesInner>}
     * @memberof CoreMessageSendMessagesToConversationRequest
     */
    Messages: Array<CoreMessageSendMessagesToConversationRequestMessagesInner>;
}

/**
 * Check if a given object implements the CoreMessageSendMessagesToConversationRequest interface.
 */
export function instanceOfCoreMessageSendMessagesToConversationRequest(value: object): boolean {
    if (!('Conversationid' in value)) return false;
    if (!('Messages' in value)) return false;
    return true;
}

export function CoreMessageSendMessagesToConversationRequestFromJSON(json: any): CoreMessageSendMessagesToConversationRequest {
    return CoreMessageSendMessagesToConversationRequestFromJSONTyped(json, false);
}

export function CoreMessageSendMessagesToConversationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageSendMessagesToConversationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Conversationid': json['conversationid'],
        'Messages': ((json['messages'] as Array<any>).map(CoreMessageSendMessagesToConversationRequestMessagesInnerFromJSON)),
    };
}

export function CoreMessageSendMessagesToConversationRequestToJSON(value?: CoreMessageSendMessagesToConversationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'conversationid': value['Conversationid'],
        'messages': ((value['Messages'] as Array<any>).map(CoreMessageSendMessagesToConversationRequestMessagesInnerToJSON)),
    };
}

