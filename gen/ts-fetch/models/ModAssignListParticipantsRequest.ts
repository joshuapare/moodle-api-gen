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
 * @interface ModAssignListParticipantsRequest
 */
export interface ModAssignListParticipantsRequest {
    /**
     * assign instance id
     * @type {number}
     * @memberof ModAssignListParticipantsRequest
     */
    assignid: number;
    /**
     * search string to filter the results
     * @type {string}
     * @memberof ModAssignListParticipantsRequest
     */
    filter: string;
    /**
     * group id
     * @type {number}
     * @memberof ModAssignListParticipantsRequest
     */
    groupid: number;
    /**
     * Do return courses where the user is enrolled
     * @type {boolean}
     * @memberof ModAssignListParticipantsRequest
     */
    includeenrolments?: boolean;
    /**
     * maximum number of records to return
     * @type {number}
     * @memberof ModAssignListParticipantsRequest
     */
    limit?: number;
    /**
     * Do not return all user fields
     * @type {boolean}
     * @memberof ModAssignListParticipantsRequest
     */
    onlyids?: boolean;
    /**
     * number of records to skip
     * @type {number}
     * @memberof ModAssignListParticipantsRequest
     */
    skip?: number;
    /**
     * Apply current user table sorting preferences.
     * @type {boolean}
     * @memberof ModAssignListParticipantsRequest
     */
    tablesort?: boolean;
}

/**
 * Check if a given object implements the ModAssignListParticipantsRequest interface.
 */
export function instanceOfModAssignListParticipantsRequest(value: object): boolean {
    if (!('assignid' in value)) return false;
    if (!('filter' in value)) return false;
    if (!('groupid' in value)) return false;
    return true;
}

export function ModAssignListParticipantsRequestFromJSON(json: any): ModAssignListParticipantsRequest {
    return ModAssignListParticipantsRequestFromJSONTyped(json, false);
}

export function ModAssignListParticipantsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignListParticipantsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'assignid': json['assignid'],
        'filter': json['filter'],
        'groupid': json['groupid'],
        'includeenrolments': json['includeenrolments'] == null ? undefined : json['includeenrolments'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'onlyids': json['onlyids'] == null ? undefined : json['onlyids'],
        'skip': json['skip'] == null ? undefined : json['skip'],
        'tablesort': json['tablesort'] == null ? undefined : json['tablesort'],
    };
}

export function ModAssignListParticipantsRequestToJSON(value?: ModAssignListParticipantsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignid': value['assignid'],
        'filter': value['filter'],
        'groupid': value['groupid'],
        'includeenrolments': value['includeenrolments'],
        'limit': value['limit'],
        'onlyids': value['onlyids'],
        'skip': value['skip'],
        'tablesort': value['tablesort'],
    };
}
