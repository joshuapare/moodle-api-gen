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
import type { GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner } from './GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner';
import {
    GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerFromJSON,
    GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerFromJSONTyped,
    GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerToJSON,
} from './GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner';

/**
 * 
 * @export
 * @interface GradingformRubricGraderGradingpanelFetch200ResponseGrade
 */
export interface GradingformRubricGraderGradingpanelFetch200ResponseGrade {
    /**
     * Can the user edit this
     * @type {boolean}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Canedit: boolean;
    /**
     * 
     * @type {Array<GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner>}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Criteria: Array<GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner>;
    /**
     * The assumed grader of this grading instance
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Gradedby: string;
    /**
     * The id of the current grading instance
     * @type {number}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Instanceid: number;
    /**
     * Max possible grade
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Maxgrade: string;
    /**
     * The mode i.e. evaluate editable
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Rubricmode: string;
    /**
     * The time that the grade was created
     * @type {number}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Timecreated: number;
    /**
     * The time that the grade was last updated
     * @type {number}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Timemodified: number;
    /**
     * Current user grade
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    Usergrade: string;
}

/**
 * Check if a given object implements the GradingformRubricGraderGradingpanelFetch200ResponseGrade interface.
 */
export function instanceOfGradingformRubricGraderGradingpanelFetch200ResponseGrade(value: object): boolean {
    if (!('Canedit' in value)) return false;
    if (!('Criteria' in value)) return false;
    if (!('Gradedby' in value)) return false;
    if (!('Instanceid' in value)) return false;
    if (!('Maxgrade' in value)) return false;
    if (!('Rubricmode' in value)) return false;
    if (!('Timecreated' in value)) return false;
    if (!('Timemodified' in value)) return false;
    if (!('Usergrade' in value)) return false;
    return true;
}

export function GradingformRubricGraderGradingpanelFetch200ResponseGradeFromJSON(json: any): GradingformRubricGraderGradingpanelFetch200ResponseGrade {
    return GradingformRubricGraderGradingpanelFetch200ResponseGradeFromJSONTyped(json, false);
}

export function GradingformRubricGraderGradingpanelFetch200ResponseGradeFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradingformRubricGraderGradingpanelFetch200ResponseGrade {
    if (json == null) {
        return json;
    }
    return {
        
        'Canedit': json['canedit'],
        'Criteria': ((json['criteria'] as Array<any>).map(GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerFromJSON)),
        'Gradedby': json['gradedby'],
        'Instanceid': json['instanceid'],
        'Maxgrade': json['maxgrade'],
        'Rubricmode': json['rubricmode'],
        'Timecreated': json['timecreated'],
        'Timemodified': json['timemodified'],
        'Usergrade': json['usergrade'],
    };
}

export function GradingformRubricGraderGradingpanelFetch200ResponseGradeToJSON(value?: GradingformRubricGraderGradingpanelFetch200ResponseGrade | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'canedit': value['Canedit'],
        'criteria': ((value['Criteria'] as Array<any>).map(GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerToJSON)),
        'gradedby': value['Gradedby'],
        'instanceid': value['Instanceid'],
        'maxgrade': value['Maxgrade'],
        'rubricmode': value['Rubricmode'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'usergrade': value['Usergrade'],
    };
}
