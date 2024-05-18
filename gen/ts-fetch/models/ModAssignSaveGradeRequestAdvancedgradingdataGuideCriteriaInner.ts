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
import type { ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner } from './ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner';
import {
    ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerFromJSON,
    ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerFromJSONTyped,
    ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerToJSON,
} from './ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner';

/**
 * 
 * @export
 * @interface ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner
 */
export interface ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner {
    /**
     * criterion id
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner
     */
    criterionid?: number;
    /**
     * 
     * @type {Array<ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner>}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner
     */
    fillings?: Array<ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner>;
}

/**
 * Check if a given object implements the ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner interface.
 */
export function instanceOfModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner(value: object): boolean {
    return true;
}

export function ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFromJSON(json: any): ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner {
    return ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFromJSONTyped(json, false);
}

export function ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner {
    if (json == null) {
        return json;
    }
    return {
        
        'criterionid': json['criterionid'] == null ? undefined : json['criterionid'],
        'fillings': json['fillings'] == null ? undefined : ((json['fillings'] as Array<any>).map(ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerFromJSON)),
    };
}

export function ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerToJSON(value?: ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'criterionid': value['criterionid'],
        'fillings': value['fillings'] == null ? undefined : ((value['fillings'] as Array<any>).map(ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerToJSON)),
    };
}

