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
 * @interface ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls
 */
export interface ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls {
    /**
     * image
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls
     */
    Image?: string;
}

/**
 * Check if a given object implements the ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls interface.
 */
export function instanceOfModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls(value: object): boolean {
    return true;
}

export function ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsFromJSON(json: any): ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls {
    return ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsFromJSONTyped(json, false);
}

export function ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls {
    if (json == null) {
        return json;
    }
    return {
        
        'Image': json['image'] == null ? undefined : json['image'],
    };
}

export function ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrlsToJSON(value?: ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'image': value['Image'],
    };
}
