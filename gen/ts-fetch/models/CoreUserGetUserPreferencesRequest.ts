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
 * @interface CoreUserGetUserPreferencesRequest
 */
export interface CoreUserGetUserPreferencesRequest {
    /**
     * preference name, empty for all
     * @type {string}
     * @memberof CoreUserGetUserPreferencesRequest
     */
    name?: string;
    /**
     * id of the user, default to current user
     * @type {number}
     * @memberof CoreUserGetUserPreferencesRequest
     */
    userid?: number;
}

/**
 * Check if a given object implements the CoreUserGetUserPreferencesRequest interface.
 */
export function instanceOfCoreUserGetUserPreferencesRequest(value: object): boolean {
    return true;
}

export function CoreUserGetUserPreferencesRequestFromJSON(json: any): CoreUserGetUserPreferencesRequest {
    return CoreUserGetUserPreferencesRequestFromJSONTyped(json, false);
}

export function CoreUserGetUserPreferencesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserGetUserPreferencesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function CoreUserGetUserPreferencesRequestToJSON(value?: CoreUserGetUserPreferencesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'userid': value['userid'],
    };
}

