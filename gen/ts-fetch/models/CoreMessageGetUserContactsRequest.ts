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
 * @interface CoreMessageGetUserContactsRequest
 */
export interface CoreMessageGetUserContactsRequest {
    /**
     * Limit from
     * @type {number}
     * @memberof CoreMessageGetUserContactsRequest
     */
    limitfrom?: number;
    /**
     * Limit number
     * @type {number}
     * @memberof CoreMessageGetUserContactsRequest
     */
    limitnum?: number;
    /**
     * The id of the user who we retrieving the contacts for
     * @type {number}
     * @memberof CoreMessageGetUserContactsRequest
     */
    userid: number;
}

/**
 * Check if a given object implements the CoreMessageGetUserContactsRequest interface.
 */
export function instanceOfCoreMessageGetUserContactsRequest(value: object): boolean {
    if (!('userid' in value)) return false;
    return true;
}

export function CoreMessageGetUserContactsRequestFromJSON(json: any): CoreMessageGetUserContactsRequest {
    return CoreMessageGetUserContactsRequestFromJSONTyped(json, false);
}

export function CoreMessageGetUserContactsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetUserContactsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'limitfrom': json['limitfrom'] == null ? undefined : json['limitfrom'],
        'limitnum': json['limitnum'] == null ? undefined : json['limitnum'],
        'userid': json['userid'],
    };
}

export function CoreMessageGetUserContactsRequestToJSON(value?: CoreMessageGetUserContactsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'limitfrom': value['limitfrom'],
        'limitnum': value['limitnum'],
        'userid': value['userid'],
    };
}

