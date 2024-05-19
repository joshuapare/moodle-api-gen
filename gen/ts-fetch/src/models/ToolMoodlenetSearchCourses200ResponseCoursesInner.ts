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
 * @interface ToolMoodlenetSearchCourses200ResponseCoursesInner
 */
export interface ToolMoodlenetSearchCourses200ResponseCoursesInner {
    /**
     * Category name
     * @type {string}
     * @memberof ToolMoodlenetSearchCourses200ResponseCoursesInner
     */
    Coursecategory?: string;
    /**
     * course image
     * @type {string}
     * @memberof ToolMoodlenetSearchCourses200ResponseCoursesInner
     */
    Courseimage?: string;
    /**
     * course full name
     * @type {string}
     * @memberof ToolMoodlenetSearchCourses200ResponseCoursesInner
     */
    Fullname?: string;
    /**
     * is the course visible
     * @type {number}
     * @memberof ToolMoodlenetSearchCourses200ResponseCoursesInner
     */
    Hidden?: number;
    /**
     * course id
     * @type {number}
     * @memberof ToolMoodlenetSearchCourses200ResponseCoursesInner
     */
    Id?: number;
    /**
     * Next step of import
     * @type {string}
     * @memberof ToolMoodlenetSearchCourses200ResponseCoursesInner
     */
    Viewurl?: string;
}

/**
 * Check if a given object implements the ToolMoodlenetSearchCourses200ResponseCoursesInner interface.
 */
export function instanceOfToolMoodlenetSearchCourses200ResponseCoursesInner(value: object): boolean {
    return true;
}

export function ToolMoodlenetSearchCourses200ResponseCoursesInnerFromJSON(json: any): ToolMoodlenetSearchCourses200ResponseCoursesInner {
    return ToolMoodlenetSearchCourses200ResponseCoursesInnerFromJSONTyped(json, false);
}

export function ToolMoodlenetSearchCourses200ResponseCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolMoodlenetSearchCourses200ResponseCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Coursecategory': json['coursecategory'] == null ? undefined : json['coursecategory'],
        'Courseimage': json['courseimage'] == null ? undefined : json['courseimage'],
        'Fullname': json['fullname'] == null ? undefined : json['fullname'],
        'Hidden': json['hidden'] == null ? undefined : json['hidden'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Viewurl': json['viewurl'] == null ? undefined : json['viewurl'],
    };
}

export function ToolMoodlenetSearchCourses200ResponseCoursesInnerToJSON(value?: ToolMoodlenetSearchCourses200ResponseCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'coursecategory': value['Coursecategory'],
        'courseimage': value['Courseimage'],
        'fullname': value['Fullname'],
        'hidden': value['Hidden'],
        'id': value['Id'],
        'viewurl': value['Viewurl'],
    };
}
