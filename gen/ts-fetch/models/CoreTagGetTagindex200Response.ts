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
 * @interface CoreTagGetTagindex200Response
 */
export interface CoreTagGetTagindex200Response {
    /**
     * name of anchor
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    anchor?: string;
    /**
     * component
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    component: string;
    /**
     * title
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    content: string;
    /**
     * text for exclusive link
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    exclusivetext?: string;
    /**
     * URL for exclusive link
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    exclusiveurl?: string;
    /**
     * whether the content is present
     * @type {number}
     * @memberof CoreTagGetTagindex200Response
     */
    hascontent: number;
    /**
     * itemtype
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    itemtype: string;
    /**
     * URL for the next page
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    nextpageurl?: string;
    /**
     * URL for the next page
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    prevpageurl?: string;
    /**
     * tag area id
     * @type {number}
     * @memberof CoreTagGetTagindex200Response
     */
    ta: number;
    /**
     * tag id
     * @type {number}
     * @memberof CoreTagGetTagindex200Response
     */
    tagid: number;
    /**
     * title
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    title: string;
}

/**
 * Check if a given object implements the CoreTagGetTagindex200Response interface.
 */
export function instanceOfCoreTagGetTagindex200Response(value: object): boolean {
    if (!('component' in value)) return false;
    if (!('content' in value)) return false;
    if (!('hascontent' in value)) return false;
    if (!('itemtype' in value)) return false;
    if (!('ta' in value)) return false;
    if (!('tagid' in value)) return false;
    if (!('title' in value)) return false;
    return true;
}

export function CoreTagGetTagindex200ResponseFromJSON(json: any): CoreTagGetTagindex200Response {
    return CoreTagGetTagindex200ResponseFromJSONTyped(json, false);
}

export function CoreTagGetTagindex200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagGetTagindex200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'anchor': json['anchor'] == null ? undefined : json['anchor'],
        'component': json['component'],
        'content': json['content'],
        'exclusivetext': json['exclusivetext'] == null ? undefined : json['exclusivetext'],
        'exclusiveurl': json['exclusiveurl'] == null ? undefined : json['exclusiveurl'],
        'hascontent': json['hascontent'],
        'itemtype': json['itemtype'],
        'nextpageurl': json['nextpageurl'] == null ? undefined : json['nextpageurl'],
        'prevpageurl': json['prevpageurl'] == null ? undefined : json['prevpageurl'],
        'ta': json['ta'],
        'tagid': json['tagid'],
        'title': json['title'],
    };
}

export function CoreTagGetTagindex200ResponseToJSON(value?: CoreTagGetTagindex200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'anchor': value['anchor'],
        'component': value['component'],
        'content': value['content'],
        'exclusivetext': value['exclusivetext'],
        'exclusiveurl': value['exclusiveurl'],
        'hascontent': value['hascontent'],
        'itemtype': value['itemtype'],
        'nextpageurl': value['nextpageurl'],
        'prevpageurl': value['prevpageurl'],
        'ta': value['ta'],
        'tagid': value['tagid'],
        'title': value['title'],
    };
}
