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
 * @interface ModGlossaryGetEntriesBySearchRequest
 */
export interface ModGlossaryGetEntriesBySearchRequest {
    /**
     * Start returning records from here
     * @type {number}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    from?: number;
    /**
     * The query
     * @type {boolean}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    fullsearch?: boolean;
    /**
     * Glossary entry ID
     * @type {number}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    id: number;
    /**
     * Number of records to return
     * @type {number}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    limit?: number;
    /**
     * 
     * @type {ModGlossaryGetEntriesByAuthorRequestOptions}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    options?: ModGlossaryGetEntriesByAuthorRequestOptions;
    /**
     * Order by: 'CONCEPT', 'CREATION' or 'UPDATE'
     * @type {string}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    order?: string;
    /**
     * The query string
     * @type {string}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    query: string;
    /**
     * The direction of the order: 'ASC' or 'DESC'
     * @type {string}
     * @memberof ModGlossaryGetEntriesBySearchRequest
     */
    sort?: string;
}

/**
 * Check if a given object implements the ModGlossaryGetEntriesBySearchRequest interface.
 */
export function instanceOfModGlossaryGetEntriesBySearchRequest(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('query' in value)) return false;
    return true;
}

export function ModGlossaryGetEntriesBySearchRequestFromJSON(json: any): ModGlossaryGetEntriesBySearchRequest {
    return ModGlossaryGetEntriesBySearchRequestFromJSONTyped(json, false);
}

export function ModGlossaryGetEntriesBySearchRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetEntriesBySearchRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'from': json['from'] == null ? undefined : json['from'],
        'fullsearch': json['fullsearch'] == null ? undefined : json['fullsearch'],
        'id': json['id'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'options': json['options'] == null ? undefined : ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON(json['options']),
        'order': json['order'] == null ? undefined : json['order'],
        'query': json['query'],
        'sort': json['sort'] == null ? undefined : json['sort'],
    };
}

export function ModGlossaryGetEntriesBySearchRequestToJSON(value?: ModGlossaryGetEntriesBySearchRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'from': value['from'],
        'fullsearch': value['fullsearch'],
        'id': value['id'],
        'limit': value['limit'],
        'options': ModGlossaryGetEntriesByAuthorRequestOptionsToJSON(value['options']),
        'order': value['order'],
        'query': value['query'],
        'sort': value['sort'],
    };
}
