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
import type { CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner } from './CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner';
import {
    CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerFromJSON,
    CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerFromJSONTyped,
    CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerToJSON,
} from './CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner';

/**
 * 
 * @export
 * @interface CoreGradesGetEnrolledUsersForSelector200Response
 */
export interface CoreGradesGetEnrolledUsersForSelector200Response {
    /**
     * 
     * @type {Array<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner>}
     * @memberof CoreGradesGetEnrolledUsersForSelector200Response
     */
    Users: Array<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreGradesGetEnrolledUsersForSelector200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreGradesGetEnrolledUsersForSelector200Response interface.
 */
export function instanceOfCoreGradesGetEnrolledUsersForSelector200Response(value: object): boolean {
    if (!('Users' in value)) return false;
    return true;
}

export function CoreGradesGetEnrolledUsersForSelector200ResponseFromJSON(json: any): CoreGradesGetEnrolledUsersForSelector200Response {
    return CoreGradesGetEnrolledUsersForSelector200ResponseFromJSONTyped(json, false);
}

export function CoreGradesGetEnrolledUsersForSelector200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGetEnrolledUsersForSelector200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Users': ((json['users'] as Array<any>).map(CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreGradesGetEnrolledUsersForSelector200ResponseToJSON(value?: CoreGradesGetEnrolledUsersForSelector200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'users': ((value['Users'] as Array<any>).map(CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

