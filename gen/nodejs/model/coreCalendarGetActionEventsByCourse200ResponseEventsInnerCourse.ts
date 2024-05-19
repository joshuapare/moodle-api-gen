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

export class CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse {
    /**
    * coursecategory
    */
    'Coursecategory': string = 'null';
    /**
    * courseimage
    */
    'Courseimage': string = 'null';
    /**
    * enddate
    */
    'Enddate': number = null;
    /**
    * fullname
    */
    'Fullname': string = 'null';
    /**
    * fullnamedisplay
    */
    'Fullnamedisplay': string = 'null';
    /**
    * hasprogress
    */
    'Hasprogress': boolean = null;
    /**
    * hidden
    */
    'Hidden': boolean = null;
    /**
    * id
    */
    'Id': number;
    /**
    * idnumber
    */
    'Idnumber': string = 'null';
    /**
    * isfavourite
    */
    'Isfavourite': boolean = null;
    /**
    * pdfexportfont
    */
    'Pdfexportfont': string = 'null';
    /**
    * progress
    */
    'Progress'?: number = null;
    /**
    * shortname
    */
    'Shortname': string = 'null';
    /**
    * showactivitydates
    */
    'Showactivitydates': boolean = null;
    /**
    * showcompletionconditions
    */
    'Showcompletionconditions': boolean = null;
    /**
    * showshortname
    */
    'Showshortname': boolean = null;
    /**
    * startdate
    */
    'Startdate': number = null;
    /**
    * summary
    */
    'Summary': string = 'null';
    /**
    * summary format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Summaryformat': number = null;
    /**
    * timeaccess
    */
    'Timeaccess'?: number = null;
    /**
    * viewurl
    */
    'Viewurl': string = 'null';
    /**
    * visible
    */
    'Visible': boolean = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Coursecategory",
            "baseName": "coursecategory",
            "type": "string"
        },
        {
            "name": "Courseimage",
            "baseName": "courseimage",
            "type": "string"
        },
        {
            "name": "Enddate",
            "baseName": "enddate",
            "type": "number"
        },
        {
            "name": "Fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "Fullnamedisplay",
            "baseName": "fullnamedisplay",
            "type": "string"
        },
        {
            "name": "Hasprogress",
            "baseName": "hasprogress",
            "type": "boolean"
        },
        {
            "name": "Hidden",
            "baseName": "hidden",
            "type": "boolean"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "Isfavourite",
            "baseName": "isfavourite",
            "type": "boolean"
        },
        {
            "name": "Pdfexportfont",
            "baseName": "pdfexportfont",
            "type": "string"
        },
        {
            "name": "Progress",
            "baseName": "progress",
            "type": "number"
        },
        {
            "name": "Shortname",
            "baseName": "shortname",
            "type": "string"
        },
        {
            "name": "Showactivitydates",
            "baseName": "showactivitydates",
            "type": "boolean"
        },
        {
            "name": "Showcompletionconditions",
            "baseName": "showcompletionconditions",
            "type": "boolean"
        },
        {
            "name": "Showshortname",
            "baseName": "showshortname",
            "type": "boolean"
        },
        {
            "name": "Startdate",
            "baseName": "startdate",
            "type": "number"
        },
        {
            "name": "Summary",
            "baseName": "summary",
            "type": "string"
        },
        {
            "name": "Summaryformat",
            "baseName": "summaryformat",
            "type": "number"
        },
        {
            "name": "Timeaccess",
            "baseName": "timeaccess",
            "type": "number"
        },
        {
            "name": "Viewurl",
            "baseName": "viewurl",
            "type": "string"
        },
        {
            "name": "Visible",
            "baseName": "visible",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.attributeTypeMap;
    }
}

