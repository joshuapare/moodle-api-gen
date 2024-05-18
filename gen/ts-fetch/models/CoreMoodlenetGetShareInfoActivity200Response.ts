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
 * @interface CoreMoodlenetGetShareInfoActivity200Response
 */
export interface CoreMoodlenetGetShareInfoActivity200Response {
    /**
     * MoodleNet issuer id
     * @type {number}
     * @memberof CoreMoodlenetGetShareInfoActivity200Response
     */
    issuerid: number;
    /**
     * Activity name
     * @type {string}
     * @memberof CoreMoodlenetGetShareInfoActivity200Response
     */
    name: string;
    /**
     * MoodleNet server
     * @type {string}
     * @memberof CoreMoodlenetGetShareInfoActivity200Response
     */
    server: string;
    /**
     * status: true if success
     * @type {boolean}
     * @memberof CoreMoodlenetGetShareInfoActivity200Response
     */
    status: boolean;
    /**
     * Support page URL
     * @type {string}
     * @memberof CoreMoodlenetGetShareInfoActivity200Response
     */
    supportpageurl: string;
    /**
     * Activity type
     * @type {string}
     * @memberof CoreMoodlenetGetShareInfoActivity200Response
     */
    type: string;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreMoodlenetGetShareInfoActivity200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreMoodlenetGetShareInfoActivity200Response interface.
 */
export function instanceOfCoreMoodlenetGetShareInfoActivity200Response(value: object): boolean {
    if (!('issuerid' in value)) return false;
    if (!('name' in value)) return false;
    if (!('server' in value)) return false;
    if (!('status' in value)) return false;
    if (!('supportpageurl' in value)) return false;
    if (!('type' in value)) return false;
    return true;
}

export function CoreMoodlenetGetShareInfoActivity200ResponseFromJSON(json: any): CoreMoodlenetGetShareInfoActivity200Response {
    return CoreMoodlenetGetShareInfoActivity200ResponseFromJSONTyped(json, false);
}

export function CoreMoodlenetGetShareInfoActivity200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMoodlenetGetShareInfoActivity200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'issuerid': json['issuerid'],
        'name': json['name'],
        'server': json['server'],
        'status': json['status'],
        'supportpageurl': json['supportpageurl'],
        'type': json['type'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreMoodlenetGetShareInfoActivity200ResponseToJSON(value?: CoreMoodlenetGetShareInfoActivity200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'issuerid': value['issuerid'],
        'name': value['name'],
        'server': value['server'],
        'status': value['status'],
        'supportpageurl': value['supportpageurl'],
        'type': value['type'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
