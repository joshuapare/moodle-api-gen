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
import { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse } from './coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse';
import { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner } from './toolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner';
import { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner } from './toolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner';
import { ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary } from './toolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary';

export class ToolLpDataForUserCompetencySummaryInCourse200Response {
    'course': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse;
    'coursemodules': Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner>;
    'plans': Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>;
    /**
    * pluginbaseurl
    */
    'pluginbaseurl': string;
    'usercompetencysummary': ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "course",
            "baseName": "course",
            "type": "CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse"
        },
        {
            "name": "coursemodules",
            "baseName": "coursemodules",
            "type": "Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner>"
        },
        {
            "name": "plans",
            "baseName": "plans",
            "type": "Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>"
        },
        {
            "name": "pluginbaseurl",
            "baseName": "pluginbaseurl",
            "type": "string"
        },
        {
            "name": "usercompetencysummary",
            "baseName": "usercompetencysummary",
            "type": "ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForUserCompetencySummaryInCourse200Response.attributeTypeMap;
    }
}
