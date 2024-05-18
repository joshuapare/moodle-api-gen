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
 * @interface ModGlossaryGetEntriesByCategoryRequest
 */
export interface ModGlossaryGetEntriesByCategoryRequest {
    /**
     * The category ID. Use '0' for all categories, or '-1' for uncategorised entries.
     * @type {number}
     * @memberof ModGlossaryGetEntriesByCategoryRequest
     */
    categoryid: number;
    /**
     * Start returning records from here
     * @type {number}
     * @memberof ModGlossaryGetEntriesByCategoryRequest
     */
    from?: number;
    /**
     * The glossary ID.
     * @type {number}
     * @memberof ModGlossaryGetEntriesByCategoryRequest
     */
    id: number;
    /**
     * Number of records to return
     * @type {number}
     * @memberof ModGlossaryGetEntriesByCategoryRequest
     */
    limit?: number;
    /**
     * 
     * @type {ModGlossaryGetEntriesByAuthorRequestOptions}
     * @memberof ModGlossaryGetEntriesByCategoryRequest
     */
    options?: ModGlossaryGetEntriesByAuthorRequestOptions;
}

/**
 * Check if a given object implements the ModGlossaryGetEntriesByCategoryRequest interface.
 */
export function instanceOfModGlossaryGetEntriesByCategoryRequest(value: object): boolean {
    if (!('categoryid' in value)) return false;
    if (!('id' in value)) return false;
    return true;
}

export function ModGlossaryGetEntriesByCategoryRequestFromJSON(json: any): ModGlossaryGetEntriesByCategoryRequest {
    return ModGlossaryGetEntriesByCategoryRequestFromJSONTyped(json, false);
}

export function ModGlossaryGetEntriesByCategoryRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetEntriesByCategoryRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'categoryid': json['categoryid'],
        'from': json['from'] == null ? undefined : json['from'],
        'id': json['id'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'options': json['options'] == null ? undefined : ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON(json['options']),
    };
}

export function ModGlossaryGetEntriesByCategoryRequestToJSON(value?: ModGlossaryGetEntriesByCategoryRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'categoryid': value['categoryid'],
        'from': value['from'],
        'id': value['id'],
        'limit': value['limit'],
        'options': ModGlossaryGetEntriesByAuthorRequestOptionsToJSON(value['options']),
    };
}
