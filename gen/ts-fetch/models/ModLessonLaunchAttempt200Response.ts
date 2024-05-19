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
import type { ModLessonGetPageData200ResponseMessagesInner } from './ModLessonGetPageData200ResponseMessagesInner';
import {
    ModLessonGetPageData200ResponseMessagesInnerFromJSON,
    ModLessonGetPageData200ResponseMessagesInnerFromJSONTyped,
    ModLessonGetPageData200ResponseMessagesInnerToJSON,
} from './ModLessonGetPageData200ResponseMessagesInner';

/**
 * 
 * @export
 * @interface ModLessonLaunchAttempt200Response
 */
export interface ModLessonLaunchAttempt200Response {
    /**
     * 
     * @type {Array<ModLessonGetPageData200ResponseMessagesInner>}
     * @memberof ModLessonLaunchAttempt200Response
     */
    messages: Array<ModLessonGetPageData200ResponseMessagesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModLessonLaunchAttempt200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModLessonLaunchAttempt200Response interface.
 */
export function instanceOfModLessonLaunchAttempt200Response(value: object): boolean {
    if (!('messages' in value)) return false;
    return true;
}

export function ModLessonLaunchAttempt200ResponseFromJSON(json: any): ModLessonLaunchAttempt200Response {
    return ModLessonLaunchAttempt200ResponseFromJSONTyped(json, false);
}

export function ModLessonLaunchAttempt200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonLaunchAttempt200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'messages': ((json['messages'] as Array<any>).map(ModLessonGetPageData200ResponseMessagesInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModLessonLaunchAttempt200ResponseToJSON(value?: ModLessonLaunchAttempt200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'messages': ((value['messages'] as Array<any>).map(ModLessonGetPageData200ResponseMessagesInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

