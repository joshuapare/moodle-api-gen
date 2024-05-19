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
 * @interface CoreUserViewUserProfileRequest
 */
export interface CoreUserViewUserProfileRequest {
    /**
     * id of the course, default site course
     * @type {number}
     * @memberof CoreUserViewUserProfileRequest
     */
    Courseid?: number;
    /**
     * id of the user, 0 for current user
     * @type {number}
     * @memberof CoreUserViewUserProfileRequest
     */
    Userid: number;
}

/**
 * Check if a given object implements the CoreUserViewUserProfileRequest interface.
 */
export function instanceOfCoreUserViewUserProfileRequest(value: object): boolean {
    if (!('Userid' in value)) return false;
    return true;
}

export function CoreUserViewUserProfileRequestFromJSON(json: any): CoreUserViewUserProfileRequest {
    return CoreUserViewUserProfileRequestFromJSONTyped(json, false);
}

export function CoreUserViewUserProfileRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserViewUserProfileRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Userid': json['userid'],
    };
}

export function CoreUserViewUserProfileRequestToJSON(value?: CoreUserViewUserProfileRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'userid': value['Userid'],
    };
}

