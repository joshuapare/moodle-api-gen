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
 * @interface CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
 */
export interface CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
     */
    Itemids?: Array<object>;
    /**
     * Name of the area updated.
     * @type {string}
     * @memberof CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
     */
    Name?: string;
    /**
     * Last time was updated
     * @type {number}
     * @memberof CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
     */
    Timeupdated?: number;
}

/**
 * Check if a given object implements the CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner interface.
 */
export function instanceOfCoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner(value: object): boolean {
    return true;
}

export function CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerFromJSON(json: any): CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner {
    return CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerFromJSONTyped(json, false);
}

export function CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Itemids': json['itemids'] == null ? undefined : json['itemids'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Timeupdated': json['timeupdated'] == null ? undefined : json['timeupdated'],
    };
}

export function CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerToJSON(value?: CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'itemids': value['Itemids'],
        'name': value['Name'],
        'timeupdated': value['Timeupdated'],
    };
}
