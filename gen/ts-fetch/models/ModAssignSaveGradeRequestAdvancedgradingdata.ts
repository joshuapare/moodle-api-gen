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
import type { ModAssignSaveGradeRequestAdvancedgradingdataGuide } from './ModAssignSaveGradeRequestAdvancedgradingdataGuide';
import {
    ModAssignSaveGradeRequestAdvancedgradingdataGuideFromJSON,
    ModAssignSaveGradeRequestAdvancedgradingdataGuideFromJSONTyped,
    ModAssignSaveGradeRequestAdvancedgradingdataGuideToJSON,
} from './ModAssignSaveGradeRequestAdvancedgradingdataGuide';
import type { ModAssignSaveGradeRequestAdvancedgradingdataRubric } from './ModAssignSaveGradeRequestAdvancedgradingdataRubric';
import {
    ModAssignSaveGradeRequestAdvancedgradingdataRubricFromJSON,
    ModAssignSaveGradeRequestAdvancedgradingdataRubricFromJSONTyped,
    ModAssignSaveGradeRequestAdvancedgradingdataRubricToJSON,
} from './ModAssignSaveGradeRequestAdvancedgradingdataRubric';

/**
 * 
 * @export
 * @interface ModAssignSaveGradeRequestAdvancedgradingdata
 */
export interface ModAssignSaveGradeRequestAdvancedgradingdata {
    /**
     * 
     * @type {ModAssignSaveGradeRequestAdvancedgradingdataGuide}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdata
     */
    guide?: ModAssignSaveGradeRequestAdvancedgradingdataGuide;
    /**
     * 
     * @type {ModAssignSaveGradeRequestAdvancedgradingdataRubric}
     * @memberof ModAssignSaveGradeRequestAdvancedgradingdata
     */
    rubric?: ModAssignSaveGradeRequestAdvancedgradingdataRubric;
}

/**
 * Check if a given object implements the ModAssignSaveGradeRequestAdvancedgradingdata interface.
 */
export function instanceOfModAssignSaveGradeRequestAdvancedgradingdata(value: object): boolean {
    return true;
}

export function ModAssignSaveGradeRequestAdvancedgradingdataFromJSON(json: any): ModAssignSaveGradeRequestAdvancedgradingdata {
    return ModAssignSaveGradeRequestAdvancedgradingdataFromJSONTyped(json, false);
}

export function ModAssignSaveGradeRequestAdvancedgradingdataFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignSaveGradeRequestAdvancedgradingdata {
    if (json == null) {
        return json;
    }
    return {
        
        'guide': json['guide'] == null ? undefined : ModAssignSaveGradeRequestAdvancedgradingdataGuideFromJSON(json['guide']),
        'rubric': json['rubric'] == null ? undefined : ModAssignSaveGradeRequestAdvancedgradingdataRubricFromJSON(json['rubric']),
    };
}

export function ModAssignSaveGradeRequestAdvancedgradingdataToJSON(value?: ModAssignSaveGradeRequestAdvancedgradingdata | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'guide': ModAssignSaveGradeRequestAdvancedgradingdataGuideToJSON(value['guide']),
        'rubric': ModAssignSaveGradeRequestAdvancedgradingdataRubricToJSON(value['rubric']),
    };
}

