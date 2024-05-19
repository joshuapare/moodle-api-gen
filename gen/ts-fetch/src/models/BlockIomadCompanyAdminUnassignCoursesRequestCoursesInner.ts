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
 * @interface BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner
 */
export interface BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
    /**
     * Course company ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner
     */
    Companyid?: number;
    /**
     * Course ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner
     */
    Courseid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner interface.
 */
export function instanceOfBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminUnassignCoursesRequestCoursesInnerFromJSON(json: any): BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
    return BlockIomadCompanyAdminUnassignCoursesRequestCoursesInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminUnassignCoursesRequestCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Companyid': json['companyid'] == null ? undefined : json['companyid'],
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
    };
}

export function BlockIomadCompanyAdminUnassignCoursesRequestCoursesInnerToJSON(value?: BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'companyid': value['Companyid'],
        'courseid': value['Courseid'],
    };
}

