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
 * @interface CoreReportbuilderRetrieveSystemReportRequest
 */
export interface CoreReportbuilderRetrieveSystemReportRequest {
    /**
     * Report area
     * @type {string}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Area?: string;
    /**
     * Report component
     * @type {string}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Component?: string;
    /**
     * 
     * @type {CoreCohortSearchCohortsRequestContext}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Context: CoreCohortSearchCohortsRequestContext;
    /**
     * Report item ID
     * @type {number}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Itemid?: number;
    /**
     * Page number
     * @type {number}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Page?: number;
    /**
     * 
     * @type {Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Parameters?: Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>;
    /**
     * Reports per page
     * @type {number}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Perpage?: number;
    /**
     * Report class path
     * @type {string}
     * @memberof CoreReportbuilderRetrieveSystemReportRequest
     */
    Source: string;
}

/**
 * Check if a given object implements the CoreReportbuilderRetrieveSystemReportRequest interface.
 */
export function instanceOfCoreReportbuilderRetrieveSystemReportRequest(value: object): boolean {
    if (!('Context' in value)) return false;
    if (!('Source' in value)) return false;
    return true;
}

export function CoreReportbuilderRetrieveSystemReportRequestFromJSON(json: any): CoreReportbuilderRetrieveSystemReportRequest {
    return CoreReportbuilderRetrieveSystemReportRequestFromJSONTyped(json, false);
}

export function CoreReportbuilderRetrieveSystemReportRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderRetrieveSystemReportRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Area': json['area'] == null ? undefined : json['area'],
        'Component': json['component'] == null ? undefined : json['component'],
        'Context': CoreCohortSearchCohortsRequestContextFromJSON(json['context']),
        'Itemid': json['itemid'] == null ? undefined : json['itemid'],
        'Page': json['page'] == null ? undefined : json['page'],
        'Parameters': json['parameters'] == null ? undefined : ((json['parameters'] as Array<any>).map(CoreReportbuilderCanViewSystemReportRequestParametersInnerFromJSON)),
        'Perpage': json['perpage'] == null ? undefined : json['perpage'],
        'Source': json['source'],
    };
}

export function CoreReportbuilderRetrieveSystemReportRequestToJSON(value?: CoreReportbuilderRetrieveSystemReportRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'area': value['Area'],
        'component': value['Component'],
        'context': CoreCohortSearchCohortsRequestContextToJSON(value['Context']),
        'itemid': value['Itemid'],
        'page': value['Page'],
        'parameters': value['Parameters'] == null ? undefined : ((value['Parameters'] as Array<any>).map(CoreReportbuilderCanViewSystemReportRequestParametersInnerToJSON)),
        'perpage': value['Perpage'],
        'source': value['Source'],
    };
}
