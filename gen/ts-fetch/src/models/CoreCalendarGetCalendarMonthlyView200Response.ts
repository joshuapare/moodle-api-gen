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
import type { CoreCalendarGetCalendarDayView200ResponseNextperiod } from './CoreCalendarGetCalendarDayView200ResponseNextperiod';
import {
    CoreCalendarGetCalendarDayView200ResponseNextperiodFromJSON,
    CoreCalendarGetCalendarDayView200ResponseNextperiodFromJSONTyped,
    CoreCalendarGetCalendarDayView200ResponseNextperiodToJSON,
} from './CoreCalendarGetCalendarDayView200ResponseNextperiod';
import type { CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner } from './CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner';
import {
    CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInnerFromJSON,
    CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInnerFromJSONTyped,
    CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInnerToJSON,
} from './CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner';
import type { CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner } from './CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner';
import {
    CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerFromJSON,
    CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerFromJSONTyped,
    CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerToJSON,
} from './CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner';

/**
 * 
 * @export
 * @interface CoreCalendarGetCalendarMonthlyView200Response
 */
export interface CoreCalendarGetCalendarMonthlyView200Response {
    /**
     * calendarinstanceid
     * @type {number}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Calendarinstanceid: number;
    /**
     * categoryid
     * @type {number}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Categoryid?: number;
    /**
     * courseid
     * @type {number}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Courseid: number;
    /**
     * 
     * @type {CoreCalendarGetCalendarDayView200ResponseNextperiod}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Date: CoreCalendarGetCalendarDayView200ResponseNextperiod;
    /**
     * 
     * @type {Array<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner>}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Daynames: Array<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner>;
    /**
     * defaulteventcontext
     * @type {number}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Defaulteventcontext: number;
    /**
     * filter_selector
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    FilterSelector?: string;
    /**
     * includenavigation
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Includenavigation: boolean;
    /**
     * initialeventsloaded
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Initialeventsloaded: boolean;
    /**
     * larrow
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Larrow: string;
    /**
     * 
     * @type {CoreCalendarGetCalendarDayView200ResponseNextperiod}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Nextperiod: CoreCalendarGetCalendarDayView200ResponseNextperiod;
    /**
     * nextperiodlink
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Nextperiodlink: string;
    /**
     * nextperiodname
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Nextperiodname: string;
    /**
     * periodname
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Periodname: string;
    /**
     * 
     * @type {CoreCalendarGetCalendarDayView200ResponseNextperiod}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Previousperiod: CoreCalendarGetCalendarDayView200ResponseNextperiod;
    /**
     * previousperiodlink
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Previousperiodlink: string;
    /**
     * previousperiodname
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Previousperiodname: string;
    /**
     * rarrow
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Rarrow: string;
    /**
     * showviewselector
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Showviewselector: boolean;
    /**
     * url
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Url: string;
    /**
     * view
     * @type {string}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    View: string;
    /**
     * viewinginblock
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Viewinginblock: boolean;
    /**
     * viewingmonth
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Viewingmonth: boolean;
    /**
     * 
     * @type {Array<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner>}
     * @memberof CoreCalendarGetCalendarMonthlyView200Response
     */
    Weeks: Array<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner>;
}

/**
 * Check if a given object implements the CoreCalendarGetCalendarMonthlyView200Response interface.
 */
export function instanceOfCoreCalendarGetCalendarMonthlyView200Response(value: object): boolean {
    if (!('Calendarinstanceid' in value)) return false;
    if (!('Courseid' in value)) return false;
    if (!('Date' in value)) return false;
    if (!('Daynames' in value)) return false;
    if (!('Defaulteventcontext' in value)) return false;
    if (!('Includenavigation' in value)) return false;
    if (!('Initialeventsloaded' in value)) return false;
    if (!('Larrow' in value)) return false;
    if (!('Nextperiod' in value)) return false;
    if (!('Nextperiodlink' in value)) return false;
    if (!('Nextperiodname' in value)) return false;
    if (!('Periodname' in value)) return false;
    if (!('Previousperiod' in value)) return false;
    if (!('Previousperiodlink' in value)) return false;
    if (!('Previousperiodname' in value)) return false;
    if (!('Rarrow' in value)) return false;
    if (!('Showviewselector' in value)) return false;
    if (!('Url' in value)) return false;
    if (!('View' in value)) return false;
    if (!('Viewinginblock' in value)) return false;
    if (!('Viewingmonth' in value)) return false;
    if (!('Weeks' in value)) return false;
    return true;
}

