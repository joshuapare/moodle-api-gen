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
 * @interface CoreBlockFetchAddableBlocksRequest
 */
export interface CoreBlockFetchAddableBlocksRequest {
    /**
     * The context ID of the page.
     * @type {number}
     * @memberof CoreBlockFetchAddableBlocksRequest
     */
    pagecontextid: number;
    /**
     * Page hash
     * @type {string}
     * @memberof CoreBlockFetchAddableBlocksRequest
     */
    pagehash?: string;
    /**
     * The layout of the page.
     * @type {string}
     * @memberof CoreBlockFetchAddableBlocksRequest
     */
    pagelayout: string;
    /**
     * The type of the page.
     * @type {string}
     * @memberof CoreBlockFetchAddableBlocksRequest
     */
    pagetype: string;
    /**
     * The subpage identifier
     * @type {string}
     * @memberof CoreBlockFetchAddableBlocksRequest
     */
    subpage?: string;
}

/**
 * Check if a given object implements the CoreBlockFetchAddableBlocksRequest interface.
 */
export function instanceOfCoreBlockFetchAddableBlocksRequest(value: object): boolean {
    if (!('pagecontextid' in value)) return false;
    if (!('pagelayout' in value)) return false;
    if (!('pagetype' in value)) return false;
    return true;
}

export function CoreBlockFetchAddableBlocksRequestFromJSON(json: any): CoreBlockFetchAddableBlocksRequest {
    return CoreBlockFetchAddableBlocksRequestFromJSONTyped(json, false);
}

export function CoreBlockFetchAddableBlocksRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBlockFetchAddableBlocksRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'pagecontextid': json['pagecontextid'],
        'pagehash': json['pagehash'] == null ? undefined : json['pagehash'],
        'pagelayout': json['pagelayout'],
        'pagetype': json['pagetype'],
        'subpage': json['subpage'] == null ? undefined : json['subpage'],
    };
}

export function CoreBlockFetchAddableBlocksRequestToJSON(value?: CoreBlockFetchAddableBlocksRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pagecontextid': value['pagecontextid'],
        'pagehash': value['pagehash'],
        'pagelayout': value['pagelayout'],
        'pagetype': value['pagetype'],
        'subpage': value['subpage'],
    };
}
