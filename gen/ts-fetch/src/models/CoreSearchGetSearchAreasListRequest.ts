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
 * @interface CoreSearchGetSearchAreasListRequest
 */
export interface CoreSearchGetSearchAreasListRequest {
    /**
     * category to filter areas
     * @type {string}
     * @memberof CoreSearchGetSearchAreasListRequest
     */
    Cat?: string;
}

/**
 * Check if a given object implements the CoreSearchGetSearchAreasListRequest interface.
 */
export function instanceOfCoreSearchGetSearchAreasListRequest(value: object): boolean {
    return true;
}

export function CoreSearchGetSearchAreasListRequestFromJSON(json: any): CoreSearchGetSearchAreasListRequest {
    return CoreSearchGetSearchAreasListRequestFromJSONTyped(json, false);
}

export function CoreSearchGetSearchAreasListRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreSearchGetSearchAreasListRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Cat': json['cat'] == null ? undefined : json['cat'],
    };
}

export function CoreSearchGetSearchAreasListRequestToJSON(value?: CoreSearchGetSearchAreasListRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cat': value['Cat'],
    };
}
