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
 * @interface CoreTagGetTagsRequestTagsInner
 */
export interface CoreTagGetTagsRequestTagsInner {
    /**
     * tag id
     * @type {number}
     * @memberof CoreTagGetTagsRequestTagsInner
     */
    id?: number;
}

/**
 * Check if a given object implements the CoreTagGetTagsRequestTagsInner interface.
 */
export function instanceOfCoreTagGetTagsRequestTagsInner(value: object): boolean {
    return true;
}

export function CoreTagGetTagsRequestTagsInnerFromJSON(json: any): CoreTagGetTagsRequestTagsInner {
    return CoreTagGetTagsRequestTagsInnerFromJSONTyped(json, false);
}

export function CoreTagGetTagsRequestTagsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagGetTagsRequestTagsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
    };
}

export function CoreTagGetTagsRequestTagsInnerToJSON(value?: CoreTagGetTagsRequestTagsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}
