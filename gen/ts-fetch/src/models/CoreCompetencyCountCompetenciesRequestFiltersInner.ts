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
 * @interface CoreCompetencyCountCompetenciesRequestFiltersInner
 */
export interface CoreCompetencyCountCompetenciesRequestFiltersInner {
    /**
     * Column name to filter by
     * @type {string}
     * @memberof CoreCompetencyCountCompetenciesRequestFiltersInner
     */
    Column?: string;
    /**
     * Value to filter by. Must be exact match
     * @type {string}
     * @memberof CoreCompetencyCountCompetenciesRequestFiltersInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the CoreCompetencyCountCompetenciesRequestFiltersInner interface.
 */
export function instanceOfCoreCompetencyCountCompetenciesRequestFiltersInner(value: object): boolean {
    return true;
}

export function CoreCompetencyCountCompetenciesRequestFiltersInnerFromJSON(json: any): CoreCompetencyCountCompetenciesRequestFiltersInner {
    return CoreCompetencyCountCompetenciesRequestFiltersInnerFromJSONTyped(json, false);
}

export function CoreCompetencyCountCompetenciesRequestFiltersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyCountCompetenciesRequestFiltersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Column': json['column'] == null ? undefined : json['column'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreCompetencyCountCompetenciesRequestFiltersInnerToJSON(value?: CoreCompetencyCountCompetenciesRequestFiltersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'column': value['Column'],
        'value': value['Value'],
    };
}

