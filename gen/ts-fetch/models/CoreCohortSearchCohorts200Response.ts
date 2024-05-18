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
import type { CoreCohortSearchCohorts200ResponseCohortsInner } from './CoreCohortSearchCohorts200ResponseCohortsInner';
import {
    CoreCohortSearchCohorts200ResponseCohortsInnerFromJSON,
    CoreCohortSearchCohorts200ResponseCohortsInnerFromJSONTyped,
    CoreCohortSearchCohorts200ResponseCohortsInnerToJSON,
} from './CoreCohortSearchCohorts200ResponseCohortsInner';

/**
 * 
 * @export
 * @interface CoreCohortSearchCohorts200Response
 */
export interface CoreCohortSearchCohorts200Response {
    /**
     * 
     * @type {Array<CoreCohortSearchCohorts200ResponseCohortsInner>}
     * @memberof CoreCohortSearchCohorts200Response
     */
    cohorts: Array<CoreCohortSearchCohorts200ResponseCohortsInner>;
}

/**
 * Check if a given object implements the CoreCohortSearchCohorts200Response interface.
 */
export function instanceOfCoreCohortSearchCohorts200Response(value: object): boolean {
    if (!('cohorts' in value)) return false;
    return true;
}

export function CoreCohortSearchCohorts200ResponseFromJSON(json: any): CoreCohortSearchCohorts200Response {
    return CoreCohortSearchCohorts200ResponseFromJSONTyped(json, false);
}

export function CoreCohortSearchCohorts200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCohortSearchCohorts200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'cohorts': ((json['cohorts'] as Array<any>).map(CoreCohortSearchCohorts200ResponseCohortsInnerFromJSON)),
    };
}

export function CoreCohortSearchCohorts200ResponseToJSON(value?: CoreCohortSearchCohorts200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cohorts': ((value['cohorts'] as Array<any>).map(CoreCohortSearchCohorts200ResponseCohortsInnerToJSON)),
    };
}
