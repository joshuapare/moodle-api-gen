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
 * @interface ModWikiViewPageRequest
 */
export interface ModWikiViewPageRequest {
    /**
     * Wiki page ID.
     * @type {number}
     * @memberof ModWikiViewPageRequest
     */
    Pageid: number;
}

/**
 * Check if a given object implements the ModWikiViewPageRequest interface.
 */
export function instanceOfModWikiViewPageRequest(value: object): boolean {
    if (!('Pageid' in value)) return false;
    return true;
}

export function ModWikiViewPageRequestFromJSON(json: any): ModWikiViewPageRequest {
    return ModWikiViewPageRequestFromJSONTyped(json, false);
}

export function ModWikiViewPageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiViewPageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Pageid': json['pageid'],
    };
}

export function ModWikiViewPageRequestToJSON(value?: ModWikiViewPageRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pageid': value['Pageid'],
    };
}

