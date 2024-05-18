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
 * @interface ModScormGetScormsByCourses200ResponseOptionsInner
 */
export interface ModScormGetScormsByCourses200ResponseOptionsInner {
    /**
     * Options name
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseOptionsInner
     */
    name?: string;
    /**
     * Option value
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseOptionsInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModScormGetScormsByCourses200ResponseOptionsInner interface.
 */
export function instanceOfModScormGetScormsByCourses200ResponseOptionsInner(value: object): boolean {
    return true;
}

export function ModScormGetScormsByCourses200ResponseOptionsInnerFromJSON(json: any): ModScormGetScormsByCourses200ResponseOptionsInner {
    return ModScormGetScormsByCourses200ResponseOptionsInnerFromJSONTyped(json, false);
}

export function ModScormGetScormsByCourses200ResponseOptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormsByCourses200ResponseOptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModScormGetScormsByCourses200ResponseOptionsInnerToJSON(value?: ModScormGetScormsByCourses200ResponseOptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'value': value['value'],
    };
}

