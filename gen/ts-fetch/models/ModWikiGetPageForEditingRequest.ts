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
 * @interface ModWikiGetPageForEditingRequest
 */
export interface ModWikiGetPageForEditingRequest {
    /**
     * Just renew lock and not return content.
     * @type {boolean}
     * @memberof ModWikiGetPageForEditingRequest
     */
    lockonly?: boolean;
    /**
     * Page ID to edit.
     * @type {number}
     * @memberof ModWikiGetPageForEditingRequest
     */
    pageid: number;
    /**
     * Section page title.
     * @type {string}
     * @memberof ModWikiGetPageForEditingRequest
     */
    section?: string;
}

/**
 * Check if a given object implements the ModWikiGetPageForEditingRequest interface.
 */
export function instanceOfModWikiGetPageForEditingRequest(value: object): boolean {
    if (!('pageid' in value)) return false;
    return true;
}

export function ModWikiGetPageForEditingRequestFromJSON(json: any): ModWikiGetPageForEditingRequest {
    return ModWikiGetPageForEditingRequestFromJSONTyped(json, false);
}

export function ModWikiGetPageForEditingRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiGetPageForEditingRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'lockonly': json['lockonly'] == null ? undefined : json['lockonly'],
        'pageid': json['pageid'],
        'section': json['section'] == null ? undefined : json['section'],
    };
}

export function ModWikiGetPageForEditingRequestToJSON(value?: ModWikiGetPageForEditingRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lockonly': value['lockonly'],
        'pageid': value['pageid'],
        'section': value['section'],
    };
}
