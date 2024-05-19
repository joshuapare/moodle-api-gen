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
 * @interface CoreCourseGetCoursesRequestOptions
 */
export interface CoreCourseGetCoursesRequestOptions {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreCourseGetCoursesRequestOptions
     */
    Ids?: Array<object>;
}

/**
 * Check if a given object implements the CoreCourseGetCoursesRequestOptions interface.
 */
export function instanceOfCoreCourseGetCoursesRequestOptions(value: object): boolean {
    return true;
}

export function CoreCourseGetCoursesRequestOptionsFromJSON(json: any): CoreCourseGetCoursesRequestOptions {
    return CoreCourseGetCoursesRequestOptionsFromJSONTyped(json, false);
}

export function CoreCourseGetCoursesRequestOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetCoursesRequestOptions {
    if (json == null) {
        return json;
    }
    return {
        
        'Ids': json['ids'] == null ? undefined : json['ids'],
    };
}

export function CoreCourseGetCoursesRequestOptionsToJSON(value?: CoreCourseGetCoursesRequestOptions | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ids': value['Ids'],
    };
}

