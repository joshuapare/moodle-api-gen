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

/**
* grade information
*/
export class ModAssignGetGrades200ResponseAssignmentsInnerGradesInner {
    /**
    * assignment id
    */
    'Assignment'?: number;
    /**
    * attempt number
    */
    'Attemptnumber'?: number = null;
    /**
    * grade
    */
    'Grade'?: string = 'null';
    /**
    * grade rendered into a format suitable for display
    */
    'Gradefordisplay'?: string = 'null';
    /**
    * grader, -1 if grader is hidden
    */
    'Grader'?: number = null;
    /**
    * grade id
    */
    'Id'?: number = null;
    /**
    * grade creation time
    */
    'Timecreated'?: number = null;
    /**
    * grade last modified time
    */
    'Timemodified'?: number = null;
    /**
    * student id
    */
    'Userid'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Assignment",
            "baseName": "assignment",
            "type": "number"
        },
        {
            "name": "Attemptnumber",
            "baseName": "attemptnumber",
            "type": "number"
        },
        {
            "name": "Grade",
            "baseName": "grade",
            "type": "string"
        },
        {
            "name": "Gradefordisplay",
            "baseName": "gradefordisplay",
            "type": "string"
        },
        {
            "name": "Grader",
            "baseName": "grader",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "Timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.attributeTypeMap;
    }
}

