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
 * @interface CoreMessageGetBlockedUsersRequest
 */
export interface CoreMessageGetBlockedUsersRequest {
    /**
     * the user whose blocked users we want to retrieve
     * @type {number}
     * @memberof CoreMessageGetBlockedUsersRequest
     */
    Userid: number;
}

/**
 * Check if a given object implements the CoreMessageGetBlockedUsersRequest interface.
 */
export function instanceOfCoreMessageGetBlockedUsersRequest(value: object): boolean {
    if (!('Userid' in value)) return false;
    return true;
}

export function CoreMessageGetBlockedUsersRequestFromJSON(json: any): CoreMessageGetBlockedUsersRequest {
    return CoreMessageGetBlockedUsersRequestFromJSONTyped(json, false);
}

export function CoreMessageGetBlockedUsersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetBlockedUsersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Userid': json['userid'],
    };
}

export function CoreMessageGetBlockedUsersRequestToJSON(value?: CoreMessageGetBlockedUsersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'userid': value['Userid'],
    };
}

