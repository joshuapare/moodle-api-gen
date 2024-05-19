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
    Allowsubmissionsfromdate: number;
    /**
     * is blind marking enabled for this assignment
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    Blindmarking: boolean;
    /**
     * cutoffdate for the user
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    Cutoffdate: number;
    /**
     * duedate for the user
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    Duedate: number;
    /**
     * duedate for the user
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    Duedatestr: string;
    /**
     * The fullname of the user
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    Fullname: string;
    /**
     * have they been granted an extension
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    Grantedextension: boolean;
    /**
     * for group assignments this is the group id
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    Groupid?: number;
    /**
     * for group assignments this is the group name
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    Groupname?: string;
    /**
     * ID of the user
     * @type {number}
     * @memberof ModAssignGetParticipant200Response
     */
    Id: number;
    /**
     * is their submission waiting for grading
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    Requiregrading: boolean;
    /**
     * The submission status (new, draft, reopened or submitted).
     *                 Empty when not submitted.
     * @type {string}
     * @memberof ModAssignGetParticipant200Response
     */
    Submissionstatus?: string;
    /**
     * have they submitted their assignment
     * @type {boolean}
     * @memberof ModAssignGetParticipant200Response
     */
    Submitted: boolean;
    /**
     * 
     * @type {ModAssignGetParticipant200ResponseUser}
     * @memberof ModAssignGetParticipant200Response
     */
    User?: ModAssignGetParticipant200ResponseUser;
}

/**
 * Check if a given object implements the ModAssignGetParticipant200Response interface.
 */
export function instanceOfModAssignGetParticipant200Response(value: object): boolean {
    if (!('Allowsubmissionsfromdate' in value)) return false;
    if (!('Blindmarking' in value)) return false;
    if (!('Cutoffdate' in value)) return false;
    if (!('Duedate' in value)) return false;
    if (!('Duedatestr' in value)) return false;
    if (!('Fullname' in value)) return false;
    if (!('Grantedextension' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Requiregrading' in value)) return false;
    if (!('Submitted' in value)) return false;
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
        
        'Allowsubmissionsfromdate': json['allowsubmissionsfromdate'],
        'Blindmarking': json['blindmarking'],
        'Cutoffdate': json['cutoffdate'],
        'Duedate': json['duedate'],
        'Duedatestr': json['duedatestr'],
        'Fullname': json['fullname'],
        'Grantedextension': json['grantedextension'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Groupname': json['groupname'] == null ? undefined : json['groupname'],
        'Id': json['id'],
        'Requiregrading': json['requiregrading'],
        'Submissionstatus': json['submissionstatus'] == null ? undefined : json['submissionstatus'],
        'Submitted': json['submitted'],
        'User': json['user'] == null ? undefined : ModAssignGetParticipant200ResponseUserFromJSON(json['user']),
    };
}

export function ModAssignGetParticipant200ResponseToJSON(value?: ModAssignGetParticipant200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allowsubmissionsfromdate': value['Allowsubmissionsfromdate'],
        'blindmarking': value['Blindmarking'],
        'cutoffdate': value['Cutoffdate'],
        'duedate': value['Duedate'],
        'duedatestr': value['Duedatestr'],
        'fullname': value['Fullname'],
        'grantedextension': value['Grantedextension'],
        'groupid': value['Groupid'],
        'groupname': value['Groupname'],
        'id': value['Id'],
        'requiregrading': value['Requiregrading'],
        'submissionstatus': value['Submissionstatus'],
        'submitted': value['Submitted'],
        'user': ModAssignGetParticipant200ResponseUserToJSON(value['User']),
    };
}

