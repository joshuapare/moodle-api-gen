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
 * @interface ModAssignSubmitGradingFormRequest
 */
export interface ModAssignSubmitGradingFormRequest {
    /**
     * The assignment id to operate on
     * @type {number}
     * @memberof ModAssignSubmitGradingFormRequest
     */
    Assignmentid: number;
    /**
     * The data from the grading form, encoded as a json array
     * @type {string}
     * @memberof ModAssignSubmitGradingFormRequest
     */
    Jsonformdata: string;
    /**
     * The user id the submission belongs to
     * @type {number}
     * @memberof ModAssignSubmitGradingFormRequest
     */
    Userid: number;
}

/**
 * Check if a given object implements the ModAssignSubmitGradingFormRequest interface.
 */
export function instanceOfModAssignSubmitGradingFormRequest(value: object): boolean {
    if (!('Assignmentid' in value)) return false;
    if (!('Jsonformdata' in value)) return false;
    if (!('Userid' in value)) return false;
    return true;
}

export function ModAssignSubmitGradingFormRequestFromJSON(json: any): ModAssignSubmitGradingFormRequest {
    return ModAssignSubmitGradingFormRequestFromJSONTyped(json, false);
}

export function ModAssignSubmitGradingFormRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSubmitGradingFormRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignmentid': json['assignmentid'],
        'Jsonformdata': json['jsonformdata'],
        'Userid': json['userid'],
    };
}

export function ModAssignSubmitGradingFormRequestToJSON(value?: ModAssignSubmitGradingFormRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignmentid': value['Assignmentid'],
        'jsonformdata': value['Jsonformdata'],
        'userid': value['Userid'],
    };
}
