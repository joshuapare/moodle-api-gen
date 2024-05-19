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
 * @interface CoreMessageDeleteMessageRequest
 */
export interface CoreMessageDeleteMessageRequest {
    /**
     * The message id
     * @type {number}
     * @memberof CoreMessageDeleteMessageRequest
     */
    messageid: number;
    /**
     * If is a message read
     * @type {boolean}
     * @memberof CoreMessageDeleteMessageRequest
     */
    read?: boolean;
    /**
     * The user id of who we want to delete the message for
     * @type {number}
     * @memberof CoreMessageDeleteMessageRequest
     */
    userid: number;
}

/**
 * Check if a given object implements the CoreMessageDeleteMessageRequest interface.
 */
export function instanceOfCoreMessageDeleteMessageRequest(value: object): boolean {
    if (!('messageid' in value)) return false;
    if (!('userid' in value)) return false;
    return true;
}

export function CoreMessageDeleteMessageRequestFromJSON(json: any): CoreMessageDeleteMessageRequest {
    return CoreMessageDeleteMessageRequestFromJSONTyped(json, false);
}

export function CoreMessageDeleteMessageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageDeleteMessageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'messageid': json['messageid'],
        'read': json['read'] == null ? undefined : json['read'],
        'userid': json['userid'],
    };
}

export function CoreMessageDeleteMessageRequestToJSON(value?: CoreMessageDeleteMessageRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'messageid': value['messageid'],
        'read': value['read'],
        'userid': value['userid'],
    };
}

