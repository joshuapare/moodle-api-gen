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
import type { ModAssignGetSubmissionStatus200ResponseFeedbackGrade } from './ModAssignGetSubmissionStatus200ResponseFeedbackGrade';
import {
    ModAssignGetSubmissionStatus200ResponseFeedbackGradeFromJSON,
    ModAssignGetSubmissionStatus200ResponseFeedbackGradeFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseFeedbackGradeToJSON,
} from './ModAssignGetSubmissionStatus200ResponseFeedbackGrade';
import type { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner } from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner';
import {
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFromJSON,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFromJSONTyped,
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerToJSON,
} from './ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner';

/**
 * 
 * @export
 * @interface ModAssignGetSubmissionStatus200ResponseFeedback
 */
export interface ModAssignGetSubmissionStatus200ResponseFeedback {
    /**
     * 
     * @type {ModAssignGetSubmissionStatus200ResponseFeedbackGrade}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedback
     */
    Grade?: ModAssignGetSubmissionStatus200ResponseFeedbackGrade;
    /**
     * The date the user was graded.
     * @type {number}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedback
     */
    Gradeddate: number;
    /**
     * Grade rendered into a format suitable for display.
     * @type {string}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedback
     */
    Gradefordisplay: string;
    /**
     * 
     * @type {Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner>}
     * @memberof ModAssignGetSubmissionStatus200ResponseFeedback
     */
    Plugins?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner>;
}

/**
 * Check if a given object implements the ModAssignGetSubmissionStatus200ResponseFeedback interface.
 */
export function instanceOfModAssignGetSubmissionStatus200ResponseFeedback(value: object): boolean {
    if (!('Gradeddate' in value)) return false;
    if (!('Gradefordisplay' in value)) return false;
    return true;
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackFromJSON(json: any): ModAssignGetSubmissionStatus200ResponseFeedback {
    return ModAssignGetSubmissionStatus200ResponseFeedbackFromJSONTyped(json, false);
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetSubmissionStatus200ResponseFeedback {
    if (json == null) {
        return json;
    }
    return {
        
        'Grade': json['grade'] == null ? undefined : ModAssignGetSubmissionStatus200ResponseFeedbackGradeFromJSON(json['grade']),
        'Gradeddate': json['gradeddate'],
        'Gradefordisplay': json['gradefordisplay'],
        'Plugins': json['plugins'] == null ? undefined : ((json['plugins'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFromJSON)),
    };
}

export function ModAssignGetSubmissionStatus200ResponseFeedbackToJSON(value?: ModAssignGetSubmissionStatus200ResponseFeedback | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'grade': ModAssignGetSubmissionStatus200ResponseFeedbackGradeToJSON(value['Grade']),
        'gradeddate': value['Gradeddate'],
        'gradefordisplay': value['Gradefordisplay'],
        'plugins': value['Plugins'] == null ? undefined : ((value['Plugins'] as Array<any>).map(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerToJSON)),
    };
}
