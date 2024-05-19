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
 * @interface CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner
 */
export interface CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner {
    /**
     * Outcome id
     * @type {string}
     * @memberof CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner
     */
    Id?: string;
    /**
     * Outcome full name
     * @type {string}
     * @memberof CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner
     */
    Name?: string;
    /**
     * Scale items
     * @type {string}
     * @memberof CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner
     */
    Scale?: string;
}

/**
 * Check if a given object implements the CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner interface.
 */
export function instanceOfCoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner(value: object): boolean {
    return true;
}

export function CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInnerFromJSON(json: any): CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner {
    return CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInnerFromJSONTyped(json, false);
}

export function CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Scale': json['scale'] == null ? undefined : json['scale'],
    };
}

export function CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInnerToJSON(value?: CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
        'name': value['Name'],
        'scale': value['Scale'],
    };
}

