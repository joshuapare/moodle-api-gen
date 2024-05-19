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
import type { CoreEnrolGetEnrolledUsersRequestOptionsInner } from './CoreEnrolGetEnrolledUsersRequestOptionsInner';
import {
    CoreEnrolGetEnrolledUsersRequestOptionsInnerFromJSON,
    CoreEnrolGetEnrolledUsersRequestOptionsInnerFromJSONTyped,
    CoreEnrolGetEnrolledUsersRequestOptionsInnerToJSON,
} from './CoreEnrolGetEnrolledUsersRequestOptionsInner';

/**
 * 
 * @export
 * @interface CoreEnrolGetEnrolledUsersRequest
 */
export interface CoreEnrolGetEnrolledUsersRequest {
    /**
     * course id
     * @type {number}
     * @memberof CoreEnrolGetEnrolledUsersRequest
     */
    Courseid: number;
    /**
     * 
     * @type {Array<CoreEnrolGetEnrolledUsersRequestOptionsInner>}
     * @memberof CoreEnrolGetEnrolledUsersRequest
     */
    Options?: Array<CoreEnrolGetEnrolledUsersRequestOptionsInner>;
}

/**
 * Check if a given object implements the CoreEnrolGetEnrolledUsersRequest interface.
 */
export function instanceOfCoreEnrolGetEnrolledUsersRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    return true;
}

export function CoreEnrolGetEnrolledUsersRequestFromJSON(json: any): CoreEnrolGetEnrolledUsersRequest {
    return CoreEnrolGetEnrolledUsersRequestFromJSONTyped(json, false);
}

export function CoreEnrolGetEnrolledUsersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreEnrolGetEnrolledUsersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
        'Options': json['options'] == null ? undefined : ((json['options'] as Array<any>).map(CoreEnrolGetEnrolledUsersRequestOptionsInnerFromJSON)),
    };
}

export function CoreEnrolGetEnrolledUsersRequestToJSON(value?: CoreEnrolGetEnrolledUsersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'options': value['Options'] == null ? undefined : ((value['Options'] as Array<any>).map(CoreEnrolGetEnrolledUsersRequestOptionsInnerToJSON)),
    };
}

