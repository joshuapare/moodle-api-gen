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
 * @interface CoreCompetencyCountCompetencyFrameworksRequest
 */
export interface CoreCompetencyCountCompetencyFrameworksRequest {
    /**
     * 
     * @type {CoreCohortSearchCohortsRequestContext}
     * @memberof CoreCompetencyCountCompetencyFrameworksRequest
     */
    Context: CoreCohortSearchCohortsRequestContext;
    /**
     * What other contextes to fetch the frameworks from. (children, parents, self)
     * @type {string}
     * @memberof CoreCompetencyCountCompetencyFrameworksRequest
     */
    Includes?: string;
}

/**
 * Check if a given object implements the CoreCompetencyCountCompetencyFrameworksRequest interface.
 */
export function instanceOfCoreCompetencyCountCompetencyFrameworksRequest(value: object): boolean {
    if (!('Context' in value)) return false;
    return true;
}

export function CoreCompetencyCountCompetencyFrameworksRequestFromJSON(json: any): CoreCompetencyCountCompetencyFrameworksRequest {
    return CoreCompetencyCountCompetencyFrameworksRequestFromJSONTyped(json, false);
}

export function CoreCompetencyCountCompetencyFrameworksRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyCountCompetencyFrameworksRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Context': CoreCohortSearchCohortsRequestContextFromJSON(json['context']),
        'Includes': json['includes'] == null ? undefined : json['includes'],
    };
}

export function CoreCompetencyCountCompetencyFrameworksRequestToJSON(value?: CoreCompetencyCountCompetencyFrameworksRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': CoreCohortSearchCohortsRequestContextToJSON(value['Context']),
        'includes': value['Includes'],
    };
}
