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
 * @interface CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
 */
export interface CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory {
    /**
     * coursecount
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    coursecount: number;
    /**
     * depth
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    depth: number;
    /**
     * description
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    description?: string;
    /**
     * id
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    id: number;
    /**
     * idnumber
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    idnumber: string;
    /**
     * name
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    name: string;
    /**
     * nestedname
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    nestedname: string;
    /**
     * parent
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    parent: number;
    /**
     * timemodified
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    timemodified: number;
    /**
     * url
     * @type {string}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    url: string;
    /**
     * visible
     * @type {number}
     * @memberof CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory
     */
    visible: number;
}

/**
 * Check if a given object implements the CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory interface.
 */
export function instanceOfCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory(value: object): boolean {
    if (!('coursecount' in value)) return false;
    if (!('depth' in value)) return false;
    if (!('id' in value)) return false;
    if (!('idnumber' in value)) return false;
    if (!('name' in value)) return false;
    if (!('nestedname' in value)) return false;
    if (!('parent' in value)) return false;
    if (!('timemodified' in value)) return false;
    if (!('url' in value)) return false;
    if (!('visible' in value)) return false;
    return true;
}

export function CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryFromJSON(json: any): CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory {
    return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryFromJSONTyped(json, false);
}

export function CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory {
    if (json == null) {
        return json;
    }
    return {
        
        'coursecount': json['coursecount'],
        'depth': json['depth'],
        'description': json['description'] == null ? undefined : json['description'],
        'id': json['id'],
        'idnumber': json['idnumber'],
        'name': json['name'],
        'nestedname': json['nestedname'],
        'parent': json['parent'],
        'timemodified': json['timemodified'],
        'url': json['url'],
        'visible': json['visible'],
    };
}

export function CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategoryToJSON(value?: CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'coursecount': value['coursecount'],
        'depth': value['depth'],
        'description': value['description'],
        'id': value['id'],
        'idnumber': value['idnumber'],
        'name': value['name'],
        'nestedname': value['nestedname'],
        'parent': value['parent'],
        'timemodified': value['timemodified'],
        'url': value['url'],
        'visible': value['visible'],
    };
}

