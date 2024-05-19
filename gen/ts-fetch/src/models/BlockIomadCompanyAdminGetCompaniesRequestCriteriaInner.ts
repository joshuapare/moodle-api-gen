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
 * @interface BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner
 */
export interface BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {
    /**
     * the company column to search, expected keys (value format) are:
     *                                 "id" (int) matching company id,
     *                                 "name" (string) company name (Note: you can use % for searching but it may be considerably slower!),
     *                                 "shortname" (string) company short name (Note: you can use % for searching but it may be considerably slower!),
     *                                 "code" (string) company code (Note: you can use % for searching but it may be considerably slower!),
     *                                 "suspended" (bool) company is suspended or not,
     *                                 "city" (string) matching company city,
     *                                 "country" (string) matching company country,
     *                                 "timezone" (int) company timezone,
     *                                 "lang" (string) matching company language setting
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner
     */
    Key?: string;
    /**
     * the value to search
     * @type {string}
     * @memberof BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner interface.
 */
export function instanceOfBlockIomadCompanyAdminGetCompaniesRequestCriteriaInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminGetCompaniesRequestCriteriaInnerFromJSON(json: any): BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {
    return BlockIomadCompanyAdminGetCompaniesRequestCriteriaInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminGetCompaniesRequestCriteriaInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Key': json['key'] == null ? undefined : json['key'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function BlockIomadCompanyAdminGetCompaniesRequestCriteriaInnerToJSON(value?: BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'key': value['Key'],
        'value': value['Value'],
    };
}

