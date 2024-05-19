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
 * @interface ModForumAddDiscussionPost200ResponsePostAuthorUrls
 */
export interface ModForumAddDiscussionPost200ResponsePostAuthorUrls {
    /**
     * The URL for the use profile page
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthorUrls
     */
    profile?: string;
    /**
     * The URL for the use profile image
     * @type {string}
     * @memberof ModForumAddDiscussionPost200ResponsePostAuthorUrls
     */
    profileimage?: string;
}

/**
 * Check if a given object implements the ModForumAddDiscussionPost200ResponsePostAuthorUrls interface.
 */
export function instanceOfModForumAddDiscussionPost200ResponsePostAuthorUrls(value: object): boolean {
    return true;
}

export function ModForumAddDiscussionPost200ResponsePostAuthorUrlsFromJSON(json: any): ModForumAddDiscussionPost200ResponsePostAuthorUrls {
    return ModForumAddDiscussionPost200ResponsePostAuthorUrlsFromJSONTyped(json, false);
}

export function ModForumAddDiscussionPost200ResponsePostAuthorUrlsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumAddDiscussionPost200ResponsePostAuthorUrls {
    if (json == null) {
        return json;
    }
    return {
        
        'profile': json['profile'] == null ? undefined : json['profile'],
        'profileimage': json['profileimage'] == null ? undefined : json['profileimage'],
    };
}

export function ModForumAddDiscussionPost200ResponsePostAuthorUrlsToJSON(value?: ModForumAddDiscussionPost200ResponsePostAuthorUrls | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'profile': value['profile'],
        'profileimage': value['profileimage'],
    };
}

