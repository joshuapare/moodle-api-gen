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
 * @interface CoreContentbankSetContentVisibilityRequest
 */
export interface CoreContentbankSetContentVisibilityRequest {
    /**
     * The content id to rename
     * @type {number}
     * @memberof CoreContentbankSetContentVisibilityRequest
     */
    contentid: number;
    /**
     * The new visibility for the content
     * @type {number}
     * @memberof CoreContentbankSetContentVisibilityRequest
     */
    visibility: number;
}

/**
 * Check if a given object implements the CoreContentbankSetContentVisibilityRequest interface.
 */
export function instanceOfCoreContentbankSetContentVisibilityRequest(value: object): boolean {
    if (!('contentid' in value)) return false;
    if (!('visibility' in value)) return false;
    return true;
}

export function CoreContentbankSetContentVisibilityRequestFromJSON(json: any): CoreContentbankSetContentVisibilityRequest {
    return CoreContentbankSetContentVisibilityRequestFromJSONTyped(json, false);
}

export function CoreContentbankSetContentVisibilityRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreContentbankSetContentVisibilityRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'contentid': json['contentid'],
        'visibility': json['visibility'],
    };
}

export function CoreContentbankSetContentVisibilityRequestToJSON(value?: CoreContentbankSetContentVisibilityRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'contentid': value['contentid'],
        'visibility': value['visibility'],
    };
}
