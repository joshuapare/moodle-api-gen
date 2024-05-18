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
 * @interface CoreCalendarGetCalendarDayView200ResponseEventsInner
 */
export interface CoreCalendarGetCalendarDayView200ResponseEventsInner {
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    action?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction;
    /**
     * activityname
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    activityname?: string;
    /**
     * activitystr
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    activitystr?: string;
    /**
     * candelete
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    candelete?: boolean;
    /**
     * canedit
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    canedit?: boolean;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    category?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory;
    /**
     * categoryid
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    categoryid?: number;
    /**
     * component
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    component?: string;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    course?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse;
    /**
     * deleteurl
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    deleteurl?: string;
    /**
     * description
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    descriptionformat?: number;
    /**
     * draggable
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    draggable?: boolean;
    /**
     * editurl
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    editurl?: string;
    /**
     * eventcount
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    eventcount?: number;
    /**
     * eventtype
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    eventtype?: string;
    /**
     * formattedlocation
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    formattedlocation?: string;
    /**
     * formattedtime
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    formattedtime?: string;
    /**
     * groupid
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    groupid?: number;
    /**
     * groupname
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    groupname?: string;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    icon?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon;
    /**
     * id
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    id?: number;
    /**
     * instance
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    instance?: number;
    /**
     * isactionevent
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    isactionevent?: boolean;
    /**
     * iscategoryevent
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    iscategoryevent?: boolean;
    /**
     * iscourseevent
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    iscourseevent?: boolean;
    /**
     * islastday
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    islastday?: boolean;
    /**
     * location
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    location?: string;
    /**
     * maxdayerror
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    maxdayerror?: string;
    /**
     * maxdaytimestamp
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    maxdaytimestamp?: number;
    /**
     * mindayerror
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    mindayerror?: string;
    /**
     * mindaytimestamp
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    mindaytimestamp?: number;
    /**
     * modulename
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    modulename?: string;
    /**
     * name
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    name?: string;
    /**
     * normalisedeventtype
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    normalisedeventtype?: string;
    /**
     * normalisedeventtypetext
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    normalisedeventtypetext?: string;
    /**
     * overdue
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    overdue?: boolean;
    /**
     * popupname
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    popupname?: string;
    /**
     * purpose
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    purpose?: string;
    /**
     * repeatid
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    repeatid?: number;
    /**
     * 
     * @type {CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    subscription?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription;
    /**
     * timeduration
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    timeduration?: number;
    /**
     * timemodified
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    timemodified?: number;
    /**
     * timesort
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    timesort?: number;
    /**
     * timestart
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    timestart?: number;
    /**
     * timeusermidnight
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    timeusermidnight?: number;
    /**
     * url
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    url?: string;
    /**
     * userid
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    userid?: number;
    /**
     * viewurl
     * @type {string}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    viewurl?: string;
    /**
     * visible
     * @type {number}
     * @memberof CoreCalendarGetCalendarDayView200ResponseEventsInner
     */
    visible?: number;
}

/**
 * Check if a given object implements the CoreCalendarGetCalendarDayView200ResponseEventsInner interface.
 */
export function instanceOfCoreCalendarGetCalendarDayView200ResponseEventsInner(value: object): boolean {
    return true;
}

export function CoreCalendarGetCalendarDayView200ResponseEventsInnerFromJSON(json: any): CoreCalendarGetCalendarDayView200ResponseEventsInner {
    return CoreCalendarGetCalendarDayView200ResponseEventsInnerFromJSONTyped(json, false);
}

