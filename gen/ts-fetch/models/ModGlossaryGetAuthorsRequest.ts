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
import type { ModGlossaryGetAuthorsRequestOptions } from './ModGlossaryGetAuthorsRequestOptions';
import {
    ModGlossaryGetAuthorsRequestOptionsFromJSON,
    ModGlossaryGetAuthorsRequestOptionsFromJSONTyped,
    ModGlossaryGetAuthorsRequestOptionsToJSON,
} from './ModGlossaryGetAuthorsRequestOptions';

/**
 * 
 * @export
 * @interface ModGlossaryGetAuthorsRequest
 */
export interface ModGlossaryGetAuthorsRequest {
    /**
     * Start returning records from here
     * @type {number}
     * @memberof ModGlossaryGetAuthorsRequest
     */
    from?: number;
    /**
     * Glossary entry ID
     * @type {number}
     * @memberof ModGlossaryGetAuthorsRequest
     */
    id: number;
    /**
     * Number of records to return
     * @type {number}
     * @memberof ModGlossaryGetAuthorsRequest
     */
    limit?: number;
    /**
     * 
     * @type {ModGlossaryGetAuthorsRequestOptions}
     * @memberof ModGlossaryGetAuthorsRequest
     */
    options?: ModGlossaryGetAuthorsRequestOptions;
}

/**
 * Check if a given object implements the ModGlossaryGetAuthorsRequest interface.
 */
export function instanceOfModGlossaryGetAuthorsRequest(value: object): boolean {
    if (!('id' in value)) return false;
    return true;
}

export function ModGlossaryGetAuthorsRequestFromJSON(json: any): ModGlossaryGetAuthorsRequest {
    return ModGlossaryGetAuthorsRequestFromJSONTyped(json, false);
}

export function ModGlossaryGetAuthorsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetAuthorsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'from': json['from'] == null ? undefined : json['from'],
        'id': json['id'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'options': json['options'] == null ? undefined : ModGlossaryGetAuthorsRequestOptionsFromJSON(json['options']),
    };
}

export function ModGlossaryGetAuthorsRequestToJSON(value?: ModGlossaryGetAuthorsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'from': value['from'],
        'id': value['id'],
        'limit': value['limit'],
        'options': ModGlossaryGetAuthorsRequestOptionsToJSON(value['options']),
    };
}
