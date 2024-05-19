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
 * @interface CoreEnrolGetPotentialUsersRequest
 */
export interface CoreEnrolGetPotentialUsersRequest {
    /**
     * course id
     * @type {number}
     * @memberof CoreEnrolGetPotentialUsersRequest
     */
    Courseid: number;
    /**
     * enrolment id
     * @type {number}
     * @memberof CoreEnrolGetPotentialUsersRequest
     */
    Enrolid: number;
    /**
     * Page number
     * @type {number}
     * @memberof CoreEnrolGetPotentialUsersRequest
     */
    Page: number;
    /**
     * Number per page
     * @type {number}
     * @memberof CoreEnrolGetPotentialUsersRequest
     */
    Perpage: number;
    /**
     * query
     * @type {string}
     * @memberof CoreEnrolGetPotentialUsersRequest
     */
    Search: string;
    /**
     * find a match anywhere, or only at the beginning
     * @type {boolean}
     * @memberof CoreEnrolGetPotentialUsersRequest
     */
    Searchanywhere: boolean;
}

/**
 * Check if a given object implements the CoreEnrolGetPotentialUsersRequest interface.
 */
export function instanceOfCoreEnrolGetPotentialUsersRequest(value: object): boolean {
    if (!('Courseid' in value)) return false;
    if (!('Enrolid' in value)) return false;
    if (!('Page' in value)) return false;
    if (!('Perpage' in value)) return false;
    if (!('Search' in value)) return false;
    if (!('Searchanywhere' in value)) return false;
    return true;
}

export function CoreEnrolGetPotentialUsersRequestFromJSON(json: any): CoreEnrolGetPotentialUsersRequest {
    return CoreEnrolGetPotentialUsersRequestFromJSONTyped(json, false);
}

export function CoreEnrolGetPotentialUsersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreEnrolGetPotentialUsersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'],
        'Enrolid': json['enrolid'],
        'Page': json['page'],
        'Perpage': json['perpage'],
        'Search': json['search'],
        'Searchanywhere': json['searchanywhere'],
    };
}

export function CoreEnrolGetPotentialUsersRequestToJSON(value?: CoreEnrolGetPotentialUsersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'enrolid': value['Enrolid'],
        'page': value['Page'],
        'perpage': value['Perpage'],
        'search': value['Search'],
        'searchanywhere': value['Searchanywhere'],
    };
}
