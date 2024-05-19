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
 * @interface CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
 */
export interface CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
    /**
     * alttext
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
     */
    alttext: string;
    /**
     * component
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
     */
    component: string;
    /**
     * iconclass
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
     */
    iconclass: string;
    /**
     * iconurl
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
     */
    iconurl: string;
    /**
     * key
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
     */
    key: string;
}

/**
 * Check if a given object implements the CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon interface.
 */
export function instanceOfCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon(value: object): boolean {
    if (!('alttext' in value)) return false;
    if (!('component' in value)) return false;
    if (!('iconclass' in value)) return false;
    if (!('iconurl' in value)) return false;
    if (!('key' in value)) return false;
    return true;
}

export function CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconFromJSON(json: any): CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
    return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconFromJSONTyped(json, false);
}

export function CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {
    if (json == null) {
        return json;
    }
    return {
        
        'alttext': json['alttext'],
        'component': json['component'],
        'iconclass': json['iconclass'],
        'iconurl': json['iconurl'],
        'key': json['key'],
    };
}

export function CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIconToJSON(value?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'alttext': value['alttext'],
        'component': value['component'],
        'iconclass': value['iconclass'],
        'iconurl': value['iconurl'],
        'key': value['key'],
    };
}

