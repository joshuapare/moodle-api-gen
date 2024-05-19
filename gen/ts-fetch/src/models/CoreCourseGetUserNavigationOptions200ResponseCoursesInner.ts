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
import type { CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner } from './CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner';
import {
    CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInnerFromJSON,
    CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInnerFromJSONTyped,
    CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInnerToJSON,
} from './CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner';

/**
 * 
 * @export
 * @interface CoreCourseGetUserNavigationOptions200ResponseCoursesInner
 */
export interface CoreCourseGetUserNavigationOptions200ResponseCoursesInner {
    /**
     * Course id
     * @type {number}
     * @memberof CoreCourseGetUserNavigationOptions200ResponseCoursesInner
     */
    Id?: number;
    /**
     * 
     * @type {Array<CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner>}
     * @memberof CoreCourseGetUserNavigationOptions200ResponseCoursesInner
     */
    Options?: Array<CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner>;
}

/**
 * Check if a given object implements the CoreCourseGetUserNavigationOptions200ResponseCoursesInner interface.
 */
export function instanceOfCoreCourseGetUserNavigationOptions200ResponseCoursesInner(value: object): boolean {
    return true;
}

export function CoreCourseGetUserNavigationOptions200ResponseCoursesInnerFromJSON(json: any): CoreCourseGetUserNavigationOptions200ResponseCoursesInner {
    return CoreCourseGetUserNavigationOptions200ResponseCoursesInnerFromJSONTyped(json, false);
}

export function CoreCourseGetUserNavigationOptions200ResponseCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetUserNavigationOptions200ResponseCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'] == null ? undefined : json['id'],
        'Options': json['options'] == null ? undefined : ((json['options'] as Array<any>).map(CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInnerFromJSON)),
    };
}

export function CoreCourseGetUserNavigationOptions200ResponseCoursesInnerToJSON(value?: CoreCourseGetUserNavigationOptions200ResponseCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
        'options': value['Options'] == null ? undefined : ((value['Options'] as Array<any>).map(CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInnerToJSON)),
    };
}
