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
 * @interface ModGlossaryGetEntriesByAuthorIdRequest
 */
export interface ModGlossaryGetEntriesByAuthorIdRequest {
    /**
     * The author ID
     * @type {number}
     * @memberof ModGlossaryGetEntriesByAuthorIdRequest
     */
    authorid: number;
    /**
     * Start returning records from here
     * @type {number}
     * @memberof ModGlossaryGetEntriesByAuthorIdRequest
     */
    from?: number;
    /**
     * Glossary entry ID
     * @type {number}
     * @memberof ModGlossaryGetEntriesByAuthorIdRequest
     */
    id: number;
    /**
     * Number of records to return
     * @type {number}
     * @memberof ModGlossaryGetEntriesByAuthorIdRequest
     */
    limit?: number;
    /**
     * 
     * @type {ModGlossaryGetEntriesByAuthorRequestOptions}
     * @memberof ModGlossaryGetEntriesByAuthorIdRequest
     */
    options?: ModGlossaryGetEntriesByAuthorRequestOptions;
    /**
     * Order by: 'CONCEPT', 'CREATION' or 'UPDATE'
     * @type {string}
     * @memberof ModGlossaryGetEntriesByAuthorIdRequest
     */
    order?: string;
    /**
     * The direction of the order: 'ASC' or 'DESC'
     * @type {string}
     * @memberof ModGlossaryGetEntriesByAuthorIdRequest
     */
    sort?: string;
}

/**
 * Check if a given object implements the ModGlossaryGetEntriesByAuthorIdRequest interface.
 */
export function instanceOfModGlossaryGetEntriesByAuthorIdRequest(value: object): boolean {
    if (!('authorid' in value)) return false;
    if (!('id' in value)) return false;
    return true;
}

export function ModGlossaryGetEntriesByAuthorIdRequestFromJSON(json: any): ModGlossaryGetEntriesByAuthorIdRequest {
    return ModGlossaryGetEntriesByAuthorIdRequestFromJSONTyped(json, false);
}

export function ModGlossaryGetEntriesByAuthorIdRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetEntriesByAuthorIdRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'authorid': json['authorid'],
        'from': json['from'] == null ? undefined : json['from'],
        'id': json['id'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'options': json['options'] == null ? undefined : ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON(json['options']),
        'order': json['order'] == null ? undefined : json['order'],
        'sort': json['sort'] == null ? undefined : json['sort'],
    };
}

export function ModGlossaryGetEntriesByAuthorIdRequestToJSON(value?: ModGlossaryGetEntriesByAuthorIdRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'authorid': value['authorid'],
        'from': value['from'],
        'id': value['id'],
        'limit': value['limit'],
        'options': ModGlossaryGetEntriesByAuthorRequestOptionsToJSON(value['options']),
        'order': value['order'],
        'sort': value['sort'],
    };
}

