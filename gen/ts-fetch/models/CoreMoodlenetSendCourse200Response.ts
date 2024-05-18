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
 * @interface CoreMoodlenetSendCourse200Response
 */
export interface CoreMoodlenetSendCourse200Response {
    /**
     * Resource URL from MoodleNet
     * @type {string}
     * @memberof CoreMoodlenetSendCourse200Response
     */
    resourceurl: string;
    /**
     * Status: true if success
     * @type {boolean}
     * @memberof CoreMoodlenetSendCourse200Response
     */
    status: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreMoodlenetSendCourse200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreMoodlenetSendCourse200Response interface.
 */
export function instanceOfCoreMoodlenetSendCourse200Response(value: object): boolean {
    if (!('resourceurl' in value)) return false;
    if (!('status' in value)) return false;
    return true;
}

export function CoreMoodlenetSendCourse200ResponseFromJSON(json: any): CoreMoodlenetSendCourse200Response {
    return CoreMoodlenetSendCourse200ResponseFromJSONTyped(json, false);
}

export function CoreMoodlenetSendCourse200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMoodlenetSendCourse200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'resourceurl': json['resourceurl'],
        'status': json['status'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreMoodlenetSendCourse200ResponseToJSON(value?: CoreMoodlenetSendCourse200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'resourceurl': value['resourceurl'],
        'status': value['status'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
