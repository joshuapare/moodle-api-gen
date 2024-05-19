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
import type { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import {
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON,
} from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';

/**
 * Books
 * @export
 * @interface ModBookGetBooksByCourses200ResponseBooksInner
 */
export interface ModBookGetBooksByCourses200ResponseBooksInner {
    /**
     * Course id
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Course?: number;
    /**
     * Course module id
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Coursemodule?: number;
    /**
     * Book custom titles type
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Customtitles?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Groupingid?: number;
    /**
     * Group mode
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Groupmode?: number;
    /**
     * Activity instance id
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Id?: number;
    /**
     * Activity introduction
     * @type {string}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Introformat?: number;
    /**
     * Forced activity language
     * @type {string}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Lang?: string;
    /**
     * Activity name
     * @type {string}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Name?: string;
    /**
     * Book navigation style configuration
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Navstyle?: number;
    /**
     * Book numbering configuration
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Numbering?: number;
    /**
     * Book revision
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Revision?: number;
    /**
     * Course section id
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Section?: number;
    /**
     * Time of creation
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Timecreated?: number;
    /**
     * Time of last modification
     * @type {number}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Timemodified?: number;
    /**
     * Visible
     * @type {boolean}
     * @memberof ModBookGetBooksByCourses200ResponseBooksInner
     */
    Visible?: boolean;
}

/**
 * Check if a given object implements the ModBookGetBooksByCourses200ResponseBooksInner interface.
 */
export function instanceOfModBookGetBooksByCourses200ResponseBooksInner(value: object): boolean {
    return true;
}

export function ModBookGetBooksByCourses200ResponseBooksInnerFromJSON(json: any): ModBookGetBooksByCourses200ResponseBooksInner {
    return ModBookGetBooksByCourses200ResponseBooksInnerFromJSONTyped(json, false);
}

export function ModBookGetBooksByCourses200ResponseBooksInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBookGetBooksByCourses200ResponseBooksInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Course': json['course'] == null ? undefined : json['course'],
        'Coursemodule': json['coursemodule'] == null ? undefined : json['coursemodule'],
        'Customtitles': json['customtitles'] == null ? undefined : json['customtitles'],
        'Groupingid': json['groupingid'] == null ? undefined : json['groupingid'],
        'Groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Intro': json['intro'] == null ? undefined : json['intro'],
        'Introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Introformat': json['introformat'] == null ? undefined : json['introformat'],
        'Lang': json['lang'] == null ? undefined : json['lang'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Navstyle': json['navstyle'] == null ? undefined : json['navstyle'],
        'Numbering': json['numbering'] == null ? undefined : json['numbering'],
        'Revision': json['revision'] == null ? undefined : json['revision'],
        'Section': json['section'] == null ? undefined : json['section'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function ModBookGetBooksByCourses200ResponseBooksInnerToJSON(value?: ModBookGetBooksByCourses200ResponseBooksInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'course': value['Course'],
        'coursemodule': value['Coursemodule'],
        'customtitles': value['Customtitles'],
        'groupingid': value['Groupingid'],
        'groupmode': value['Groupmode'],
        'id': value['Id'],
        'intro': value['Intro'],
        'introfiles': value['Introfiles'] == null ? undefined : ((value['Introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['Introformat'],
        'lang': value['Lang'],
        'name': value['Name'],
        'navstyle': value['Navstyle'],
        'numbering': value['Numbering'],
        'revision': value['Revision'],
        'section': value['Section'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'visible': value['Visible'],
    };
}
