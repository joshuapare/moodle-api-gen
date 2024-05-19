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
import type { CoreCourseGetCoursesByField200ResponseCoursesInner } from './CoreCourseGetCoursesByField200ResponseCoursesInner';
import {
    CoreCourseGetCoursesByField200ResponseCoursesInnerFromJSON,
    CoreCourseGetCoursesByField200ResponseCoursesInnerFromJSONTyped,
    CoreCourseGetCoursesByField200ResponseCoursesInnerToJSON,
} from './CoreCourseGetCoursesByField200ResponseCoursesInner';

/**
 * 
 * @export
 * @interface CoreCourseGetCoursesByField200Response
 */
export interface CoreCourseGetCoursesByField200Response {
    /**
     * 
     * @type {Array<CoreCourseGetCoursesByField200ResponseCoursesInner>}
     * @memberof CoreCourseGetCoursesByField200Response
     */
    Courses: Array<CoreCourseGetCoursesByField200ResponseCoursesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreCourseGetCoursesByField200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreCourseGetCoursesByField200Response interface.
 */
export function instanceOfCoreCourseGetCoursesByField200Response(value: object): boolean {
    if (!('Courses' in value)) return false;
    return true;
}

export function CoreCourseGetCoursesByField200ResponseFromJSON(json: any): CoreCourseGetCoursesByField200Response {
    return CoreCourseGetCoursesByField200ResponseFromJSONTyped(json, false);
}

export function CoreCourseGetCoursesByField200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetCoursesByField200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Courses': ((json['courses'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreCourseGetCoursesByField200ResponseToJSON(value?: CoreCourseGetCoursesByField200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courses': ((value['Courses'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
