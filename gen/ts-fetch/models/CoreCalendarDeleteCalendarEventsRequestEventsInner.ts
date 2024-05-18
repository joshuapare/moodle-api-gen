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
/**
 * List of events to delete
 * @export
 * @interface CoreCalendarDeleteCalendarEventsRequestEventsInner
 */
export interface CoreCalendarDeleteCalendarEventsRequestEventsInner {
    /**
     * Event ID
     * @type {number}
     * @memberof CoreCalendarDeleteCalendarEventsRequestEventsInner
     */
    eventid?: number;
    /**
     * Delete comeplete series if repeated event
     * @type {boolean}
     * @memberof CoreCalendarDeleteCalendarEventsRequestEventsInner
     */
    repeat?: boolean;
}

/**
 * Check if a given object implements the CoreCalendarDeleteCalendarEventsRequestEventsInner interface.
 */
export function instanceOfCoreCalendarDeleteCalendarEventsRequestEventsInner(value: object): boolean {
    return true;
}

export function CoreCalendarDeleteCalendarEventsRequestEventsInnerFromJSON(json: any): CoreCalendarDeleteCalendarEventsRequestEventsInner {
    return CoreCalendarDeleteCalendarEventsRequestEventsInnerFromJSONTyped(json, false);
}

export function CoreCalendarDeleteCalendarEventsRequestEventsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarDeleteCalendarEventsRequestEventsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'eventid': json['eventid'] == null ? undefined : json['eventid'],
        'repeat': json['repeat'] == null ? undefined : json['repeat'],
    };
}

export function CoreCalendarDeleteCalendarEventsRequestEventsInnerToJSON(value?: CoreCalendarDeleteCalendarEventsRequestEventsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'eventid': value['eventid'],
        'repeat': value['repeat'],
    };
}