export function CoreCalendarGetCalendarMonthlyView200ResponseFromJSON(json: any): CoreCalendarGetCalendarMonthlyView200Response {
    return CoreCalendarGetCalendarMonthlyView200ResponseFromJSONTyped(json, false);
}

export function CoreCalendarGetCalendarMonthlyView200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetCalendarMonthlyView200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Calendarinstanceid': json['calendarinstanceid'],
        'Categoryid': json['categoryid'] == null ? undefined : json['categoryid'],
        'Courseid': json['courseid'],
        'Date': CoreCalendarGetCalendarDayView200ResponseNextperiodFromJSON(json['date']),
        'Daynames': ((json['daynames'] as Array<any>).map(CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInnerFromJSON)),
        'Defaulteventcontext': json['defaulteventcontext'],
        'FilterSelector': json['filter_selector'] == null ? undefined : json['filter_selector'],
        'Includenavigation': json['includenavigation'],
        'Initialeventsloaded': json['initialeventsloaded'],
        'Larrow': json['larrow'],
        'Nextperiod': CoreCalendarGetCalendarDayView200ResponseNextperiodFromJSON(json['nextperiod']),
        'Nextperiodlink': json['nextperiodlink'],
        'Nextperiodname': json['nextperiodname'],
        'Periodname': json['periodname'],
        'Previousperiod': CoreCalendarGetCalendarDayView200ResponseNextperiodFromJSON(json['previousperiod']),
        'Previousperiodlink': json['previousperiodlink'],
        'Previousperiodname': json['previousperiodname'],
        'Rarrow': json['rarrow'],
        'Showviewselector': json['showviewselector'],
        'Url': json['url'],
        'View': json['view'],
        'Viewinginblock': json['viewinginblock'],
        'Viewingmonth': json['viewingmonth'],
        'Weeks': ((json['weeks'] as Array<any>).map(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerFromJSON)),
    };
}

export function CoreCalendarGetCalendarMonthlyView200ResponseToJSON(value?: CoreCalendarGetCalendarMonthlyView200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'calendarinstanceid': value['Calendarinstanceid'],
        'categoryid': value['Categoryid'],
        'courseid': value['Courseid'],
        'date': CoreCalendarGetCalendarDayView200ResponseNextperiodToJSON(value['Date']),
        'daynames': ((value['Daynames'] as Array<any>).map(CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInnerToJSON)),
        'defaulteventcontext': value['Defaulteventcontext'],
        'filter_selector': value['FilterSelector'],
        'includenavigation': value['Includenavigation'],
        'initialeventsloaded': value['Initialeventsloaded'],
        'larrow': value['Larrow'],
        'nextperiod': CoreCalendarGetCalendarDayView200ResponseNextperiodToJSON(value['Nextperiod']),
        'nextperiodlink': value['Nextperiodlink'],
        'nextperiodname': value['Nextperiodname'],
        'periodname': value['Periodname'],
        'previousperiod': CoreCalendarGetCalendarDayView200ResponseNextperiodToJSON(value['Previousperiod']),
        'previousperiodlink': value['Previousperiodlink'],
        'previousperiodname': value['Previousperiodname'],
        'rarrow': value['Rarrow'],
        'showviewselector': value['Showviewselector'],
        'url': value['Url'],
        'view': value['View'],
        'viewinginblock': value['Viewinginblock'],
        'viewingmonth': value['Viewingmonth'],
        'weeks': ((value['Weeks'] as Array<any>).map(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerToJSON)),
    };
}
