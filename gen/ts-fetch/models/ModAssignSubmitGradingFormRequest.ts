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
    assignmentid: number;
    /**
     * The data from the grading form, encoded as a json array
     * @type {string}
     * @memberof ModAssignSubmitGradingFormRequest
     */
    jsonformdata: string;
    /**
     * The user id the submission belongs to
     * @type {number}
     * @memberof ModAssignSubmitGradingFormRequest
     */
    userid: number;
}

/**
 * Check if a given object implements the ModAssignSubmitGradingFormRequest interface.
 */
export function instanceOfModAssignSubmitGradingFormRequest(value: object): boolean {
    if (!('assignmentid' in value)) return false;
    if (!('jsonformdata' in value)) return false;
    if (!('userid' in value)) return false;
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
        
        'assignmentid': json['assignmentid'],
        'jsonformdata': json['jsonformdata'],
        'userid': json['userid'],
    };
}

export function ModAssignSubmitGradingFormRequestToJSON(value?: ModAssignSubmitGradingFormRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignmentid': value['assignmentid'],
        'jsonformdata': value['jsonformdata'],
        'userid': value['userid'],
    };
}

