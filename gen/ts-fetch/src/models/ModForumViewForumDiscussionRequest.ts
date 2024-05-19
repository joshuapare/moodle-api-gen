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
 * @interface ModForumViewForumDiscussionRequest
 */
export interface ModForumViewForumDiscussionRequest {
    /**
     * discussion id
     * @type {number}
     * @memberof ModForumViewForumDiscussionRequest
     */
    Discussionid: number;
}

/**
 * Check if a given object implements the ModForumViewForumDiscussionRequest interface.
 */
export function instanceOfModForumViewForumDiscussionRequest(value: object): boolean {
    if (!('Discussionid' in value)) return false;
    return true;
}

export function ModForumViewForumDiscussionRequestFromJSON(json: any): ModForumViewForumDiscussionRequest {
    return ModForumViewForumDiscussionRequestFromJSONTyped(json, false);
}

export function ModForumViewForumDiscussionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumViewForumDiscussionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Discussionid': json['discussionid'],
    };
}

export function ModForumViewForumDiscussionRequestToJSON(value?: ModForumViewForumDiscussionRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'discussionid': value['Discussionid'],
    };
}
