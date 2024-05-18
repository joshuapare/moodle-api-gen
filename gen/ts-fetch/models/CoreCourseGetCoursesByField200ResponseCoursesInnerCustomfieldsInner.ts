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
 * @interface CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
 */
export interface CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner {
    /**
     * The name of the custom field
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
     */
    name?: string;
    /**
     * The shortname of the custom field - to be able to build the field class in the code
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
     */
    shortname?: string;
    /**
     * The type of the custom field - text field, checkbox...
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
     */
    type?: string;
    /**
     * The value of the custom field
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
     */
    value?: string;
    /**
     * The raw value of the custom field
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
     */
    valueraw?: string;
}

/**
 * Check if a given object implements the CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner interface.
 */
export function instanceOfCoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner(value: object): boolean {
    return true;
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerFromJSON(json: any): CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner {
    return CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerFromJSONTyped(json, false);
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'shortname': json['shortname'] == null ? undefined : json['shortname'],
        'type': json['type'] == null ? undefined : json['type'],
        'value': json['value'] == null ? undefined : json['value'],
        'valueraw': json['valueraw'] == null ? undefined : json['valueraw'],
    };
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerToJSON(value?: CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'shortname': value['shortname'],
        'type': value['type'],
        'value': value['value'],
        'valueraw': value['valueraw'],
    };
}
