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
 * @interface ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner
 */
export interface ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner {
    /**
     * criterion id
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner
     */
    Criterionid?: number;
    /**
     * level id
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner
     */
    Levelid?: number;
    /**
     * remark
     * @type {string}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner
     */
    Remark?: string;
    /**
     * remark format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner
     */
    Remarkformat?: number;
}

/**
 * Check if a given object implements the ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner interface.
 */
export function instanceOfModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner(value: object): boolean {
    return true;
}

export function ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInnerFromJSON(json: any): ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner {
    return ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInnerFromJSONTyped(json, false);
}

export function ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Criterionid': json['criterionid'] == null ? undefined : json['criterionid'],
        'Levelid': json['levelid'] == null ? undefined : json['levelid'],
        'Remark': json['remark'] == null ? undefined : json['remark'],
        'Remarkformat': json['remarkformat'] == null ? undefined : json['remarkformat'],
    };
}

export function ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInnerToJSON(value?: ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'criterionid': value['Criterionid'],
        'levelid': value['Levelid'],
        'remark': value['Remark'],
        'remarkformat': value['Remarkformat'],
    };
}
