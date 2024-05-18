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
import { CoreCalendarGetCalendarDayView200ResponseNextperiod } from './coreCalendarGetCalendarDayView200ResponseNextperiod';
import { CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner } from './coreCalendarGetCalendarMonthlyView200ResponseDaynamesInner';
import { CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner } from './coreCalendarGetCalendarMonthlyView200ResponseWeeksInner';

export class CoreCalendarGetCalendarMonthlyView200Response {
    /**
    * calendarinstanceid
    */
    'calendarinstanceid': number = 0;
    /**
    * categoryid
    */
    'categoryid'?: number = 0;
    /**
    * courseid
    */
    'courseid': number;
    'date': CoreCalendarGetCalendarDayView200ResponseNextperiod;
    'daynames': Array<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner>;
    /**
    * defaulteventcontext
    */
    'defaulteventcontext': number = 0;
    /**
    * filter_selector
    */
    'filterSelector'?: string;
    /**
    * includenavigation
    */
    'includenavigation': boolean = true;
    /**
    * initialeventsloaded
    */
    'initialeventsloaded': boolean = true;
    /**
    * larrow
    */
    'larrow': string;
    'nextperiod': CoreCalendarGetCalendarDayView200ResponseNextperiod;
    /**
    * nextperiodlink
    */
    'nextperiodlink': string;
    /**
    * nextperiodname
    */
    'nextperiodname': string;
    /**
    * periodname
    */
    'periodname': string;
    'previousperiod': CoreCalendarGetCalendarDayView200ResponseNextperiod;
    /**
    * previousperiodlink
    */
    'previousperiodlink': string;
    /**
    * previousperiodname
    */
    'previousperiodname': string;
    /**
    * rarrow
    */
    'rarrow': string;
    /**
    * showviewselector
    */
    'showviewselector': boolean = true;
    /**
    * url
    */
    'url': string;
    /**
    * view
    */
    'view': string = 'null';
    /**
    * viewinginblock
    */
    'viewinginblock': boolean = false;
    /**
    * viewingmonth
    */
    'viewingmonth': boolean = true;
    'weeks': Array<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "calendarinstanceid",
            "baseName": "calendarinstanceid",
            "type": "number"
        },
        {
            "name": "categoryid",
            "baseName": "categoryid",
            "type": "number"
        },
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "date",
            "baseName": "date",
            "type": "CoreCalendarGetCalendarDayView200ResponseNextperiod"
        },
        {
            "name": "daynames",
            "baseName": "daynames",
            "type": "Array<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner>"
        },
        {
            "name": "defaulteventcontext",
            "baseName": "defaulteventcontext",
            "type": "number"
        },
        {
            "name": "filterSelector",
            "baseName": "filter_selector",
            "type": "string"
        },
        {
            "name": "includenavigation",
            "baseName": "includenavigation",
            "type": "boolean"
        },
        {
            "name": "initialeventsloaded",
            "baseName": "initialeventsloaded",
            "type": "boolean"
        },
        {
            "name": "larrow",
            "baseName": "larrow",
            "type": "string"
        },
        {
            "name": "nextperiod",
            "baseName": "nextperiod",
            "type": "CoreCalendarGetCalendarDayView200ResponseNextperiod"
        },
        {
            "name": "nextperiodlink",
            "baseName": "nextperiodlink",
            "type": "string"
        },
        {
            "name": "nextperiodname",
            "baseName": "nextperiodname",
            "type": "string"
        },
        {
            "name": "periodname",
            "baseName": "periodname",
            "type": "string"
        },
        {
            "name": "previousperiod",
            "baseName": "previousperiod",
            "type": "CoreCalendarGetCalendarDayView200ResponseNextperiod"
        },
        {
            "name": "previousperiodlink",
            "baseName": "previousperiodlink",
            "type": "string"
        },
        {
            "name": "previousperiodname",
            "baseName": "previousperiodname",
            "type": "string"
        },
        {
            "name": "rarrow",
            "baseName": "rarrow",
            "type": "string"
        },
        {
            "name": "showviewselector",
            "baseName": "showviewselector",
            "type": "boolean"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "view",
            "baseName": "view",
            "type": "string"
        },
        {
            "name": "viewinginblock",
            "baseName": "viewinginblock",
            "type": "boolean"
        },
        {
            "name": "viewingmonth",
            "baseName": "viewingmonth",
            "type": "boolean"
        },
        {
            "name": "weeks",
            "baseName": "weeks",
            "type": "Array<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetCalendarMonthlyView200Response.attributeTypeMap;
    }
}
