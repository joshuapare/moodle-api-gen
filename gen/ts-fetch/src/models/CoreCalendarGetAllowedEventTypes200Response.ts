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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface CoreCalendarGetAllowedEventTypes200Response
 */
export interface CoreCalendarGetAllowedEventTypes200Response {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreCalendarGetAllowedEventTypes200Response
     */
    Allowedeventtypes: Array<object>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreCalendarGetAllowedEventTypes200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreCalendarGetAllowedEventTypes200Response interface.
 */
export function instanceOfCoreCalendarGetAllowedEventTypes200Response(value: object): boolean {
    if (!('Allowedeventtypes' in value)) return false;
    return true;
}

export function CoreCalendarGetAllowedEventTypes200ResponseFromJSON(json: any): CoreCalendarGetAllowedEventTypes200Response {
    return CoreCalendarGetAllowedEventTypes200ResponseFromJSONTyped(json, false);
}

export function CoreCalendarGetAllowedEventTypes200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetAllowedEventTypes200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Allowedeventtypes': json['allowedeventtypes'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreCalendarGetAllowedEventTypes200ResponseToJSON(value?: CoreCalendarGetAllowedEventTypes200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allowedeventtypes': value['Allowedeventtypes'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

