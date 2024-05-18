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
 * @interface CoreGradesGetGroupsForSearchWidgetRequest
 */
export interface CoreGradesGetGroupsForSearchWidgetRequest {
    /**
     * Course Id
     * @type {number}
     * @memberof CoreGradesGetGroupsForSearchWidgetRequest
     */
    courseid: number;
}

/**
 * Check if a given object implements the CoreGradesGetGroupsForSearchWidgetRequest interface.
 */
export function instanceOfCoreGradesGetGroupsForSearchWidgetRequest(value: object): boolean {
    if (!('courseid' in value)) return false;
    return true;
}

export function CoreGradesGetGroupsForSearchWidgetRequestFromJSON(json: any): CoreGradesGetGroupsForSearchWidgetRequest {
    return CoreGradesGetGroupsForSearchWidgetRequestFromJSONTyped(json, false);
}

export function CoreGradesGetGroupsForSearchWidgetRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGetGroupsForSearchWidgetRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'],
    };
}

export function CoreGradesGetGroupsForSearchWidgetRequestToJSON(value?: CoreGradesGetGroupsForSearchWidgetRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
    };
}

