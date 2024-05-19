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
 * event
 * @export
 * @interface CoreCalendarCreateCalendarEventsRequestEventsInner
 */
export interface CoreCalendarCreateCalendarEventsRequestEventsInner {
    /**
     * course id
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Courseid?: number;
    /**
     * Description
     * @type {string}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Description?: string;
    /**
     * Event type
     * @type {string}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Eventtype?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Format?: number;
    /**
     * group id
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Groupid?: number;
    /**
     * event name
     * @type {string}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Name?: string;
    /**
     * number of repeats
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Repeats?: number;
    /**
     * sequence
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Sequence?: number;
    /**
     * time duration
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Timeduration?: number;
    /**
     * timestart
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Timestart?: number;
    /**
     * visible
     * @type {number}
     * @memberof CoreCalendarCreateCalendarEventsRequestEventsInner
     */
    Visible?: number;
}

/**
 * Check if a given object implements the CoreCalendarCreateCalendarEventsRequestEventsInner interface.
 */
export function instanceOfCoreCalendarCreateCalendarEventsRequestEventsInner(value: object): boolean {
    return true;
}

export function CoreCalendarCreateCalendarEventsRequestEventsInnerFromJSON(json: any): CoreCalendarCreateCalendarEventsRequestEventsInner {
    return CoreCalendarCreateCalendarEventsRequestEventsInnerFromJSONTyped(json, false);
}

export function CoreCalendarCreateCalendarEventsRequestEventsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarCreateCalendarEventsRequestEventsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Description': json['description'] == null ? undefined : json['description'],
        'Eventtype': json['eventtype'] == null ? undefined : json['eventtype'],
        'Format': json['format'] == null ? undefined : json['format'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Repeats': json['repeats'] == null ? undefined : json['repeats'],
        'Sequence': json['sequence'] == null ? undefined : json['sequence'],
        'Timeduration': json['timeduration'] == null ? undefined : json['timeduration'],
        'Timestart': json['timestart'] == null ? undefined : json['timestart'],
        'Visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function CoreCalendarCreateCalendarEventsRequestEventsInnerToJSON(value?: CoreCalendarCreateCalendarEventsRequestEventsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'description': value['Description'],
        'eventtype': value['Eventtype'],
        'format': value['Format'],
        'groupid': value['Groupid'],
        'name': value['Name'],
        'repeats': value['Repeats'],
        'sequence': value['Sequence'],
        'timeduration': value['Timeduration'],
        'timestart': value['Timestart'],
        'visible': value['Visible'],
    };
}
