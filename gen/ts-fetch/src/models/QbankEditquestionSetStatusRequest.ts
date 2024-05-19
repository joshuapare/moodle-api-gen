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
 * @interface QbankEditquestionSetStatusRequest
 */
export interface QbankEditquestionSetStatusRequest {
    /**
     * The question id
     * @type {number}
     * @memberof QbankEditquestionSetStatusRequest
     */
    Questionid: number;
    /**
     * The updated question status
     * @type {string}
     * @memberof QbankEditquestionSetStatusRequest
     */
    Status: string;
}

/**
 * Check if a given object implements the QbankEditquestionSetStatusRequest interface.
 */
export function instanceOfQbankEditquestionSetStatusRequest(value: object): boolean {
    if (!('Questionid' in value)) return false;
    if (!('Status' in value)) return false;
    return true;
}

export function QbankEditquestionSetStatusRequestFromJSON(json: any): QbankEditquestionSetStatusRequest {
    return QbankEditquestionSetStatusRequestFromJSONTyped(json, false);
}

export function QbankEditquestionSetStatusRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): QbankEditquestionSetStatusRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Questionid': json['questionid'],
        'Status': json['status'],
    };
}

export function QbankEditquestionSetStatusRequestToJSON(value?: QbankEditquestionSetStatusRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'questionid': value['Questionid'],
        'status': value['Status'],
    };
}

