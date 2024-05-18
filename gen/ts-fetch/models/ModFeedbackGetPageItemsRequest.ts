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
 * @interface ModFeedbackGetPageItemsRequest
 */
export interface ModFeedbackGetPageItemsRequest {
    /**
     * Course where user completes the feedback (for site feedbacks only).
     * @type {number}
     * @memberof ModFeedbackGetPageItemsRequest
     */
    courseid?: number;
    /**
     * Feedback instance id
     * @type {number}
     * @memberof ModFeedbackGetPageItemsRequest
     */
    feedbackid: number;
    /**
     * The page to get starting by 0
     * @type {number}
     * @memberof ModFeedbackGetPageItemsRequest
     */
    page: number;
}

/**
 * Check if a given object implements the ModFeedbackGetPageItemsRequest interface.
 */
export function instanceOfModFeedbackGetPageItemsRequest(value: object): boolean {
    if (!('feedbackid' in value)) return false;
    if (!('page' in value)) return false;
    return true;
}

export function ModFeedbackGetPageItemsRequestFromJSON(json: any): ModFeedbackGetPageItemsRequest {
    return ModFeedbackGetPageItemsRequestFromJSONTyped(json, false);
}

export function ModFeedbackGetPageItemsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetPageItemsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'] == null ? undefined : json['courseid'],
        'feedbackid': json['feedbackid'],
        'page': json['page'],
    };
}

export function ModFeedbackGetPageItemsRequestToJSON(value?: ModFeedbackGetPageItemsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
        'feedbackid': value['feedbackid'],
        'page': value['page'],
    };
}

