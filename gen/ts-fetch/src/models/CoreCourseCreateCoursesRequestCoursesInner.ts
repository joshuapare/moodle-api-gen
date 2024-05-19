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
import type { CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner } from './CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner';
import {
    CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSON,
    CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSONTyped,
    CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInnerToJSON,
} from './CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner';

/**
 * 
 * @export
 * @interface CoreCourseCreateCoursesRequestCoursesInner
 */
export interface CoreCourseCreateCoursesRequestCoursesInner {
    /**
     * category id
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Categoryid?: number;
    /**
     * 1: yes 0: no
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Completionnotify?: number;
    /**
     * 
     * @type {Array<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner>}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Courseformatoptions?: Array<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner>;
    /**
     * 
     * @type {Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Customfields?: Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>;
    /**
     * default grouping id
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Defaultgroupingid?: number;
    /**
     * Enabled, control via completion and activity settings. Disabled,
     *                                         not shown in activity settings.
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Enablecompletion?: number;
    /**
     * timestamp when the course end
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Enddate?: number;
    /**
     * name of the force theme
     * @type {string}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Forcetheme?: string;
    /**
     * course format: weeks, topics, social, site,..
     * @type {string}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Format?: string;
    /**
     * full name
     * @type {string}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Fullname?: string;
    /**
     * no group, separate, visible
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Groupmode?: number;
    /**
     * 1: yes, 0: no
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Groupmodeforce?: number;
    /**
     * (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Hiddensections?: number;
    /**
     * id number
     * @type {string}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Idnumber?: string;
    /**
     * forced course language
     * @type {string}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Lang?: string;
    /**
     * largest size of file that can be uploaded into the course
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Maxbytes?: number;
    /**
     * number of recent items appearing on the course page
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Newsitems?: number;
    /**
     * (deprecated, use courseformatoptions) number of weeks/topics
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Numsections?: number;
    /**
     * course short name
     * @type {string}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Shortname?: string;
    /**
     * 1 if grades are shown, otherwise 0
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Showgrades?: number;
    /**
     * are activity report shown (yes = 1, no =0)
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Showreports?: number;
    /**
     * timestamp when the course start
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Startdate?: number;
    /**
     * summary
     * @type {string}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Summary?: string;
    /**
     * summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Summaryformat?: number;
    /**
     * 1: available to student, 0:not available
     * @type {number}
     * @memberof CoreCourseCreateCoursesRequestCoursesInner
     */
    Visible?: number;
}

/**
 * Check if a given object implements the CoreCourseCreateCoursesRequestCoursesInner interface.
 */
export function instanceOfCoreCourseCreateCoursesRequestCoursesInner(value: object): boolean {
    return true;
}

export function CoreCourseCreateCoursesRequestCoursesInnerFromJSON(json: any): CoreCourseCreateCoursesRequestCoursesInner {
    return CoreCourseCreateCoursesRequestCoursesInnerFromJSONTyped(json, false);
}

export function CoreCourseCreateCoursesRequestCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseCreateCoursesRequestCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Categoryid': json['categoryid'] == null ? undefined : json['categoryid'],
        'Completionnotify': json['completionnotify'] == null ? undefined : json['completionnotify'],
        'Courseformatoptions': json['courseformatoptions'] == null ? undefined : ((json['courseformatoptions'] as Array<any>).map(CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInnerFromJSON)),
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

export function CoreCourseCreateCoursesRequestCoursesInnerToJSON(value?: CoreCourseCreateCoursesRequestCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'categoryid': value['Categoryid'],
        'completionnotify': value['Completionnotify'],
        'courseformatoptions': value['Courseformatoptions'] == null ? undefined : ((value['Courseformatoptions'] as Array<any>).map(CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInnerToJSON)),
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
