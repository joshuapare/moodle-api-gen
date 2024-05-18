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
 * grade information
 * @export
 * @interface ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
 */
export interface ModAssignGetGrades200ResponseAssignmentsInnerGradesInner {
    /**
     * assignment id
     * @type {number}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    assignment?: number;
    /**
     * attempt number
     * @type {number}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    attemptnumber?: number;
    /**
     * grade
     * @type {string}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    grade?: string;
    /**
     * grade rendered into a format suitable for display
     * @type {string}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    gradefordisplay?: string;
    /**
     * grader, -1 if grader is hidden
     * @type {number}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    grader?: number;
    /**
     * grade id
     * @type {number}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    id?: number;
    /**
     * grade creation time
     * @type {number}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    timecreated?: number;
    /**
     * grade last modified time
     * @type {number}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    timemodified?: number;
    /**
     * student id
     * @type {number}
     * @memberof ModAssignGetGrades200ResponseAssignmentsInnerGradesInner
     */
    userid?: number;
}

/**
 * Check if a given object implements the ModAssignGetGrades200ResponseAssignmentsInnerGradesInner interface.
 */
export function instanceOfModAssignGetGrades200ResponseAssignmentsInnerGradesInner(value: object): boolean {
    return true;
}

export function ModAssignGetGrades200ResponseAssignmentsInnerGradesInnerFromJSON(json: any): ModAssignGetGrades200ResponseAssignmentsInnerGradesInner {
    return ModAssignGetGrades200ResponseAssignmentsInnerGradesInnerFromJSONTyped(json, false);
}

export function ModAssignGetGrades200ResponseAssignmentsInnerGradesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetGrades200ResponseAssignmentsInnerGradesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'assignment': json['assignment'] == null ? undefined : json['assignment'],
        'attemptnumber': json['attemptnumber'] == null ? undefined : json['attemptnumber'],
        'grade': json['grade'] == null ? undefined : json['grade'],
        'gradefordisplay': json['gradefordisplay'] == null ? undefined : json['gradefordisplay'],
        'grader': json['grader'] == null ? undefined : json['grader'],
        'id': json['id'] == null ? undefined : json['id'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModAssignGetGrades200ResponseAssignmentsInnerGradesInnerToJSON(value?: ModAssignGetGrades200ResponseAssignmentsInnerGradesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignment': value['assignment'],
        'attemptnumber': value['attemptnumber'],
        'grade': value['grade'],
        'gradefordisplay': value['gradefordisplay'],
        'grader': value['grader'],
        'id': value['id'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'userid': value['userid'],
    };
}
