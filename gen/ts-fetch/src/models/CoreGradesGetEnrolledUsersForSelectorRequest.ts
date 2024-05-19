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
 * @interface CoreGradesGetEnrolledUsersForSelectorRequest
 */
export interface CoreGradesGetEnrolledUsersForSelectorRequest {
    /**
     * Course Id
     * @type {number}
     * @memberof CoreGradesGetEnrolledUsersForSelectorRequest
     */
    Courseid: number;
    /**
     * Group Id
     * @type {number}
     * @memberof CoreGradesGetEnrolledUsersForSelectorRequest
     */
    Groupid?: number;
}

/**
 * Check if a given object implements the CoreGradesGetEnrolledUsersForSelectorRequest interface.
 */
export function instanceOfCoreGradesGetEnrolledUsersForSelectorRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    return true;
}

export function CoreGradesGetEnrolledUsersForSelectorRequestFromJSON(json: any): CoreGradesGetEnrolledUsersForSelectorRequest {
    return CoreGradesGetEnrolledUsersForSelectorRequestFromJSONTyped(json, false);
}

export function CoreGradesGetEnrolledUsersForSelectorRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGetEnrolledUsersForSelectorRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
    };
}

export function CoreGradesGetEnrolledUsersForSelectorRequestToJSON(value?: CoreGradesGetEnrolledUsersForSelectorRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'groupid': value['Groupid'],
    };
}
