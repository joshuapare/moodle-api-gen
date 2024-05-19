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
 * @interface CoreMessageDeleteContactsRequest
 */
export interface CoreMessageDeleteContactsRequest {
    /**
     * The id of the user we are deleting the contacts for, 0 for the
     *                     current user
     * @type {number}
     * @memberof CoreMessageDeleteContactsRequest
     */
    Userid?: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreMessageDeleteContactsRequest
     */
    Userids: Array<object>;
}

/**
 * Check if a given object implements the CoreMessageDeleteContactsRequest interface.
 */
export function instanceOfCoreMessageDeleteContactsRequest(value: object): boolean {
    if (!('Userids' in value)) return false;
    return true;
}

export function CoreMessageDeleteContactsRequestFromJSON(json: any): CoreMessageDeleteContactsRequest {
    return CoreMessageDeleteContactsRequestFromJSONTyped(json, false);
}

export function CoreMessageDeleteContactsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageDeleteContactsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Userids': json['userids'],
    };
}

export function CoreMessageDeleteContactsRequestToJSON(value?: CoreMessageDeleteContactsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'userid': value['Userid'],
        'userids': value['Userids'],
    };
}

