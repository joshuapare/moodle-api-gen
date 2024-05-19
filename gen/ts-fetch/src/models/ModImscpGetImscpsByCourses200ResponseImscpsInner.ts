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
 * IMS content packages
 * @export
 * @interface ModImscpGetImscpsByCourses200ResponseImscpsInner
 */
export interface ModImscpGetImscpsByCourses200ResponseImscpsInner {
    /**
     * Course id
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Course?: number;
    /**
     * Course module id
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Coursemodule?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Groupingid?: number;
    /**
     * Group mode
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Groupmode?: number;
    /**
     * Activity instance id
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Id?: number;
    /**
     * Activity introduction
     * @type {string}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Introformat?: number;
    /**
     * Number of old IMSCP to keep
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Keepold?: number;
    /**
     * Forced activity language
     * @type {string}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Lang?: string;
    /**
     * Activity name
     * @type {string}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Name?: string;
    /**
     * Revision
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Revision?: number;
    /**
     * Course section id
     * @type {number}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Section?: number;
    /**
     * IMSCP structure
     * @type {string}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Structure?: string;
    /**
     * Time of last modification
     * @type {string}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Timemodified?: string;
    /**
     * Visible
     * @type {boolean}
     * @memberof ModImscpGetImscpsByCourses200ResponseImscpsInner
     */
    Visible?: boolean;
}

/**
 * Check if a given object implements the ModImscpGetImscpsByCourses200ResponseImscpsInner interface.
 */
export function instanceOfModImscpGetImscpsByCourses200ResponseImscpsInner(value: object): boolean {
    return true;
}

export function ModImscpGetImscpsByCourses200ResponseImscpsInnerFromJSON(json: any): ModImscpGetImscpsByCourses200ResponseImscpsInner {
    return ModImscpGetImscpsByCourses200ResponseImscpsInnerFromJSONTyped(json, false);
}

export function ModImscpGetImscpsByCourses200ResponseImscpsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModImscpGetImscpsByCourses200ResponseImscpsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Course': json['course'] == null ? undefined : json['course'],
        'Coursemodule': json['coursemodule'] == null ? undefined : json['coursemodule'],
        'Groupingid': json['groupingid'] == null ? undefined : json['groupingid'],
        'Groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Intro': json['intro'] == null ? undefined : json['intro'],
        'Introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Introformat': json['introformat'] == null ? undefined : json['introformat'],
        'Keepold': json['keepold'] == null ? undefined : json['keepold'],
        'Lang': json['lang'] == null ? undefined : json['lang'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Revision': json['revision'] == null ? undefined : json['revision'],
        'Section': json['section'] == null ? undefined : json['section'],
        'Structure': json['structure'] == null ? undefined : json['structure'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function ModImscpGetImscpsByCourses200ResponseImscpsInnerToJSON(value?: ModImscpGetImscpsByCourses200ResponseImscpsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'course': value['Course'],
        'coursemodule': value['Coursemodule'],
        'groupingid': value['Groupingid'],
        'groupmode': value['Groupmode'],
        'id': value['Id'],
        'intro': value['Intro'],
        'introfiles': value['Introfiles'] == null ? undefined : ((value['Introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['Introformat'],
        'keepold': value['Keepold'],
        'lang': value['Lang'],
        'name': value['Name'],
        'revision': value['Revision'],
        'section': value['Section'],
        'structure': value['Structure'],
        'timemodified': value['Timemodified'],
        'visible': value['Visible'],
    };
}

