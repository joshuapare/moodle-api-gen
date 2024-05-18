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
import type { CoreCompetencyListCompetenciesRequestFiltersInner } from './CoreCompetencyListCompetenciesRequestFiltersInner';
import {
    CoreCompetencyListCompetenciesRequestFiltersInnerFromJSON,
    CoreCompetencyListCompetenciesRequestFiltersInnerFromJSONTyped,
    CoreCompetencyListCompetenciesRequestFiltersInnerToJSON,
} from './CoreCompetencyListCompetenciesRequestFiltersInner';

/**
 * 
 * @export
 * @interface CoreCompetencyListCompetenciesRequest
 */
export interface CoreCompetencyListCompetenciesRequest {
    /**
     * 
     * @type {Array<CoreCompetencyListCompetenciesRequestFiltersInner>}
     * @memberof CoreCompetencyListCompetenciesRequest
     */
    filters: Array<CoreCompetencyListCompetenciesRequestFiltersInner>;
    /**
     * Return this number of records at most.
     * @type {number}
     * @memberof CoreCompetencyListCompetenciesRequest
     */
    limit?: number;
    /**
     * Sort direction. Should be either ASC or DESC
     * @type {string}
     * @memberof CoreCompetencyListCompetenciesRequest
     */
    order?: string;
    /**
     * Skip this number of records before returning results
     * @type {number}
     * @memberof CoreCompetencyListCompetenciesRequest
     */
    skip?: number;
    /**
     * Column to sort by.
     * @type {string}
     * @memberof CoreCompetencyListCompetenciesRequest
     */
    sort?: string;
}

/**
 * Check if a given object implements the CoreCompetencyListCompetenciesRequest interface.
 */
export function instanceOfCoreCompetencyListCompetenciesRequest(value: object): boolean {
    if (!('filters' in value)) return false;
    return true;
}

export function CoreCompetencyListCompetenciesRequestFromJSON(json: any): CoreCompetencyListCompetenciesRequest {
    return CoreCompetencyListCompetenciesRequestFromJSONTyped(json, false);
}

export function CoreCompetencyListCompetenciesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyListCompetenciesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'filters': ((json['filters'] as Array<any>).map(CoreCompetencyListCompetenciesRequestFiltersInnerFromJSON)),
        'limit': json['limit'] == null ? undefined : json['limit'],
        'order': json['order'] == null ? undefined : json['order'],
        'skip': json['skip'] == null ? undefined : json['skip'],
        'sort': json['sort'] == null ? undefined : json['sort'],
    };
}

export function CoreCompetencyListCompetenciesRequestToJSON(value?: CoreCompetencyListCompetenciesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'filters': ((value['filters'] as Array<any>).map(CoreCompetencyListCompetenciesRequestFiltersInnerToJSON)),
        'limit': value['limit'],
        'order': value['order'],
        'skip': value['skip'],
        'sort': value['sort'],
    };
}

