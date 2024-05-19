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
 * @interface CoreMessageUnmuteConversationsRequest
 */
export interface CoreMessageUnmuteConversationsRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreMessageUnmuteConversationsRequest
     */
    Conversationids: Array<object>;
    /**
     * The id of the user who is unblocking
     * @type {number}
     * @memberof CoreMessageUnmuteConversationsRequest
     */
    Userid: number;
}

/**
 * Check if a given object implements the CoreMessageUnmuteConversationsRequest interface.
 */
export function instanceOfCoreMessageUnmuteConversationsRequest(value: object): boolean {
    if (!('Conversationids' in value)) return false;
    if (!('Userid' in value)) return false;
    return true;
}

export function CoreMessageUnmuteConversationsRequestFromJSON(json: any): CoreMessageUnmuteConversationsRequest {
    return CoreMessageUnmuteConversationsRequestFromJSONTyped(json, false);
}

export function CoreMessageUnmuteConversationsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageUnmuteConversationsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Conversationids': json['conversationids'],
        'Userid': json['userid'],
    };
}

export function CoreMessageUnmuteConversationsRequestToJSON(value?: CoreMessageUnmuteConversationsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'conversationids': value['Conversationids'],
        'userid': value['Userid'],
    };
}
