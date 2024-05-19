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
import type { ModForumAddDiscussionRequestOptionsInner } from './ModForumAddDiscussionRequestOptionsInner';
import {
    ModForumAddDiscussionRequestOptionsInnerFromJSON,
    ModForumAddDiscussionRequestOptionsInnerFromJSONTyped,
    ModForumAddDiscussionRequestOptionsInnerToJSON,
} from './ModForumAddDiscussionRequestOptionsInner';

/**
 * 
 * @export
 * @interface ModForumAddDiscussionRequest
 */
export interface ModForumAddDiscussionRequest {
    /**
     * Forum instance ID
     * @type {number}
     * @memberof ModForumAddDiscussionRequest
     */
    Forumid: number;
    /**
     * The group, default to 0
     * @type {number}
     * @memberof ModForumAddDiscussionRequest
     */
    Groupid?: number;
    /**
     * New Discussion message (only html format allowed)
     * @type {string}
     * @memberof ModForumAddDiscussionRequest
     */
    Message: string;
    /**
     * 
     * @type {Array<ModForumAddDiscussionRequestOptionsInner>}
     * @memberof ModForumAddDiscussionRequest
     */
    Options?: Array<ModForumAddDiscussionRequestOptionsInner>;
    /**
     * New Discussion subject
     * @type {string}
     * @memberof ModForumAddDiscussionRequest
     */
    Subject: string;
}

/**
 * Check if a given object implements the ModForumAddDiscussionRequest interface.
 */
export function instanceOfModForumAddDiscussionRequest(value: object): boolean {
    if (!('Forumid' in value)) return false;
    if (!('Message' in value)) return false;
    if (!('Subject' in value)) return false;
    return true;
}

export function ModForumAddDiscussionRequestFromJSON(json: any): ModForumAddDiscussionRequest {
    return ModForumAddDiscussionRequestFromJSONTyped(json, false);
}

export function ModForumAddDiscussionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumAddDiscussionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Forumid': json['forumid'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Message': json['message'],
        'Options': json['options'] == null ? undefined : ((json['options'] as Array<any>).map(ModForumAddDiscussionRequestOptionsInnerFromJSON)),
        'Subject': json['subject'],
    };
}

export function ModForumAddDiscussionRequestToJSON(value?: ModForumAddDiscussionRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'forumid': value['Forumid'],
        'groupid': value['Groupid'],
        'message': value['Message'],
        'options': value['Options'] == null ? undefined : ((value['Options'] as Array<any>).map(ModForumAddDiscussionRequestOptionsInnerToJSON)),
        'subject': value['Subject'],
    };
}

