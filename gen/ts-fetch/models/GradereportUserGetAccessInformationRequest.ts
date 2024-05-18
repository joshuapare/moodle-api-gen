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
 * @interface GradereportUserGetAccessInformationRequest
 */
export interface GradereportUserGetAccessInformationRequest {
    /**
     * Course to check.
     * @type {number}
     * @memberof GradereportUserGetAccessInformationRequest
     */
    courseid: number;
}

/**
 * Check if a given object implements the GradereportUserGetAccessInformationRequest interface.
 */
export function instanceOfGradereportUserGetAccessInformationRequest(value: object): boolean {
    if (!('courseid' in value)) return false;
    return true;
}

export function GradereportUserGetAccessInformationRequestFromJSON(json: any): GradereportUserGetAccessInformationRequest {
    return GradereportUserGetAccessInformationRequestFromJSONTyped(json, false);
}

export function GradereportUserGetAccessInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradereportUserGetAccessInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'],
    };
}

export function GradereportUserGetAccessInformationRequestToJSON(value?: GradereportUserGetAccessInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
    };
}

