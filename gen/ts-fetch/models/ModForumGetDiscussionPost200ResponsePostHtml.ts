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
 * @interface ModForumGetDiscussionPost200ResponsePostHtml
 */
export interface ModForumGetDiscussionPost200ResponsePostHtml {
    /**
     * The HTML source to view the author details
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostHtml
     */
    authorsubheading?: string;
    /**
     * The HTML source to rate the post
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostHtml
     */
    rating?: string;
    /**
     * The HTML source to view the list of tags
     * @type {string}
     * @memberof ModForumGetDiscussionPost200ResponsePostHtml
     */
    taglist?: string;
}

/**
 * Check if a given object implements the ModForumGetDiscussionPost200ResponsePostHtml interface.
 */
export function instanceOfModForumGetDiscussionPost200ResponsePostHtml(value: object): boolean {
    return true;
}

export function ModForumGetDiscussionPost200ResponsePostHtmlFromJSON(json: any): ModForumGetDiscussionPost200ResponsePostHtml {
    return ModForumGetDiscussionPost200ResponsePostHtmlFromJSONTyped(json, false);
}

export function ModForumGetDiscussionPost200ResponsePostHtmlFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetDiscussionPost200ResponsePostHtml {
    if (json == null) {
        return json;
    }
    return {
        
        'authorsubheading': json['authorsubheading'] == null ? undefined : json['authorsubheading'],
        'rating': json['rating'] == null ? undefined : json['rating'],
        'taglist': json['taglist'] == null ? undefined : json['taglist'],
    };
}

export function ModForumGetDiscussionPost200ResponsePostHtmlToJSON(value?: ModForumGetDiscussionPost200ResponsePostHtml | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'authorsubheading': value['authorsubheading'],
        'rating': value['rating'],
        'taglist': value['taglist'],
    };
}

