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
import { CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner } from './coreCourseGetCourseModule200ResponseCmAdvancedgradingInner';
import { CoreCourseGetCourseModule200ResponseCmOutcomesInner } from './coreCourseGetCourseModule200ResponseCmOutcomesInner';

export class CoreCourseGetCourseModule200ResponseCm {
    /**
    * Time added
    */
    'Added'?: number = null;
    'Advancedgrading'?: Array<CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner>;
    /**
    * Availability settings
    */
    'Availability'?: string = 'null';
    /**
    * If completion is enabled
    */
    'Completion': number = null;
    /**
    * Completion time expected
    */
    'Completionexpected'?: number = null;
    /**
    * Completion grade item
    */
    'Completiongradeitemnumber'?: number = null;
    /**
    * Completion pass grade setting
    */
    'Completionpassgrade'?: number = null;
    /**
    * Completion view setting
    */
    'Completionview'?: number = null;
    /**
    * The course id
    */
    'Course': number;
    /**
    * The download content value
    */
    'Downloadcontent'?: number = null;
    /**
    * Grade (max value or scale id)
    */
    'Grade'?: number = null;
    /**
    * Grade category
    */
    'Gradecat'?: number = null;
    /**
    * Grade to pass (float)
    */
    'Gradepass'?: string = 'null';
    /**
    * Grouping id
    */
    'Groupingid': number = null;
    /**
    * Group mode
    */
    'Groupmode': number = null;
    /**
    * The course module id
    */
    'Id': number;
    /**
    * Module id number
    */
    'Idnumber'?: string = 'null';
    /**
    * Indentation
    */
    'Indent'?: number = null;
    /**
    * The activity instance id
    */
    'Instance': number = null;
    /**
    * The module component name (forum, assign, etc..)
    */
    'Modname': string = 'null';
    /**
    * The module type id
    */
    'Module': number = null;
    /**
    * The activity name
    */
    'Name': string = 'null';
    'Outcomes'?: Array<CoreCourseGetCourseModule200ResponseCmOutcomesInner>;
    /**
    * Scale items (if used)
    */
    'Scale'?: string = 'null';
    /**
    * Score
    */
    'Score'?: number = null;
    /**
    * The module section id
    */
    'Section': number = null;
    /**
    * The module section number
    */
    'Sectionnum': number = null;
    /**
    * If the description is showed
    */
    'Showdescription'?: number = null;
    /**
    * If visible
    */
    'Visible'?: number = null;
    /**
    * Visible old
    */
    'Visibleold'?: number = null;
    /**
    * If visible on course page
    */
    'Visibleoncoursepage'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Added",
            "baseName": "added",
            "type": "number"
        },
        {
            "name": "Advancedgrading",
            "baseName": "advancedgrading",
            "type": "Array<CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner>"
        },
        {
            "name": "Availability",
            "baseName": "availability",
            "type": "string"
        },
        {
            "name": "Completion",
            "baseName": "completion",
            "type": "number"
        },
        {
            "name": "Completionexpected",
            "baseName": "completionexpected",
            "type": "number"
        },
        {
            "name": "Completiongradeitemnumber",
            "baseName": "completiongradeitemnumber",
            "type": "number"
        },
        {
            "name": "Completionpassgrade",
            "baseName": "completionpassgrade",
            "type": "number"
        },
        {
            "name": "Completionview",
            "baseName": "completionview",
            "type": "number"
        },
        {
            "name": "Course",
            "baseName": "course",
            "type": "number"
        },
        {
            "name": "Downloadcontent",
            "baseName": "downloadcontent",
            "type": "number"
        },
        {
            "name": "Grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "Gradecat",
            "baseName": "gradecat",
            "type": "number"
        },
        {
            "name": "Gradepass",
            "baseName": "gradepass",
            "type": "string"
        },
        {
            "name": "Groupingid",
            "baseName": "groupingid",
            "type": "number"
        },
        {
            "name": "Groupmode",
            "baseName": "groupmode",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "Indent",
            "baseName": "indent",
            "type": "number"
        },
        {
            "name": "Instance",
            "baseName": "instance",
            "type": "number"
        },
        {
            "name": "Modname",
            "baseName": "modname",
            "type": "string"
        },
        {
            "name": "Module",
            "baseName": "module",
            "type": "number"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Outcomes",
            "baseName": "outcomes",
            "type": "Array<CoreCourseGetCourseModule200ResponseCmOutcomesInner>"
        },
        {
            "name": "Scale",
            "baseName": "scale",
            "type": "string"
        },
        {
            "name": "Score",
            "baseName": "score",
            "type": "number"
        },
        {
            "name": "Section",
            "baseName": "section",
            "type": "number"
        },
        {
            "name": "Sectionnum",
            "baseName": "sectionnum",
            "type": "number"
        },
        {
            "name": "Showdescription",
            "baseName": "showdescription",
            "type": "number"
        },
        {
            "name": "Visible",
            "baseName": "visible",
            "type": "number"
        },
        {
            "name": "Visibleold",
            "baseName": "visibleold",
            "type": "number"
        },
        {
            "name": "Visibleoncoursepage",
            "baseName": "visibleoncoursepage",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseGetCourseModule200ResponseCm.attributeTypeMap;
    }
}

