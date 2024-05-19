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
 * @interface ModQuizSaveAttemptRequest
 */
export interface ModQuizSaveAttemptRequest {
    /**
     * attempt id
     * @type {number}
     * @memberof ModQuizSaveAttemptRequest
     */
    Attemptid: number;
    /**
     * 
     * @type {Array<ModQuizGetAttemptDataRequestPreflightdataInner>}
     * @memberof ModQuizSaveAttemptRequest
     */
    Data: Array<ModQuizGetAttemptDataRequestPreflightdataInner>;
    /**
     * 
     * @type {Array<ModQuizGetAttemptDataRequestPreflightdataInner>}
     * @memberof ModQuizSaveAttemptRequest
     */
    Preflightdata?: Array<ModQuizGetAttemptDataRequestPreflightdataInner>;
}

/**
 * Check if a given object implements the ModQuizSaveAttemptRequest interface.
 */
export function instanceOfModQuizSaveAttemptRequest(value: object): boolean {
    if (!('Attemptid' in value)) return false;
    if (!('Data' in value)) return false;
    return true;
}

export function ModQuizSaveAttemptRequestFromJSON(json: any): ModQuizSaveAttemptRequest {
    return ModQuizSaveAttemptRequestFromJSONTyped(json, false);
}

export function ModQuizSaveAttemptRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizSaveAttemptRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Attemptid': json['attemptid'],
        'Data': ((json['data'] as Array<any>).map(ModQuizGetAttemptDataRequestPreflightdataInnerFromJSON)),
        'Preflightdata': json['preflightdata'] == null ? undefined : ((json['preflightdata'] as Array<any>).map(ModQuizGetAttemptDataRequestPreflightdataInnerFromJSON)),
    };
}

export function ModQuizSaveAttemptRequestToJSON(value?: ModQuizSaveAttemptRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attemptid': value['Attemptid'],
        'data': ((value['Data'] as Array<any>).map(ModQuizGetAttemptDataRequestPreflightdataInnerToJSON)),
        'preflightdata': value['Preflightdata'] == null ? undefined : ((value['Preflightdata'] as Array<any>).map(ModQuizGetAttemptDataRequestPreflightdataInnerToJSON)),
    };
}

