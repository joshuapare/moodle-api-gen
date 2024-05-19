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
import type { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction } from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction';
import {
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerActionFromJSON,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerActionFromJSONTyped,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerActionToJSON,
} from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction';
import type { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory } from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory';
import {
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryFromJSON,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryFromJSONTyped,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryToJSON,
} from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory';
import type { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse } from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse';
import {
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSON,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSONTyped,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseToJSON,
} from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse';
import type { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon } from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon';
import {
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconFromJSON,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconFromJSONTyped,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconToJSON,
} from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon';
import type { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription } from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription';
import {
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscriptionFromJSON,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscriptionFromJSONTyped,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscriptionToJSON,
} from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription';

/**
 * 
 * @export
 * @interface CoreCalendarGetCalendarEventById200ResponseEvent
 */
export interface CoreCalendarGetCalendarEventById200ResponseEvent {
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Action?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction;
    /**
     * activityname
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Activityname?: string;
    /**
     * activitystr
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Activitystr?: string;
    /**
     * candelete
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Candelete: boolean;
    /**
     * canedit
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Canedit: boolean;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Category?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory;
    /**
     * categoryid
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Categoryid?: number;
    /**
     * component
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Component?: string;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Course?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse;
    /**
     * deleteurl
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Deleteurl: string;
    /**
     * description
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Descriptionformat?: number;
    /**
     * editurl
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Editurl: string;
    /**
     * eventcount
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Eventcount?: number;
    /**
     * eventtype
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Eventtype: string;
    /**
     * formattedlocation
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Formattedlocation: string;
    /**
     * formattedtime
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Formattedtime: string;
    /**
     * groupid
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Groupid?: number;
    /**
     * groupname
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Groupname?: string;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Icon: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon;
    /**
     * id
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Id: number;
    /**
     * instance
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Instance?: number;
    /**
     * isactionevent
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Isactionevent: boolean;
    /**
     * iscategoryevent
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Iscategoryevent: boolean;
    /**
     * iscourseevent
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Iscourseevent: boolean;
    /**
     * location
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Location?: string;
    /**
     * modulename
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Modulename?: string;
    /**
     * name
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Name: string;
    /**
     * normalisedeventtype
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Normalisedeventtype: string;
    /**
     * normalisedeventtypetext
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Normalisedeventtypetext: string;
    /**
     * overdue
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Overdue?: boolean;
    /**
     * purpose
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Purpose: string;
    /**
     * repeatid
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Repeatid?: number;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Subscription?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription;
    /**
     * timeduration
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Timeduration: number;
    /**
     * timemodified
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Timemodified: number;
    /**
     * timesort
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Timesort: number;
    /**
     * timestart
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Timestart: number;
    /**
     * timeusermidnight
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Timeusermidnight: number;
    /**
     * url
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Url: string;
    /**
     * userid
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Userid?: number;
    /**
     * viewurl
     * @type {string}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Viewurl: string;
    /**
     * visible
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventById200ResponseEvent
     */
    Visible: number;
}

/**
 * Check if a given object implements the CoreCalendarGetCalendarEventById200ResponseEvent interface.
 */
