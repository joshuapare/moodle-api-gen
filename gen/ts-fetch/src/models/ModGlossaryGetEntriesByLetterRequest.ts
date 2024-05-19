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
    From?: number;
    /**
     * Glossary entry ID
     * @type {number}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    Id: number;
    /**
     * A letter, or either keywords: 'ALL' or 'SPECIAL'.
     * @type {string}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    Letter: string;
    /**
     * Number of records to return
     * @type {number}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    Limit?: number;
    /**
     * 
     * @type {ModGlossaryGetEntriesByAuthorRequestOptions}
     * @memberof ModGlossaryGetEntriesByLetterRequest
     */
    Options?: ModGlossaryGetEntriesByAuthorRequestOptions;
}

/**
 * Check if a given object implements the ModGlossaryGetEntriesByLetterRequest interface.
 */
export function instanceOfModGlossaryGetEntriesByLetterRequest(value: object): boolean {
    if (!('Id' in value)) return false;
    if (!('Letter' in value)) return false;
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
        
        'From': json['from'] == null ? undefined : json['from'],
        'Id': json['id'],
        'Letter': json['letter'],
        'Limit': json['limit'] == null ? undefined : json['limit'],
        'Options': json['options'] == null ? undefined : ModGlossaryGetEntriesByAuthorRequestOptionsFromJSON(json['options']),
    };
}

export function ModGlossaryGetEntriesByLetterRequestToJSON(value?: ModGlossaryGetEntriesByLetterRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'from': value['From'],
        'id': value['Id'],
        'letter': value['Letter'],
        'limit': value['Limit'],
        'options': ModGlossaryGetEntriesByAuthorRequestOptionsToJSON(value['Options']),
    };
}
