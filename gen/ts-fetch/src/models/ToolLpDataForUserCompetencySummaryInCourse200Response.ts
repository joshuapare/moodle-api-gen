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
import type { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse } from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse';
import {
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSON,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSONTyped,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseToJSON,
} from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse';
import type { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner } from './ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner';
import {
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerFromJSON,
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerFromJSONTyped,
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerToJSON,
} from './ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner';
import type { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner } from './ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner';
import {
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerFromJSON,
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerFromJSONTyped,
    ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerToJSON,
} from './ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner';
import type { ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary } from './ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary';
import {
    ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummaryFromJSON,
    ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummaryFromJSONTyped,
    ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummaryToJSON,
} from './ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary';

/**
 * 
 * @export
 * @interface ToolLpDataForUserCompetencySummaryInCourse200Response
 */
export interface ToolLpDataForUserCompetencySummaryInCourse200Response {
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse}
     * @memberof ToolLpDataForUserCompetencySummaryInCourse200Response
     */
    Course: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse;
    /**
     * 
     * @type {Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner>}
     * @memberof ToolLpDataForUserCompetencySummaryInCourse200Response
     */
    Coursemodules: Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner>;
    /**
     * 
     * @type {Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>}
     * @memberof ToolLpDataForUserCompetencySummaryInCourse200Response
     */
    Plans: Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>;
    /**
     * pluginbaseurl
     * @type {string}
     * @memberof ToolLpDataForUserCompetencySummaryInCourse200Response
     */
    Pluginbaseurl: string;
    /**
     * 
     * @type {ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary}
     * @memberof ToolLpDataForUserCompetencySummaryInCourse200Response
     */
    Usercompetencysummary: ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary;
}

/**
 * Check if a given object implements the ToolLpDataForUserCompetencySummaryInCourse200Response interface.
 */
export function instanceOfToolLpDataForUserCompetencySummaryInCourse200Response(value: object): boolean {
    if (!('Course' in value)) return false;
    if (!('Coursemodules' in value)) return false;
    if (!('Plans' in value)) return false;
    if (!('Pluginbaseurl' in value)) return false;
    if (!('Usercompetencysummary' in value)) return false;
    return true;
}

export function ToolLpDataForUserCompetencySummaryInCourse200ResponseFromJSON(json: any): ToolLpDataForUserCompetencySummaryInCourse200Response {
    return ToolLpDataForUserCompetencySummaryInCourse200ResponseFromJSONTyped(json, false);
}

export function ToolLpDataForUserCompetencySummaryInCourse200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForUserCompetencySummaryInCourse200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Course': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSON(json['course']),
        'Coursemodules': ((json['coursemodules'] as Array<any>).map(ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerFromJSON)),
        'Plans': ((json['plans'] as Array<any>).map(ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerFromJSON)),
        'Pluginbaseurl': json['pluginbaseurl'],
        'Usercompetencysummary': ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummaryFromJSON(json['usercompetencysummary']),
    };
}

export function ToolLpDataForUserCompetencySummaryInCourse200ResponseToJSON(value?: ToolLpDataForUserCompetencySummaryInCourse200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'course': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseToJSON(value['Course']),
        'coursemodules': ((value['Coursemodules'] as Array<any>).map(ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInnerToJSON)),
        'plans': ((value['Plans'] as Array<any>).map(ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInnerToJSON)),
        'pluginbaseurl': value['Pluginbaseurl'],
        'usercompetencysummary': ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummaryToJSON(value['Usercompetencysummary']),
    };
}

