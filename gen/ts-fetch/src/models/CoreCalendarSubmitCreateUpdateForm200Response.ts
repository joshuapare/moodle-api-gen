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
import type { CoreCalendarGetCalendarEventById200ResponseEvent } from './CoreCalendarGetCalendarEventById200ResponseEvent';
import {
    CoreCalendarGetCalendarEventById200ResponseEventFromJSON,
    CoreCalendarGetCalendarEventById200ResponseEventFromJSONTyped,
    CoreCalendarGetCalendarEventById200ResponseEventToJSON,
} from './CoreCalendarGetCalendarEventById200ResponseEvent';

/**
 * 
 * @export
 * @interface CoreCalendarSubmitCreateUpdateForm200Response
 */
export interface CoreCalendarSubmitCreateUpdateForm200Response {
    /**
     * 
     * @type {CoreCalendarGetCalendarEventById200ResponseEvent}
     * @memberof CoreCalendarSubmitCreateUpdateForm200Response
     */
    Event?: CoreCalendarGetCalendarEventById200ResponseEvent;
    /**
     * Invalid form data
     * @type {boolean}
     * @memberof CoreCalendarSubmitCreateUpdateForm200Response
     */
    Validationerror?: boolean;
}

/**
 * Check if a given object implements the CoreCalendarSubmitCreateUpdateForm200Response interface.
 */
export function instanceOfCoreCalendarSubmitCreateUpdateForm200Response(value: object): boolean {
    return true;
}

export function CoreCalendarSubmitCreateUpdateForm200ResponseFromJSON(json: any): CoreCalendarSubmitCreateUpdateForm200Response {
    return CoreCalendarSubmitCreateUpdateForm200ResponseFromJSONTyped(json, false);
}

export function CoreCalendarSubmitCreateUpdateForm200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarSubmitCreateUpdateForm200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Event': json['event'] == null ? undefined : CoreCalendarGetCalendarEventById200ResponseEventFromJSON(json['event']),
        'Validationerror': json['validationerror'] == null ? undefined : json['validationerror'],
    };
}

export function CoreCalendarSubmitCreateUpdateForm200ResponseToJSON(value?: CoreCalendarSubmitCreateUpdateForm200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'event': CoreCalendarGetCalendarEventById200ResponseEventToJSON(value['Event']),
        'validationerror': value['Validationerror'],
    };
}

