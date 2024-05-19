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
 * @interface ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
 */
export interface ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner {
    /**
     * criterion id
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
     */
    Criterionid?: number;
    /**
     * level id
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
     */
    Levelid?: number;
    /**
     * remark
     * @type {string}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
     */
    Remark?: string;
    /**
     * remark format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
     */
    Remarkformat?: number;
    /**
     * maximum score
     * @type {number}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
     */
    Score?: number;
}

/**
 * Check if a given object implements the ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner interface.
 */
export function instanceOfModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner(value: object): boolean {
    return true;
}

export function ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerFromJSON(json: any): ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner {
    return ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerFromJSONTyped(json, false);
}

export function ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Criterionid': json['criterionid'] == null ? undefined : json['criterionid'],
        'Levelid': json['levelid'] == null ? undefined : json['levelid'],
        'Remark': json['remark'] == null ? undefined : json['remark'],
        'Remarkformat': json['remarkformat'] == null ? undefined : json['remarkformat'],
        'Score': json['score'] == null ? undefined : json['score'],
    };
}

export function ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInnerToJSON(value?: ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'criterionid': value['Criterionid'],
        'levelid': value['Levelid'],
        'remark': value['Remark'],
        'remarkformat': value['Remarkformat'],
        'score': value['Score'],
    };
}

