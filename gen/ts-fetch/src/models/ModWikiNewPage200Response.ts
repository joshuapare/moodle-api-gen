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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface ModWikiNewPage200Response
 */
export interface ModWikiNewPage200Response {
    /**
     * New page id.
     * @type {number}
     * @memberof ModWikiNewPage200Response
     */
    Pageid: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModWikiNewPage200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModWikiNewPage200Response interface.
 */
export function instanceOfModWikiNewPage200Response(value: object): boolean {
    if (!('Pageid' in value)) return false;
    return true;
}

export function ModWikiNewPage200ResponseFromJSON(json: any): ModWikiNewPage200Response {
    return ModWikiNewPage200ResponseFromJSONTyped(json, false);
}

export function ModWikiNewPage200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiNewPage200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Pageid': json['pageid'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModWikiNewPage200ResponseToJSON(value?: ModWikiNewPage200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pageid': value['Pageid'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

