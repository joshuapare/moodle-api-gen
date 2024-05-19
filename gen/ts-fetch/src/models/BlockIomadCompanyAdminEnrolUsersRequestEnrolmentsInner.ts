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
 * @interface BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
 */
export interface BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner {
    /**
     * The course to enrol the user role in
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    Courseid?: number;
    /**
     * Number of items purchased.
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    Quantity?: number;
    /**
     * Role to assign to the user
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    Roleid?: number;
    /**
     * set to 1 to suspend the enrolment
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    Suspend?: number;
    /**
     * Timestamp when the enrolment end
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    Timeend?: number;
    /**
     * Timestamp when the enrolment start
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    Timestart?: number;
    /**
     * The user that is going to be enrolled
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner interface.
 */
export function instanceOfBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerFromJSON(json: any): BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner {
    return BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Quantity': json['quantity'] == null ? undefined : json['quantity'],
        'Roleid': json['roleid'] == null ? undefined : json['roleid'],
        'Suspend': json['suspend'] == null ? undefined : json['suspend'],
        'Timeend': json['timeend'] == null ? undefined : json['timeend'],
        'Timestart': json['timestart'] == null ? undefined : json['timestart'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerToJSON(value?: BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'quantity': value['Quantity'],
        'roleid': value['Roleid'],
        'suspend': value['Suspend'],
        'timeend': value['Timeend'],
        'timestart': value['Timestart'],
        'userid': value['Userid'],
    };
}

