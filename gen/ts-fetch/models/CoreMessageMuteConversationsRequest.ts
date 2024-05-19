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
 * @interface CoreMessageMuteConversationsRequest
 */
export interface CoreMessageMuteConversationsRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreMessageMuteConversationsRequest
     */
    conversationids: Array<object>;
    /**
     * The id of the user who is blocking
     * @type {number}
     * @memberof CoreMessageMuteConversationsRequest
     */
    userid: number;
}

/**
 * Check if a given object implements the CoreMessageMuteConversationsRequest interface.
 */
export function instanceOfCoreMessageMuteConversationsRequest(value: object): boolean {
    if (!('conversationids' in value)) return false;
    if (!('userid' in value)) return false;
    return true;
}

export function CoreMessageMuteConversationsRequestFromJSON(json: any): CoreMessageMuteConversationsRequest {
    return CoreMessageMuteConversationsRequestFromJSONTyped(json, false);
}

export function CoreMessageMuteConversationsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageMuteConversationsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'conversationids': json['conversationids'],
        'userid': json['userid'],
    };
}

export function CoreMessageMuteConversationsRequestToJSON(value?: CoreMessageMuteConversationsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'conversationids': value['conversationids'],
        'userid': value['userid'],
    };
}

