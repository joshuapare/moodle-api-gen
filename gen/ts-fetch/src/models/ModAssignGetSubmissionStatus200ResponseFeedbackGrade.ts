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
 * @interface ModAssignGetSubmissionStatus200ResponseFeedbackGrade
 */
export interface ModAssignGetSubmissionStatus200ResponseFeedbackGrade {
    /**
     * assignment id
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Assignment?: number;
    /**
     * attempt number
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Attemptnumber: number;
    /**
     * grade
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Grade: string;
    /**
     * grade rendered into a format suitable for display
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Gradefordisplay?: string;
    /**
     * grader, -1 if grader is hidden
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Grader: number;
    /**
     * grade id
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Id: number;
    /**
     * grade creation time
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Timecreated: number;
    /**
     * grade last modified time
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Timemodified: number;
    /**
     * student id
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedbackGrade
     */
    Userid: number;
}

/**
 * Check if a given object implements the ModAssignGetSubmissionStatus200ResponseFeedbackGrade interface.
 */
export function instanceOfModAssignGetSubmissionStatus200ResponseFeedbackGrade(value: object): boolean {
    if (!('Attemptnumber' in value)) return false;
    if (!('Grade' in value)) return false;
    if (!('Grader' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Timecreated' in value)) return false;
    if (!('Timemodified' in value)) return false;
    if (!('Userid' in value)) return false;
    return true;
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackGradeFromJSON(json: any): ModAssignGetSubmissionStatus200ResponseFeedbackGrade {
    return ModAssignGetSubmissionStatus200ResponseFeedbackGradeFromJSONTyped(json, false);
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackGradeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetSubmissionStatus200ResponseFeedbackGrade {
    if (json == null) {
        return json;
    }
    return {
        
        'Assignment': json['assignment'] == null ? undefined : json['assignment'],
        'Attemptnumber': json['attemptnumber'],
        'Grade': json['grade'],
        'Gradefordisplay': json['gradefordisplay'] == null ? undefined : json['gradefordisplay'],
        'Grader': json['grader'],
        'Id': json['id'],
        'Timecreated': json['timecreated'],
        'Timemodified': json['timemodified'],
        'Userid': json['userid'],
    };
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackGradeToJSON(value?: ModAssignGetSubmissionStatus200ResponseFeedbackGrade | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assignment': value['Assignment'],
        'attemptnumber': value['Attemptnumber'],
        'grade': value['Grade'],
        'gradefordisplay': value['Gradefordisplay'],
        'grader': value['Grader'],
        'id': value['Id'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'userid': value['Userid'],
    };
}

