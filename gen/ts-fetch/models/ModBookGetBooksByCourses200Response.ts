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
import type { ModBookGetBooksByCourses200ResponseBooksInner } from './ModBookGetBooksByCourses200ResponseBooksInner';
import {
    ModBookGetBooksByCourses200ResponseBooksInnerFromJSON,
    ModBookGetBooksByCourses200ResponseBooksInnerFromJSONTyped,
    ModBookGetBooksByCourses200ResponseBooksInnerToJSON,
} from './ModBookGetBooksByCourses200ResponseBooksInner';

/**
 * 
 * @export
 * @interface ModBookGetBooksByCourses200Response
 */
export interface ModBookGetBooksByCourses200Response {
    /**
     * 
     * @type {Array<ModBookGetBooksByCourses200ResponseBooksInner>}
     * @memberof ModBookGetBooksByCourses200Response
     */
    books: Array<ModBookGetBooksByCourses200ResponseBooksInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModBookGetBooksByCourses200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModBookGetBooksByCourses200Response interface.
 */
export function instanceOfModBookGetBooksByCourses200Response(value: object): boolean {
    if (!('books' in value)) return false;
    return true;
}

export function ModBookGetBooksByCourses200ResponseFromJSON(json: any): ModBookGetBooksByCourses200Response {
    return ModBookGetBooksByCourses200ResponseFromJSONTyped(json, false);
}

export function ModBookGetBooksByCourses200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBookGetBooksByCourses200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'books': ((json['books'] as Array<any>).map(ModBookGetBooksByCourses200ResponseBooksInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModBookGetBooksByCourses200ResponseToJSON(value?: ModBookGetBooksByCourses200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'books': ((value['books'] as Array<any>).map(ModBookGetBooksByCourses200ResponseBooksInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

