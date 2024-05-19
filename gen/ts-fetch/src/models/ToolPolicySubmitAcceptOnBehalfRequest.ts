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
 * @interface ToolPolicySubmitAcceptOnBehalfRequest
 */
export interface ToolPolicySubmitAcceptOnBehalfRequest {
    /**
     * The data from the create group form, encoded as a json array
     * @type {string}
     * @memberof ToolPolicySubmitAcceptOnBehalfRequest
     */
    Jsonformdata: string;
}

/**
 * Check if a given object implements the ToolPolicySubmitAcceptOnBehalfRequest interface.
 */
export function instanceOfToolPolicySubmitAcceptOnBehalfRequest(value: object): boolean {
    if (!('Jsonformdata' in value)) return false;
    return true;
}

export function ToolPolicySubmitAcceptOnBehalfRequestFromJSON(json: any): ToolPolicySubmitAcceptOnBehalfRequest {
    return ToolPolicySubmitAcceptOnBehalfRequestFromJSONTyped(json, false);
}

export function ToolPolicySubmitAcceptOnBehalfRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolPolicySubmitAcceptOnBehalfRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Jsonformdata': json['jsonformdata'],
    };
}

export function ToolPolicySubmitAcceptOnBehalfRequestToJSON(value?: ToolPolicySubmitAcceptOnBehalfRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'jsonformdata': value['Jsonformdata'],
    };
}

