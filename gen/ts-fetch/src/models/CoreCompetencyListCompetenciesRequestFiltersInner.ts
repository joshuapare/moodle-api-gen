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
 * @interface CoreCompetencyListCompetenciesRequestFiltersInner
 */
export interface CoreCompetencyListCompetenciesRequestFiltersInner {
    /**
     * Column name to filter by
     * @type {string}
     * @memberof CoreCompetencyListCompetenciesRequestFiltersInner
     */
    Column?: string;
    /**
     * Value to filter by. Must be exact match
     * @type {string}
     * @memberof CoreCompetencyListCompetenciesRequestFiltersInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the CoreCompetencyListCompetenciesRequestFiltersInner interface.
 */
export function instanceOfCoreCompetencyListCompetenciesRequestFiltersInner(value: object): boolean {
    return true;
}

export function CoreCompetencyListCompetenciesRequestFiltersInnerFromJSON(json: any): CoreCompetencyListCompetenciesRequestFiltersInner {
    return CoreCompetencyListCompetenciesRequestFiltersInnerFromJSONTyped(json, false);
}

export function CoreCompetencyListCompetenciesRequestFiltersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyListCompetenciesRequestFiltersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Column': json['column'] == null ? undefined : json['column'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreCompetencyListCompetenciesRequestFiltersInnerToJSON(value?: CoreCompetencyListCompetenciesRequestFiltersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'column': value['Column'],
        'value': value['Value'],
    };
}
