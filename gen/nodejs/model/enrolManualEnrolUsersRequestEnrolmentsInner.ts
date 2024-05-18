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

import { RequestFile } from './models';

export class EnrolManualEnrolUsersRequestEnrolmentsInner {
    /**
    * The course to enrol the user role in
    */
    'courseid'?: number;
    /**
    * Role to assign to the user
    */
    'roleid'?: number;
    /**
    * set to 1 to suspend the enrolment
    */
    'suspend'?: number;
    /**
    * Timestamp when the enrolment end
    */
    'timeend'?: number;
    /**
    * Timestamp when the enrolment start
    */
    'timestart'?: number;
    /**
    * The user that is going to be enrolled
    */
    'userid'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "roleid",
            "baseName": "roleid",
            "type": "number"
        },
        {
            "name": "suspend",
            "baseName": "suspend",
            "type": "number"
        },
        {
            "name": "timeend",
            "baseName": "timeend",
            "type": "number"
        },
        {
            "name": "timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return EnrolManualEnrolUsersRequestEnrolmentsInner.attributeTypeMap;
    }
}
