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
 * @interface CoreTagGetTagindexPerAreaRequestTagindex
 */
export interface CoreTagGetTagindexPerAreaRequestTagindex {
    /**
     * context id where to search for items
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    ctx?: number;
    /**
     * exlusive mode for this tag area
     * @type {boolean}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    excl?: boolean;
    /**
     * context id where the link was displayed
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    from?: number;
    /**
     * tag id
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    id?: number;
    /**
     * page number (0-based)
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    page?: number;
    /**
     * search in the context recursive
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    rec?: number;
    /**
     * tag area id
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    ta?: number;
    /**
     * tag name
     * @type {string}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    tag?: string;
    /**
     * tag collection id
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    tc?: number;
}

/**
 * Check if a given object implements the CoreTagGetTagindexPerAreaRequestTagindex interface.
 */
export function instanceOfCoreTagGetTagindexPerAreaRequestTagindex(value: object): boolean {
    return true;
}

export function CoreTagGetTagindexPerAreaRequestTagindexFromJSON(json: any): CoreTagGetTagindexPerAreaRequestTagindex {
    return CoreTagGetTagindexPerAreaRequestTagindexFromJSONTyped(json, false);
}

export function CoreTagGetTagindexPerAreaRequestTagindexFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTagGetTagindexPerAreaRequestTagindex {
    if (json == null) {
        return json;
    }
    return {
        
        'ctx': json['ctx'] == null ? undefined : json['ctx'],
        'excl': json['excl'] == null ? undefined : json['excl'],
        'from': json['from'] == null ? undefined : json['from'],
        'id': json['id'] == null ? undefined : json['id'],
        'page': json['page'] == null ? undefined : json['page'],
        'rec': json['rec'] == null ? undefined : json['rec'],
        'ta': json['ta'] == null ? undefined : json['ta'],
        'tag': json['tag'] == null ? undefined : json['tag'],
        'tc': json['tc'] == null ? undefined : json['tc'],
    };
}

export function CoreTagGetTagindexPerAreaRequestTagindexToJSON(value?: CoreTagGetTagindexPerAreaRequestTagindex | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ctx': value['ctx'],
        'excl': value['excl'],
        'from': value['from'],
        'id': value['id'],
        'page': value['page'],
        'rec': value['rec'],
        'ta': value['ta'],
        'tag': value['tag'],
        'tc': value['tc'],
    };
}
