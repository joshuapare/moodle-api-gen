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
    courseid?: number;
    /**
     * Number of items purchased.
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    quantity?: number;
    /**
     * Role to assign to the user
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    roleid?: number;
    /**
     * set to 1 to suspend the enrolment
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    suspend?: number;
    /**
     * Timestamp when the enrolment end
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    timeend?: number;
    /**
     * Timestamp when the enrolment start
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    timestart?: number;
    /**
     * The user that is going to be enrolled
     * @type {number}
     * @memberof BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner
     */
    userid?: number;
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
        
        'courseid': json['courseid'] == null ? undefined : json['courseid'],
        'quantity': json['quantity'] == null ? undefined : json['quantity'],
        'roleid': json['roleid'] == null ? undefined : json['roleid'],
        'suspend': json['suspend'] == null ? undefined : json['suspend'],
        'timeend': json['timeend'] == null ? undefined : json['timeend'],
        'timestart': json['timestart'] == null ? undefined : json['timestart'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerToJSON(value?: BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
        'quantity': value['quantity'],
        'roleid': value['roleid'],
        'suspend': value['suspend'],
        'timeend': value['timeend'],
        'timestart': value['timestart'],
        'userid': value['userid'],
    };
}
