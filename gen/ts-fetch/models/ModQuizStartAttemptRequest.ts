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
import type { ModQuizGetAttemptDataRequestPreflightdataInner } from './ModQuizGetAttemptDataRequestPreflightdataInner';
import {
    ModQuizGetAttemptDataRequestPreflightdataInnerFromJSON,
    ModQuizGetAttemptDataRequestPreflightdataInnerFromJSONTyped,
    ModQuizGetAttemptDataRequestPreflightdataInnerToJSON,
} from './ModQuizGetAttemptDataRequestPreflightdataInner';

/**
 * 
 * @export
 * @interface ModQuizStartAttemptRequest
 */
export interface ModQuizStartAttemptRequest {
    /**
     * Whether to force a new attempt or not.
     * @type {boolean}
     * @memberof ModQuizStartAttemptRequest
     */
    forcenew?: boolean;
    /**
     * 
     * @type {Array<ModQuizGetAttemptDataRequestPreflightdataInner>}
     * @memberof ModQuizStartAttemptRequest
     */
    preflightdata?: Array<ModQuizGetAttemptDataRequestPreflightdataInner>;
    /**
     * quiz instance id
     * @type {number}
     * @memberof ModQuizStartAttemptRequest
     */
    quizid: number;
}

/**
 * Check if a given object implements the ModQuizStartAttemptRequest interface.
 */
export function instanceOfModQuizStartAttemptRequest(value: object): boolean {
    if (!('quizid' in value)) return false;
    return true;
}

export function ModQuizStartAttemptRequestFromJSON(json: any): ModQuizStartAttemptRequest {
    return ModQuizStartAttemptRequestFromJSONTyped(json, false);
}

export function ModQuizStartAttemptRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizStartAttemptRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'forcenew': json['forcenew'] == null ? undefined : json['forcenew'],
        'preflightdata': json['preflightdata'] == null ? undefined : ((json['preflightdata'] as Array<any>).map(ModQuizGetAttemptDataRequestPreflightdataInnerFromJSON)),
        'quizid': json['quizid'],
    };
}

export function ModQuizStartAttemptRequestToJSON(value?: ModQuizStartAttemptRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'forcenew': value['forcenew'],
        'preflightdata': value['preflightdata'] == null ? undefined : ((value['preflightdata'] as Array<any>).map(ModQuizGetAttemptDataRequestPreflightdataInnerToJSON)),
        'quizid': value['quizid'],
    };
}

