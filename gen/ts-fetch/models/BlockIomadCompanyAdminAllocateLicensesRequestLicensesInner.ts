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
 * @interface BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner
 */
export interface BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner {
    /**
     * Course ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner
     */
    licensecourseid?: number;
    /**
     * License ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner
     */
    licenseid?: number;
    /**
     * User ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner
     */
    userid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminAllocateLicensesRequestLicensesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminAllocateLicensesRequestLicensesInnerFromJSON(json: any): BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner {
    return BlockIomadCompanyAdminAllocateLicensesRequestLicensesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminAllocateLicensesRequestLicensesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'licensecourseid': json['licensecourseid'] == null ? undefined : json['licensecourseid'],
        'licenseid': json['licenseid'] == null ? undefined : json['licenseid'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function BlockIomadCompanyAdminAllocateLicensesRequestLicensesInnerToJSON(value?: BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'licensecourseid': value['licensecourseid'],
        'licenseid': value['licenseid'],
        'userid': value['userid'],
    };
}
