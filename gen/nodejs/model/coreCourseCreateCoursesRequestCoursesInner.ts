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
import { CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner } from './coreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner';
import { CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner } from './coreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner';

export class CoreCourseCreateCoursesRequestCoursesInner {
    /**
    * category id
    */
    'categoryid'?: number = null;
    /**
    * 1: yes 0: no
    */
    'completionnotify'?: number = null;
    'courseformatoptions'?: Array<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner>;
    'customfields'?: Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>;
    /**
    * default grouping id
    */
    'defaultgroupingid'?: number = 0;
    /**
    * Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings.
    */
    'enablecompletion'?: number = null;
    /**
    * timestamp when the course end
    */
    'enddate'?: number = null;
    /**
    * name of the force theme
    */
    'forcetheme'?: string = 'null';
    /**
    * course format: weeks, topics, social, site,..
    */
    'format'?: string = 'topics';
    /**
    * full name
    */
    'fullname'?: string = 'null';
    /**
    * no group, separate, visible
    */
    'groupmode'?: number = 0;
    /**
    * 1: yes, 0: no
    */
    'groupmodeforce'?: number = 0;
    /**
    * (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students
    */
    'hiddensections'?: number = null;
    /**
    * id number
    */
    'idnumber'?: string = 'null';
    /**
    * forced course language
    */
    'lang'?: string = 'null';
    /**
    * largest size of file that can be uploaded into the course
    */
    'maxbytes'?: number = 0;
    /**
    * number of recent items appearing on the course page
    */
    'newsitems'?: number = 5;
    /**
    * (deprecated, use courseformatoptions) number of weeks/topics
    */
    'numsections'?: number = null;
    /**
    * course short name
    */
    'shortname'?: string = 'null';
    /**
    * 1 if grades are shown, otherwise 0
    */
    'showgrades'?: number = 1;
    /**
    * are activity report shown (yes = 1, no =0)
    */
    'showreports'?: number = 0;
    /**
    * timestamp when the course start
    */
    'startdate'?: number = null;
    /**
    * summary
    */
    'summary'?: string;
    /**
    * summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'summaryformat'?: number = 1;
    /**
    * 1: available to student, 0:not available
    */
    'visible'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "categoryid",
            "baseName": "categoryid",
            "type": "number"
        },
        {
            "name": "completionnotify",
            "baseName": "completionnotify",
            "type": "number"
        },
        {
            "name": "courseformatoptions",
            "baseName": "courseformatoptions",
            "type": "Array<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner>"
        },
        {
            "name": "customfields",
            "baseName": "customfields",
            "type": "Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>"
        },
        {
            "name": "defaultgroupingid",
            "baseName": "defaultgroupingid",
            "type": "number"
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
            "name": "forcetheme",
            "baseName": "forcetheme",
            "type": "string"
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
            "name": "hiddensections",
            "baseName": "hiddensections",
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
            "name": "numsections",
            "baseName": "numsections",
            "type": "number"
        },
        {
            "name": "shortname",
            "baseName": "shortname",
            "type": "string"
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
            "name": "summaryformat",
            "baseName": "summaryformat",
            "type": "number"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseCreateCoursesRequestCoursesInner.attributeTypeMap;
    }
}