export function instanceOfCoreCalendarGetCalendarEventById200ResponseEvent(value: object): boolean {
    if (!('Candelete' in value)) return false;
    if (!('Canedit' in value)) return false;
    if (!('Deleteurl' in value)) return false;
    if (!('Editurl' in value)) return false;
    if (!('Eventtype' in value)) return false;
    if (!('Formattedlocation' in value)) return false;
    if (!('Formattedtime' in value)) return false;
    if (!('Icon' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Isactionevent' in value)) return false;
    if (!('Iscategoryevent' in value)) return false;
    if (!('Iscourseevent' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Normalisedeventtype' in value)) return false;
    if (!('Normalisedeventtypetext' in value)) return false;
    if (!('Purpose' in value)) return false;
    if (!('Timeduration' in value)) return false;
    if (!('Timemodified' in value)) return false;
    if (!('Timesort' in value)) return false;
    if (!('Timestart' in value)) return false;
    if (!('Timeusermidnight' in value)) return false;
    if (!('Url' in value)) return false;
    if (!('Viewurl' in value)) return false;
    if (!('Visible' in value)) return false;
    return true;
}

export function CoreCalendarGetCalendarEventById200ResponseEventFromJSON(json: any): CoreCalendarGetCalendarEventById200ResponseEvent {
    return CoreCalendarGetCalendarEventById200ResponseEventFromJSONTyped(json, false);
}

export function CoreCalendarGetCalendarEventById200ResponseEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetCalendarEventById200ResponseEvent {
    if (json == null) {
        return json;
    }
    return {
        
        'Action': json['action'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerActionFromJSON(json['action']),
        'Activityname': json['activityname'] == null ? undefined : json['activityname'],
        'Activitystr': json['activitystr'] == null ? undefined : json['activitystr'],
        'Candelete': json['candelete'],
        'Canedit': json['canedit'],
        'Category': json['category'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryFromJSON(json['category']),
        'Categoryid': json['categoryid'] == null ? undefined : json['categoryid'],
        'Component': json['component'] == null ? undefined : json['component'],
        'Course': json['course'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSON(json['course']),
        'Deleteurl': json['deleteurl'],
        'Description': json['description'] == null ? undefined : json['description'],
        'Descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'Editurl': json['editurl'],
        'Eventcount': json['eventcount'] == null ? undefined : json['eventcount'],
        'Eventtype': json['eventtype'],
        'Formattedlocation': json['formattedlocation'],
        'Formattedtime': json['formattedtime'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Groupname': json['groupname'] == null ? undefined : json['groupname'],
        'Icon': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconFromJSON(json['icon']),
        'Id': json['id'],
        'Instance': json['instance'] == null ? undefined : json['instance'],
        'Isactionevent': json['isactionevent'],
        'Iscategoryevent': json['iscategoryevent'],
        'Iscourseevent': json['iscourseevent'],
        'Location': json['location'] == null ? undefined : json['location'],
        'Modulename': json['modulename'] == null ? undefined : json['modulename'],
        'Name': json['name'],
        'Normalisedeventtype': json['normalisedeventtype'],
        'Normalisedeventtypetext': json['normalisedeventtypetext'],
        'Overdue': json['overdue'] == null ? undefined : json['overdue'],
        'Purpose': json['purpose'],
        'Repeatid': json['repeatid'] == null ? undefined : json['repeatid'],
        'Subscription': json['subscription'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscriptionFromJSON(json['subscription']),
        'Timeduration': json['timeduration'],
        'Timemodified': json['timemodified'],
        'Timesort': json['timesort'],
        'Timestart': json['timestart'],
        'Timeusermidnight': json['timeusermidnight'],
        'Url': json['url'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Viewurl': json['viewurl'],
        'Visible': json['visible'],
    };
}

export function CoreCalendarGetCalendarEventById200ResponseEventToJSON(value?: CoreCalendarGetCalendarEventById200ResponseEvent | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'action': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerActionToJSON(value['Action']),
        'activityname': value['Activityname'],
        'activitystr': value['Activitystr'],
        'candelete': value['Candelete'],
        'canedit': value['Canedit'],
        'category': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryToJSON(value['Category']),
        'categoryid': value['Categoryid'],
        'component': value['Component'],
        'course': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseToJSON(value['Course']),
        'deleteurl': value['Deleteurl'],
        'description': value['Description'],
        'descriptionformat': value['Descriptionformat'],
        'editurl': value['Editurl'],
        'eventcount': value['Eventcount'],
        'eventtype': value['Eventtype'],
        'formattedlocation': value['Formattedlocation'],
        'formattedtime': value['Formattedtime'],
        'groupid': value['Groupid'],
        'groupname': value['Groupname'],
        'icon': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconToJSON(value['Icon']),
        'id': value['Id'],
        'instance': value['Instance'],
        'isactionevent': value['Isactionevent'],
        'iscategoryevent': value['Iscategoryevent'],
        'iscourseevent': value['Iscourseevent'],
        'location': value['Location'],
        'modulename': value['Modulename'],
        'name': value['Name'],
        'normalisedeventtype': value['Normalisedeventtype'],
        'normalisedeventtypetext': value['Normalisedeventtypetext'],
        'overdue': value['Overdue'],
        'purpose': value['Purpose'],
        'repeatid': value['Repeatid'],
        'subscription': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscriptionToJSON(value['Subscription']),
        'timeduration': value['Timeduration'],
        'timemodified': value['Timemodified'],
        'timesort': value['Timesort'],
        'timestart': value['Timestart'],
        'timeusermidnight': value['Timeusermidnight'],
        'url': value['Url'],
        'userid': value['Userid'],
        'viewurl': value['Viewurl'],
        'visible': value['Visible'],
    };
}
