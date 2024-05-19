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
 * @interface CoreMoodlenetAuthCheckRequest
 */
export interface CoreMoodlenetAuthCheckRequest {
    /**
     * Course ID
     * @type {number}
     * @memberof CoreMoodlenetAuthCheckRequest
     */
    Courseid: number;
    /**
     * OAuth 2 issuer ID
     * @type {number}
     * @memberof CoreMoodlenetAuthCheckRequest
     */
    Issuerid: number;
}

/**
 * Check if a given object implements the CoreMoodlenetAuthCheckRequest interface.
 */
export function instanceOfCoreMoodlenetAuthCheckRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    if (!('Issuerid' in value)) return false;
    return true;
}

export function CoreMoodlenetAuthCheckRequestFromJSON(json: any): CoreMoodlenetAuthCheckRequest {
    return CoreMoodlenetAuthCheckRequestFromJSONTyped(json, false);
}

export function CoreMoodlenetAuthCheckRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMoodlenetAuthCheckRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
        'Issuerid': json['issuerid'],
    };
}

export function CoreMoodlenetAuthCheckRequestToJSON(value?: CoreMoodlenetAuthCheckRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'issuerid': value['Issuerid'],
    };
}

