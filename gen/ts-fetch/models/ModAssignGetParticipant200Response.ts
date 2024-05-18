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
import type { ModAssignGetParticipant200ResponseUser } from './ModAssignGetParticipant200ResponseUser';
import {
    ModAssignGetParticipant200ResponseUserFromJSON,
    ModAssignGetParticipant200ResponseUserFromJSONTyped,
    ModAssignGetParticipant200ResponseUserToJSON,
} from './ModAssignGetParticipant200ResponseUser';

/**
 * 
 * @export
 * @interface ModAssignGetParticipant200Response
 */
export interface ModAssignGetParticipant200Response {
    /**
     * allowsubmissionsfromdate for the user
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    allowsubmissionsfromdate: number;
    /**
     * is blind marking enabled for this assignment
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    blindmarking: boolean;
    /**
     * cutoffdate for the user
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    cutoffdate: number;
    /**
     * duedate for the user
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    duedate: number;
    /**
     * duedate for the user
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    duedatestr: string;
    /**
     * The fullname of the user
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    fullname: string;
    /**
     * have they been granted an extension
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    grantedextension: boolean;
    /**
     * for group assignments this is the group id
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    groupid?: number;
    /**
     * for group assignments this is the group name
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    groupname?: string;
    /**
     * ID of the user
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    id: number;
    /**
     * is their submission waiting for grading
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    requiregrading: boolean;
    /**
     * The submission status (new, draft, reopened or submitted).
     *                 Empty when not submitted.
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    submissionstatus?: string;
    /**
     * have they submitted their assignment
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    submitted: boolean;
    /**
     * 
     * @type {ModAssignGetParticipant200ResponseUser}
     * @memberof ModAssignGetParticipant200Response
     */
    user?: ModAssignGetParticipant200ResponseUser;
}

/**
 * Check if a given object implements the ModAssignGetParticipant200Response interface.
 */
export function instanceOfModAssignGetParticipant200Response(value: object): boolean {
    if (!('allowsubmissionsfromdate' in value)) return false;
    if (!('blindmarking' in value)) return false;
    if (!('cutoffdate' in value)) return false;
    if (!('duedate' in value)) return false;
    if (!('duedatestr' in value)) return false;
    if (!('fullname' in value)) return false;
    if (!('grantedextension' in value)) return false;
    if (!('id' in value)) return false;
    if (!('requiregrading' in value)) return false;
    if (!('submitted' in value)) return false;
    return true;
}

export function ModAssignGetParticipant200ResponseFromJSON(json: any): ModAssignGetParticipant200Response {
    return ModAssignGetParticipant200ResponseFromJSONTyped(json, false);
}

export function ModAssignGetParticipant200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetParticipant200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'allowsubmissionsfromdate': json['allowsubmissionsfromdate'],
        'blindmarking': json['blindmarking'],
        'cutoffdate': json['cutoffdate'],
        'duedate': json['duedate'],
        'duedatestr': json['duedatestr'],
        'fullname': json['fullname'],
        'grantedextension': json['grantedextension'],
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'groupname': json['groupname'] == null ? undefined : json['groupname'],
        'id': json['id'],
        'requiregrading': json['requiregrading'],
        'submissionstatus': json['submissionstatus'] == null ? undefined : json['submissionstatus'],
        'submitted': json['submitted'],
        'user': json['user'] == null ? undefined : ModAssignGetParticipant200ResponseUserFromJSON(json['user']),
    };
}

export function ModAssignGetParticipant200ResponseToJSON(value?: ModAssignGetParticipant200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allowsubmissionsfromdate': value['allowsubmissionsfromdate'],
        'blindmarking': value['blindmarking'],
        'cutoffdate': value['cutoffdate'],
        'duedate': value['duedate'],
        'duedatestr': value['duedatestr'],
        'fullname': value['fullname'],
        'grantedextension': value['grantedextension'],
        'groupid': value['groupid'],
        'groupname': value['groupname'],
        'id': value['id'],
        'requiregrading': value['requiregrading'],
        'submissionstatus': value['submissionstatus'],
        'submitted': value['submitted'],
        'user': ModAssignGetParticipant200ResponseUserToJSON(value['user']),
    };
}
