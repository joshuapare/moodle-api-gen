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
 * @interface CoreBlockGetDashboardBlocksRequest
 */
export interface CoreBlockGetDashboardBlocksRequest {
    /**
     * What my page to return blocks of
     * @type {string}
     * @memberof CoreBlockGetDashboardBlocksRequest
     */
    mypage?: string;
    /**
     * Whether to return the block contents.
     * @type {boolean}
     * @memberof CoreBlockGetDashboardBlocksRequest
     */
    returncontents?: boolean;
    /**
     * User id (optional), default is current user.
     * @type {number}
     * @memberof CoreBlockGetDashboardBlocksRequest
     */
    userid?: number;
}

/**
 * Check if a given object implements the CoreBlockGetDashboardBlocksRequest interface.
 */
export function instanceOfCoreBlockGetDashboardBlocksRequest(value: object): boolean {
    return true;
}

export function CoreBlockGetDashboardBlocksRequestFromJSON(json: any): CoreBlockGetDashboardBlocksRequest {
    return CoreBlockGetDashboardBlocksRequestFromJSONTyped(json, false);
}

export function CoreBlockGetDashboardBlocksRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreBlockGetDashboardBlocksRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'mypage': json['mypage'] == null ? undefined : json['mypage'],
        'returncontents': json['returncontents'] == null ? undefined : json['returncontents'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function CoreBlockGetDashboardBlocksRequestToJSON(value?: CoreBlockGetDashboardBlocksRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'mypage': value['mypage'],
        'returncontents': value['returncontents'],
        'userid': value['userid'],
    };
}
