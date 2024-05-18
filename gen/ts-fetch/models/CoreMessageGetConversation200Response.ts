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
import type { CoreMessageGetConversation200ResponseMembersInner } from './CoreMessageGetConversation200ResponseMembersInner';
import {
    CoreMessageGetConversation200ResponseMembersInnerFromJSON,
    CoreMessageGetConversation200ResponseMembersInnerFromJSONTyped,
    CoreMessageGetConversation200ResponseMembersInnerToJSON,
} from './CoreMessageGetConversation200ResponseMembersInner';
import type { CoreMessageGetConversation200ResponseMessagesInner } from './CoreMessageGetConversation200ResponseMessagesInner';
import {
    CoreMessageGetConversation200ResponseMessagesInnerFromJSON,
    CoreMessageGetConversation200ResponseMessagesInnerFromJSONTyped,
    CoreMessageGetConversation200ResponseMessagesInnerToJSON,
} from './CoreMessageGetConversation200ResponseMessagesInner';

/**
 * 
 * @export
 * @interface CoreMessageGetConversation200Response
 */
export interface CoreMessageGetConversation200Response {
    /**
     * If the user can delete messages in the conversation for all users
     * @type {boolean}
     * @memberof CoreMessageGetConversation200Response
     */
    candeletemessagesforallusers?: boolean;
    /**
     * The conversation id
     * @type {number}
     * @memberof CoreMessageGetConversation200Response
     */
    id: number;
    /**
     * A link to the conversation picture, if set
     * @type {string}
     * @memberof CoreMessageGetConversation200Response
     */
    imageurl?: string;
    /**
     * If the user marked this conversation as a favourite
     * @type {boolean}
     * @memberof CoreMessageGetConversation200Response
     */
    isfavourite: boolean;
    /**
     * If the user muted this conversation
     * @type {boolean}
     * @memberof CoreMessageGetConversation200Response
     */
    ismuted: boolean;
    /**
     * If the user has read all messages in the conversation
     * @type {boolean}
     * @memberof CoreMessageGetConversation200Response
     */
    isread: boolean;
    /**
     * Total number of conversation members
     * @type {number}
     * @memberof CoreMessageGetConversation200Response
     */
    membercount: number;
    /**
     * 
     * @type {Array<CoreMessageGetConversation200ResponseMembersInner>}
     * @memberof CoreMessageGetConversation200Response
     */
    members: Array<CoreMessageGetConversation200ResponseMembersInner>;
    /**
     * 
     * @type {Array<CoreMessageGetConversation200ResponseMessagesInner>}
     * @memberof CoreMessageGetConversation200Response
     */
    messages: Array<CoreMessageGetConversation200ResponseMessagesInner>;
    /**
     * The conversation name, if set
     * @type {string}
     * @memberof CoreMessageGetConversation200Response
     */
    name?: string;
    /**
     * A subtitle for the conversation name, if set
     * @type {string}
     * @memberof CoreMessageGetConversation200Response
     */
    subname?: string;
    /**
     * The type of the conversation (1=individual,2=group,3=self)
     * @type {number}
     * @memberof CoreMessageGetConversation200Response
     */
    type: number;
    /**
     * The number of unread messages in this conversation
     * @type {number}
     * @memberof CoreMessageGetConversation200Response
     */
    unreadcount?: number;
}

/**
 * Check if a given object implements the CoreMessageGetConversation200Response interface.
 */
export function instanceOfCoreMessageGetConversation200Response(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('isfavourite' in value)) return false;
    if (!('ismuted' in value)) return false;
    if (!('isread' in value)) return false;
    if (!('membercount' in value)) return false;
    if (!('members' in value)) return false;
    if (!('messages' in value)) return false;
    if (!('type' in value)) return false;
    return true;
}

export function CoreMessageGetConversation200ResponseFromJSON(json: any): CoreMessageGetConversation200Response {
    return CoreMessageGetConversation200ResponseFromJSONTyped(json, false);
}

export function CoreMessageGetConversation200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetConversation200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'candeletemessagesforallusers': json['candeletemessagesforallusers'] == null ? undefined : json['candeletemessagesforallusers'],
        'id': json['id'],
        'imageurl': json['imageurl'] == null ? undefined : json['imageurl'],
        'isfavourite': json['isfavourite'],
        'ismuted': json['ismuted'],
        'isread': json['isread'],
        'membercount': json['membercount'],
        'members': ((json['members'] as Array<any>).map(CoreMessageGetConversation200ResponseMembersInnerFromJSON)),
        'messages': ((json['messages'] as Array<any>).map(CoreMessageGetConversation200ResponseMessagesInnerFromJSON)),
        'name': json['name'] == null ? undefined : json['name'],
        'subname': json['subname'] == null ? undefined : json['subname'],
        'type': json['type'],
        'unreadcount': json['unreadcount'] == null ? undefined : json['unreadcount'],
    };
}

export function CoreMessageGetConversation200ResponseToJSON(value?: CoreMessageGetConversation200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'candeletemessagesforallusers': value['candeletemessagesforallusers'],
        'id': value['id'],
        'imageurl': value['imageurl'],
        'isfavourite': value['isfavourite'],
        'ismuted': value['ismuted'],
        'isread': value['isread'],
        'membercount': value['membercount'],
        'members': ((value['members'] as Array<any>).map(CoreMessageGetConversation200ResponseMembersInnerToJSON)),
        'messages': ((value['messages'] as Array<any>).map(CoreMessageGetConversation200ResponseMessagesInnerToJSON)),
        'name': value['name'],
        'subname': value['subname'],
        'type': value['type'],
        'unreadcount': value['unreadcount'],
    };
}
