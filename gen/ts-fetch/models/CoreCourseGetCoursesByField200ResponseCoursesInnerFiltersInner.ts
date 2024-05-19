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
/**
 * 
 * @export
 * @interface CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
 */
export interface CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner {
    /**
     * Filter plugin name
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
     */
    filter?: string;
    /**
     * 1 or 0 to use when localstate is set to inherit
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
     */
    inheritedstate?: number;
    /**
     * Filter state: 1 for on, -1 for off, 0 if inherit
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
     */
    localstate?: number;
}

/**
 * Check if a given object implements the CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner interface.
 */
export function instanceOfCoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner(value: object): boolean {
    return true;
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerFromJSON(json: any): CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner {
    return CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerFromJSONTyped(json, false);
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'filter': json['filter'] == null ? undefined : json['filter'],
        'inheritedstate': json['inheritedstate'] == null ? undefined : json['inheritedstate'],
        'localstate': json['localstate'] == null ? undefined : json['localstate'],
    };
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerToJSON(value?: CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'filter': value['filter'],
        'inheritedstate': value['inheritedstate'],
        'localstate': value['localstate'],
    };
}

