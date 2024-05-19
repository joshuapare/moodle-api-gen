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
import type { CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner } from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner';
import {
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerFromJSON,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerFromJSONTyped,
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerToJSON,
} from './CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner';

/**
 * 
 * @export
 * @interface CoreCalendarGetActionEventsByCourses200Response
 */
export interface CoreCalendarGetActionEventsByCourses200Response {
    /**
     * 
     * @type {Array<CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner>}
     * @memberof CoreCalendarGetActionEventsByCourses200Response
     */
    Groupedbycourse: Array<CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner>;
}

/**
 * Check if a given object implements the CoreCalendarGetActionEventsByCourses200Response interface.
 */
export function instanceOfCoreCalendarGetActionEventsByCourses200Response(value: object): boolean {
    if (!('Groupedbycourse' in value)) return false;
    return true;
}

export function CoreCalendarGetActionEventsByCourses200ResponseFromJSON(json: any): CoreCalendarGetActionEventsByCourses200Response {
    return CoreCalendarGetActionEventsByCourses200ResponseFromJSONTyped(json, false);
}

export function CoreCalendarGetActionEventsByCourses200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetActionEventsByCourses200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Groupedbycourse': ((json['groupedbycourse'] as Array<any>).map(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerFromJSON)),
    };
}

export function CoreCalendarGetActionEventsByCourses200ResponseToJSON(value?: CoreCalendarGetActionEventsByCourses200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'groupedbycourse': ((value['Groupedbycourse'] as Array<any>).map(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerToJSON)),
    };
}
