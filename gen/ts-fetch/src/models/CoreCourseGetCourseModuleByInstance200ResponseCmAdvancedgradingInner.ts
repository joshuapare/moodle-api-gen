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
 * @interface CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner
 */
export interface CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner {
    /**
     * Gradable area name
     * @type {string}
     * @memberof CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner
     */
    Area?: string;
    /**
     * Grading method
     * @type {string}
     * @memberof CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner
     */
    Method?: string;
}

/**
 * Check if a given object implements the CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner interface.
 */
export function instanceOfCoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner(value: object): boolean {
    return true;
}

export function CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInnerFromJSON(json: any): CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner {
    return CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInnerFromJSONTyped(json, false);
}

export function CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Area': json['area'] == null ? undefined : json['area'],
        'Method': json['method'] == null ? undefined : json['method'],
    };
}

export function CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInnerToJSON(value?: CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'area': value['Area'],
        'method': value['Method'],
    };
}

