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
 * @interface ToolDataprivacyApproveDataRequestRequest
 */
export interface ToolDataprivacyApproveDataRequestRequest {
    /**
     * The request ID
     * @type {number}
     * @memberof ToolDataprivacyApproveDataRequestRequest
     */
    Requestid: number;
}

/**
 * Check if a given object implements the ToolDataprivacyApproveDataRequestRequest interface.
 */
export function instanceOfToolDataprivacyApproveDataRequestRequest(value: object): boolean {
    if (!('Requestid' in value)) return false;
    return true;
}

export function ToolDataprivacyApproveDataRequestRequestFromJSON(json: any): ToolDataprivacyApproveDataRequestRequest {
    return ToolDataprivacyApproveDataRequestRequestFromJSONTyped(json, false);
}

export function ToolDataprivacyApproveDataRequestRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyApproveDataRequestRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Requestid': json['requestid'],
    };
}

export function ToolDataprivacyApproveDataRequestRequestToJSON(value?: ToolDataprivacyApproveDataRequestRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'requestid': value['Requestid'],
    };
}

