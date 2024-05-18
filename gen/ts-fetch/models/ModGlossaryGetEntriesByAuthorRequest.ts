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
import type { ModGlossaryGetEntriesByAuthorRequestOptions } from './ModGlossaryGetEntriesByAuthorRequestOptions';
import {
    ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON,
    ModGlossaryGetEntriesByAuthorRequestOptionsFromJSONTyped,
    ModGlossaryGetEntriesByAuthorRequestOptionsToJSON,
} from './ModGlossaryGetEntriesByAuthorRequestOptions';

/**
 * 
 * @export
 * @interface ModGlossaryGetEntriesByAuthorRequest
 */
export interface ModGlossaryGetEntriesByAuthorRequest {
    /**
     * Search and order using: 'FIRSTNAME' or 'LASTNAME'
     * @type {string}
     * @memberof ModGlossaryGetEntriesByAuthorRequest
     */
    field?: string;
    /**
     * Start returning records from here
     * @type {number}
     * @memberof ModGlossaryGetEntriesByAuthorRequest
     */
    from?: number;
    /**
     * Glossary entry ID
     * @type {number}
     * @memberof ModGlossaryGetEntriesByAuthorRequest
     */
    id: number;
    /**
     * First letter of firstname or lastname, or either keywords: 'ALL' or 'SPECIAL'.
     * @type {string}
     * @memberof ModGlossaryGetEntriesByAuthorRequest
     */
    letter: string;
    /**
     * Number of records to return
     * @type {number}
     * @memberof ModGlossaryGetEntriesByAuthorRequest
     */
    limit?: number;
    /**
     * 
     * @type {ModGlossaryGetEntriesByAuthorRequestOptions}
     * @memberof ModGlossaryGetEntriesByAuthorRequest
     */
    options?: ModGlossaryGetEntriesByAuthorRequestOptions;
    /**
     * The direction of the order: 'ASC' or 'DESC'
     * @type {string}
     * @memberof ModGlossaryGetEntriesByAuthorRequest
     */
    sort?: string;
}

/**
 * Check if a given object implements the ModGlossaryGetEntriesByAuthorRequest interface.
 */
export function instanceOfModGlossaryGetEntriesByAuthorRequest(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('letter' in value)) return false;
    return true;
}

export function ModGlossaryGetEntriesByAuthorRequestFromJSON(json: any): ModGlossaryGetEntriesByAuthorRequest {
    return ModGlossaryGetEntriesByAuthorRequestFromJSONTyped(json, false);
}

export function ModGlossaryGetEntriesByAuthorRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetEntriesByAuthorRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'field': json['field'] == null ? undefined : json['field'],
        'from': json['from'] == null ? undefined : json['from'],
        'id': json['id'],
        'letter': json['letter'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'options': json['options'] == null ? undefined : ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON(json['options']),
        'sort': json['sort'] == null ? undefined : json['sort'],
    };
}

export function ModGlossaryGetEntriesByAuthorRequestToJSON(value?: ModGlossaryGetEntriesByAuthorRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'field': value['field'],
        'from': value['from'],
        'id': value['id'],
        'letter': value['letter'],
        'limit': value['limit'],
        'options': ModGlossaryGetEntriesByAuthorRequestOptionsToJSON(value['options']),
        'sort': value['sort'],
    };
}

