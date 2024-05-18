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
 * @interface ModForumGetForumDiscussionsRequest
 */
export interface ModForumGetForumDiscussionsRequest {
    /**
     * forum instance id
     * @type {number}
     * @memberof ModForumGetForumDiscussionsRequest
     */
    forumid: number;
    /**
     * group id
     * @type {number}
     * @memberof ModForumGetForumDiscussionsRequest
     */
    groupid?: number;
    /**
     * current page
     * @type {number}
     * @memberof ModForumGetForumDiscussionsRequest
     */
    page?: number;
    /**
     * items per page
     * @type {number}
     * @memberof ModForumGetForumDiscussionsRequest
     */
    perpage?: number;
    /**
     * sort by this element: numreplies, , created or timemodified
     * @type {number}
     * @memberof ModForumGetForumDiscussionsRequest
     */
    sortorder?: number;
}

/**
 * Check if a given object implements the ModForumGetForumDiscussionsRequest interface.
 */
export function instanceOfModForumGetForumDiscussionsRequest(value: object): boolean {
    if (!('forumid' in value)) return false;
    return true;
}

export function ModForumGetForumDiscussionsRequestFromJSON(json: any): ModForumGetForumDiscussionsRequest {
    return ModForumGetForumDiscussionsRequestFromJSONTyped(json, false);
}

export function ModForumGetForumDiscussionsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumGetForumDiscussionsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'forumid': json['forumid'],
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'page': json['page'] == null ? undefined : json['page'],
        'perpage': json['perpage'] == null ? undefined : json['perpage'],
        'sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
    };
}

export function ModForumGetForumDiscussionsRequestToJSON(value?: ModForumGetForumDiscussionsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'forumid': value['forumid'],
        'groupid': value['groupid'],
        'page': value['page'],
        'perpage': value['perpage'],
        'sortorder': value['sortorder'],
    };
}
