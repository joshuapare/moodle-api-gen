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
 * @interface ModWikiViewWiki200Response
 */
export interface ModWikiViewWiki200Response {
    /**
     * Status: true if success.
     * @type {boolean}
     * @memberof ModWikiViewWiki200Response
     */
    Status: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModWikiViewWiki200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModWikiViewWiki200Response interface.
 */
export function instanceOfModWikiViewWiki200Response(value: object): boolean {
    if (!('Status' in value)) return false;
    return true;
}

export function ModWikiViewWiki200ResponseFromJSON(json: any): ModWikiViewWiki200Response {
    return ModWikiViewWiki200ResponseFromJSONTyped(json, false);
}

export function ModWikiViewWiki200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiViewWiki200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Status': json['status'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModWikiViewWiki200ResponseToJSON(value?: ModWikiViewWiki200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': value['Status'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

