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
    Anchor?: string;
    /**
     * component
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Component: string;
    /**
     * title
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Content: string;
    /**
     * text for exclusive link
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Exclusivetext?: string;
    /**
     * URL for exclusive link
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Exclusiveurl?: string;
    /**
     * whether the content is present
     * @type {number}
     * @memberof CoreTagGetTagindex200Response
     */
    Hascontent: number;
    /**
     * itemtype
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Itemtype: string;
    /**
     * URL for the next page
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Nextpageurl?: string;
    /**
     * URL for the next page
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Prevpageurl?: string;
    /**
     * tag area id
     * @type {number}
     * @memberof CoreTagGetTagindex200Response
     */
    Ta: number;
    /**
     * tag id
     * @type {number}
     * @memberof CoreTagGetTagindex200Response
     */
    Tagid: number;
    /**
     * title
     * @type {string}
     * @memberof CoreTagGetTagindex200Response
     */
    Title: string;
}

/**
 * Check if a given object implements the CoreTagGetTagindex200Response interface.
 */
export function instanceOfCoreTagGetTagindex200Response(value: object): boolean {
    if (!('Component' in value)) return false;
    if (!('Content' in value)) return false;
    if (!('Hascontent' in value)) return false;
    if (!('Itemtype' in value)) return false;
    if (!('Ta' in value)) return false;
    if (!('Tagid' in value)) return false;
    if (!('Title' in value)) return false;
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
        
        'Anchor': json['anchor'] == null ? undefined : json['anchor'],
        'Component': json['component'],
        'Content': json['content'],
        'Exclusivetext': json['exclusivetext'] == null ? undefined : json['exclusivetext'],
        'Exclusiveurl': json['exclusiveurl'] == null ? undefined : json['exclusiveurl'],
        'Hascontent': json['hascontent'],
        'Itemtype': json['itemtype'],
        'Nextpageurl': json['nextpageurl'] == null ? undefined : json['nextpageurl'],
        'Prevpageurl': json['prevpageurl'] == null ? undefined : json['prevpageurl'],
        'Ta': json['ta'],
        'Tagid': json['tagid'],
        'Title': json['title'],
    };
}

export function CoreTagGetTagindex200ResponseToJSON(value?: CoreTagGetTagindex200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'anchor': value['Anchor'],
        'component': value['Component'],
        'content': value['Content'],
        'exclusivetext': value['Exclusivetext'],
        'exclusiveurl': value['Exclusiveurl'],
        'hascontent': value['Hascontent'],
        'itemtype': value['Itemtype'],
        'nextpageurl': value['Nextpageurl'],
        'prevpageurl': value['Prevpageurl'],
        'ta': value['Ta'],
        'tagid': value['Tagid'],
        'title': value['Title'],
    };
}

