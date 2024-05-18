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
 * @interface CoreQuestionUpdateFlagRequest
 */
export interface CoreQuestionUpdateFlagRequest {
    /**
     * computed checksum with the last three arguments and
     *                              the users username
     * @type {string}
     * @memberof CoreQuestionUpdateFlagRequest
     */
    checksum: string;
    /**
     * the new state of the flag. true = flagged
     * @type {boolean}
     * @memberof CoreQuestionUpdateFlagRequest
     */
    newstate: boolean;
    /**
     * the question_attempt id
     * @type {number}
     * @memberof CoreQuestionUpdateFlagRequest
     */
    qaid: number;
    /**
     * the question usage id.
     * @type {number}
     * @memberof CoreQuestionUpdateFlagRequest
     */
    qubaid: number;
    /**
     * the question id
     * @type {number}
     * @memberof CoreQuestionUpdateFlagRequest
     */
    questionid: number;
    /**
     * the slot number within the usage
     * @type {number}
     * @memberof CoreQuestionUpdateFlagRequest
     */
    slot: number;
}

/**
 * Check if a given object implements the CoreQuestionUpdateFlagRequest interface.
 */
export function instanceOfCoreQuestionUpdateFlagRequest(value: object): boolean {
    if (!('checksum' in value)) return false;
    if (!('newstate' in value)) return false;
    if (!('qaid' in value)) return false;
    if (!('qubaid' in value)) return false;
    if (!('questionid' in value)) return false;
    if (!('slot' in value)) return false;
    return true;
}

export function CoreQuestionUpdateFlagRequestFromJSON(json: any): CoreQuestionUpdateFlagRequest {
    return CoreQuestionUpdateFlagRequestFromJSONTyped(json, false);
}

export function CoreQuestionUpdateFlagRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreQuestionUpdateFlagRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'checksum': json['checksum'],
        'newstate': json['newstate'],
        'qaid': json['qaid'],
        'qubaid': json['qubaid'],
        'questionid': json['questionid'],
        'slot': json['slot'],
    };
}

export function CoreQuestionUpdateFlagRequestToJSON(value?: CoreQuestionUpdateFlagRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'checksum': value['checksum'],
        'newstate': value['newstate'],
        'qaid': value['qaid'],
        'qubaid': value['qubaid'],
        'questionid': value['questionid'],
        'slot': value['slot'],
    };
}
