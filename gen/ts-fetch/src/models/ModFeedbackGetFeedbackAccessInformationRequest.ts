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
 * @interface ModFeedbackGetFeedbackAccessInformationRequest
 */
export interface ModFeedbackGetFeedbackAccessInformationRequest {
    /**
     * Course where user completes the feedback (for site feedbacks only).
     * @type {number}
     * @memberof ModFeedbackGetFeedbackAccessInformationRequest
     */
    Courseid?: number;
    /**
     * Feedback instance id.
     * @type {number}
     * @memberof ModFeedbackGetFeedbackAccessInformationRequest
     */
    Feedbackid: number;
}

/**
 * Check if a given object implements the ModFeedbackGetFeedbackAccessInformationRequest interface.
 */
export function instanceOfModFeedbackGetFeedbackAccessInformationRequest(value: object): boolean {
    if (!('Feedbackid' in value)) return false;
    return true;
}

export function ModFeedbackGetFeedbackAccessInformationRequestFromJSON(json: any): ModFeedbackGetFeedbackAccessInformationRequest {
    return ModFeedbackGetFeedbackAccessInformationRequestFromJSONTyped(json, false);
}

export function ModFeedbackGetFeedbackAccessInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetFeedbackAccessInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Feedbackid': json['feedbackid'],
    };
}

export function ModFeedbackGetFeedbackAccessInformationRequestToJSON(value?: ModFeedbackGetFeedbackAccessInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'feedbackid': value['Feedbackid'],
    };
}
