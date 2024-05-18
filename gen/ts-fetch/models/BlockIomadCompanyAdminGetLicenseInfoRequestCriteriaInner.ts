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
 * @interface BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner
 */
export interface BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner {
    /**
     * the user column to search, expected keys (value format) are:
     *                                 "id" (int) matching user id,
     *                                 "name" (string) license name (Note: you can use % for searching but it may be considerably slower!),
     *                                 "startdate" (int) license start date in unix time,
     *                                 "expirydate" (int) license expiry date in unix time,
     *                                 "companyid" (int) license company id,
     *                                 "parentid"  (int) license parent id for split licenses,
     *                                 "program"  (bool) license is program,
     *                                 "instant"  (bool) license is instant,
     *                                 "type"  (int) license type (0 = standard, 1 = reusable, 3 = educator),
     *                                 "reference" license reference (Note: you can use % for searching but it may be considerably slower!)
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner
     */
    key?: string;
    /**
     * the value to search
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner
     */
    value?: string;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner interface.
 */
export function instanceOfBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInnerFromJSON(json: any): BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner {
    return BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner {
    if (json == null) {
        return json;
    }
    return {
        
        'key': json['key'] == null ? undefined : json['key'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInnerToJSON(value?: BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'key': value['key'],
        'value': value['value'],
    };
}

