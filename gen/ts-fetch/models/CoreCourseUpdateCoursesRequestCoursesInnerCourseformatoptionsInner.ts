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
 * @interface CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner
 */
export interface CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner {
    /**
     * course format option name
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner
     */
    name?: string;
    /**
     * course format option value
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner
     */
    value?: string;
}

/**
 * Check if a given object implements the CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner interface.
 */
export function instanceOfCoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner(value: object): boolean {
    return true;
}

export function CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSON(json: any): CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner {
    return CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSONTyped(json, false);
}

export function CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerToJSON(value?: CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'value': value['value'],
    };
}
