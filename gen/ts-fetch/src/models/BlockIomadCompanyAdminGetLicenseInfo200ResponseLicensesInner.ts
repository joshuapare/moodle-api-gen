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
 * @interface BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
 */
export interface BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner {
    /**
     * Number of license slots
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Allocation?: number;
    /**
     * Company id
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Companyid?: number;
    /**
     * License expiry date
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Expirydate?: number;
    /**
     * license ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Id?: number;
    /**
     * License name
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Name?: string;
    /**
     * Parent license id
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Parentid?: number;
    /**
     * Number allocated
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Used?: number;
    /**
     * Course access length (days)
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
     */
    Validlength?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInnerFromJSON(json: any): BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner {
    return BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Allocation': json['allocation'] == null ? undefined : json['allocation'],
        'Companyid': json['companyid'] == null ? undefined : json['companyid'],
        'Expirydate': json['expirydate'] == null ? undefined : json['expirydate'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Parentid': json['parentid'] == null ? undefined : json['parentid'],
        'Used': json['used'] == null ? undefined : json['used'],
        'Validlength': json['validlength'] == null ? undefined : json['validlength'],
    };
}

export function BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInnerToJSON(value?: BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allocation': value['Allocation'],
        'companyid': value['Companyid'],
        'expirydate': value['Expirydate'],
        'id': value['Id'],
        'name': value['Name'],
        'parentid': value['Parentid'],
        'used': value['Used'],
        'validlength': value['Validlength'],
    };
}

