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
 * @interface CoreMessageSendMessagesToConversationRequestMessagesInner
 */
export interface CoreMessageSendMessagesToConversationRequestMessagesInner {
    /**
     * the text of the message
     * @type {string}
     * @memberof CoreMessageSendMessagesToConversationRequestMessagesInner
     */
    Text?: string;
    /**
     * text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreMessageSendMessagesToConversationRequestMessagesInner
     */
    Textformat?: number;
}

/**
 * Check if a given object implements the CoreMessageSendMessagesToConversationRequestMessagesInner interface.
 */
export function instanceOfCoreMessageSendMessagesToConversationRequestMessagesInner(value: object): boolean {
    return true;
}

export function CoreMessageSendMessagesToConversationRequestMessagesInnerFromJSON(json: any): CoreMessageSendMessagesToConversationRequestMessagesInner {
    return CoreMessageSendMessagesToConversationRequestMessagesInnerFromJSONTyped(json, false);
}

export function CoreMessageSendMessagesToConversationRequestMessagesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageSendMessagesToConversationRequestMessagesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Text': json['text'] == null ? undefined : json['text'],
        'Textformat': json['textformat'] == null ? undefined : json['textformat'],
    };
}

export function CoreMessageSendMessagesToConversationRequestMessagesInnerToJSON(value?: CoreMessageSendMessagesToConversationRequestMessagesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'text': value['Text'],
        'textformat': value['Textformat'],
    };
}

