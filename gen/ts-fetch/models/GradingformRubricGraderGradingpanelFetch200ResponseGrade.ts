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
    canedit: boolean;
    /**
     * 
     * @type {Array<GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner>}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    criteria: Array<GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner>;
    /**
     * The assumed grader of this grading instance
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    gradedby: string;
    /**
     * The id of the current grading instance
     * @type {number}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    instanceid: number;
    /**
     * Max possible grade
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    maxgrade: string;
    /**
     * The mode i.e. evaluate editable
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    rubricmode: string;
    /**
     * The time that the grade was created
     * @type {number}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    timecreated: number;
    /**
     * The time that the grade was last updated
     * @type {number}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    timemodified: number;
    /**
     * Current user grade
     * @type {string}
     * @memberof GradingformRubricGraderGradingpanelFetch200ResponseGrade
     */
    usergrade: string;
}

/**
 * Check if a given object implements the GradingformRubricGraderGradingpanelFetch200ResponseGrade interface.
 */
export function instanceOfGradingformRubricGraderGradingpanelFetch200ResponseGrade(value: object): boolean {
    if (!('canedit' in value)) return false;
    if (!('criteria' in value)) return false;
    if (!('gradedby' in value)) return false;
    if (!('instanceid' in value)) return false;
    if (!('maxgrade' in value)) return false;
    if (!('rubricmode' in value)) return false;
    if (!('timecreated' in value)) return false;
    if (!('timemodified' in value)) return false;
    if (!('usergrade' in value)) return false;
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
        
        'canedit': json['canedit'],
        'criteria': ((json['criteria'] as Array<any>).map(GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerFromJSON)),
        'gradedby': json['gradedby'],
        'instanceid': json['instanceid'],
        'maxgrade': json['maxgrade'],
        'rubricmode': json['rubricmode'],
        'timecreated': json['timecreated'],
        'timemodified': json['timemodified'],
        'usergrade': json['usergrade'],
    };
}

export function GradingformRubricGraderGradingpanelFetch200ResponseGradeToJSON(value?: GradingformRubricGraderGradingpanelFetch200ResponseGrade | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'canedit': value['canedit'],
        'criteria': ((value['criteria'] as Array<any>).map(GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerToJSON)),
        'gradedby': value['gradedby'],
        'instanceid': value['instanceid'],
        'maxgrade': value['maxgrade'],
        'rubricmode': value['rubricmode'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'usergrade': value['usergrade'],
    };
}
