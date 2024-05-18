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
import type { CoreCalendarGetActionEventsByCourse200ResponseEventsInner } from './CoreCalendarGetActionEventsByCourse200ResponseEventsInner';
import {
    CoreCalendarGetActionEventsByCourse200ResponseEventsInnerFromJSON,
    CoreCalendarGetActionEventsByCourse200ResponseEventsInnerFromJSONTyped,
    CoreCalendarGetActionEventsByCourse200ResponseEventsInnerToJSON,
} from './CoreCalendarGetActionEventsByCourse200ResponseEventsInner';

/**
 * 
 * @export
 * @interface CoreCalendarGetActionEventsByCourse200Response
 */
export interface CoreCalendarGetActionEventsByCourse200Response {
    /**
     * 
     * @type {Array<CoreCalendarGetActionEventsByCourse200ResponseEventsInner>}
     * @memberof CoreCalendarGetActionEventsByCourse200Response
     */
    events: Array<CoreCalendarGetActionEventsByCourse200ResponseEventsInner>;
    /**
     * firstid
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourse200Response
     */
    firstid: number;
    /**
     * lastid
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourse200Response
     */
    lastid: number;
}

/**
 * Check if a given object implements the CoreCalendarGetActionEventsByCourse200Response interface.
 */
export function instanceOfCoreCalendarGetActionEventsByCourse200Response(value: object): boolean {
    if (!('events' in value)) return false;
    if (!('firstid' in value)) return false;
    if (!('lastid' in value)) return false;
    return true;
}

export function CoreCalendarGetActionEventsByCourse200ResponseFromJSON(json: any): CoreCalendarGetActionEventsByCourse200Response {
    return CoreCalendarGetActionEventsByCourse200ResponseFromJSONTyped(json, false);
}

export function CoreCalendarGetActionEventsByCourse200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetActionEventsByCourse200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'events': ((json['events'] as Array<any>).map(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerFromJSON)),
        'firstid': json['firstid'],
        'lastid': json['lastid'],
    };
}

export function CoreCalendarGetActionEventsByCourse200ResponseToJSON(value?: CoreCalendarGetActionEventsByCourse200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'events': ((value['events'] as Array<any>).map(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerToJSON)),
        'firstid': value['firstid'],
        'lastid': value['lastid'],
    };
}

