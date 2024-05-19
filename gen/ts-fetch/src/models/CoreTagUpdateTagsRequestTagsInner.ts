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
 * @interface CoreTagUpdateTagsRequestTagsInner
 */
export interface CoreTagUpdateTagsRequestTagsInner {
    /**
     * tag description
     * @type {string}
     * @memberof CoreTagUpdateTagsRequestTagsInner
     */
    Description?: string;
    /**
     * tag description format
     * @type {number}
     * @memberof CoreTagUpdateTagsRequestTagsInner
     */
    Descriptionformat?: number;
    /**
     * flag
     * @type {number}
     * @memberof CoreTagUpdateTagsRequestTagsInner
     */
    Flag?: number;
    /**
     * tag id
     * @type {number}
     * @memberof CoreTagUpdateTagsRequestTagsInner
     */
    Id?: number;
    /**
     * whether this flag is standard
     * @type {number}
     * @memberof CoreTagUpdateTagsRequestTagsInner
     */
    Isstandard?: number;
    /**
     * (deprecated, use isstandard) whether this flag is standard
     * @type {number}
     * @memberof CoreTagUpdateTagsRequestTagsInner
     */
    Official?: number;
    /**
     * tag raw name (may contain capital letters)
     * @type {string}
     * @memberof CoreTagUpdateTagsRequestTagsInner
     */
    Rawname?: string;
}

/**
 * Check if a given object implements the CoreTagUpdateTagsRequestTagsInner interface.
 */
export function instanceOfCoreTagUpdateTagsRequestTagsInner(value: object): boolean {
    return true;
}

export function CoreTagUpdateTagsRequestTagsInnerFromJSON(json: any): CoreTagUpdateTagsRequestTagsInner {
    return CoreTagUpdateTagsRequestTagsInnerFromJSONTyped(json, false);
}

export function CoreTagUpdateTagsRequestTagsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagUpdateTagsRequestTagsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'] == null ? undefined : json['description'],
        'Descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'Flag': json['flag'] == null ? undefined : json['flag'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Isstandard': json['isstandard'] == null ? undefined : json['isstandard'],
        'Official': json['official'] == null ? undefined : json['official'],
        'Rawname': json['rawname'] == null ? undefined : json['rawname'],
    };
}

export function CoreTagUpdateTagsRequestTagsInnerToJSON(value?: CoreTagUpdateTagsRequestTagsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'descriptionformat': value['Descriptionformat'],
        'flag': value['Flag'],
        'id': value['Id'],
        'isstandard': value['Isstandard'],
        'official': value['Official'],
        'rawname': value['Rawname'],
    };
}
