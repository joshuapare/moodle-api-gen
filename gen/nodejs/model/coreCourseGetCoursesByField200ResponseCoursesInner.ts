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
import { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './coreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import { CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner } from './coreCourseGetCoursesByField200ResponseCoursesInnerContactsInner';
import { CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner } from './coreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner';
import { CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner } from './coreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner';
import { CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner } from './coreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner';

export class CoreCourseGetCoursesByField200ResponseCoursesInner {
    /**
    * Cache revision number
    */
    'cacherev'?: number = null;
    /**
    * Calendar type
    */
    'calendartype'?: string = 'null';
    /**
    * category id
    */
    'categoryid'?: number;
    /**
    * category name
    */
    'categoryname'?: string = 'null';
    /**
    * 1: yes 0: no
    */
    'completionnotify'?: number;
    'contacts'?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner>;
    'courseformatoptions'?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner>;
    /**
    * Course image
    */
    'courseimage'?: string = 'null';
    'customfields'?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner>;
    /**
    * default grouping id
    */
    'defaultgroupingid'?: number = null;
    /**
    * course display name
    */
    'displayname'?: string = 'null';
    /**
    * Completion enabled? 1: yes 0: no
    */
    'enablecompletion'?: number = null;
    /**
    * Timestamp when the course end
    */
    'enddate'?: number = null;
    'enrollmentmethods'?: Array<object>;
    'filters'?: Array<CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner>;
    /**
    * Course format: weeks, topics, social, site,..
    */
    'format'?: string = 'null';
    /**
    * course full name
    */
    'fullname'?: string = 'null';
    /**
    * no group, separate, visible
    */
    'groupmode'?: number = null;
    /**
    * 1: yes, 0: no
    */
    'groupmodeforce'?: number = null;
    /**
    * course id
    */
    'id'?: number;
    /**
    * Id number
    */
    'idnumber'?: string = 'null';
    /**
    * Forced course language
    */
    'lang'?: string = 'null';
    /**
    * If legacy files are enabled
    */
    'legacyfiles'?: number = null;
    /**
    * Current course marker
    */
    'marker'?: number = null;
    /**
    * Largest size of file that can be uploaded into
    */
    'maxbytes'?: number = null;
    /**
    * Number of recent items appearing on the course page
    */
    'newsitems'?: number = null;
    'overviewfiles'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * If is a requested course
    */
    'requested'?: number = null;
    /**
    * course short name
    */
    'shortname'?: string;
    /**
    * Whether the activity dates are shown or not
    */
    'showactivitydates'?: boolean = null;
    /**
    * Whether the activity completion conditions are shown or not
    */
    'showcompletionconditions'?: boolean = null;
    /**
    * 1 if grades are shown, otherwise 0
    */
    'showgrades'?: number = null;
    /**
    * Are activity report shown (yes = 1, no =0)
    */
    'showreports'?: number = null;
    /**
    * Sort order in the category
    */
    'sortorder'?: number = null;
    /**
    * Timestamp when the course start
    */
    'startdate'?: number = null;
    /**
    * summary
    */
    'summary'?: string;
    'summaryfiles'?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
    * summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'summaryformat'?: number;
    /**
    * Fame of the forced theme
    */
    'theme'?: string = 'null';
    /**
    * Time when the course was created
    */
    'timecreated'?: number = null;
    /**
    * Last time  the course was updated
    */
    'timemodified'?: number = null;
    /**
    * 1: available to student, 0:not available
    */
    'visible'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cacherev",
            "baseName": "cacherev",
            "type": "number"
        },
        {
            "name": "calendartype",
            "baseName": "calendartype",
            "type": "string"
        },
        {
            "name": "categoryid",
            "baseName": "categoryid",
            "type": "number"
        },
        {
            "name": "categoryname",
            "baseName": "categoryname",
            "type": "string"
        },
        {
            "name": "completionnotify",
            "baseName": "completionnotify",
            "type": "number"
        },
        {
            "name": "contacts",
            "baseName": "contacts",
            "type": "Array<CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner>"
        },
        {
            "name": "courseformatoptions",
            "baseName": "courseformatoptions",
            "type": "Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner>"
        },
        {
            "name": "courseimage",
            "baseName": "courseimage",
            "type": "string"
        },
        {
            "name": "customfields",
            "baseName": "customfields",
            "type": "Array<CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner>"
        },
        {
            "name": "defaultgroupingid",
            "baseName": "defaultgroupingid",
            "type": "number"
        },
        {
            "name": "displayname",
            "baseName": "displayname",
            "type": "string"
        },
        {
            "name": "enablecompletion",
            "baseName": "enablecompletion",
            "type": "number"
        },
        {
            "name": "enddate",
            "baseName": "enddate",
            "type": "number"
        },
        {
            "name": "enrollmentmethods",
            "baseName": "enrollmentmethods",
            "type": "Array<object>"
        },
        {
            "name": "filters",
            "baseName": "filters",
            "type": "Array<CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner>"
        },
        {
            "name": "format",
            "baseName": "format",
            "type": "string"
        },
        {
            "name": "fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "groupmode",
            "baseName": "groupmode",
            "type": "number"
        },
        {
            "name": "groupmodeforce",
            "baseName": "groupmodeforce",
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
            "name": "lang",
            "baseName": "lang",
            "type": "string"
        },
        {
            "name": "legacyfiles",
            "baseName": "legacyfiles",
            "type": "number"
        },
        {
            "name": "marker",
            "baseName": "marker",
            "type": "number"
        },
        {
            "name": "maxbytes",
            "baseName": "maxbytes",
            "type": "number"
        },
        {
            "name": "newsitems",
            "baseName": "newsitems",
            "type": "number"
        },
        {
            "name": "overviewfiles",
            "baseName": "overviewfiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "requested",
            "baseName": "requested",
            "type": "number"
        },
        {
            "name": "shortname",
            "baseName": "shortname",
            "type": "string"
        },
        {
            "name": "showactivitydates",
            "baseName": "showactivitydates",
            "type": "boolean"
        },
        {
            "name": "showcompletionconditions",
            "baseName": "showcompletionconditions",
            "type": "boolean"
        },
        {
            "name": "showgrades",
            "baseName": "showgrades",
            "type": "number"
        },
        {
            "name": "showreports",
            "baseName": "showreports",
            "type": "number"
        },
        {
            "name": "sortorder",
            "baseName": "sortorder",
            "type": "number"
        },
        {
            "name": "startdate",
            "baseName": "startdate",
            "type": "number"
        },
        {
            "name": "summary",
            "baseName": "summary",
            "type": "string"
        },
        {
            "name": "summaryfiles",
            "baseName": "summaryfiles",
            "type": "Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>"
        },
        {
            "name": "summaryformat",
            "baseName": "summaryformat",
            "type": "number"
        },
        {
            "name": "theme",
            "baseName": "theme",
            "type": "string"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseGetCoursesByField200ResponseCoursesInner.attributeTypeMap;
    }
}

