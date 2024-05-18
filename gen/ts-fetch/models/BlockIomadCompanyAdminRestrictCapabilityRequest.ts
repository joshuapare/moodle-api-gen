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
 * @interface BlockIomadCompanyAdminRestrictCapabilityRequest
 */
export interface BlockIomadCompanyAdminRestrictCapabilityRequest {
    /**
     * Set capability?
     * @type {boolean}
     * @memberof BlockIomadCompanyAdminRestrictCapabilityRequest
     */
    allow: boolean;
    /**
     * The capability
     * @type {string}
     * @memberof BlockIomadCompanyAdminRestrictCapabilityRequest
     */
    capability: string;
    /**
     * Company ID. Ignored if templateid is non-zero
     * @type {number}
     * @memberof BlockIomadCompanyAdminRestrictCapabilityRequest
     */
    companyid: number;
    /**
     * Role ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminRestrictCapabilityRequest
     */
    roleid: number;
    /**
     * Template ID. Set to 0 if company restriction
     * @type {number}
     * @memberof BlockIomadCompanyAdminRestrictCapabilityRequest
     */
    templateid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminRestrictCapabilityRequest interface.
 */
export function instanceOfBlockIomadCompanyAdminRestrictCapabilityRequest(value: object): boolean {
    if (!('allow' in value)) return false;
    if (!('capability' in value)) return false;
    if (!('companyid' in value)) return false;
    if (!('roleid' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminRestrictCapabilityRequestFromJSON(json: any): BlockIomadCompanyAdminRestrictCapabilityRequest {
    return BlockIomadCompanyAdminRestrictCapabilityRequestFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminRestrictCapabilityRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminRestrictCapabilityRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'allow': json['allow'],
        'capability': json['capability'],
        'companyid': json['companyid'],
        'roleid': json['roleid'],
        'templateid': json['templateid'] == null ? undefined : json['templateid'],
    };
}

export function BlockIomadCompanyAdminRestrictCapabilityRequestToJSON(value?: BlockIomadCompanyAdminRestrictCapabilityRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allow': value['allow'],
        'capability': value['capability'],
        'companyid': value['companyid'],
        'roleid': value['roleid'],
        'templateid': value['templateid'],
    };
}

