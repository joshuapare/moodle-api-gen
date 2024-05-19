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
import type { CoreCohortCreateCohortsRequestCohortsInner } from './CoreCohortCreateCohortsRequestCohortsInner';
import {
    CoreCohortCreateCohortsRequestCohortsInnerFromJSON,
    CoreCohortCreateCohortsRequestCohortsInnerFromJSONTyped,
    CoreCohortCreateCohortsRequestCohortsInnerToJSON,
} from './CoreCohortCreateCohortsRequestCohortsInner';

/**
 * 
 * @export
 * @interface CoreCohortCreateCohortsRequest
 */
export interface CoreCohortCreateCohortsRequest {
    /**
     * 
     * @type {Array<CoreCohortCreateCohortsRequestCohortsInner>}
     * @memberof CoreCohortCreateCohortsRequest
     */
    Cohorts: Array<CoreCohortCreateCohortsRequestCohortsInner>;
}

/**
 * Check if a given object implements the CoreCohortCreateCohortsRequest interface.
 */
export function instanceOfCoreCohortCreateCohortsRequest(value: object): boolean {
    if (!('Cohorts' in value)) return false;
    return true;
}

export function CoreCohortCreateCohortsRequestFromJSON(json: any): CoreCohortCreateCohortsRequest {
    return CoreCohortCreateCohortsRequestFromJSONTyped(json, false);
}

export function CoreCohortCreateCohortsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCohortCreateCohortsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Cohorts': ((json['cohorts'] as Array<any>).map(CoreCohortCreateCohortsRequestCohortsInnerFromJSON)),
    };
}

export function CoreCohortCreateCohortsRequestToJSON(value?: CoreCohortCreateCohortsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cohorts': ((value['Cohorts'] as Array<any>).map(CoreCohortCreateCohortsRequestCohortsInnerToJSON)),
    };
}

