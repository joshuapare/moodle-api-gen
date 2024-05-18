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
 * @interface CoreMessageSearchContactsRequest
 */
export interface CoreMessageSearchContactsRequest {
    /**
     * Limit search to the user's courses
     * @type {boolean}
     * @memberof CoreMessageSearchContactsRequest
     */
    onlymycourses?: boolean;
    /**
     * String the user's fullname has to match to be found
     * @type {string}
     * @memberof CoreMessageSearchContactsRequest
     */
    searchtext: string;
}

/**
 * Check if a given object implements the CoreMessageSearchContactsRequest interface.
 */
export function instanceOfCoreMessageSearchContactsRequest(value: object): boolean {
    if (!('searchtext' in value)) return false;
    return true;
}

export function CoreMessageSearchContactsRequestFromJSON(json: any): CoreMessageSearchContactsRequest {
    return CoreMessageSearchContactsRequestFromJSONTyped(json, false);
}

export function CoreMessageSearchContactsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageSearchContactsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'onlymycourses': json['onlymycourses'] == null ? undefined : json['onlymycourses'],
        'searchtext': json['searchtext'],
    };
}

export function CoreMessageSearchContactsRequestToJSON(value?: CoreMessageSearchContactsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'onlymycourses': value['onlymycourses'],
        'searchtext': value['searchtext'],
    };
}
