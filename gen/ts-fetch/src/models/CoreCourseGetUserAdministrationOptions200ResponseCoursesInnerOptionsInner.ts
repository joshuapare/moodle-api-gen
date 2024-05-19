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
 * @interface CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner
 */
export interface CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner {
    /**
     * Whether the option is available or not
     * @type {boolean}
     * @memberof CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner
     */
    Available?: boolean;
    /**
     * Option name
     * @type {string}
     * @memberof CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner
     */
    Name?: string;
}

/**
 * Check if a given object implements the CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner interface.
 */
export function instanceOfCoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner(value: object): boolean {
    return true;
}

export function CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInnerFromJSON(json: any): CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner {
    return CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInnerFromJSONTyped(json, false);
}

export function CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Available': json['available'] == null ? undefined : json['available'],
        'Name': json['name'] == null ? undefined : json['name'],
    };
}

export function CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInnerToJSON(value?: CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'available': value['Available'],
        'name': value['Name'],
    };
}

