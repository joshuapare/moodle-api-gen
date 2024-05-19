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
 * @interface ModForumGetForumDiscussionsPaginatedRequest
 */
export interface ModForumGetForumDiscussionsPaginatedRequest {
    /**
     * forum instance id
     * @type {number}
     * @memberof ModForumGetForumDiscussionsPaginatedRequest
     */
    forumid: number;
    /**
     * current page
     * @type {number}
     * @memberof ModForumGetForumDiscussionsPaginatedRequest
     */
    page?: number;
    /**
     * items per page
     * @type {number}
     * @memberof ModForumGetForumDiscussionsPaginatedRequest
     */
    perpage?: number;
    /**
     * sort by this element: id, timemodified, timestart or timeend
     * @type {string}
     * @memberof ModForumGetForumDiscussionsPaginatedRequest
     */
    sortby?: string;
    /**
     * sort direction: ASC or DESC
     * @type {string}
     * @memberof ModForumGetForumDiscussionsPaginatedRequest
     */
    sortdirection?: string;
}

/**
 * Check if a given object implements the ModForumGetForumDiscussionsPaginatedRequest interface.
 */
export function instanceOfModForumGetForumDiscussionsPaginatedRequest(value: object): boolean {
    if (!('forumid' in value)) return false;
    return true;
}

export function ModForumGetForumDiscussionsPaginatedRequestFromJSON(json: any): ModForumGetForumDiscussionsPaginatedRequest {
    return ModForumGetForumDiscussionsPaginatedRequestFromJSONTyped(json, false);
}

export function ModForumGetForumDiscussionsPaginatedRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetForumDiscussionsPaginatedRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'forumid': json['forumid'],
        'page': json['page'] == null ? undefined : json['page'],
        'perpage': json['perpage'] == null ? undefined : json['perpage'],
        'sortby': json['sortby'] == null ? undefined : json['sortby'],
        'sortdirection': json['sortdirection'] == null ? undefined : json['sortdirection'],
    };
}

export function ModForumGetForumDiscussionsPaginatedRequestToJSON(value?: ModForumGetForumDiscussionsPaginatedRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'forumid': value['forumid'],
        'page': value['page'],
        'perpage': value['perpage'],
        'sortby': value['sortby'],
        'sortdirection': value['sortdirection'],
    };
}

