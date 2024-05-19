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
 * @interface EnrolSelfEnrolUser200Response
 */
export interface EnrolSelfEnrolUser200Response {
    /**
     * status: true if the user is enrolled, false otherwise
     * @type {boolean}
     * @memberof EnrolSelfEnrolUser200Response
     */
    Status: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof EnrolSelfEnrolUser200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the EnrolSelfEnrolUser200Response interface.
 */
export function instanceOfEnrolSelfEnrolUser200Response(value: object): boolean {
    if (!('Status' in value)) return false;
    return true;
}

export function EnrolSelfEnrolUser200ResponseFromJSON(json: any): EnrolSelfEnrolUser200Response {
    return EnrolSelfEnrolUser200ResponseFromJSONTyped(json, false);
}

export function EnrolSelfEnrolUser200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrolSelfEnrolUser200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Status': json['status'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function EnrolSelfEnrolUser200ResponseToJSON(value?: EnrolSelfEnrolUser200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': value['Status'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

