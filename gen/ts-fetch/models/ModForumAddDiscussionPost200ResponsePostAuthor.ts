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
import type { ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner } from './ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner';
import {
    ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerFromJSON,
    ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerFromJSONTyped,
    ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerToJSON,
} from './ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner';
import type { ModForumAddDiscussionPost200ResponsePostAuthorUrls } from './ModForumAddDiscussionPost200ResponsePostAuthorUrls';
import {
    ModForumAddDiscussionPost200ResponsePostAuthorUrlsFromJSON,
    ModForumAddDiscussionPost200ResponsePostAuthorUrlsFromJSONTyped,
    ModForumAddDiscussionPost200ResponsePostAuthorUrlsToJSON,
} from './ModForumAddDiscussionPost200ResponsePostAuthorUrls';

/**
 * 
 * @export
 * @interface ModForumAddDiscussionPost200ResponsePostAuthor
 */
export interface ModForumAddDiscussionPost200ResponsePostAuthor {
    /**
     * fullname
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthor
     */
    fullname?: string;
    /**
     * 
     * @type {Array<ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner>}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthor
     */
    groups?: Array<ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner>;
    /**
     * id
     * @type {number}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthor
     */
    id?: number;
    /**
     * isdeleted
     * @type {boolean}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthor
     */
    isdeleted?: boolean;
    /**
     * 
     * @type {ModForumAddDiscussionPost200ResponsePostAuthorUrls}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthor
     */
    urls: ModForumAddDiscussionPost200ResponsePostAuthorUrls;
}

/**
 * Check if a given object implements the ModForumAddDiscussionPost200ResponsePostAuthor interface.
 */
export function instanceOfModForumAddDiscussionPost200ResponsePostAuthor(value: object): boolean {
    if (!('urls' in value)) return false;
    return true;
}

export function ModForumAddDiscussionPost200ResponsePostAuthorFromJSON(json: any): ModForumAddDiscussionPost200ResponsePostAuthor {
    return ModForumAddDiscussionPost200ResponsePostAuthorFromJSONTyped(json, false);
}

export function ModForumAddDiscussionPost200ResponsePostAuthorFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumAddDiscussionPost200ResponsePostAuthor {
    if (json == null) {
        return json;
    }
    return {
        
        'fullname': json['fullname'] == null ? undefined : json['fullname'],
        'groups': json['groups'] == null ? undefined : ((json['groups'] as Array<any>).map(ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerFromJSON)),
        'id': json['id'] == null ? undefined : json['id'],
        'isdeleted': json['isdeleted'] == null ? undefined : json['isdeleted'],
        'urls': ModForumAddDiscussionPost200ResponsePostAuthorUrlsFromJSON(json['urls']),
    };
}

export function ModForumAddDiscussionPost200ResponsePostAuthorToJSON(value?: ModForumAddDiscussionPost200ResponsePostAuthor | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'fullname': value['fullname'],
        'groups': value['groups'] == null ? undefined : ((value['groups'] as Array<any>).map(ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerToJSON)),
        'id': value['id'],
        'isdeleted': value['isdeleted'],
        'urls': ModForumAddDiscussionPost200ResponsePostAuthorUrlsToJSON(value['urls']),
    };
}
