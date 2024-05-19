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
import type { ModWikiGetSubwikiPages200ResponsePagesInner } from './ModWikiGetSubwikiPages200ResponsePagesInner';
import {
    ModWikiGetSubwikiPages200ResponsePagesInnerFromJSON,
    ModWikiGetSubwikiPages200ResponsePagesInnerFromJSONTyped,
    ModWikiGetSubwikiPages200ResponsePagesInnerToJSON,
} from './ModWikiGetSubwikiPages200ResponsePagesInner';

/**
 * 
 * @export
 * @interface ModWikiGetSubwikiPages200Response
 */
export interface ModWikiGetSubwikiPages200Response {
    /**
     * 
     * @type {Array<ModWikiGetSubwikiPages200ResponsePagesInner>}
     * @memberof ModWikiGetSubwikiPages200Response
     */
    Pages: Array<ModWikiGetSubwikiPages200ResponsePagesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModWikiGetSubwikiPages200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModWikiGetSubwikiPages200Response interface.
 */
export function instanceOfModWikiGetSubwikiPages200Response(value: object): boolean {
    if (!('Pages' in value)) return false;
    return true;
}

export function ModWikiGetSubwikiPages200ResponseFromJSON(json: any): ModWikiGetSubwikiPages200Response {
    return ModWikiGetSubwikiPages200ResponseFromJSONTyped(json, false);
}

export function ModWikiGetSubwikiPages200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiGetSubwikiPages200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Pages': ((json['pages'] as Array<any>).map(ModWikiGetSubwikiPages200ResponsePagesInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModWikiGetSubwikiPages200ResponseToJSON(value?: ModWikiGetSubwikiPages200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'pages': ((value['Pages'] as Array<any>).map(ModWikiGetSubwikiPages200ResponsePagesInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

