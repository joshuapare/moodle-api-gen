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
import type { CoreCompetencyCountCompetenciesRequestFiltersInner } from './CoreCompetencyCountCompetenciesRequestFiltersInner';
import {
    CoreCompetencyCountCompetenciesRequestFiltersInnerFromJSON,
    CoreCompetencyCountCompetenciesRequestFiltersInnerFromJSONTyped,
    CoreCompetencyCountCompetenciesRequestFiltersInnerToJSON,
} from './CoreCompetencyCountCompetenciesRequestFiltersInner';

/**
 * 
 * @export
 * @interface CoreCompetencyCountCompetenciesRequest
 */
export interface CoreCompetencyCountCompetenciesRequest {
    /**
     * 
     * @type {Array<CoreCompetencyCountCompetenciesRequestFiltersInner>}
     * @memberof CoreCompetencyCountCompetenciesRequest
     */
    filters: Array<CoreCompetencyCountCompetenciesRequestFiltersInner>;
}

/**
 * Check if a given object implements the CoreCompetencyCountCompetenciesRequest interface.
 */
export function instanceOfCoreCompetencyCountCompetenciesRequest(value: object): boolean {
    if (!('filters' in value)) return false;
    return true;
}

export function CoreCompetencyCountCompetenciesRequestFromJSON(json: any): CoreCompetencyCountCompetenciesRequest {
    return CoreCompetencyCountCompetenciesRequestFromJSONTyped(json, false);
}

export function CoreCompetencyCountCompetenciesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyCountCompetenciesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'filters': ((json['filters'] as Array<any>).map(CoreCompetencyCountCompetenciesRequestFiltersInnerFromJSON)),
    };
}

export function CoreCompetencyCountCompetenciesRequestToJSON(value?: CoreCompetencyCountCompetenciesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'filters': ((value['filters'] as Array<any>).map(CoreCompetencyCountCompetenciesRequestFiltersInnerToJSON)),
    };
}
