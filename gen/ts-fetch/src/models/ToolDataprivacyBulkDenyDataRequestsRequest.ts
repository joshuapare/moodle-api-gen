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
 * @interface ToolDataprivacyBulkDenyDataRequestsRequest
 */
export interface ToolDataprivacyBulkDenyDataRequestsRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof ToolDataprivacyBulkDenyDataRequestsRequest
     */
    Requestids: Array<object>;
}

/**
 * Check if a given object implements the ToolDataprivacyBulkDenyDataRequestsRequest interface.
 */
export function instanceOfToolDataprivacyBulkDenyDataRequestsRequest(value: object): boolean {
    if (!('Requestids' in value)) return false;
    return true;
}

export function ToolDataprivacyBulkDenyDataRequestsRequestFromJSON(json: any): ToolDataprivacyBulkDenyDataRequestsRequest {
    return ToolDataprivacyBulkDenyDataRequestsRequestFromJSONTyped(json, false);
}

export function ToolDataprivacyBulkDenyDataRequestsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyBulkDenyDataRequestsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Requestids': json['requestids'],
    };
}

export function ToolDataprivacyBulkDenyDataRequestsRequestToJSON(value?: ToolDataprivacyBulkDenyDataRequestsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'requestids': value['Requestids'],
    };
}
