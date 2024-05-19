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
 * 
 * @export
 * @interface ModPageGetPagesByCourses200ResponsePagesInner
 */
export interface ModPageGetPagesByCourses200ResponsePagesInner {
    /**
     * Page content
     * @type {string}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    content?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    contentfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    contentformat?: number;
    /**
     * Course id
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    course?: number;
    /**
     * Course module id
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    coursemodule?: number;
    /**
     * How to display the page
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    display?: number;
    /**
     * Display options (width, height)
     * @type {string}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    displayoptions?: string;
    /**
     * Group id
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    groupingid?: number;
    /**
     * Group mode
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    groupmode?: number;
    /**
     * Activity instance id
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    id?: number;
    /**
     * Activity introduction
     * @type {string}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    introformat?: number;
    /**
     * Forced activity language
     * @type {string}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    lang?: string;
    /**
     * Legacy files flag
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    legacyfiles?: number;
    /**
     * Legacy files last control flag
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    legacyfileslast?: number;
    /**
     * Activity name
     * @type {string}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    name?: string;
    /**
     * Incremented when after each file changes, to avoid cache
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    revision?: number;
    /**
     * Course section id
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    section?: number;
    /**
     * Last time the page was modified
     * @type {number}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    timemodified?: number;
    /**
     * Visible
     * @type {boolean}
     * @memberof ModPageGetPagesByCourses200ResponsePagesInner
     */
    visible?: boolean;
}

/**
 * Check if a given object implements the ModPageGetPagesByCourses200ResponsePagesInner interface.
 */
export function instanceOfModPageGetPagesByCourses200ResponsePagesInner(value: object): boolean {
    return true;
}

export function ModPageGetPagesByCourses200ResponsePagesInnerFromJSON(json: any): ModPageGetPagesByCourses200ResponsePagesInner {
    return ModPageGetPagesByCourses200ResponsePagesInnerFromJSONTyped(json, false);
}

export function ModPageGetPagesByCourses200ResponsePagesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModPageGetPagesByCourses200ResponsePagesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'content': json['content'] == null ? undefined : json['content'],
        'contentfiles': json['contentfiles'] == null ? undefined : ((json['contentfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'contentformat': json['contentformat'] == null ? undefined : json['contentformat'],
        'course': json['course'] == null ? undefined : json['course'],
        'coursemodule': json['coursemodule'] == null ? undefined : json['coursemodule'],
        'display': json['display'] == null ? undefined : json['display'],
        'displayoptions': json['displayoptions'] == null ? undefined : json['displayoptions'],
        'groupingid': json['groupingid'] == null ? undefined : json['groupingid'],
        'groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'id': json['id'] == null ? undefined : json['id'],
        'intro': json['intro'] == null ? undefined : json['intro'],
        'introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'introformat': json['introformat'] == null ? undefined : json['introformat'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'legacyfiles': json['legacyfiles'] == null ? undefined : json['legacyfiles'],
        'legacyfileslast': json['legacyfileslast'] == null ? undefined : json['legacyfileslast'],
        'name': json['name'] == null ? undefined : json['name'],
        'revision': json['revision'] == null ? undefined : json['revision'],
        'section': json['section'] == null ? undefined : json['section'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function ModPageGetPagesByCourses200ResponsePagesInnerToJSON(value?: ModPageGetPagesByCourses200ResponsePagesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'content': value['content'],
        'contentfiles': value['contentfiles'] == null ? undefined : ((value['contentfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'contentformat': value['contentformat'],
        'course': value['course'],
        'coursemodule': value['coursemodule'],
        'display': value['display'],
        'displayoptions': value['displayoptions'],
        'groupingid': value['groupingid'],
        'groupmode': value['groupmode'],
        'id': value['id'],
        'intro': value['intro'],
        'introfiles': value['introfiles'] == null ? undefined : ((value['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['introformat'],
        'lang': value['lang'],
        'legacyfiles': value['legacyfiles'],
        'legacyfileslast': value['legacyfileslast'],
        'name': value['name'],
        'revision': value['revision'],
        'section': value['section'],
        'timemodified': value['timemodified'],
        'visible': value['visible'],
    };
}

