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
import type { ModWikiGetPageForEditing200ResponsePagesection } from './ModWikiGetPageForEditing200ResponsePagesection';
import {
    ModWikiGetPageForEditing200ResponsePagesectionFromJSON,
    ModWikiGetPageForEditing200ResponsePagesectionFromJSONTyped,
    ModWikiGetPageForEditing200ResponsePagesectionToJSON,
} from './ModWikiGetPageForEditing200ResponsePagesection';

/**
 * 
 * @export
 * @interface ModWikiGetPageForEditing200Response
 */
export interface ModWikiGetPageForEditing200Response {
    /**
     * 
     * @type {ModWikiGetPageForEditing200ResponsePagesection}
     * @memberof ModWikiGetPageForEditing200Response
     */
    pagesection: ModWikiGetPageForEditing200ResponsePagesection;
}

/**
 * Check if a given object implements the ModWikiGetPageForEditing200Response interface.
 */
export function instanceOfModWikiGetPageForEditing200Response(value: object): boolean {
    if (!('pagesection' in value)) return false;
    return true;
}

export function ModWikiGetPageForEditing200ResponseFromJSON(json: any): ModWikiGetPageForEditing200Response {
    return ModWikiGetPageForEditing200ResponseFromJSONTyped(json, false);
}

export function ModWikiGetPageForEditing200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiGetPageForEditing200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'pagesection': ModWikiGetPageForEditing200ResponsePagesectionFromJSON(json['pagesection']),
    };
}

export function ModWikiGetPageForEditing200ResponseToJSON(value?: ModWikiGetPageForEditing200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pagesection': ModWikiGetPageForEditing200ResponsePagesectionToJSON(value['pagesection']),
    };
}
