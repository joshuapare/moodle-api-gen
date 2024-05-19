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
 * @interface ToolDataprivacyDeletePurposeRequest
 */
export interface ToolDataprivacyDeletePurposeRequest {
    /**
     * The purpose ID
     * @type {number}
     * @memberof ToolDataprivacyDeletePurposeRequest
     */
    Id: number;
}

/**
 * Check if a given object implements the ToolDataprivacyDeletePurposeRequest interface.
 */
export function instanceOfToolDataprivacyDeletePurposeRequest(value: object): boolean {
    if (!('Id' in value)) return false;
    return true;
}

export function ToolDataprivacyDeletePurposeRequestFromJSON(json: any): ToolDataprivacyDeletePurposeRequest {
    return ToolDataprivacyDeletePurposeRequestFromJSONTyped(json, false);
}

export function ToolDataprivacyDeletePurposeRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyDeletePurposeRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'],
    };
}

export function ToolDataprivacyDeletePurposeRequestToJSON(value?: ToolDataprivacyDeletePurposeRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
    };
}
