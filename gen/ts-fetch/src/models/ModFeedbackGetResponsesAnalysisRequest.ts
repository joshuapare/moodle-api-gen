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
 * @interface ModFeedbackGetResponsesAnalysisRequest
 */
export interface ModFeedbackGetResponsesAnalysisRequest {
    /**
     * Course where user completes the feedback (for site feedbacks only).
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysisRequest
     */
    Courseid?: number;
    /**
     * Feedback instance id
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysisRequest
     */
    Feedbackid: number;
    /**
     * Group id, 0 means that the function will determine the user group
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysisRequest
     */
    Groupid?: number;
    /**
     * The page of records to return.
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysisRequest
     */
    Page?: number;
    /**
     * The number of records to return per page
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysisRequest
     */
    Perpage?: number;
}

/**
 * Check if a given object implements the ModFeedbackGetResponsesAnalysisRequest interface.
 */
export function instanceOfModFeedbackGetResponsesAnalysisRequest(value: object): boolean {
    if (!('Feedbackid' in value)) return false;
    return true;
}

export function ModFeedbackGetResponsesAnalysisRequestFromJSON(json: any): ModFeedbackGetResponsesAnalysisRequest {
    return ModFeedbackGetResponsesAnalysisRequestFromJSONTyped(json, false);
}

export function ModFeedbackGetResponsesAnalysisRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetResponsesAnalysisRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Feedbackid': json['feedbackid'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Page': json['page'] == null ? undefined : json['page'],
        'Perpage': json['perpage'] == null ? undefined : json['perpage'],
    };
}

export function ModFeedbackGetResponsesAnalysisRequestToJSON(value?: ModFeedbackGetResponsesAnalysisRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'feedbackid': value['Feedbackid'],
        'groupid': value['Groupid'],
        'page': value['Page'],
        'perpage': value['Perpage'],
    };
}
