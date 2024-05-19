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
 * @interface ModQuizGetCombinedReviewOptionsRequest
 */
export interface ModQuizGetCombinedReviewOptionsRequest {
    /**
     * quiz instance id
     * @type {number}
     * @memberof ModQuizGetCombinedReviewOptionsRequest
     */
    Quizid: number;
    /**
     * user id (empty for current user)
     * @type {number}
     * @memberof ModQuizGetCombinedReviewOptionsRequest
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModQuizGetCombinedReviewOptionsRequest interface.
 */
export function instanceOfModQuizGetCombinedReviewOptionsRequest(value: object): boolean {
    if (!('Quizid' in value)) return false;
    return true;
}

export function ModQuizGetCombinedReviewOptionsRequestFromJSON(json: any): ModQuizGetCombinedReviewOptionsRequest {
    return ModQuizGetCombinedReviewOptionsRequestFromJSONTyped(json, false);
}

export function ModQuizGetCombinedReviewOptionsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetCombinedReviewOptionsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Quizid': json['quizid'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModQuizGetCombinedReviewOptionsRequestToJSON(value?: ModQuizGetCombinedReviewOptionsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'quizid': value['Quizid'],
        'userid': value['Userid'],
    };
}

