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
import type { ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls } from './ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls';
import {
    ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsFromJSON,
    ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsFromJSONTyped,
    ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsToJSON,
} from './ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls';

/**
 * 
 * @export
 * @interface ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner
 */
export interface ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
    /**
     * id
     * @type {number}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner
     */
    id?: number;
    /**
     * name
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner
     */
    name?: string;
    /**
     * 
     * @type {ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner
     */
    urls?: ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls;
}

/**
 * Check if a given object implements the ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner interface.
 */
export function instanceOfModForumAddDiscussionPost200ResponsePostAuthorGroupsInner(value: object): boolean {
    return true;
}

export function ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerFromJSON(json: any): ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
    return ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerFromJSONTyped(json, false);
}

export function ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'name': json['name'] == null ? undefined : json['name'],
        'urls': json['urls'] == null ? undefined : ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsFromJSON(json['urls']),
    };
}

export function ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerToJSON(value?: ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'name': value['name'],
        'urls': ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsToJSON(value['urls']),
    };
}

