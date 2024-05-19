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
import type { CoreCohortSearchCohortsRequestContext } from './CoreCohortSearchCohortsRequestContext';
import {
    CoreCohortSearchCohortsRequestContextFromJSON,
    CoreCohortSearchCohortsRequestContextFromJSONTyped,
    CoreCohortSearchCohortsRequestContextToJSON,
} from './CoreCohortSearchCohortsRequestContext';

/**
 * 
 * @export
 * @interface CoreCompetencyListCompetencyFrameworksRequest
 */
export interface CoreCompetencyListCompetencyFrameworksRequest {
    /**
     * 
     * @type {CoreCohortSearchCohortsRequestContext}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Context: CoreCohortSearchCohortsRequestContext;
    /**
     * What other contextes to fetch the frameworks from. (children, parents, self)
     * @type {string}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Includes?: string;
    /**
     * Return this number of records at most.
     * @type {number}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Limit?: number;
    /**
     * Only visible frameworks will be returned if visible true
     * @type {boolean}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Onlyvisible?: boolean;
    /**
     * Sort direction. Should be either ASC or DESC
     * @type {string}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Order?: string;
    /**
     * A query string to filter the results
     * @type {string}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Query?: string;
    /**
     * Skip this number of records before returning results
     * @type {number}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Skip?: number;
    /**
     * Column to sort by.
     * @type {string}
     * @memberof CoreCompetencyListCompetencyFrameworksRequest
     */
    Sort?: string;
}

/**
 * Check if a given object implements the CoreCompetencyListCompetencyFrameworksRequest interface.
 */
export function instanceOfCoreCompetencyListCompetencyFrameworksRequest(value: object): boolean {
    if (!('Context' in value)) return false;
    return true;
}

export function CoreCompetencyListCompetencyFrameworksRequestFromJSON(json: any): CoreCompetencyListCompetencyFrameworksRequest {
    return CoreCompetencyListCompetencyFrameworksRequestFromJSONTyped(json, false);
}

export function CoreCompetencyListCompetencyFrameworksRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyListCompetencyFrameworksRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Context': CoreCohortSearchCohortsRequestContextFromJSON(json['context']),
        'Includes': json['includes'] == null ? undefined : json['includes'],
        'Limit': json['limit'] == null ? undefined : json['limit'],
        'Onlyvisible': json['onlyvisible'] == null ? undefined : json['onlyvisible'],
        'Order': json['order'] == null ? undefined : json['order'],
        'Query': json['query'] == null ? undefined : json['query'],
        'Skip': json['skip'] == null ? undefined : json['skip'],
        'Sort': json['sort'] == null ? undefined : json['sort'],
    };
}

export function CoreCompetencyListCompetencyFrameworksRequestToJSON(value?: CoreCompetencyListCompetencyFrameworksRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': CoreCohortSearchCohortsRequestContextToJSON(value['Context']),
        'includes': value['Includes'],
        'limit': value['Limit'],
        'onlyvisible': value['Onlyvisible'],
        'order': value['Order'],
        'query': value['Query'],
        'skip': value['Skip'],
        'sort': value['Sort'],
    };
}