export function CoreCalendarGetCalendarDayView200ResponseEventsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetCalendarDayView200ResponseEventsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'action': json['action'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerActionFromJSON(json['action']),
        'activityname': json['activityname'] == null ? undefined : json['activityname'],
        'activitystr': json['activitystr'] == null ? undefined : json['activitystr'],
        'candelete': json['candelete'] == null ? undefined : json['candelete'],
        'canedit': json['canedit'] == null ? undefined : json['canedit'],
        'category': json['category'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryFromJSON(json['category']),
        'categoryid': json['categoryid'] == null ? undefined : json['categoryid'],
        'component': json['component'] == null ? undefined : json['component'],
        'course': json['course'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseFromJSON(json['course']),
        'deleteurl': json['deleteurl'] == null ? undefined : json['deleteurl'],
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'draggable': json['draggable'] == null ? undefined : json['draggable'],
        'editurl': json['editurl'] == null ? undefined : json['editurl'],
        'eventcount': json['eventcount'] == null ? undefined : json['eventcount'],
        'eventtype': json['eventtype'] == null ? undefined : json['eventtype'],
        'formattedlocation': json['formattedlocation'] == null ? undefined : json['formattedlocation'],
        'formattedtime': json['formattedtime'] == null ? undefined : json['formattedtime'],
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'groupname': json['groupname'] == null ? undefined : json['groupname'],
        'icon': json['icon'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconFromJSON(json['icon']),
        'id': json['id'] == null ? undefined : json['id'],
        'instance': json['instance'] == null ? undefined : json['instance'],
        'isactionevent': json['isactionevent'] == null ? undefined : json['isactionevent'],
        'iscategoryevent': json['iscategoryevent'] == null ? undefined : json['iscategoryevent'],
        'iscourseevent': json['iscourseevent'] == null ? undefined : json['iscourseevent'],
        'islastday': json['islastday'] == null ? undefined : json['islastday'],
        'location': json['location'] == null ? undefined : json['location'],
        'maxdayerror': json['maxdayerror'] == null ? undefined : json['maxdayerror'],
        'maxdaytimestamp': json['maxdaytimestamp'] == null ? undefined : json['maxdaytimestamp'],
        'mindayerror': json['mindayerror'] == null ? undefined : json['mindayerror'],
        'mindaytimestamp': json['mindaytimestamp'] == null ? undefined : json['mindaytimestamp'],
        'modulename': json['modulename'] == null ? undefined : json['modulename'],
        'name': json['name'] == null ? undefined : json['name'],
        'normalisedeventtype': json['normalisedeventtype'] == null ? undefined : json['normalisedeventtype'],
        'normalisedeventtypetext': json['normalisedeventtypetext'] == null ? undefined : json['normalisedeventtypetext'],
        'overdue': json['overdue'] == null ? undefined : json['overdue'],
        'popupname': json['popupname'] == null ? undefined : json['popupname'],
        'purpose': json['purpose'] == null ? undefined : json['purpose'],
        'repeatid': json['repeatid'] == null ? undefined : json['repeatid'],
        'subscription': json['subscription'] == null ? undefined : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscriptionFromJSON(json['subscription']),
        'timeduration': json['timeduration'] == null ? undefined : json['timeduration'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'timesort': json['timesort'] == null ? undefined : json['timesort'],
        'timestart': json['timestart'] == null ? undefined : json['timestart'],
        'timeusermidnight': json['timeusermidnight'] == null ? undefined : json['timeusermidnight'],
        'url': json['url'] == null ? undefined : json['url'],
        'userid': json['userid'] == null ? undefined : json['userid'],
        'viewurl': json['viewurl'] == null ? undefined : json['viewurl'],
        'visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function CoreCalendarGetCalendarDayView200ResponseEventsInnerToJSON(value?: CoreCalendarGetCalendarDayView200ResponseEventsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'action': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerActionToJSON(value['action']),
        'activityname': value['activityname'],
        'activitystr': value['activitystr'],
        'candelete': value['candelete'],
        'canedit': value['canedit'],
        'category': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryToJSON(value['category']),
        'categoryid': value['categoryid'],
        'component': value['component'],
        'course': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourseToJSON(value['course']),
        'deleteurl': value['deleteurl'],
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'draggable': value['draggable'],
        'editurl': value['editurl'],
        'eventcount': value['eventcount'],
        'eventtype': value['eventtype'],
        'formattedlocation': value['formattedlocation'],
        'formattedtime': value['formattedtime'],
        'groupid': value['groupid'],
        'groupname': value['groupname'],
        'icon': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconToJSON(value['icon']),
        'id': value['id'],
        'instance': value['instance'],
        'isactionevent': value['isactionevent'],
        'iscategoryevent': value['iscategoryevent'],
        'iscourseevent': value['iscourseevent'],
        'islastday': value['islastday'],
        'location': value['location'],
        'maxdayerror': value['maxdayerror'],
        'maxdaytimestamp': value['maxdaytimestamp'],
        'mindayerror': value['mindayerror'],
        'mindaytimestamp': value['mindaytimestamp'],
        'modulename': value['modulename'],
        'name': value['name'],
        'normalisedeventtype': value['normalisedeventtype'],
        'normalisedeventtypetext': value['normalisedeventtypetext'],
        'overdue': value['overdue'],
        'popupname': value['popupname'],
        'purpose': value['purpose'],
        'repeatid': value['repeatid'],
        'subscription': CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscriptionToJSON(value['subscription']),
        'timeduration': value['timeduration'],
        'timemodified': value['timemodified'],
        'timesort': value['timesort'],
        'timestart': value['timestart'],
        'timeusermidnight': value['timeusermidnight'],
        'url': value['url'],
        'userid': value['userid'],
        'viewurl': value['viewurl'],
        'visible': value['visible'],
    };
}
