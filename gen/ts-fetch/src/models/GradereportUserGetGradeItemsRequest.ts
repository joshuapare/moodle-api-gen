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
 * @interface GradereportUserGetGradeItemsRequest
 */
export interface GradereportUserGetGradeItemsRequest {
    /**
     * Course Id
     * @type {number}
     * @memberof GradereportUserGetGradeItemsRequest
     */
    Courseid: number;
    /**
     * Get users from this group only
     * @type {number}
     * @memberof GradereportUserGetGradeItemsRequest
     */
    Groupid?: number;
    /**
     * Return grades only for this user (optional)
     * @type {number}
     * @memberof GradereportUserGetGradeItemsRequest
     */
    Userid?: number;
}

/**
 * Check if a given object implements the GradereportUserGetGradeItemsRequest interface.
 */
export function instanceOfGradereportUserGetGradeItemsRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    return true;
}

export function GradereportUserGetGradeItemsRequestFromJSON(json: any): GradereportUserGetGradeItemsRequest {
    return GradereportUserGetGradeItemsRequestFromJSONTyped(json, false);
}

export function GradereportUserGetGradeItemsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradereportUserGetGradeItemsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function GradereportUserGetGradeItemsRequestToJSON(value?: GradereportUserGetGradeItemsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'groupid': value['Groupid'],
        'userid': value['Userid'],
    };
}

