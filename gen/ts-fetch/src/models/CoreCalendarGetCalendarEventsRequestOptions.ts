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
 * 
 * @export
 * @interface CoreCalendarGetCalendarEventsRequestOptions
 */
export interface CoreCalendarGetCalendarEventsRequestOptions {
    /**
     * Ignore hidden events or not
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventsRequestOptions
     */
    Ignorehidden?: boolean;
    /**
     * Set to true to return site events
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventsRequestOptions
     */
    Siteevents?: boolean;
    /**
     * Time to which the events should be returned. We treat 0 and null as no end
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventsRequestOptions
     */
    Timeend?: number;
    /**
     * Time from which events should be returned
     * @type {number}
     * @memberof CoreCalendarGetCalendarEventsRequestOptions
     */
    Timestart?: number;
    /**
     * Set to true to return current user's user events
     * @type {boolean}
     * @memberof CoreCalendarGetCalendarEventsRequestOptions
     */
    Userevents?: boolean;
}

/**
 * Check if a given object implements the CoreCalendarGetCalendarEventsRequestOptions interface.
 */
export function instanceOfCoreCalendarGetCalendarEventsRequestOptions(value: object): boolean {
    return true;
}

export function CoreCalendarGetCalendarEventsRequestOptionsFromJSON(json: any): CoreCalendarGetCalendarEventsRequestOptions {
    return CoreCalendarGetCalendarEventsRequestOptionsFromJSONTyped(json, false);
}

export function CoreCalendarGetCalendarEventsRequestOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetCalendarEventsRequestOptions {
    if (json == null) {
        return json;
    }
    return {
        
        'Ignorehidden': json['ignorehidden'] == null ? undefined : json['ignorehidden'],
        'Siteevents': json['siteevents'] == null ? undefined : json['siteevents'],
        'Timeend': json['timeend'] == null ? undefined : json['timeend'],
        'Timestart': json['timestart'] == null ? undefined : json['timestart'],
        'Userevents': json['userevents'] == null ? undefined : json['userevents'],
    };
}

export function CoreCalendarGetCalendarEventsRequestOptionsToJSON(value?: CoreCalendarGetCalendarEventsRequestOptions | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ignorehidden': value['Ignorehidden'],
        'siteevents': value['Siteevents'],
        'timeend': value['Timeend'],
        'timestart': value['Timestart'],
        'userevents': value['Userevents'],
    };
}
