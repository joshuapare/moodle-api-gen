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
import { ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner } from './modAssignGetAssignments200ResponseCoursesInnerAssignmentsInner';

/**
* course information object
*/
export class ModAssignGetAssignments200ResponseCoursesInner {
    'assignments'?: Array<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner>;
    /**
    * course full name
    */
    'fullname'?: string;
    /**
    * course id
    */
    'id'?: number;
    /**
    * course short name
    */
    'shortname'?: string;
    /**
    * last time modified
    */
    'timemodified'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assignments",
            "baseName": "assignments",
            "type": "Array<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner>"
        },
        {
            "name": "fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "shortname",
            "baseName": "shortname",
            "type": "string"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignGetAssignments200ResponseCoursesInner.attributeTypeMap;
    }
}

