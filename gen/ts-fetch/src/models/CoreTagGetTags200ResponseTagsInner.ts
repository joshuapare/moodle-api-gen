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
 * information about one tag
 * @export
 * @interface CoreTagGetTags200ResponseTagsInner
 */
export interface CoreTagGetTags200ResponseTagsInner {
    /**
     * tag description
     * @type {string}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Descriptionformat?: number;
    /**
     * flag
     * @type {number}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Flag?: number;
    /**
     * tag id
     * @type {number}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Id?: number;
    /**
     * whether this flag is standard
     * @type {number}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Isstandard?: number;
    /**
     * name
     * @type {string}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Name?: string;
    /**
     * whether this flag is standard (deprecated, use isstandard)
     * @type {number}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Official?: number;
    /**
     * tag raw name (may contain capital letters)
     * @type {string}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Rawname?: string;
    /**
     * tag collection id
     * @type {number}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Tagcollid?: number;
    /**
     * URL to view
     * @type {string}
     * @memberof CoreTagGetTags200ResponseTagsInner
     */
    Viewurl?: string;
}

/**
 * Check if a given object implements the CoreTagGetTags200ResponseTagsInner interface.
 */
export function instanceOfCoreTagGetTags200ResponseTagsInner(value: object): boolean {
    return true;
}

export function CoreTagGetTags200ResponseTagsInnerFromJSON(json: any): CoreTagGetTags200ResponseTagsInner {
    return CoreTagGetTags200ResponseTagsInnerFromJSONTyped(json, false);
}

export function CoreTagGetTags200ResponseTagsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagGetTags200ResponseTagsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'] == null ? undefined : json['description'],
        'Descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'Flag': json['flag'] == null ? undefined : json['flag'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Isstandard': json['isstandard'] == null ? undefined : json['isstandard'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Official': json['official'] == null ? undefined : json['official'],
        'Rawname': json['rawname'] == null ? undefined : json['rawname'],
        'Tagcollid': json['tagcollid'] == null ? undefined : json['tagcollid'],
        'Viewurl': json['viewurl'] == null ? undefined : json['viewurl'],
    };
}

export function CoreTagGetTags200ResponseTagsInnerToJSON(value?: CoreTagGetTags200ResponseTagsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'descriptionformat': value['Descriptionformat'],
        'flag': value['Flag'],
        'id': value['Id'],
        'isstandard': value['Isstandard'],
        'name': value['Name'],
        'official': value['Official'],
        'rawname': value['Rawname'],
        'tagcollid': value['Tagcollid'],
        'viewurl': value['Viewurl'],
    };
}

