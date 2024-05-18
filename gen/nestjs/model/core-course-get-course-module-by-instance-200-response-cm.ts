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
import { CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner } from './core-course-get-course-module-by-instance200-response-cm-advancedgrading-inner';
import { CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner } from './core-course-get-course-module-by-instance200-response-cm-outcomes-inner';


export interface CoreCourseGetCourseModuleByInstance200ResponseCm { 
    /**
     * Time added
     */
    Added?: number;
    Advancedgrading?: Array<CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner>;
    /**
     * Availability settings
     */
    Availability?: string;
    /**
     * If completion is enabled
     */
    Completion: number;
    /**
     * Completion time expected
     */
    Completionexpected?: number;
    /**
     * Completion grade item
     */
    Completiongradeitemnumber?: number;
    /**
     * Completion pass grade setting
     */
    Completionpassgrade?: number;
    /**
     * Completion view setting
     */
    Completionview?: number;
    /**
     * The course id
     */
    Course: number;
    /**
     * The download content value
     */
    Downloadcontent?: number;
    /**
     * Grade (max value or scale id)
     */
    Grade?: number;
    /**
     * Grade category
     */
    Gradecat?: number;
    /**
     * Grade to pass (float)
     */
    Gradepass?: string;
    /**
     * Grouping id
     */
    Groupingid: number;
    /**
     * Group mode
     */
    Groupmode: number;
    /**
     * The course module id
     */
    Id: number;
    /**
     * Module id number
     */
    Idnumber?: string;
    /**
     * Indentation
     */
    Indent?: number;
    /**
     * The activity instance id
     */
    Instance: number;
    /**
     * The module component name (forum, assign, etc..)
     */
    Modname: string;
    /**
     * The module type id
     */
    Module: number;
    /**
     * The activity name
     */
    Name: string;
    Outcomes?: Array<CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner>;
    /**
     * Scale items (if used)
     */
    Scale?: string;
    /**
     * Score
     */
    Score?: number;
    /**
     * The module section id
     */
    Section: number;
    /**
     * The module section number
     */
    Sectionnum: number;
    /**
     * If the description is showed
     */
    Showdescription?: number;
    /**
     * If visible
     */
    Visible?: number;
    /**
     * Visible old
     */
    Visibleold?: number;
    /**
     * If visible on course page
     */
    Visibleoncoursepage?: number;
}

