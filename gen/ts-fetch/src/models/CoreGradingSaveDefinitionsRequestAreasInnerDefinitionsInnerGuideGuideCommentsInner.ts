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
 * @interface CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner
 */
export interface CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner {
    /**
     * description
     * @type {string}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    Description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    Descriptionformat?: number;
    /**
     * criterion id
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    Id?: number;
    /**
     * sortorder
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner
     */
    Sortorder?: number;
}

/**
 * Check if a given object implements the CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner interface.
 */
export function instanceOfCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner(value: object): boolean {
    return true;
}

export function CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInnerFromJSON(json: any): CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner {
    return CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInnerFromJSONTyped(json, false);
}

export function CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'] == null ? undefined : json['description'],
        'Descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
    };
}

export function CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInnerToJSON(value?: CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'descriptionformat': value['Descriptionformat'],
        'id': value['Id'],
        'sortorder': value['Sortorder'],
    };
}
