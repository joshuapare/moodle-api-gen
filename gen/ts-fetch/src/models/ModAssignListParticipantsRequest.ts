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
    Assignid: number;
    /**
     * search string to filter the results
     * @type {string}
     * @memberof ModAssignListParticipantsRequest
     */
    Filter: string;
    /**
     * group id
     * @type {number}
     * @memberof ModAssignListParticipantsRequest
     */
    Groupid: number;
    /**
     * Do return courses where the user is enrolled
     * @type {boolean}
     * @memberof ModAssignListParticipantsRequest
     */
    Includeenrolments?: boolean;
    /**
     * maximum number of records to return
     * @type {number}
     * @memberof ModAssignListParticipantsRequest
     */
    Limit?: number;
    /**
     * Do not return all user fields
     * @type {boolean}
     * @memberof ModAssignListParticipantsRequest
     */
    Onlyids?: boolean;
    /**
     * number of records to skip
     * @type {number}
     * @memberof ModAssignListParticipantsRequest
     */
    Skip?: number;
    /**
     * Apply current user table sorting preferences.
     * @type {boolean}
     * @memberof ModAssignListParticipantsRequest
     */
    Tablesort?: boolean;
}

/**
 * Check if a given object implements the ModAssignListParticipantsRequest interface.
 */
export function instanceOfModAssignListParticipantsRequest(value: object): boolean {
    if (!('Assignid' in value)) return false;
    if (!('Filter' in value)) return false;
    if (!('Groupid' in value)) return false;
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
        
        'Assignid': json['assignid'],
        'Filter': json['filter'],
        'Groupid': json['groupid'],
        'Includeenrolments': json['includeenrolments'] == null ? undefined : json['includeenrolments'],
        'Limit': json['limit'] == null ? undefined : json['limit'],
        'Onlyids': json['onlyids'] == null ? undefined : json['onlyids'],
        'Skip': json['skip'] == null ? undefined : json['skip'],
        'Tablesort': json['tablesort'] == null ? undefined : json['tablesort'],
    };
}

export function ModAssignListParticipantsRequestToJSON(value?: ModAssignListParticipantsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignid': value['Assignid'],
        'filter': value['Filter'],
        'groupid': value['Groupid'],
        'includeenrolments': value['Includeenrolments'],
        'limit': value['Limit'],
        'onlyids': value['Onlyids'],
        'skip': value['Skip'],
        'tablesort': value['Tablesort'],
    };
}

