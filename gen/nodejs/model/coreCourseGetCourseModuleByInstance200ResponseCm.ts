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
import { CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner } from './coreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner';
import { CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner } from './coreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner';

export class CoreCourseGetCourseModuleByInstance200ResponseCm {
    /**
    * Time added
    */
    'added'?: number;
    'advancedgrading'?: Array<CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner>;
    /**
    * Availability settings
    */
    'availability'?: string;
    /**
    * If completion is enabled
    */
    'completion': number;
    /**
    * Completion time expected
    */
    'completionexpected'?: number;
    /**
    * Completion grade item
    */
    'completiongradeitemnumber'?: number;
    /**
    * Completion pass grade setting
    */
    'completionpassgrade'?: number;
    /**
    * Completion view setting
    */
    'completionview'?: number;
    /**
    * The course id
    */
    'course': number;
    /**
    * The download content value
    */
    'downloadcontent'?: number;
    /**
    * Grade (max value or scale id)
    */
    'grade'?: number;
    /**
    * Grade category
    */
    'gradecat'?: number;
    /**
    * Grade to pass (float)
    */
    'gradepass'?: string;
    /**
    * Grouping id
    */
    'groupingid': number;
    /**
    * Group mode
    */
    'groupmode': number;
    /**
    * The course module id
    */
    'id': number;
    /**
    * Module id number
    */
    'idnumber'?: string;
    /**
    * Indentation
    */
    'indent'?: number;
    /**
    * The activity instance id
    */
    'instance': number;
    /**
    * The module component name (forum, assign, etc..)
    */
    'modname': string;
    /**
    * The module type id
    */
    'module': number;
    /**
    * The activity name
    */
    'name': string;
    'outcomes'?: Array<CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner>;
    /**
    * Scale items (if used)
    */
    'scale'?: string;
    /**
    * Score
    */
    'score'?: number;
    /**
    * The module section id
    */
    'section': number;
    /**
    * The module section number
    */
    'sectionnum': number;
    /**
    * If the description is showed
    */
    'showdescription'?: number;
    /**
    * If visible
    */
    'visible'?: number;
    /**
    * Visible old
    */
    'visibleold'?: number;
    /**
    * If visible on course page
    */
    'visibleoncoursepage'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "added",
            "baseName": "added",
            "type": "number"
        },
        {
            "name": "advancedgrading",
            "baseName": "advancedgrading",
            "type": "Array<CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner>"
        },
        {
            "name": "availability",
            "baseName": "availability",
            "type": "string"
        },
        {
            "name": "completion",
            "baseName": "completion",
            "type": "number"
        },
        {
            "name": "completionexpected",
            "baseName": "completionexpected",
            "type": "number"
        },
        {
            "name": "completiongradeitemnumber",
            "baseName": "completiongradeitemnumber",
            "type": "number"
        },
        {
            "name": "completionpassgrade",
            "baseName": "completionpassgrade",
            "type": "number"
        },
        {
            "name": "completionview",
            "baseName": "completionview",
            "type": "number"
        },
        {
            "name": "course",
            "baseName": "course",
            "type": "number"
        },
        {
            "name": "downloadcontent",
            "baseName": "downloadcontent",
            "type": "number"
        },
        {
            "name": "grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "gradecat",
            "baseName": "gradecat",
            "type": "number"
        },
        {
            "name": "gradepass",
            "baseName": "gradepass",
            "type": "string"
        },
        {
            "name": "groupingid",
            "baseName": "groupingid",
            "type": "number"
        },
        {
            "name": "groupmode",
            "baseName": "groupmode",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "indent",
            "baseName": "indent",
            "type": "number"
        },
        {
            "name": "instance",
            "baseName": "instance",
            "type": "number"
        },
        {
            "name": "modname",
            "baseName": "modname",
            "type": "string"
        },
        {
            "name": "module",
            "baseName": "module",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "outcomes",
            "baseName": "outcomes",
            "type": "Array<CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner>"
        },
        {
            "name": "scale",
            "baseName": "scale",
            "type": "string"
        },
        {
            "name": "score",
            "baseName": "score",
            "type": "number"
        },
        {
            "name": "section",
            "baseName": "section",
            "type": "number"
        },
        {
            "name": "sectionnum",
            "baseName": "sectionnum",
            "type": "number"
        },
        {
            "name": "showdescription",
            "baseName": "showdescription",
            "type": "number"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "number"
        },
        {
            "name": "visibleold",
            "baseName": "visibleold",
            "type": "number"
        },
        {
            "name": "visibleoncoursepage",
            "baseName": "visibleoncoursepage",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseGetCourseModuleByInstance200ResponseCm.attributeTypeMap;
    }
}

