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
 * @interface CoreUserViewUserListRequest
 */
export interface CoreUserViewUserListRequest {
    /**
     * id of the course, 0 for site
     * @type {number}
     * @memberof CoreUserViewUserListRequest
     */
    courseid: number;
}

/**
 * Check if a given object implements the CoreUserViewUserListRequest interface.
 */
export function instanceOfCoreUserViewUserListRequest(value: object): boolean {
    if (!('courseid' in value)) return false;
    return true;
}

export function CoreUserViewUserListRequestFromJSON(json: any): CoreUserViewUserListRequest {
    return CoreUserViewUserListRequestFromJSONTyped(json, false);
}

export function CoreUserViewUserListRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserViewUserListRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'courseid': json['courseid'],
    };
}

export function CoreUserViewUserListRequestToJSON(value?: CoreUserViewUserListRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['courseid'],
    };
}
