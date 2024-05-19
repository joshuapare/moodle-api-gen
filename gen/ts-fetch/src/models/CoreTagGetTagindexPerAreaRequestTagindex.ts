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
    Ctx?: number;
    /**
     * exlusive mode for this tag area
     * @type {boolean}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    Excl?: boolean;
    /**
     * context id where the link was displayed
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    From?: number;
    /**
     * tag id
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    Id?: number;
    /**
     * page number (0-based)
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    Page?: number;
    /**
     * search in the context recursive
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    Rec?: number;
    /**
     * tag area id
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    Ta?: number;
    /**
     * tag name
     * @type {string}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    Tag?: string;
    /**
     * tag collection id
     * @type {number}
     * @memberof CoreTagGetTagindexPerAreaRequestTagindex
     */
    Tc?: number;
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
        
        'Ctx': json['ctx'] == null ? undefined : json['ctx'],
        'Excl': json['excl'] == null ? undefined : json['excl'],
        'From': json['from'] == null ? undefined : json['from'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Page': json['page'] == null ? undefined : json['page'],
        'Rec': json['rec'] == null ? undefined : json['rec'],
        'Ta': json['ta'] == null ? undefined : json['ta'],
        'Tag': json['tag'] == null ? undefined : json['tag'],
        'Tc': json['tc'] == null ? undefined : json['tc'],
    };
}

export function CoreTagGetTagindexPerAreaRequestTagindexToJSON(value?: CoreTagGetTagindexPerAreaRequestTagindex | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ctx': value['Ctx'],
        'excl': value['Excl'],
        'from': value['From'],
        'id': value['Id'],
        'page': value['Page'],
        'rec': value['Rec'],
        'ta': value['Ta'],
        'tag': value['Tag'],
        'tc': value['Tc'],
    };
}

