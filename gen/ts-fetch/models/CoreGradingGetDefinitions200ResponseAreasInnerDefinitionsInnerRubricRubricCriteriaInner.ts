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
import type { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner } from './CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner';
import {
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInnerFromJSON,
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInnerFromJSONTyped,
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInnerToJSON,
} from './CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner';

/**
 * 
 * @export
 * @interface CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner
 */
export interface CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner {
    /**
     * description
     * @type {string}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner
     */
    description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner
     */
    descriptionformat?: number;
    /**
     * criterion id
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner
     */
    id?: number;
    /**
     * 
     * @type {Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner>}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner
     */
    levels?: Array<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner>;
    /**
     * sortorder
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner
     */
    sortorder?: number;
}

/**
 * Check if a given object implements the CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner interface.
 */
export function instanceOfCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner(value: object): boolean {
    return true;
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerFromJSON(json: any): CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner {
    return CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerFromJSONTyped(json, false);
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'id': json['id'] == null ? undefined : json['id'],
        'levels': json['levels'] == null ? undefined : ((json['levels'] as Array<any>).map(CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInnerFromJSON)),
        'sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
    };
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerToJSON(value?: CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'id': value['id'],
        'levels': value['levels'] == null ? undefined : ((value['levels'] as Array<any>).map(CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInnerToJSON)),
        'sortorder': value['sortorder'],
    };
}
