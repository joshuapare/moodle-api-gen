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
import type { ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner } from './ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner';
import {
    ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFromJSON,
    ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFromJSONTyped,
    ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerToJSON,
} from './ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner';

/**
 * 
 * @export
 * @interface ModAssignSaveGradeRequestAdvancedgradingdataRubric
 */
export interface ModAssignSaveGradeRequestAdvancedgradingdataRubric {
    /**
     * 
     * @type {Array<ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner>}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataRubric
     */
    Criteria: Array<ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner>;
}

/**
 * Check if a given object implements the ModAssignSaveGradeRequestAdvancedgradingdataRubric interface.
 */
export function instanceOfModAssignSaveGradeRequestAdvancedgradingdataRubric(value: object): boolean {
    if (!('Criteria' in value)) return false;
    return true;
}

export function ModAssignSaveGradeRequestAdvancedgradingdataRubricFromJSON(json: any): ModAssignSaveGradeRequestAdvancedgradingdataRubric {
    return ModAssignSaveGradeRequestAdvancedgradingdataRubricFromJSONTyped(json, false);
}

export function ModAssignSaveGradeRequestAdvancedgradingdataRubricFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSaveGradeRequestAdvancedgradingdataRubric {
    if (json == null) {
        return json;
    }
    return {
        
        'Criteria': ((json['criteria'] as Array<any>).map(ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFromJSON)),
    };
}

export function ModAssignSaveGradeRequestAdvancedgradingdataRubricToJSON(value?: ModAssignSaveGradeRequestAdvancedgradingdataRubric | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'criteria': ((value['Criteria'] as Array<any>).map(ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerToJSON)),
    };
}

