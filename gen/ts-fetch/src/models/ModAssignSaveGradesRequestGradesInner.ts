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
import type { ModAssignSaveGradeRequestAdvancedgradingdata } from './ModAssignSaveGradeRequestAdvancedgradingdata';
import {
    ModAssignSaveGradeRequestAdvancedgradingdataFromJSON,
    ModAssignSaveGradeRequestAdvancedgradingdataFromJSONTyped,
    ModAssignSaveGradeRequestAdvancedgradingdataToJSON,
} from './ModAssignSaveGradeRequestAdvancedgradingdata';
import type { ModAssignSaveGradesRequestGradesInnerPlugindata } from './ModAssignSaveGradesRequestGradesInnerPlugindata';
import {
    ModAssignSaveGradesRequestGradesInnerPlugindataFromJSON,
    ModAssignSaveGradesRequestGradesInnerPlugindataFromJSONTyped,
    ModAssignSaveGradesRequestGradesInnerPlugindataToJSON,
} from './ModAssignSaveGradesRequestGradesInnerPlugindata';

/**
 * 
 * @export
 * @interface ModAssignSaveGradesRequestGradesInner
 */
export interface ModAssignSaveGradesRequestGradesInner {
    /**
     * Allow another attempt if manual attempt reopen method
     * @type {boolean}
     * @memberof ModAssignSaveGradesRequestGradesInner
     */
    Addattempt?: boolean;
    /**
     * 
     * @type {ModAssignSaveGradeRequestAdvancedgradingdata}
     * @memberof ModAssignSaveGradesRequestGradesInner
     */
    Advancedgradingdata?: ModAssignSaveGradeRequestAdvancedgradingdata;
    /**
     * The attempt number (-1 means latest attempt)
     * @type {number}
     * @memberof ModAssignSaveGradesRequestGradesInner
     */
    Attemptnumber?: number;
    /**
     * The new grade for this user. Ignored if advanced grading used
     * @type {number}
     * @memberof ModAssignSaveGradesRequestGradesInner
     */
    Grade?: number;
    /**
     * 
     * @type {ModAssignSaveGradesRequestGradesInnerPlugindata}
     * @memberof ModAssignSaveGradesRequestGradesInner
     */
    Plugindata?: ModAssignSaveGradesRequestGradesInnerPlugindata;
    /**
     * The student id to operate on
     * @type {number}
     * @memberof ModAssignSaveGradesRequestGradesInner
     */
    Userid?: number;
    /**
     * The next marking workflow state
     * @type {string}
     * @memberof ModAssignSaveGradesRequestGradesInner
     */
    Workflowstate?: string;
}

/**
 * Check if a given object implements the ModAssignSaveGradesRequestGradesInner interface.
 */
export function instanceOfModAssignSaveGradesRequestGradesInner(value: object): boolean {
    return true;
}

export function ModAssignSaveGradesRequestGradesInnerFromJSON(json: any): ModAssignSaveGradesRequestGradesInner {
    return ModAssignSaveGradesRequestGradesInnerFromJSONTyped(json, false);
}

export function ModAssignSaveGradesRequestGradesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSaveGradesRequestGradesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Addattempt': json['addattempt'] == null ? undefined : json['addattempt'],
        'Advancedgradingdata': json['advancedgradingdata'] == null ? undefined : ModAssignSaveGradeRequestAdvancedgradingdataFromJSON(json['advancedgradingdata']),
        'Attemptnumber': json['attemptnumber'] == null ? undefined : json['attemptnumber'],
        'Grade': json['grade'] == null ? undefined : json['grade'],
        'Plugindata': json['plugindata'] == null ? undefined : ModAssignSaveGradesRequestGradesInnerPlugindataFromJSON(json['plugindata']),
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Workflowstate': json['workflowstate'] == null ? undefined : json['workflowstate'],
    };
}

export function ModAssignSaveGradesRequestGradesInnerToJSON(value?: ModAssignSaveGradesRequestGradesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'addattempt': value['Addattempt'],
        'advancedgradingdata': ModAssignSaveGradeRequestAdvancedgradingdataToJSON(value['Advancedgradingdata']),
        'attemptnumber': value['Attemptnumber'],
        'grade': value['Grade'],
        'plugindata': ModAssignSaveGradesRequestGradesInnerPlugindataToJSON(value['Plugindata']),
        'userid': value['Userid'],
        'workflowstate': value['Workflowstate'],
    };
}
