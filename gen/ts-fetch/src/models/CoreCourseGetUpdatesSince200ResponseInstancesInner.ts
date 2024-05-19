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
import type { CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner } from './CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner';
import {
    CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerFromJSON,
    CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerFromJSONTyped,
    CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerToJSON,
} from './CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner';

/**
 * 
 * @export
 * @interface CoreCourseGetUpdatesSince200ResponseInstancesInner
 */
export interface CoreCourseGetUpdatesSince200ResponseInstancesInner {
    /**
     * The context level
     * @type {string}
     * @memberof CoreCourseGetUpdatesSince200ResponseInstancesInner
     */
    Contextlevel?: string;
    /**
     * Instance id
     * @type {number}
     * @memberof CoreCourseGetUpdatesSince200ResponseInstancesInner
     */
    Id?: number;
    /**
     * 
     * @type {Array<CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner>}
     * @memberof CoreCourseGetUpdatesSince200ResponseInstancesInner
     */
    Updates?: Array<CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner>;
}

/**
 * Check if a given object implements the CoreCourseGetUpdatesSince200ResponseInstancesInner interface.
 */
export function instanceOfCoreCourseGetUpdatesSince200ResponseInstancesInner(value: object): boolean {
    return true;
}

export function CoreCourseGetUpdatesSince200ResponseInstancesInnerFromJSON(json: any): CoreCourseGetUpdatesSince200ResponseInstancesInner {
    return CoreCourseGetUpdatesSince200ResponseInstancesInnerFromJSONTyped(json, false);
}

export function CoreCourseGetUpdatesSince200ResponseInstancesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetUpdatesSince200ResponseInstancesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Contextlevel': json['contextlevel'] == null ? undefined : json['contextlevel'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Updates': json['updates'] == null ? undefined : ((json['updates'] as Array<any>).map(CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerFromJSON)),
    };
}

export function CoreCourseGetUpdatesSince200ResponseInstancesInnerToJSON(value?: CoreCourseGetUpdatesSince200ResponseInstancesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'contextlevel': value['Contextlevel'],
        'id': value['Id'],
        'updates': value['Updates'] == null ? undefined : ((value['Updates'] as Array<any>).map(CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInnerToJSON)),
    };
}
