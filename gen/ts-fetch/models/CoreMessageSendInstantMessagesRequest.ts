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
import type { CoreMessageSendInstantMessagesRequestMessagesInner } from './CoreMessageSendInstantMessagesRequestMessagesInner';
import {
    CoreMessageSendInstantMessagesRequestMessagesInnerFromJSON,
    CoreMessageSendInstantMessagesRequestMessagesInnerFromJSONTyped,
    CoreMessageSendInstantMessagesRequestMessagesInnerToJSON,
} from './CoreMessageSendInstantMessagesRequestMessagesInner';

/**
 * 
 * @export
 * @interface CoreMessageSendInstantMessagesRequest
 */
export interface CoreMessageSendInstantMessagesRequest {
    /**
     * 
     * @type {Array<CoreMessageSendInstantMessagesRequestMessagesInner>}
     * @memberof CoreMessageSendInstantMessagesRequest
     */
    messages: Array<CoreMessageSendInstantMessagesRequestMessagesInner>;
}

/**
 * Check if a given object implements the CoreMessageSendInstantMessagesRequest interface.
 */
export function instanceOfCoreMessageSendInstantMessagesRequest(value: object): boolean {
    if (!('messages' in value)) return false;
    return true;
}

export function CoreMessageSendInstantMessagesRequestFromJSON(json: any): CoreMessageSendInstantMessagesRequest {
    return CoreMessageSendInstantMessagesRequestFromJSONTyped(json, false);
}

export function CoreMessageSendInstantMessagesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageSendInstantMessagesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'messages': ((json['messages'] as Array<any>).map(CoreMessageSendInstantMessagesRequestMessagesInnerFromJSON)),
    };
}

export function CoreMessageSendInstantMessagesRequestToJSON(value?: CoreMessageSendInstantMessagesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'messages': ((value['messages'] as Array<any>).map(CoreMessageSendInstantMessagesRequestMessagesInnerToJSON)),
    };
}

