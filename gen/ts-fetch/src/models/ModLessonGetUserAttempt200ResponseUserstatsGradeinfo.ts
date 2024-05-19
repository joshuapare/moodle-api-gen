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
 * @interface ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
 */
export interface ModLessonGetUserAttempt200ResponseUserstatsGradeinfo {
    /**
     * Number of question attempts
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
     */
    Attempts: number;
    /**
     * Points earned by student
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
     */
    Earned: number;
    /**
     * Calculated percentage grade
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
     */
    Grade: number;
    /**
     * Point value for manually graded questions
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
     */
    Manualpoints: number;
    /**
     * Number of manually graded questions
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
     */
    Nmanual: number;
    /**
     * Number of questions answered
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
     */
    Nquestions: number;
    /**
     * Max points possible
     * @type {number}
     * @memberof ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
     */
    Total: number;
}

/**
 * Check if a given object implements the ModLessonGetUserAttempt200ResponseUserstatsGradeinfo interface.
 */
export function instanceOfModLessonGetUserAttempt200ResponseUserstatsGradeinfo(value: object): boolean {
    if (!('Attempts' in value)) return false;
    if (!('Earned' in value)) return false;
    if (!('Grade' in value)) return false;
    if (!('Manualpoints' in value)) return false;
    if (!('Nmanual' in value)) return false;
    if (!('Nquestions' in value)) return false;
    if (!('Total' in value)) return false;
    return true;
}

export function ModLessonGetUserAttempt200ResponseUserstatsGradeinfoFromJSON(json: any): ModLessonGetUserAttempt200ResponseUserstatsGradeinfo {
    return ModLessonGetUserAttempt200ResponseUserstatsGradeinfoFromJSONTyped(json, false);
}

export function ModLessonGetUserAttempt200ResponseUserstatsGradeinfoFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetUserAttempt200ResponseUserstatsGradeinfo {
    if (json == null) {
        return json;
    }
    return {
        
        'Attempts': json['attempts'],
        'Earned': json['earned'],
        'Grade': json['grade'],
        'Manualpoints': json['manualpoints'],
        'Nmanual': json['nmanual'],
        'Nquestions': json['nquestions'],
        'Total': json['total'],
    };
}

export function ModLessonGetUserAttempt200ResponseUserstatsGradeinfoToJSON(value?: ModLessonGetUserAttempt200ResponseUserstatsGradeinfo | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attempts': value['Attempts'],
        'earned': value['Earned'],
        'grade': value['Grade'],
        'manualpoints': value['Manualpoints'],
        'nmanual': value['Nmanual'],
        'nquestions': value['Nquestions'],
        'total': value['Total'],
    };
}
