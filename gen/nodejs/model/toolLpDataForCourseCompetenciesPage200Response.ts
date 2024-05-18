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
import { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner } from './toolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner';
import { ToolLpDataForCourseCompetenciesPage200ResponseSettings } from './toolLpDataForCourseCompetenciesPage200ResponseSettings';
import { ToolLpDataForCourseCompetenciesPage200ResponseStatistics } from './toolLpDataForCourseCompetenciesPage200ResponseStatistics';

export class ToolLpDataForCourseCompetenciesPage200Response {
    /**
    * User can configure course competency settings
    */
    'canconfigurecoursecompetencies': boolean = null;
    /**
    * User can grade competencies.
    */
    'cangradecompetencies': boolean = null;
    /**
    * User can manage competency frameworks
    */
    'canmanagecompetencyframeworks': boolean = null;
    /**
    * User can manage linked course competencies
    */
    'canmanagecoursecompetencies': boolean = null;
    'competencies': Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner>;
    /**
    * The current course id
    */
    'courseid': number = null;
    /**
    * Current user id, if the user is a gradable user.
    */
    'gradableuserid'?: number = null;
    /**
    * Url to the manage competencies page.
    */
    'manageurl': string = 'null';
    /**
    * The current page context ID.
    */
    'pagecontextid': number = null;
    /**
    * Url to the course competencies page.
    */
    'pluginbaseurl': string = 'null';
    'settings': ToolLpDataForCourseCompetenciesPage200ResponseSettings;
    'statistics': ToolLpDataForCourseCompetenciesPage200ResponseStatistics;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "canconfigurecoursecompetencies",
            "baseName": "canconfigurecoursecompetencies",
            "type": "boolean"
        },
        {
            "name": "cangradecompetencies",
            "baseName": "cangradecompetencies",
            "type": "boolean"
        },
        {
            "name": "canmanagecompetencyframeworks",
            "baseName": "canmanagecompetencyframeworks",
            "type": "boolean"
        },
        {
            "name": "canmanagecoursecompetencies",
            "baseName": "canmanagecoursecompetencies",
            "type": "boolean"
        },
        {
            "name": "competencies",
            "baseName": "competencies",
            "type": "Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner>"
        },
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "gradableuserid",
            "baseName": "gradableuserid",
            "type": "number"
        },
        {
            "name": "manageurl",
            "baseName": "manageurl",
            "type": "string"
        },
        {
            "name": "pagecontextid",
            "baseName": "pagecontextid",
            "type": "number"
        },
        {
            "name": "pluginbaseurl",
            "baseName": "pluginbaseurl",
            "type": "string"
        },
        {
            "name": "settings",
            "baseName": "settings",
            "type": "ToolLpDataForCourseCompetenciesPage200ResponseSettings"
        },
        {
            "name": "statistics",
            "baseName": "statistics",
            "type": "ToolLpDataForCourseCompetenciesPage200ResponseStatistics"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForCourseCompetenciesPage200Response.attributeTypeMap;
    }
}
