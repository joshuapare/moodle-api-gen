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
 * @interface ModGlossaryGetEntriesByLetterRequest
 */
export interface ModGlossaryGetEntriesByLetterRequest {
    /**
     * Start returning records from here
     * @type {number}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    from?: number;
    /**
     * Glossary entry ID
     * @type {number}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    id: number;
    /**
     * A letter, or either keywords: 'ALL' or 'SPECIAL'.
     * @type {string}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    letter: string;
    /**
     * Number of records to return
     * @type {number}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    limit?: number;
    /**
     * 
     * @type {ModGlossaryGetEntriesByAuthorRequestOptions}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    options?: ModGlossaryGetEntriesByAuthorRequestOptions;
}

/**
 * Check if a given object implements the ModGlossaryGetEntriesByLetterRequest interface.
 */
export function instanceOfModGlossaryGetEntriesByLetterRequest(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('letter' in value)) return false;
    return true;
}

export function ModGlossaryGetEntriesByLetterRequestFromJSON(json: any): ModGlossaryGetEntriesByLetterRequest {
    return ModGlossaryGetEntriesByLetterRequestFromJSONTyped(json, false);
}

export function ModGlossaryGetEntriesByLetterRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetEntriesByLetterRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'from': json['from'] == null ? undefined : json['from'],
        'id': json['id'],
        'letter': json['letter'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'options': json['options'] == null ? undefined : ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON(json['options']),
    };
}

export function ModGlossaryGetEntriesByLetterRequestToJSON(value?: ModGlossaryGetEntriesByLetterRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'from': value['from'],
        'id': value['id'],
        'letter': value['letter'],
        'limit': value['limit'],
        'options': ModGlossaryGetEntriesByAuthorRequestOptionsToJSON(value['options']),
    };
}

