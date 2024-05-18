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
 * @interface CoreGroupDeleteGroupsRequest
 */
export interface CoreGroupDeleteGroupsRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreGroupDeleteGroupsRequest
     */
    groupids: Array<object>;
}

/**
 * Check if a given object implements the CoreGroupDeleteGroupsRequest interface.
 */
export function instanceOfCoreGroupDeleteGroupsRequest(value: object): boolean {
    if (!('groupids' in value)) return false;
    return true;
}

export function CoreGroupDeleteGroupsRequestFromJSON(json: any): CoreGroupDeleteGroupsRequest {
    return CoreGroupDeleteGroupsRequestFromJSONTyped(json, false);
}

export function CoreGroupDeleteGroupsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGroupDeleteGroupsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'groupids': json['groupids'],
    };
}

export function CoreGroupDeleteGroupsRequestToJSON(value?: CoreGroupDeleteGroupsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'groupids': value['groupids'],
    };
}

