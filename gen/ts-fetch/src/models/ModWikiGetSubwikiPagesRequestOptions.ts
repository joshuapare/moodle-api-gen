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
 * @interface ModWikiGetSubwikiPagesRequestOptions
 */
export interface ModWikiGetSubwikiPagesRequestOptions {
    /**
     * Include each page contents or just the contents size.
     * @type {number}
     * @memberof ModWikiGetSubwikiPagesRequestOptions
     */
    Includecontent?: number;
    /**
     * Field to sort by (id, title, ...).
     * @type {string}
     * @memberof ModWikiGetSubwikiPagesRequestOptions
     */
    Sortby?: string;
    /**
     * Sort direction: ASC or DESC.
     * @type {string}
     * @memberof ModWikiGetSubwikiPagesRequestOptions
     */
    Sortdirection?: string;
}

/**
 * Check if a given object implements the ModWikiGetSubwikiPagesRequestOptions interface.
 */
export function instanceOfModWikiGetSubwikiPagesRequestOptions(value: object): boolean {
    return true;
}

export function ModWikiGetSubwikiPagesRequestOptionsFromJSON(json: any): ModWikiGetSubwikiPagesRequestOptions {
    return ModWikiGetSubwikiPagesRequestOptionsFromJSONTyped(json, false);
}

export function ModWikiGetSubwikiPagesRequestOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiGetSubwikiPagesRequestOptions {
    if (json == null) {
        return json;
    }
    return {
        
        'Includecontent': json['includecontent'] == null ? undefined : json['includecontent'],
        'Sortby': json['sortby'] == null ? undefined : json['sortby'],
        'Sortdirection': json['sortdirection'] == null ? undefined : json['sortdirection'],
    };
}

export function ModWikiGetSubwikiPagesRequestOptionsToJSON(value?: ModWikiGetSubwikiPagesRequestOptions | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'includecontent': value['Includecontent'],
        'sortby': value['Sortby'],
        'sortdirection': value['Sortdirection'],
    };
}

