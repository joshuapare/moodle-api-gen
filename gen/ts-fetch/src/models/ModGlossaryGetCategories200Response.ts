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
import type { ModGlossaryGetCategories200ResponseCategoriesInner } from './ModGlossaryGetCategories200ResponseCategoriesInner';
import {
    ModGlossaryGetCategories200ResponseCategoriesInnerFromJSON,
    ModGlossaryGetCategories200ResponseCategoriesInnerFromJSONTyped,
    ModGlossaryGetCategories200ResponseCategoriesInnerToJSON,
} from './ModGlossaryGetCategories200ResponseCategoriesInner';

/**
 * 
 * @export
 * @interface ModGlossaryGetCategories200Response
 */
export interface ModGlossaryGetCategories200Response {
    /**
     * 
     * @type {Array<ModGlossaryGetCategories200ResponseCategoriesInner>}
     * @memberof ModGlossaryGetCategories200Response
     */
    Categories: Array<ModGlossaryGetCategories200ResponseCategoriesInner>;
    /**
     * The total number of records.
     * @type {number}
     * @memberof ModGlossaryGetCategories200Response
     */
    Count: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModGlossaryGetCategories200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModGlossaryGetCategories200Response interface.
 */
export function instanceOfModGlossaryGetCategories200Response(value: object): boolean {
    if (!('Categories' in value)) return false;
    if (!('Count' in value)) return false;
    return true;
}

export function ModGlossaryGetCategories200ResponseFromJSON(json: any): ModGlossaryGetCategories200Response {
    return ModGlossaryGetCategories200ResponseFromJSONTyped(json, false);
}

export function ModGlossaryGetCategories200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryGetCategories200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Categories': ((json['categories'] as Array<any>).map(ModGlossaryGetCategories200ResponseCategoriesInnerFromJSON)),
        'Count': json['count'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModGlossaryGetCategories200ResponseToJSON(value?: ModGlossaryGetCategories200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'categories': ((value['Categories'] as Array<any>).map(ModGlossaryGetCategories200ResponseCategoriesInnerToJSON)),
        'count': value['Count'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

