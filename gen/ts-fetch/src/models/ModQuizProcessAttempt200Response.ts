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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface ModQuizProcessAttempt200Response
 */
export interface ModQuizProcessAttempt200Response {
    /**
     * state: the new attempt state:
     *                                                                     inprogress, finished, overdue, abandoned
     * @type {string}
     * @memberof ModQuizProcessAttempt200Response
     */
    State: string;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModQuizProcessAttempt200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModQuizProcessAttempt200Response interface.
 */
export function instanceOfModQuizProcessAttempt200Response(value: object): boolean {
    if (!('State' in value)) return false;
    return true;
}

export function ModQuizProcessAttempt200ResponseFromJSON(json: any): ModQuizProcessAttempt200Response {
    return ModQuizProcessAttempt200ResponseFromJSONTyped(json, false);
}

export function ModQuizProcessAttempt200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizProcessAttempt200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'State': json['state'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModQuizProcessAttempt200ResponseToJSON(value?: ModQuizProcessAttempt200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'state': value['State'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
