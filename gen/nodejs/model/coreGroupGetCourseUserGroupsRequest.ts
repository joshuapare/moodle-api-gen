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

export class CoreGroupGetCourseUserGroupsRequest {
    /**
    * Id of course (empty or 0 for all the courses where the user is enrolled).
    */
    'Courseid'?: number = 0;
    /**
    * returns only groups in the specified grouping
    */
    'Groupingid'?: number = 0;
    /**
    * Id of user (empty or 0 for current user).
    */
    'Userid'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "Groupingid",
            "baseName": "groupingid",
            "type": "number"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreGroupGetCourseUserGroupsRequest.attributeTypeMap;
    }
}

