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
 * @interface CoreSearchGetRelevantUsersRequest
 */
export interface CoreSearchGetRelevantUsersRequest {
    /**
     * Course id (0 if none)
     * @type {number}
     * @memberof CoreSearchGetRelevantUsersRequest
     */
    Courseid: number;
    /**
     * Query string (full or partial user full name or other details)
     * @type {string}
     * @memberof CoreSearchGetRelevantUsersRequest
     */
    Query: string;
}

/**
 * Check if a given object implements the CoreSearchGetRelevantUsersRequest interface.
 */
export function instanceOfCoreSearchGetRelevantUsersRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    if (!('Query' in value)) return false;
    return true;
}

export function CoreSearchGetRelevantUsersRequestFromJSON(json: any): CoreSearchGetRelevantUsersRequest {
    return CoreSearchGetRelevantUsersRequestFromJSONTyped(json, false);
}

export function CoreSearchGetRelevantUsersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreSearchGetRelevantUsersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
        'Query': json['query'],
    };
}

export function CoreSearchGetRelevantUsersRequestToJSON(value?: CoreSearchGetRelevantUsersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'query': value['Query'],
    };
}
