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
import type { ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner } from './ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner';
import {
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerFromJSON,
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerToJSON,
} from './ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner';

/**
 * submission info
 * @export
 * @interface ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
 */
export interface ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner {
    /**
     * assignment id
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Assignment?: number;
    /**
     * attempt number
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Attemptnumber?: number;
    /**
     * Grading status.
     * @type {string}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Gradingstatus?: string;
    /**
     * group id
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Groupid?: number;
    /**
     * submission id
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Id?: number;
    /**
     * latest attempt
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Latest?: number;
    /**
     * 
     * @type {Array<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner>}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Plugins?: Array<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner>;
    /**
     * submission status
     * @type {string}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Status?: string;
    /**
     * submission creation time
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Timecreated?: number;
    /**
     * submission last modified time
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Timemodified?: number;
    /**
     * submission start time
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Timestarted?: number;
    /**
     * student id
     * @type {number}
     * @memberof ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner interface.
 */
export function instanceOfModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner(value: object): boolean {
    return true;
}

export function ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInnerFromJSON(json: any): ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner {
    return ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInnerFromJSONTyped(json, false);
}

export function ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignment': json['assignment'] == null ? undefined : json['assignment'],
        'Attemptnumber': json['attemptnumber'] == null ? undefined : json['attemptnumber'],
        'Gradingstatus': json['gradingstatus'] == null ? undefined : json['gradingstatus'],
        'Groupid': json['groupid'] == null ? undefined : json['groupid'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Latest': json['latest'] == null ? undefined : json['latest'],
        'Plugins': json['plugins'] == null ? undefined : ((json['plugins'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerFromJSON)),
        'Status': json['status'] == null ? undefined : json['status'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Timestarted': json['timestarted'] == null ? undefined : json['timestarted'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInnerToJSON(value?: ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignment': value['Assignment'],
        'attemptnumber': value['Attemptnumber'],
        'gradingstatus': value['Gradingstatus'],
        'groupid': value['Groupid'],
        'id': value['Id'],
        'latest': value['Latest'],
        'plugins': value['Plugins'] == null ? undefined : ((value['Plugins'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerToJSON)),
        'status': value['Status'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'timestarted': value['Timestarted'],
        'userid': value['Userid'],
    };
}
