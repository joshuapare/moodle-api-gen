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
 * @interface CoreCreateUserfeedbackActionRecordRequest
 */
export interface CoreCreateUserfeedbackActionRecordRequest {
    /**
     * The action taken by user
     * @type {string}
     * @memberof CoreCreateUserfeedbackActionRecordRequest
     */
    Action: string;
    /**
     * The context id of the page the user is in
     * @type {number}
     * @memberof CoreCreateUserfeedbackActionRecordRequest
     */
    Contextid: number;
}

/**
 * Check if a given object implements the CoreCreateUserfeedbackActionRecordRequest interface.
 */
export function instanceOfCoreCreateUserfeedbackActionRecordRequest(value: object): boolean {
    if (!('Action' in value)) return false;
    if (!('Contextid' in value)) return false;
    return true;
}

export function CoreCreateUserfeedbackActionRecordRequestFromJSON(json: any): CoreCreateUserfeedbackActionRecordRequest {
    return CoreCreateUserfeedbackActionRecordRequestFromJSONTyped(json, false);
}

export function CoreCreateUserfeedbackActionRecordRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCreateUserfeedbackActionRecordRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Action': json['action'],
        'Contextid': json['contextid'],
    };
}

export function CoreCreateUserfeedbackActionRecordRequestToJSON(value?: CoreCreateUserfeedbackActionRecordRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'action': value['Action'],
        'contextid': value['Contextid'],
    };
}

