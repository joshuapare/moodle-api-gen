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
import type { CoreReportbuilderCanViewSystemReportRequestParametersInner } from './CoreReportbuilderCanViewSystemReportRequestParametersInner';
import {
    CoreReportbuilderCanViewSystemReportRequestParametersInnerFromJSON,
    CoreReportbuilderCanViewSystemReportRequestParametersInnerFromJSONTyped,
    CoreReportbuilderCanViewSystemReportRequestParametersInnerToJSON,
} from './CoreReportbuilderCanViewSystemReportRequestParametersInner';

/**
 * 
 * @export
 * @interface CoreReportbuilderCanViewSystemReportRequest
 */
export interface CoreReportbuilderCanViewSystemReportRequest {
    /**
     * Report area
     * @type {string}
     * @memberof CoreReportbuilderCanViewSystemReportRequest
     */
    area?: string;
    /**
     * Report component
     * @type {string}
     * @memberof CoreReportbuilderCanViewSystemReportRequest
     */
    component?: string;
    /**
     * 
     * @type {CoreCohortSearchCohortsRequestContext}
     * @memberof CoreReportbuilderCanViewSystemReportRequest
     */
    context: CoreCohortSearchCohortsRequestContext;
    /**
     * Report item ID
     * @type {number}
     * @memberof CoreReportbuilderCanViewSystemReportRequest
     */
    itemid?: number;
    /**
     * 
     * @type {Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>}
     * @memberof CoreReportbuilderCanViewSystemReportRequest
     */
    parameters?: Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>;
    /**
     * Report class path
     * @type {string}
     * @memberof CoreReportbuilderCanViewSystemReportRequest
     */
    source: string;
}

/**
 * Check if a given object implements the CoreReportbuilderCanViewSystemReportRequest interface.
 */
export function instanceOfCoreReportbuilderCanViewSystemReportRequest(value: object): boolean {
    if (!('context' in value)) return false;
    if (!('source' in value)) return false;
    return true;
}

export function CoreReportbuilderCanViewSystemReportRequestFromJSON(json: any): CoreReportbuilderCanViewSystemReportRequest {
    return CoreReportbuilderCanViewSystemReportRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderCanViewSystemReportRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderCanViewSystemReportRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'area': json['area'] == null ? undefined : json['area'],
        'component': json['component'] == null ? undefined : json['component'],
        'context': CoreCohortSearchCohortsRequestContextFromJSON(json['context']),
        'itemid': json['itemid'] == null ? undefined : json['itemid'],
        'parameters': json['parameters'] == null ? undefined : ((json['parameters'] as Array<any>).map(CoreReportbuilderCanViewSystemReportRequestParametersInnerFromJSON)),
        'source': json['source'],
    };
}

export function CoreReportbuilderCanViewSystemReportRequestToJSON(value?: CoreReportbuilderCanViewSystemReportRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'area': value['area'],
        'component': value['component'],
        'context': CoreCohortSearchCohortsRequestContextToJSON(value['context']),
        'itemid': value['itemid'],
        'parameters': value['parameters'] == null ? undefined : ((value['parameters'] as Array<any>).map(CoreReportbuilderCanViewSystemReportRequestParametersInnerToJSON)),
        'source': value['source'],
    };
}
