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
 * @interface ModQuizGetUserAttemptsRequest
 */
export interface ModQuizGetUserAttemptsRequest {
    /**
     * whether to include previews or not
     * @type {boolean}
     * @memberof ModQuizGetUserAttemptsRequest
     */
    Includepreviews?: boolean;
    /**
     * quiz instance id
     * @type {number}
     * @memberof ModQuizGetUserAttemptsRequest
     */
    Quizid: number;
    /**
     * quiz status: all, finished or unfinished
     * @type {string}
     * @memberof ModQuizGetUserAttemptsRequest
     */
    Status?: string;
    /**
     * user id, empty for current user
     * @type {number}
     * @memberof ModQuizGetUserAttemptsRequest
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModQuizGetUserAttemptsRequest interface.
 */
export function instanceOfModQuizGetUserAttemptsRequest(value: object): boolean {
    if (!('Quizid' in value)) return false;
    return true;
}

export function ModQuizGetUserAttemptsRequestFromJSON(json: any): ModQuizGetUserAttemptsRequest {
    return ModQuizGetUserAttemptsRequestFromJSONTyped(json, false);
}

export function ModQuizGetUserAttemptsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetUserAttemptsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Includepreviews': json['includepreviews'] == null ? undefined : json['includepreviews'],
        'Quizid': json['quizid'],
        'Status': json['status'] == null ? undefined : json['status'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModQuizGetUserAttemptsRequestToJSON(value?: ModQuizGetUserAttemptsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'includepreviews': value['Includepreviews'],
        'quizid': value['Quizid'],
        'status': value['Status'],
        'userid': value['Userid'],
    };
}

