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
 * @interface ToolLpSearchCohortsRequest
 */
export interface ToolLpSearchCohortsRequest {
    /**
     * 
     * @type {CoreCohortSearchCohortsRequestContext}
     * @memberof ToolLpSearchCohortsRequest
     */
    Context: CoreCohortSearchCohortsRequestContext;
    /**
     * What other contexts to fetch the frameworks from. (all, parents, self)
     * @type {string}
     * @memberof ToolLpSearchCohortsRequest
     */
    Includes?: string;
    /**
     * limitfrom we are fetching the records from
     * @type {number}
     * @memberof ToolLpSearchCohortsRequest
     */
    Limitfrom?: number;
    /**
     * Number of records to fetch
     * @type {number}
     * @memberof ToolLpSearchCohortsRequest
     */
    Limitnum?: number;
    /**
     * Query string
     * @type {string}
     * @memberof ToolLpSearchCohortsRequest
     */
    Query: string;
}

/**
 * Check if a given object implements the ToolLpSearchCohortsRequest interface.
 */
export function instanceOfToolLpSearchCohortsRequest(value: object): boolean {
    if (!('Context' in value)) return false;
    if (!('Query' in value)) return false;
    return true;
}

export function ToolLpSearchCohortsRequestFromJSON(json: any): ToolLpSearchCohortsRequest {
    return ToolLpSearchCohortsRequestFromJSONTyped(json, false);
}

export function ToolLpSearchCohortsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpSearchCohortsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Context': CoreCohortSearchCohortsRequestContextFromJSON(json['context']),
        'Includes': json['includes'] == null ? undefined : json['includes'],
        'Limitfrom': json['limitfrom'] == null ? undefined : json['limitfrom'],
        'Limitnum': json['limitnum'] == null ? undefined : json['limitnum'],
        'Query': json['query'],
    };
}

export function ToolLpSearchCohortsRequestToJSON(value?: ToolLpSearchCohortsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': CoreCohortSearchCohortsRequestContextToJSON(value['Context']),
        'includes': value['Includes'],
        'limitfrom': value['Limitfrom'],
        'limitnum': value['Limitnum'],
        'query': value['Query'],
    };
}
