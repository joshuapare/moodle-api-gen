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
import type { CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner } from './CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner';
import {
    CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerFromJSON,
    CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerFromJSONTyped,
    CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerToJSON,
} from './CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner';
import type { CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner } from './CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner';
import {
    CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSON,
    CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSONTyped,
    CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerToJSON,
} from './CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner';

/**
 * 
 * @export
 * @interface CoreCourseUpdateCoursesRequestCoursesInner
 */
export interface CoreCourseUpdateCoursesRequestCoursesInner {
    /**
     * category id
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Categoryid?: number;
    /**
     * 1: yes 0: no
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Completionnotify?: number;
    /**
     * 
     * @type {Array<CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner>}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Courseformatoptions?: Array<CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner>;
    /**
     * 
     * @type {Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Customfields?: Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>;
    /**
     * default grouping id
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Defaultgroupingid?: number;
    /**
     * Enabled, control via completion and activity settings. Disabled,
     *                                         not shown in activity settings.
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Enablecompletion?: number;
    /**
     * timestamp when the course end
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Enddate?: number;
    /**
     * name of the force theme
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Forcetheme?: string;
    /**
     * course format: weeks, topics, social, site,..
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Format?: string;
    /**
     * full name
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Fullname?: string;
    /**
     * no group, separate, visible
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Groupmode?: number;
    /**
     * 1: yes, 0: no
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Groupmodeforce?: number;
    /**
     * (deprecated, use courseformatoptions) How the hidden sections in the course are
     *                                         displayed to students
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Hiddensections?: number;
    /**
     * ID of the course
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Id?: number;
    /**
     * id number
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Idnumber?: string;
    /**
     * forced course language
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Lang?: string;
    /**
     * largest size of file that can be uploaded into the course
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Maxbytes?: number;
    /**
     * number of recent items appearing on the course page
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Newsitems?: number;
    /**
     * (deprecated, use courseformatoptions) number of weeks/topics
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Numsections?: number;
    /**
     * course short name
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Shortname?: string;
    /**
     * 1 if grades are shown, otherwise 0
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Showgrades?: number;
    /**
     * are activity report shown (yes = 1, no =0)
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Showreports?: number;
    /**
     * timestamp when the course start
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Startdate?: number;
    /**
     * summary
     * @type {string}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Summary?: string;
    /**
     * summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Summaryformat?: number;
    /**
     * 1: available to student, 0:not available
     * @type {number}
     * @memberof CoreCourseUpdateCoursesRequestCoursesInner
     */
    Visible?: number;
}

/**
 * Check if a given object implements the CoreCourseUpdateCoursesRequestCoursesInner interface.
 */
export function instanceOfCoreCourseUpdateCoursesRequestCoursesInner(value: object): boolean {
    return true;
}

export function CoreCourseUpdateCoursesRequestCoursesInnerFromJSON(json: any): CoreCourseUpdateCoursesRequestCoursesInner {
    return CoreCourseUpdateCoursesRequestCoursesInnerFromJSONTyped(json, false);
}

export function CoreCourseUpdateCoursesRequestCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseUpdateCoursesRequestCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Categoryid': json['categoryid'] == null ? undefined : json['categoryid'],
        'Completionnotify': json['completionnotify'] == null ? undefined : json['completionnotify'],
        'Courseformatoptions': json['courseformatoptions'] == null ? undefined : ((json['courseformatoptions'] as Array<any>).map(CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSON)),
        'Customfields': json['customfields'] == null ? undefined : ((json['customfields'] as Array<any>).map(CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerFromJSON)),
        'Defaultgroupingid': json['defaultgroupingid'] == null ? undefined : json['defaultgroupingid'],
        'Enablecompletion': json['enablecompletion'] == null ? undefined : json['enablecompletion'],
        'Enddate': json['enddate'] == null ? undefined : json['enddate'],
        'Forcetheme': json['forcetheme'] == null ? undefined : json['forcetheme'],
        'Format': json['format'] == null ? undefined : json['format'],
        'Fullname': json['fullname'] == null ? undefined : json['fullname'],
        'Groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'Groupmodeforce': json['groupmodeforce'] == null ? undefined : json['groupmodeforce'],
        'Hiddensections': json['hiddensections'] == null ? undefined : json['hiddensections'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Idnumber': json['idnumber'] == null ? undefined : json['idnumber'],
        'Lang': json['lang'] == null ? undefined : json['lang'],
        'Maxbytes': json['maxbytes'] == null ? undefined : json['maxbytes'],
        'Newsitems': json['newsitems'] == null ? undefined : json['newsitems'],
        'Numsections': json['numsections'] == null ? undefined : json['numsections'],
        'Shortname': json['shortname'] == null ? undefined : json['shortname'],
        'Showgrades': json['showgrades'] == null ? undefined : json['showgrades'],
        'Showreports': json['showreports'] == null ? undefined : json['showreports'],
        'Startdate': json['startdate'] == null ? undefined : json['startdate'],
        'Summary': json['summary'] == null ? undefined : json['summary'],
        'Summaryformat': json['summaryformat'] == null ? undefined : json['summaryformat'],
        'Visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function CoreCourseUpdateCoursesRequestCoursesInnerToJSON(value?: CoreCourseUpdateCoursesRequestCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'categoryid': value['Categoryid'],
        'completionnotify': value['Completionnotify'],
        'courseformatoptions': value['Courseformatoptions'] == null ? undefined : ((value['Courseformatoptions'] as Array<any>).map(CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInnerToJSON)),
        'customfields': value['Customfields'] == null ? undefined : ((value['Customfields'] as Array<any>).map(CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInnerToJSON)),
        'defaultgroupingid': value['Defaultgroupingid'],
        'enablecompletion': value['Enablecompletion'],
        'enddate': value['Enddate'],
        'forcetheme': value['Forcetheme'],
        'format': value['Format'],
        'fullname': value['Fullname'],
        'groupmode': value['Groupmode'],
        'groupmodeforce': value['Groupmodeforce'],
        'hiddensections': value['Hiddensections'],
        'id': value['Id'],
        'idnumber': value['Idnumber'],
        'lang': value['Lang'],
        'maxbytes': value['Maxbytes'],
        'newsitems': value['Newsitems'],
        'numsections': value['Numsections'],
        'shortname': value['Shortname'],
        'showgrades': value['Showgrades'],
        'showreports': value['Showreports'],
        'startdate': value['Startdate'],
        'summary': value['Summary'],
        'summaryformat': value['Summaryformat'],
        'visible': value['Visible'],
    };
}

