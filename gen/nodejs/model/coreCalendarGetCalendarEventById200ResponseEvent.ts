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
import { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction } from './coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction';
import { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory } from './coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory';
import { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse } from './coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse';
import { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon } from './coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon';
import { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription } from './coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription';

export class CoreCalendarGetCalendarEventById200ResponseEvent {
    'action'?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction;
    /**
    * activityname
    */
    'activityname'?: string;
    /**
    * activitystr
    */
    'activitystr'?: string;
    /**
    * candelete
    */
    'candelete': boolean;
    /**
    * canedit
    */
    'canedit': boolean;
    'category'?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory;
    /**
    * categoryid
    */
    'categoryid'?: number;
    /**
    * component
    */
    'component'?: string;
    'course'?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse;
    /**
    * deleteurl
    */
    'deleteurl': string;
    /**
    * description
    */
    'description'?: string;
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number = 1;
    /**
    * editurl
    */
    'editurl': string;
    /**
    * eventcount
    */
    'eventcount'?: number;
    /**
    * eventtype
    */
    'eventtype': string;
    /**
    * formattedlocation
    */
    'formattedlocation': string;
    /**
    * formattedtime
    */
    'formattedtime': string;
    /**
    * groupid
    */
    'groupid'?: number;
    /**
    * groupname
    */
    'groupname'?: string;
    'icon': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon;
    /**
    * id
    */
    'id': number;
    /**
    * instance
    */
    'instance'?: number;
    /**
    * isactionevent
    */
    'isactionevent': boolean;
    /**
    * iscategoryevent
    */
    'iscategoryevent': boolean;
    /**
    * iscourseevent
    */
    'iscourseevent': boolean;
    /**
    * location
    */
    'location'?: string;
    /**
    * modulename
    */
    'modulename'?: string;
    /**
    * name
    */
    'name': string;
    /**
    * normalisedeventtype
    */
    'normalisedeventtype': string;
    /**
    * normalisedeventtypetext
    */
    'normalisedeventtypetext': string;
    /**
    * overdue
    */
    'overdue'?: boolean = false;
    /**
    * purpose
    */
    'purpose': string;
    /**
    * repeatid
    */
    'repeatid'?: number;
    'subscription'?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription;
    /**
    * timeduration
    */
    'timeduration': number;
    /**
    * timemodified
    */
    'timemodified': number;
    /**
    * timesort
    */
    'timesort': number;
    /**
    * timestart
    */
    'timestart': number;
    /**
    * timeusermidnight
    */
    'timeusermidnight': number;
    /**
    * url
    */
    'url': string;
    /**
    * userid
    */
    'userid'?: number;
    /**
    * viewurl
    */
    'viewurl': string;
    /**
    * visible
    */
    'visible': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "action",
            "baseName": "action",
            "type": "CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction"
        },
        {
            "name": "activityname",
            "baseName": "activityname",
            "type": "string"
        },
        {
            "name": "activitystr",
            "baseName": "activitystr",
            "type": "string"
        },
        {
            "name": "candelete",
            "baseName": "candelete",
            "type": "boolean"
        },
        {
            "name": "canedit",
            "baseName": "canedit",
            "type": "boolean"
        },
        {
            "name": "category",
            "baseName": "category",
            "type": "CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory"
        },
        {
            "name": "categoryid",
            "baseName": "categoryid",
            "type": "number"
        },
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "course",
            "baseName": "course",
            "type": "CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse"
        },
        {
            "name": "deleteurl",
            "baseName": "deleteurl",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "descriptionformat",
            "baseName": "descriptionformat",
            "type": "number"
        },
        {
            "name": "editurl",
            "baseName": "editurl",
            "type": "string"
        },
        {
            "name": "eventcount",
            "baseName": "eventcount",
            "type": "number"
        },
        {
            "name": "eventtype",
            "baseName": "eventtype",
            "type": "string"
        },
        {
            "name": "formattedlocation",
            "baseName": "formattedlocation",
            "type": "string"
        },
        {
            "name": "formattedtime",
            "baseName": "formattedtime",
            "type": "string"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "groupname",
            "baseName": "groupname",
            "type": "string"
        },
        {
            "name": "icon",
            "baseName": "icon",
            "type": "CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "instance",
            "baseName": "instance",
            "type": "number"
        },
        {
            "name": "isactionevent",
            "baseName": "isactionevent",
            "type": "boolean"
        },
        {
            "name": "iscategoryevent",
            "baseName": "iscategoryevent",
            "type": "boolean"
        },
        {
            "name": "iscourseevent",
            "baseName": "iscourseevent",
            "type": "boolean"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "string"
        },
        {
            "name": "modulename",
            "baseName": "modulename",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "normalisedeventtype",
            "baseName": "normalisedeventtype",
            "type": "string"
        },
        {
            "name": "normalisedeventtypetext",
            "baseName": "normalisedeventtypetext",
            "type": "string"
        },
        {
            "name": "overdue",
            "baseName": "overdue",
            "type": "boolean"
        },
        {
            "name": "purpose",
            "baseName": "purpose",
            "type": "string"
        },
        {
            "name": "repeatid",
            "baseName": "repeatid",
            "type": "number"
        },
        {
            "name": "subscription",
            "baseName": "subscription",
            "type": "CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription"
        },
        {
            "name": "timeduration",
            "baseName": "timeduration",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "timesort",
            "baseName": "timesort",
            "type": "number"
        },
        {
            "name": "timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "timeusermidnight",
            "baseName": "timeusermidnight",
            "type": "number"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "viewurl",
            "baseName": "viewurl",
            "type": "string"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetCalendarEventById200ResponseEvent.attributeTypeMap;
    }
}

