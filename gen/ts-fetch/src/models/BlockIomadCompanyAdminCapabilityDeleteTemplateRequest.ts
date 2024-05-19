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
 * @interface BlockIomadCompanyAdminCapabilityDeleteTemplateRequest
 */
export interface BlockIomadCompanyAdminCapabilityDeleteTemplateRequest {
    /**
     * Template ID.
     * @type {number}
     * @memberof BlockIomadCompanyAdminCapabilityDeleteTemplateRequest
     */
    Templateid: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminCapabilityDeleteTemplateRequest interface.
 */
export function instanceOfBlockIomadCompanyAdminCapabilityDeleteTemplateRequest(value: object): boolean {
    if (!('Templateid' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminCapabilityDeleteTemplateRequestFromJSON(json: any): BlockIomadCompanyAdminCapabilityDeleteTemplateRequest {
    return BlockIomadCompanyAdminCapabilityDeleteTemplateRequestFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminCapabilityDeleteTemplateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminCapabilityDeleteTemplateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Templateid': json['templateid'],
    };
}

export function BlockIomadCompanyAdminCapabilityDeleteTemplateRequestToJSON(value?: BlockIomadCompanyAdminCapabilityDeleteTemplateRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'templateid': value['Templateid'],
    };
}

