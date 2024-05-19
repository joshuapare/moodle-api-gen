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
 * @interface BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner
 */
export interface BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner {
    /**
     * Course ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner
     */
    licensecourseid?: number;
    /**
     * License ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner
     */
    licenseid?: number;
    /**
     * User ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner
     */
    userid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInnerFromJSON(json: any): BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner {
    return BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'licensecourseid': json['licensecourseid'] == null ? undefined : json['licensecourseid'],
        'licenseid': json['licenseid'] == null ? undefined : json['licenseid'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInnerToJSON(value?: BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'licensecourseid': value['licensecourseid'],
        'licenseid': value['licenseid'],
        'userid': value['userid'],
    };
}

