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
 * @interface BlockRecentlyaccesseditemsGetRecentItemsRequest
 */
export interface BlockRecentlyaccesseditemsGetRecentItemsRequest {
    /**
     * result set limit
     * @type {number}
     * @memberof BlockRecentlyaccesseditemsGetRecentItemsRequest
     */
    Limit?: number;
}

/**
 * Check if a given object implements the BlockRecentlyaccesseditemsGetRecentItemsRequest interface.
 */
export function instanceOfBlockRecentlyaccesseditemsGetRecentItemsRequest(value: object): boolean {
    return true;
}

export function BlockRecentlyaccesseditemsGetRecentItemsRequestFromJSON(json: any): BlockRecentlyaccesseditemsGetRecentItemsRequest {
    return BlockRecentlyaccesseditemsGetRecentItemsRequestFromJSONTyped(json, false);
}

export function BlockRecentlyaccesseditemsGetRecentItemsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockRecentlyaccesseditemsGetRecentItemsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Limit': json['limit'] == null ? undefined : json['limit'],
    };
}

export function BlockRecentlyaccesseditemsGetRecentItemsRequestToJSON(value?: BlockRecentlyaccesseditemsGetRecentItemsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'limit': value['Limit'],
    };
}
