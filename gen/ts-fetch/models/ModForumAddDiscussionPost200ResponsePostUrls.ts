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
 * @interface ModForumAddDiscussionPost200ResponsePostUrls
 */
export interface ModForumAddDiscussionPost200ResponsePostUrls {
    /**
     * The URL used to delete the post
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    _delete?: string;
    /**
     * discuss
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    discuss?: string;
    /**
     * The URL used to edit the post
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    edit?: string;
    /**
     * The URL used to export the post
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    _export?: string;
    /**
     * The URL used to mark the post as read
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    markasread?: string;
    /**
     * The URL used to mark the post as unread
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    markasunread?: string;
    /**
     * The URL used to reply to the post
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    reply?: string;
    /**
     * The URL used to split the discussion with the selected post being the first post in the new discussion
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    split?: string;
    /**
     * The URL used to view the post
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    view?: string;
    /**
     * The URL used to view the post in isolation
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    viewisolated?: string;
    /**
     * The URL used to view the parent of the post
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostUrls
     */
    viewparent?: string;
}

/**
 * Check if a given object implements the ModForumAddDiscussionPost200ResponsePostUrls interface.
 */
export function instanceOfModForumAddDiscussionPost200ResponsePostUrls(value: object): boolean {
    return true;
}

export function ModForumAddDiscussionPost200ResponsePostUrlsFromJSON(json: any): ModForumAddDiscussionPost200ResponsePostUrls {
    return ModForumAddDiscussionPost200ResponsePostUrlsFromJSONTyped(json, false);
}

export function ModForumAddDiscussionPost200ResponsePostUrlsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumAddDiscussionPost200ResponsePostUrls {
    if (json == null) {
        return json;
    }
    return {
        
        '_delete': json['delete'] == null ? undefined : json['delete'],
        'discuss': json['discuss'] == null ? undefined : json['discuss'],
        'edit': json['edit'] == null ? undefined : json['edit'],
        '_export': json['export'] == null ? undefined : json['export'],
        'markasread': json['markasread'] == null ? undefined : json['markasread'],
        'markasunread': json['markasunread'] == null ? undefined : json['markasunread'],
        'reply': json['reply'] == null ? undefined : json['reply'],
        'split': json['split'] == null ? undefined : json['split'],
        'view': json['view'] == null ? undefined : json['view'],
        'viewisolated': json['viewisolated'] == null ? undefined : json['viewisolated'],
        'viewparent': json['viewparent'] == null ? undefined : json['viewparent'],
    };
}

export function ModForumAddDiscussionPost200ResponsePostUrlsToJSON(value?: ModForumAddDiscussionPost200ResponsePostUrls | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'delete': value['_delete'],
        'discuss': value['discuss'],
        'edit': value['edit'],
        'export': value['_export'],
        'markasread': value['markasread'],
        'markasunread': value['markasunread'],
        'reply': value['reply'],
        'split': value['split'],
        'view': value['view'],
        'viewisolated': value['viewisolated'],
        'viewparent': value['viewparent'],
    };
}

