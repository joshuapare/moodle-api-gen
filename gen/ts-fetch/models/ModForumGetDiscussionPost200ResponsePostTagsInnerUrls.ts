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
 * @interface ModForumGetDiscussionPost200ResponsePostTagsInnerUrls
 */
export interface ModForumGetDiscussionPost200ResponsePostTagsInnerUrls {
    /**
     * The URL to view the tag
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostTagsInnerUrls
     */
    view: string;
}

/**
 * Check if a given object implements the ModForumGetDiscussionPost200ResponsePostTagsInnerUrls interface.
 */
export function instanceOfModForumGetDiscussionPost200ResponsePostTagsInnerUrls(value: object): boolean {
    if (!('view' in value)) return false;
    return true;
}

export function ModForumGetDiscussionPost200ResponsePostTagsInnerUrlsFromJSON(json: any): ModForumGetDiscussionPost200ResponsePostTagsInnerUrls {
    return ModForumGetDiscussionPost200ResponsePostTagsInnerUrlsFromJSONTyped(json, false);
}

export function ModForumGetDiscussionPost200ResponsePostTagsInnerUrlsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetDiscussionPost200ResponsePostTagsInnerUrls {
    if (json == null) {
        return json;
    }
    return {
        
        'view': json['view'],
    };
}

export function ModForumGetDiscussionPost200ResponsePostTagsInnerUrlsToJSON(value?: ModForumGetDiscussionPost200ResponsePostTagsInnerUrls | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'view': value['view'],
    };
}

