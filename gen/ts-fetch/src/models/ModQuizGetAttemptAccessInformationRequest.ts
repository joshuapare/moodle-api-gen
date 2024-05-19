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
 * @interface ModQuizGetAttemptAccessInformationRequest
 */
export interface ModQuizGetAttemptAccessInformationRequest {
    /**
     * attempt id, 0 for the user last attempt if exists
     * @type {number}
     * @memberof ModQuizGetAttemptAccessInformationRequest
     */
    Attemptid?: number;
    /**
     * quiz instance id
     * @type {number}
     * @memberof ModQuizGetAttemptAccessInformationRequest
     */
    Quizid: number;
}

/**
 * Check if a given object implements the ModQuizGetAttemptAccessInformationRequest interface.
 */
export function instanceOfModQuizGetAttemptAccessInformationRequest(value: object): boolean {
    if (!('Quizid' in value)) return false;
    return true;
}

export function ModQuizGetAttemptAccessInformationRequestFromJSON(json: any): ModQuizGetAttemptAccessInformationRequest {
    return ModQuizGetAttemptAccessInformationRequestFromJSONTyped(json, false);
}

export function ModQuizGetAttemptAccessInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetAttemptAccessInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Attemptid': json['attemptid'] == null ? undefined : json['attemptid'],
        'Quizid': json['quizid'],
    };
}

export function ModQuizGetAttemptAccessInformationRequestToJSON(value?: ModQuizGetAttemptAccessInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attemptid': value['Attemptid'],
        'quizid': value['Quizid'],
    };
}

