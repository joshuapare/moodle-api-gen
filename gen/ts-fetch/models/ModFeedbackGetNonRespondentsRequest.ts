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
 * @interface ModFeedbackGetNonRespondentsRequest
 */
export interface ModFeedbackGetNonRespondentsRequest {
    /**
     * Course where user completes the feedback (for site feedbacks only).
     * @type {number}
     * @memberof ModFeedbackGetNonRespondentsRequest
     */
    courseid?: number;
    /**
     * Feedback instance id
     * @type {number}
     * @memberof ModFeedbackGetNonRespondentsRequest
     */
    feedbackid: number;
    /**
     * Group id, 0 means that the function will determine the user group.
     * @type {number}
     * @memberof ModFeedbackGetNonRespondentsRequest
     */
    groupid?: number;
    /**
     * The page of records to return.
     * @type {number}
     * @memberof ModFeedbackGetNonRespondentsRequest
     */
    page?: number;
    /**
     * The number of records to return per page.
     * @type {number}
     * @memberof ModFeedbackGetNonRespondentsRequest
     */
    perpage?: number;
    /**
     * Sort param, must be firstname, lastname or lastaccess (default).
     * @type {string}
     * @memberof ModFeedbackGetNonRespondentsRequest
     */
    sort?: string;
}

/**
 * Check if a given object implements the ModFeedbackGetNonRespondentsRequest interface.
 */
export function instanceOfModFeedbackGetNonRespondentsRequest(value: object): boolean {
    if (!('feedbackid' in value)) return false;
    return true;
}

export function ModFeedbackGetNonRespondentsRequestFromJSON(json: any): ModFeedbackGetNonRespondentsRequest {
    return ModFeedbackGetNonRespondentsRequestFromJSONTyped(json, false);
}

export function ModFeedbackGetNonRespondentsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetNonRespondentsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'] == null ? undefined : json['courseid'],
        'feedbackid': json['feedbackid'],
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'page': json['page'] == null ? undefined : json['page'],
        'perpage': json['perpage'] == null ? undefined : json['perpage'],
        'sort': json['sort'] == null ? undefined : json['sort'],
    };
}

export function ModFeedbackGetNonRespondentsRequestToJSON(value?: ModFeedbackGetNonRespondentsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
        'feedbackid': value['feedbackid'],
        'groupid': value['groupid'],
        'page': value['page'],
        'perpage': value['perpage'],
        'sort': value['sort'],
    };
}

