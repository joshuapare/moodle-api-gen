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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface ModForumUpdateDiscussionPost200Response
 */
export interface ModForumUpdateDiscussionPost200Response {
    /**
     * True if the post/discussion was updated, false otherwise.
     * @type {boolean}
     * @memberof ModForumUpdateDiscussionPost200Response
     */
    status: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModForumUpdateDiscussionPost200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModForumUpdateDiscussionPost200Response interface.
 */
export function instanceOfModForumUpdateDiscussionPost200Response(value: object): boolean {
    if (!('status' in value)) return false;
    return true;
}

export function ModForumUpdateDiscussionPost200ResponseFromJSON(json: any): ModForumUpdateDiscussionPost200Response {
    return ModForumUpdateDiscussionPost200ResponseFromJSONTyped(json, false);
}

export function ModForumUpdateDiscussionPost200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModForumUpdateDiscussionPost200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModForumUpdateDiscussionPost200ResponseToJSON(value?: ModForumUpdateDiscussionPost200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': value['status'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
