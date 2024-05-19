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
 * @interface CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription
 */
export interface CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription {
    /**
     * displayeventsource
     * @type {boolean}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription
     */
    displayeventsource: boolean;
    /**
     * subscriptionname
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription
     */
    subscriptionname?: string;
    /**
     * subscriptionurl
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription
     */
    subscriptionurl?: string;
}

/**
 * Check if a given object implements the CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription interface.
 */
export function instanceOfCoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription(value: object): boolean {
    if (!('displayeventsource' in value)) return false;
    return true;
}

export function CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscriptionFromJSON(json: any): CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription {
    return CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscriptionFromJSONTyped(json, false);
}

export function CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscriptionFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription {
    if (json == null) {
        return json;
    }
    return {
        
        'displayeventsource': json['displayeventsource'],
        'subscriptionname': json['subscriptionname'] == null ? undefined : json['subscriptionname'],
        'subscriptionurl': json['subscriptionurl'] == null ? undefined : json['subscriptionurl'],
    };
}

export function CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscriptionToJSON(value?: CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'displayeventsource': value['displayeventsource'],
        'subscriptionname': value['subscriptionname'],
        'subscriptionurl': value['subscriptionurl'],
    };
}

