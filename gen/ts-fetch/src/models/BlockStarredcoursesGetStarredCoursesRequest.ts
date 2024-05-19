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
 * @interface BlockStarredcoursesGetStarredCoursesRequest
 */
export interface BlockStarredcoursesGetStarredCoursesRequest {
    /**
     * Limit
     * @type {number}
     * @memberof BlockStarredcoursesGetStarredCoursesRequest
     */
    Limit?: number;
    /**
     * Offset
     * @type {number}
     * @memberof BlockStarredcoursesGetStarredCoursesRequest
     */
    Offset?: number;
}

/**
 * Check if a given object implements the BlockStarredcoursesGetStarredCoursesRequest interface.
 */
export function instanceOfBlockStarredcoursesGetStarredCoursesRequest(value: object): boolean {
    return true;
}

export function BlockStarredcoursesGetStarredCoursesRequestFromJSON(json: any): BlockStarredcoursesGetStarredCoursesRequest {
    return BlockStarredcoursesGetStarredCoursesRequestFromJSONTyped(json, false);
}

export function BlockStarredcoursesGetStarredCoursesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockStarredcoursesGetStarredCoursesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Limit': json['limit'] == null ? undefined : json['limit'],
        'Offset': json['offset'] == null ? undefined : json['offset'],
    };
}

export function BlockStarredcoursesGetStarredCoursesRequestToJSON(value?: BlockStarredcoursesGetStarredCoursesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'limit': value['Limit'],
        'offset': value['Offset'],
    };
}

