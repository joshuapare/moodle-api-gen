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
import type { CoreCompetencyGradeCompetency200ResponseActionuser } from './CoreCompetencyGradeCompetency200ResponseActionuser';
import {
    CoreCompetencyGradeCompetency200ResponseActionuserFromJSON,
    CoreCompetencyGradeCompetency200ResponseActionuserFromJSONTyped,
    CoreCompetencyGradeCompetency200ResponseActionuserToJSON,
} from './CoreCompetencyGradeCompetency200ResponseActionuser';
import type { ReportCompetencyDataForReport200ResponseUsercompetenciesInner } from './ReportCompetencyDataForReport200ResponseUsercompetenciesInner';
import {
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerFromJSON,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerFromJSONTyped,
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerToJSON,
} from './ReportCompetencyDataForReport200ResponseUsercompetenciesInner';

/**
 * 
 * @export
 * @interface ReportCompetencyDataForReport200Response
 */
export interface ReportCompetencyDataForReport200Response {
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse}
     * @memberof ReportCompetencyDataForReport200Response
     */
    Course: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse;
    /**
     * Course id
     * @type {number}
     * @memberof ReportCompetencyDataForReport200Response
     */
    Courseid: number;
    /**
     * True if rating is push to user plans
     * @type {boolean}
     * @memberof ReportCompetencyDataForReport200Response
     */
    Pushratingstouserplans: boolean;
    /**
     * 
     * @type {CoreCompetencyGradeCompetency200ResponseActionuser}
     * @memberof ReportCompetencyDataForReport200Response
     */
    User: CoreCompetencyGradeCompetency200ResponseActionuser;
    /**
     * 
     * @type {Array<ReportCompetencyDataForReport200ResponseUsercompetenciesInner>}
     * @memberof ReportCompetencyDataForReport200Response
     */
    Usercompetencies: Array<ReportCompetencyDataForReport200ResponseUsercompetenciesInner>;
}

/**
 * Check if a given object implements the ReportCompetencyDataForReport200Response interface.
 */
export function instanceOfReportCompetencyDataForReport200Response(value: object): boolean {
    if (!('Course' in value)) return false;
    if (!('Courseid' in value)) return false;
    if (!('Pushratingstouserplans' in value)) return false;
    if (!('User' in value)) return false;
    if (!('Usercompetencies' in value)) return false;
    return true;
}

export function ReportCompetencyDataForReport200ResponseFromJSON(json: any): ReportCompetencyDataForReport200Response {
    return ReportCompetencyDataForReport200ResponseFromJSONTyped(json, false);
}

export function ReportCompetencyDataForReport200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReportCompetencyDataForReport200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Course': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSON(json['course']),
        'Courseid': json['courseid'],
        'Pushratingstouserplans': json['pushratingstouserplans'],
        'User': CoreCompetencyGradeCompetency200ResponseActionuserFromJSON(json['user']),
        'Usercompetencies': ((json['usercompetencies'] as Array<any>).map(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerFromJSON)),
    };
}

export function ReportCompetencyDataForReport200ResponseToJSON(value?: ReportCompetencyDataForReport200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'course': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseToJSON(value['Course']),
        'courseid': value['Courseid'],
        'pushratingstouserplans': value['Pushratingstouserplans'],
        'user': CoreCompetencyGradeCompetency200ResponseActionuserToJSON(value['User']),
        'usercompetencies': ((value['Usercompetencies'] as Array<any>).map(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerToJSON)),
    };
}

