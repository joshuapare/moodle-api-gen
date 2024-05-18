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
 * @interface ModForumDeletePostRequest
 */
export interface ModForumDeletePostRequest {
    /**
     * Post to be deleted. It can be a discussion topic post.
     * @type {number}
     * @memberof ModForumDeletePostRequest
     */
    postid: number;
}

/**
 * Check if a given object implements the ModForumDeletePostRequest interface.
 */
export function instanceOfModForumDeletePostRequest(value: object): boolean {
    if (!('postid' in value)) return false;
    return true;
}

export function ModForumDeletePostRequestFromJSON(json: any): ModForumDeletePostRequest {
    return ModForumDeletePostRequestFromJSONTyped(json, false);
}

export function ModForumDeletePostRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumDeletePostRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'postid': json['postid'],
    };
}

export function ModForumDeletePostRequestToJSON(value?: ModForumDeletePostRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'postid': value['postid'],
    };
}
