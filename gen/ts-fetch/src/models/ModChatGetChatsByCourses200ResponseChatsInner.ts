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
 * Chats
 * @export
 * @interface ModChatGetChatsByCourses200ResponseChatsInner
 */
export interface ModChatGetChatsByCourses200ResponseChatsInner {
    /**
     * chat method (sockets, ajax, header_js)
     * @type {string}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Chatmethod?: string;
    /**
     * chat time
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Chattime?: number;
    /**
     * Course id
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Course?: number;
    /**
     * Course module id
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Coursemodule?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Groupingid?: number;
    /**
     * Group mode
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Groupmode?: number;
    /**
     * Activity instance id
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Id?: number;
    /**
     * Activity introduction
     * @type {string}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Introformat?: number;
    /**
     * keep days
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Keepdays?: number;
    /**
     * Forced activity language
     * @type {string}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Lang?: string;
    /**
     * Activity name
     * @type {string}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Name?: string;
    /**
     * schedule type
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Schedule?: number;
    /**
     * Course section id
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Section?: number;
    /**
     * student logs visible to everyone
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Studentlogs?: number;
    /**
     * time of last modification
     * @type {number}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Timemodified?: number;
    /**
     * Visible
     * @type {boolean}
     * @memberof ModChatGetChatsByCourses200ResponseChatsInner
     */
    Visible?: boolean;
}

/**
 * Check if a given object implements the ModChatGetChatsByCourses200ResponseChatsInner interface.
 */
export function instanceOfModChatGetChatsByCourses200ResponseChatsInner(value: object): boolean {
    return true;
}

export function ModChatGetChatsByCourses200ResponseChatsInnerFromJSON(json: any): ModChatGetChatsByCourses200ResponseChatsInner {
    return ModChatGetChatsByCourses200ResponseChatsInnerFromJSONTyped(json, false);
}

export function ModChatGetChatsByCourses200ResponseChatsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChatGetChatsByCourses200ResponseChatsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Chatmethod': json['chatmethod'] == null ? undefined : json['chatmethod'],
        'Chattime': json['chattime'] == null ? undefined : json['chattime'],
        'Course': json['course'] == null ? undefined : json['course'],
        'Coursemodule': json['coursemodule'] == null ? undefined : json['coursemodule'],
        'Groupingid': json['groupingid'] == null ? undefined : json['groupingid'],
        'Groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Intro': json['intro'] == null ? undefined : json['intro'],
        'Introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'Introformat': json['introformat'] == null ? undefined : json['introformat'],
        'Keepdays': json['keepdays'] == null ? undefined : json['keepdays'],
        'Lang': json['lang'] == null ? undefined : json['lang'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Schedule': json['schedule'] == null ? undefined : json['schedule'],
        'Section': json['section'] == null ? undefined : json['section'],
        'Studentlogs': json['studentlogs'] == null ? undefined : json['studentlogs'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function ModChatGetChatsByCourses200ResponseChatsInnerToJSON(value?: ModChatGetChatsByCourses200ResponseChatsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'chatmethod': value['Chatmethod'],
        'chattime': value['Chattime'],
        'course': value['Course'],
        'coursemodule': value['Coursemodule'],
        'groupingid': value['Groupingid'],
        'groupmode': value['Groupmode'],
        'id': value['Id'],
        'intro': value['Intro'],
        'introfiles': value['Introfiles'] == null ? undefined : ((value['Introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['Introformat'],
        'keepdays': value['Keepdays'],
        'lang': value['Lang'],
        'name': value['Name'],
        'schedule': value['Schedule'],
        'section': value['Section'],
        'studentlogs': value['Studentlogs'],
        'timemodified': value['Timemodified'],
        'visible': value['Visible'],
    };
}
