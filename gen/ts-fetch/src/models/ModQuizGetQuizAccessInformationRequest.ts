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
 * @interface ModQuizGetQuizAccessInformationRequest
 */
export interface ModQuizGetQuizAccessInformationRequest {
    /**
     * quiz instance id
     * @type {number}
     * @memberof ModQuizGetQuizAccessInformationRequest
     */
    Quizid: number;
}

/**
 * Check if a given object implements the ModQuizGetQuizAccessInformationRequest interface.
 */
export function instanceOfModQuizGetQuizAccessInformationRequest(value: object): boolean {
    if (!('Quizid' in value)) return false;
    return true;
}

export function ModQuizGetQuizAccessInformationRequestFromJSON(json: any): ModQuizGetQuizAccessInformationRequest {
    return ModQuizGetQuizAccessInformationRequestFromJSONTyped(json, false);
}

export function ModQuizGetQuizAccessInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetQuizAccessInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Quizid': json['quizid'],
    };
}

export function ModQuizGetQuizAccessInformationRequestToJSON(value?: ModQuizGetQuizAccessInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'quizid': value['Quizid'],
    };
}

