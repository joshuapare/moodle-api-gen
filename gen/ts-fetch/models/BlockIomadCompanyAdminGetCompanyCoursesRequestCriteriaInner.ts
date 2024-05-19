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
 * @interface BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner
 */
export interface BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner {
    /**
     * the company id
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner
     */
    companyid?: number;
    /**
     * Show all of the shared courses availabe to the company
     * @type {number}
     * @memberof BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner
     */
    shared?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner interface.
 */
export function instanceOfBlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInnerFromJSON(json: any): BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner {
    return BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner {
    if (json == null) {
        return json;
    }
    return {
        
        'companyid': json['companyid'] == null ? undefined : json['companyid'],
        'shared': json['shared'] == null ? undefined : json['shared'],
    };
}

export function BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInnerToJSON(value?: BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'companyid': value['companyid'],
        'shared': value['shared'],
    };
}

