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
import type { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import {
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON,
} from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import type { CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner } from './CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner';
import {
    CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInnerFromJSON,
    CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInnerFromJSONTyped,
    CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInnerToJSON,
} from './CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner';
import type { CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner } from './CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner';
import {
    CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInnerFromJSON,
    CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInnerFromJSONTyped,
    CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInnerToJSON,
} from './CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner';
import type { CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner } from './CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner';
import {
    CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerFromJSON,
    CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerFromJSONTyped,
    CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerToJSON,
} from './CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner';
import type { CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner } from './CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner';
import {
    CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerFromJSON,
    CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerFromJSONTyped,
    CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerToJSON,
} from './CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner';

/**
 * 
 * @export
 * @interface CoreCourseGetCoursesByField200ResponseCoursesInner
 */
export interface CoreCourseGetCoursesByField200ResponseCoursesInner {
    /**
     * Cache revision number
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    cacherev?: number;
    /**
     * Calendar type
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    calendartype?: string;
    /**
     * category id
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    categoryid?: number;
    /**
     * category name
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    categoryname?: string;
    /**
     * 1: yes 0: no
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    completionnotify?: number;
    /**
     * 
     * @type {Array<CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner>}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    contacts?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner>;
    /**
     * 
     * @type {Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner>}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    courseformatoptions?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner>;
    /**
     * Course image
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    courseimage?: string;
    /**
     * 
     * @type {Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner>}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    customfields?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner>;
    /**
     * default grouping id
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    defaultgroupingid?: number;
    /**
     * course display name
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    displayname?: string;
    /**
     * Completion enabled? 1: yes 0: no
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    enablecompletion?: number;
    /**
     * Timestamp when the course end
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    enddate?: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    enrollmentmethods?: Array<object>;
    /**
     * 
     * @type {Array<CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner>}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    filters?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner>;
    /**
     * Course format: weeks, topics, social, site,..
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    format?: string;
    /**
     * course full name
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    fullname?: string;
    /**
     * no group, separate, visible
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    groupmode?: number;
    /**
     * 1: yes, 0: no
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    groupmodeforce?: number;
    /**
     * course id
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    id?: number;
    /**
     * Id number
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    idnumber?: string;
    /**
     * Forced course language
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    lang?: string;
    /**
     * If legacy files are enabled
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    legacyfiles?: number;
    /**
     * Current course marker
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    marker?: number;
    /**
     * Largest size of file that can be uploaded into
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    maxbytes?: number;
    /**
     * Number of recent items appearing on the course page
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    newsitems?: number;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    overviewfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * If is a requested course
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    requested?: number;
    /**
     * course short name
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    shortname?: string;
    /**
     * Whether the activity dates are shown or not
     * @type {boolean}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    showactivitydates?: boolean;
    /**
     * Whether the activity completion conditions are shown or not
     * @type {boolean}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    showcompletionconditions?: boolean;
    /**
     * 1 if grades are shown, otherwise 0
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    showgrades?: number;
    /**
     * Are activity report shown (yes = 1, no =0)
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    showreports?: number;
    /**
     * Sort order in the category
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    sortorder?: number;
    /**
     * Timestamp when the course start
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    startdate?: number;
    /**
     * summary
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    summary?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    summaryfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    summaryformat?: number;
    /**
     * Fame of the forced theme
     * @type {string}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    theme?: string;
    /**
     * Time when the course was created
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    timecreated?: number;
    /**
     * Last time  the course was updated
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    timemodified?: number;
    /**
     * 1: available to student, 0:not available
     * @type {number}
     * @memberof CoreCourseGetCoursesByField200ResponseCoursesInner
     */
    visible?: number;
}

/**
 * Check if a given object implements the CoreCourseGetCoursesByField200ResponseCoursesInner interface.
 */
export function instanceOfCoreCourseGetCoursesByField200ResponseCoursesInner(value: object): boolean {
    return true;
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerFromJSON(json: any): CoreCourseGetCoursesByField200ResponseCoursesInner {
    return CoreCourseGetCoursesByField200ResponseCoursesInnerFromJSONTyped(json, false);
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetCoursesByField200ResponseCoursesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'cacherev': json['cacherev'] == null ? undefined : json['cacherev'],
        'calendartype': json['calendartype'] == null ? undefined : json['calendartype'],
        'categoryid': json['categoryid'] == null ? undefined : json['categoryid'],
        'categoryname': json['categoryname'] == null ? undefined : json['categoryname'],
        'completionnotify': json['completionnotify'] == null ? undefined : json['completionnotify'],
        'contacts': json['contacts'] == null ? undefined : ((json['contacts'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInnerFromJSON)),
        'courseformatoptions': json['courseformatoptions'] == null ? undefined : ((json['courseformatoptions'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInnerFromJSON)),
        'courseimage': json['courseimage'] == null ? undefined : json['courseimage'],
        'customfields': json['customfields'] == null ? undefined : ((json['customfields'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerFromJSON)),
        'defaultgroupingid': json['defaultgroupingid'] == null ? undefined : json['defaultgroupingid'],
        'displayname': json['displayname'] == null ? undefined : json['displayname'],
        'enablecompletion': json['enablecompletion'] == null ? undefined : json['enablecompletion'],
        'enddate': json['enddate'] == null ? undefined : json['enddate'],
        'enrollmentmethods': json['enrollmentmethods'] == null ? undefined : json['enrollmentmethods'],
        'filters': json['filters'] == null ? undefined : ((json['filters'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerFromJSON)),
        'format': json['format'] == null ? undefined : json['format'],
        'fullname': json['fullname'] == null ? undefined : json['fullname'],
        'groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'groupmodeforce': json['groupmodeforce'] == null ? undefined : json['groupmodeforce'],
        'id': json['id'] == null ? undefined : json['id'],
        'idnumber': json['idnumber'] == null ? undefined : json['idnumber'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'legacyfiles': json['legacyfiles'] == null ? undefined : json['legacyfiles'],
        'marker': json['marker'] == null ? undefined : json['marker'],
        'maxbytes': json['maxbytes'] == null ? undefined : json['maxbytes'],
        'newsitems': json['newsitems'] == null ? undefined : json['newsitems'],
        'overviewfiles': json['overviewfiles'] == null ? undefined : ((json['overviewfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'requested': json['requested'] == null ? undefined : json['requested'],
        'shortname': json['shortname'] == null ? undefined : json['shortname'],
        'showactivitydates': json['showactivitydates'] == null ? undefined : json['showactivitydates'],
        'showcompletionconditions': json['showcompletionconditions'] == null ? undefined : json['showcompletionconditions'],
        'showgrades': json['showgrades'] == null ? undefined : json['showgrades'],
        'showreports': json['showreports'] == null ? undefined : json['showreports'],
        'sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
        'startdate': json['startdate'] == null ? undefined : json['startdate'],
        'summary': json['summary'] == null ? undefined : json['summary'],
        'summaryfiles': json['summaryfiles'] == null ? undefined : ((json['summaryfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'summaryformat': json['summaryformat'] == null ? undefined : json['summaryformat'],
        'theme': json['theme'] == null ? undefined : json['theme'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function CoreCourseGetCoursesByField200ResponseCoursesInnerToJSON(value?: CoreCourseGetCoursesByField200ResponseCoursesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cacherev': value['cacherev'],
        'calendartype': value['calendartype'],
        'categoryid': value['categoryid'],
        'categoryname': value['categoryname'],
        'completionnotify': value['completionnotify'],
        'contacts': value['contacts'] == null ? undefined : ((value['contacts'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInnerToJSON)),
        'courseformatoptions': value['courseformatoptions'] == null ? undefined : ((value['courseformatoptions'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInnerToJSON)),
        'courseimage': value['courseimage'],
        'customfields': value['customfields'] == null ? undefined : ((value['customfields'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInnerToJSON)),
        'defaultgroupingid': value['defaultgroupingid'],
        'displayname': value['displayname'],
        'enablecompletion': value['enablecompletion'],
        'enddate': value['enddate'],
        'enrollmentmethods': value['enrollmentmethods'],
        'filters': value['filters'] == null ? undefined : ((value['filters'] as Array<any>).map(CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInnerToJSON)),
        'format': value['format'],
        'fullname': value['fullname'],
        'groupmode': value['groupmode'],
        'groupmodeforce': value['groupmodeforce'],
        'id': value['id'],
        'idnumber': value['idnumber'],
        'lang': value['lang'],
        'legacyfiles': value['legacyfiles'],
        'marker': value['marker'],
        'maxbytes': value['maxbytes'],
        'newsitems': value['newsitems'],
        'overviewfiles': value['overviewfiles'] == null ? undefined : ((value['overviewfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'requested': value['requested'],
        'shortname': value['shortname'],
        'showactivitydates': value['showactivitydates'],
        'showcompletionconditions': value['showcompletionconditions'],
        'showgrades': value['showgrades'],
        'showreports': value['showreports'],
        'sortorder': value['sortorder'],
        'startdate': value['startdate'],
        'summary': value['summary'],
        'summaryfiles': value['summaryfiles'] == null ? undefined : ((value['summaryfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'summaryformat': value['summaryformat'],
        'theme': value['theme'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'visible': value['visible'],
    };
}
