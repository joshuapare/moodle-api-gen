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
 * @interface ModForumSetLockStateRequest
 */
export interface ModForumSetLockStateRequest {
    /**
     * The discussion to lock / unlock
     * @type {number}
     * @memberof ModForumSetLockStateRequest
     */
    discussionid: number;
    /**
     * Forum that the discussion is in
     * @type {number}
     * @memberof ModForumSetLockStateRequest
     */
    forumid: number;
    /**
     * The timestamp for the lock state
     * @type {number}
     * @memberof ModForumSetLockStateRequest
     */
    targetstate: number;
}

/**
 * Check if a given object implements the ModForumSetLockStateRequest interface.
 */
export function instanceOfModForumSetLockStateRequest(value: object): boolean {
    if (!('discussionid' in value)) return false;
    if (!('forumid' in value)) return false;
    if (!('targetstate' in value)) return false;
    return true;
}

export function ModForumSetLockStateRequestFromJSON(json: any): ModForumSetLockStateRequest {
    return ModForumSetLockStateRequestFromJSONTyped(json, false);
}

export function ModForumSetLockStateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumSetLockStateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'discussionid': json['discussionid'],
        'forumid': json['forumid'],
        'targetstate': json['targetstate'],
    };
}

export function ModForumSetLockStateRequestToJSON(value?: ModForumSetLockStateRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'discussionid': value['discussionid'],
        'forumid': value['forumid'],
        'targetstate': value['targetstate'],
    };
}

