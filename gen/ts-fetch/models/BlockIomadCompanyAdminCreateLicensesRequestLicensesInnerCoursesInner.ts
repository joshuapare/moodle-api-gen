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
 * @interface BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner
 */
export interface BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner {
    /**
     * Course ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner
     */
    courseid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerFromJSON(json: any): BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner {
    return BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'] == null ? undefined : json['courseid'],
    };
}

export function BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInnerToJSON(value?: BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
    };
}

