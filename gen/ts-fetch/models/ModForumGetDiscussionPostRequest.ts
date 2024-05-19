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
 * @interface ModForumGetDiscussionPostRequest
 */
export interface ModForumGetDiscussionPostRequest {
    /**
     * Post to fetch.
     * @type {number}
     * @memberof ModForumGetDiscussionPostRequest
     */
    postid: number;
}

/**
 * Check if a given object implements the ModForumGetDiscussionPostRequest interface.
 */
export function instanceOfModForumGetDiscussionPostRequest(value: object): boolean {
    if (!('postid' in value)) return false;
    return true;
}

export function ModForumGetDiscussionPostRequestFromJSON(json: any): ModForumGetDiscussionPostRequest {
    return ModForumGetDiscussionPostRequestFromJSONTyped(json, false);
}

export function ModForumGetDiscussionPostRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetDiscussionPostRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'postid': json['postid'],
    };
}

export function ModForumGetDiscussionPostRequestToJSON(value?: ModForumGetDiscussionPostRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'postid': value['postid'],
    };
}

