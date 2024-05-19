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
 * @interface ToolIomadpolicyGetIomadpolicyVersionRequest
 */
export interface ToolIomadpolicyGetIomadpolicyVersionRequest {
    /**
     * The id of user on whose behalf the user is viewing the iomadpolicy
     * @type {number}
     * @memberof ToolIomadpolicyGetIomadpolicyVersionRequest
     */
    Behalfid?: number;
    /**
     * The iomadpolicy version ID
     * @type {number}
     * @memberof ToolIomadpolicyGetIomadpolicyVersionRequest
     */
    Versionid: number;
}

/**
 * Check if a given object implements the ToolIomadpolicyGetIomadpolicyVersionRequest interface.
 */
export function instanceOfToolIomadpolicyGetIomadpolicyVersionRequest(value: object): boolean {
    if (!('Versionid' in value)) return false;
    return true;
}

export function ToolIomadpolicyGetIomadpolicyVersionRequestFromJSON(json: any): ToolIomadpolicyGetIomadpolicyVersionRequest {
    return ToolIomadpolicyGetIomadpolicyVersionRequestFromJSONTyped(json, false);
}

export function ToolIomadpolicyGetIomadpolicyVersionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolIomadpolicyGetIomadpolicyVersionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Behalfid': json['behalfid'] == null ? undefined : json['behalfid'],
        'Versionid': json['versionid'],
    };
}

export function ToolIomadpolicyGetIomadpolicyVersionRequestToJSON(value?: ToolIomadpolicyGetIomadpolicyVersionRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'behalfid': value['Behalfid'],
        'versionid': value['Versionid'],
    };
}
