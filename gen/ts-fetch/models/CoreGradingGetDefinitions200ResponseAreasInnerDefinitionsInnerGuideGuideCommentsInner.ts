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
 * @interface CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner
 */
export interface CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner {
    /**
     * description
     * @type {string}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    descriptionformat?: number;
    /**
     * criterion id
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    id?: number;
    /**
     * sortorder
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    sortorder?: number;
}

/**
 * Check if a given object implements the CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner interface.
 */
export function instanceOfCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner(value: object): boolean {
    return true;
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInnerFromJSON(json: any): CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner {
    return CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInnerFromJSONTyped(json, false);
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'id': json['id'] == null ? undefined : json['id'],
        'sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
    };
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInnerToJSON(value?: CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'id': value['id'],
        'sortorder': value['sortorder'],
    };
}
