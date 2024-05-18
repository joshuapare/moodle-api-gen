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
 * @interface CoreCalendarGetCalendarAccessInformationRequest
 */
export interface CoreCalendarGetCalendarAccessInformationRequest {
    /**
     * Course to check, empty for site calendar events.
     * @type {number}
     * @memberof CoreCalendarGetCalendarAccessInformationRequest
     */
    courseid?: number;
}

/**
 * Check if a given object implements the CoreCalendarGetCalendarAccessInformationRequest interface.
 */
export function instanceOfCoreCalendarGetCalendarAccessInformationRequest(value: object): boolean {
    return true;
}

export function CoreCalendarGetCalendarAccessInformationRequestFromJSON(json: any): CoreCalendarGetCalendarAccessInformationRequest {
    return CoreCalendarGetCalendarAccessInformationRequestFromJSONTyped(json, false);
}

export function CoreCalendarGetCalendarAccessInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetCalendarAccessInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'] == null ? undefined : json['courseid'],
    };
}

export function CoreCalendarGetCalendarAccessInformationRequestToJSON(value?: CoreCalendarGetCalendarAccessInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
    };
}

