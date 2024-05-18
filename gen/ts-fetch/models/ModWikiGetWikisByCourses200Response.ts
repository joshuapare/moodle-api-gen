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
import type { ModWikiGetWikisByCourses200ResponseWikisInner } from './ModWikiGetWikisByCourses200ResponseWikisInner';
import {
    ModWikiGetWikisByCourses200ResponseWikisInnerFromJSON,
    ModWikiGetWikisByCourses200ResponseWikisInnerFromJSONTyped,
    ModWikiGetWikisByCourses200ResponseWikisInnerToJSON,
} from './ModWikiGetWikisByCourses200ResponseWikisInner';

/**
 * 
 * @export
 * @interface ModWikiGetWikisByCourses200Response
 */
export interface ModWikiGetWikisByCourses200Response {
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModWikiGetWikisByCourses200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
    /**
     * 
     * @type {Array<ModWikiGetWikisByCourses200ResponseWikisInner>}
     * @memberof ModWikiGetWikisByCourses200Response
     */
    wikis: Array<ModWikiGetWikisByCourses200ResponseWikisInner>;
}

/**
 * Check if a given object implements the ModWikiGetWikisByCourses200Response interface.
 */
export function instanceOfModWikiGetWikisByCourses200Response(value: object): boolean {
    if (!('wikis' in value)) return false;
    return true;
}

export function ModWikiGetWikisByCourses200ResponseFromJSON(json: any): ModWikiGetWikisByCourses200Response {
    return ModWikiGetWikisByCourses200ResponseFromJSONTyped(json, false);
}

export function ModWikiGetWikisByCourses200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWikiGetWikisByCourses200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
        'wikis': ((json['wikis'] as Array<any>).map(ModWikiGetWikisByCourses200ResponseWikisInnerFromJSON)),
    };
}

export function ModWikiGetWikisByCourses200ResponseToJSON(value?: ModWikiGetWikisByCourses200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
        'wikis': ((value['wikis'] as Array<any>).map(ModWikiGetWikisByCourses200ResponseWikisInnerToJSON)),
    };
}

