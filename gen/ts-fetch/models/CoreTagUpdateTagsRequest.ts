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
import type { CoreTagUpdateTagsRequestTagsInner } from './CoreTagUpdateTagsRequestTagsInner';
import {
    CoreTagUpdateTagsRequestTagsInnerFromJSON,
    CoreTagUpdateTagsRequestTagsInnerFromJSONTyped,
    CoreTagUpdateTagsRequestTagsInnerToJSON,
} from './CoreTagUpdateTagsRequestTagsInner';

/**
 * 
 * @export
 * @interface CoreTagUpdateTagsRequest
 */
export interface CoreTagUpdateTagsRequest {
    /**
     * 
     * @type {Array<CoreTagUpdateTagsRequestTagsInner>}
     * @memberof CoreTagUpdateTagsRequest
     */
    tags: Array<CoreTagUpdateTagsRequestTagsInner>;
}

/**
 * Check if a given object implements the CoreTagUpdateTagsRequest interface.
 */
export function instanceOfCoreTagUpdateTagsRequest(value: object): boolean {
    if (!('tags' in value)) return false;
    return true;
}

export function CoreTagUpdateTagsRequestFromJSON(json: any): CoreTagUpdateTagsRequest {
    return CoreTagUpdateTagsRequestFromJSONTyped(json, false);
}

export function CoreTagUpdateTagsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagUpdateTagsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'tags': ((json['tags'] as Array<any>).map(CoreTagUpdateTagsRequestTagsInnerFromJSON)),
    };
}

export function CoreTagUpdateTagsRequestToJSON(value?: CoreTagUpdateTagsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'tags': ((value['tags'] as Array<any>).map(CoreTagUpdateTagsRequestTagsInnerToJSON)),
    };
}

