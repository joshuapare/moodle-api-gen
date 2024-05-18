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
import type { ModForumUpdateDiscussionPostRequestOptionsInner } from './ModForumUpdateDiscussionPostRequestOptionsInner';
import {
    ModForumUpdateDiscussionPostRequestOptionsInnerFromJSON,
    ModForumUpdateDiscussionPostRequestOptionsInnerFromJSONTyped,
    ModForumUpdateDiscussionPostRequestOptionsInnerToJSON,
} from './ModForumUpdateDiscussionPostRequestOptionsInner';

/**
 * 
 * @export
 * @interface ModForumUpdateDiscussionPostRequest
 */
export interface ModForumUpdateDiscussionPostRequest {
    /**
     * Updated post message (HTML assumed if messageformat is not provided)
     * @type {string}
     * @memberof ModForumUpdateDiscussionPostRequest
     */
    message?: string;
    /**
     * message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModForumUpdateDiscussionPostRequest
     */
    messageformat?: number;
    /**
     * 
     * @type {Array<ModForumUpdateDiscussionPostRequestOptionsInner>}
     * @memberof ModForumUpdateDiscussionPostRequest
     */
    options?: Array<ModForumUpdateDiscussionPostRequestOptionsInner>;
    /**
     * Post to be updated. It can be a discussion topic post.
     * @type {number}
     * @memberof ModForumUpdateDiscussionPostRequest
     */
    postid: number;
    /**
     * Updated post subject
     * @type {string}
     * @memberof ModForumUpdateDiscussionPostRequest
     */
    subject?: string;
}

/**
 * Check if a given object implements the ModForumUpdateDiscussionPostRequest interface.
 */
export function instanceOfModForumUpdateDiscussionPostRequest(value: object): boolean {
    if (!('postid' in value)) return false;
    return true;
}

export function ModForumUpdateDiscussionPostRequestFromJSON(json: any): ModForumUpdateDiscussionPostRequest {
    return ModForumUpdateDiscussionPostRequestFromJSONTyped(json, false);
}

export function ModForumUpdateDiscussionPostRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumUpdateDiscussionPostRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'message': json['message'] == null ? undefined : json['message'],
        'messageformat': json['messageformat'] == null ? undefined : json['messageformat'],
        'options': json['options'] == null ? undefined : ((json['options'] as Array<any>).map(ModForumUpdateDiscussionPostRequestOptionsInnerFromJSON)),
        'postid': json['postid'],
        'subject': json['subject'] == null ? undefined : json['subject'],
    };
}

export function ModForumUpdateDiscussionPostRequestToJSON(value?: ModForumUpdateDiscussionPostRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'message': value['message'],
        'messageformat': value['messageformat'],
        'options': value['options'] == null ? undefined : ((value['options'] as Array<any>).map(ModForumUpdateDiscussionPostRequestOptionsInnerToJSON)),
        'postid': value['postid'],
        'subject': value['subject'],
    };
}
