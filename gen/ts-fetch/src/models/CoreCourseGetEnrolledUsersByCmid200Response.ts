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
import type { CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner } from './CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner';
import {
    CoreCourseGetEnrolledUsersByCmid200ResponseUsersInnerFromJSON,
    CoreCourseGetEnrolledUsersByCmid200ResponseUsersInnerFromJSONTyped,
    CoreCourseGetEnrolledUsersByCmid200ResponseUsersInnerToJSON,
} from './CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner';

/**
 * 
 * @export
 * @interface CoreCourseGetEnrolledUsersByCmid200Response
 */
export interface CoreCourseGetEnrolledUsersByCmid200Response {
    /**
     * 
     * @type {Array<CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner>}
     * @memberof CoreCourseGetEnrolledUsersByCmid200Response
     */
    Users: Array<CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreCourseGetEnrolledUsersByCmid200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreCourseGetEnrolledUsersByCmid200Response interface.
 */
export function instanceOfCoreCourseGetEnrolledUsersByCmid200Response(value: object): boolean {
    if (!('Users' in value)) return false;
    return true;
}

export function CoreCourseGetEnrolledUsersByCmid200ResponseFromJSON(json: any): CoreCourseGetEnrolledUsersByCmid200Response {
    return CoreCourseGetEnrolledUsersByCmid200ResponseFromJSONTyped(json, false);
}

export function CoreCourseGetEnrolledUsersByCmid200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCourseGetEnrolledUsersByCmid200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Users': ((json['users'] as Array<any>).map(CoreCourseGetEnrolledUsersByCmid200ResponseUsersInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreCourseGetEnrolledUsersByCmid200ResponseToJSON(value?: CoreCourseGetEnrolledUsersByCmid200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'users': ((value['Users'] as Array<any>).map(CoreCourseGetEnrolledUsersByCmid200ResponseUsersInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

