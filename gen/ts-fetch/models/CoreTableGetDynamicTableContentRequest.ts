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
import type { CoreTableGetDynamicTableContentRequestFiltersInner } from './CoreTableGetDynamicTableContentRequestFiltersInner';
import {
    CoreTableGetDynamicTableContentRequestFiltersInnerFromJSON,
    CoreTableGetDynamicTableContentRequestFiltersInnerFromJSONTyped,
    CoreTableGetDynamicTableContentRequestFiltersInnerToJSON,
} from './CoreTableGetDynamicTableContentRequestFiltersInner';
import type { CoreTableGetDynamicTableContentRequestSortdataInner } from './CoreTableGetDynamicTableContentRequestSortdataInner';
import {
    CoreTableGetDynamicTableContentRequestSortdataInnerFromJSON,
    CoreTableGetDynamicTableContentRequestSortdataInnerFromJSONTyped,
    CoreTableGetDynamicTableContentRequestSortdataInnerToJSON,
} from './CoreTableGetDynamicTableContentRequestSortdataInner';

/**
 * 
 * @export
 * @interface CoreTableGetDynamicTableContentRequest
 */
export interface CoreTableGetDynamicTableContentRequest {
    /**
     * Component
     * @type {string}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    component: string;
    /**
     * 
     * @type {Array<CoreTableGetDynamicTableContentRequestFiltersInner>}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    filters?: Array<CoreTableGetDynamicTableContentRequestFiltersInner>;
    /**
     * The first initial to sort filter on
     * @type {string}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    firstinitial: string;
    /**
     * Handler
     * @type {string}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    handler: string;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    hiddencolumns: Array<object>;
    /**
     * Type of join to join all filters together
     * @type {number}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    jointype: number;
    /**
     * The last initial to sort filter on
     * @type {string}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    lastinitial: string;
    /**
     * The page number
     * @type {number}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    pagenumber: number;
    /**
     * The number of records per page
     * @type {number}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    pagesize: number;
    /**
     * Whether the table preferences should be reset
     * @type {boolean}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    resetpreferences: boolean;
    /**
     * 
     * @type {Array<CoreTableGetDynamicTableContentRequestSortdataInner>}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    sortdata?: Array<CoreTableGetDynamicTableContentRequestSortdataInner>;
    /**
     * Unique ID for the container
     * @type {string}
     * @memberof CoreTableGetDynamicTableContentRequest
     */
    uniqueid: string;
}

/**
 * Check if a given object implements the CoreTableGetDynamicTableContentRequest interface.
 */
export function instanceOfCoreTableGetDynamicTableContentRequest(value: object): boolean {
    if (!('component' in value)) return false;
    if (!('firstinitial' in value)) return false;
    if (!('handler' in value)) return false;
    if (!('hiddencolumns' in value)) return false;
    if (!('jointype' in value)) return false;
    if (!('lastinitial' in value)) return false;
    if (!('pagenumber' in value)) return false;
    if (!('pagesize' in value)) return false;
    if (!('resetpreferences' in value)) return false;
    if (!('uniqueid' in value)) return false;
    return true;
}

export function CoreTableGetDynamicTableContentRequestFromJSON(json: any): CoreTableGetDynamicTableContentRequest {
    return CoreTableGetDynamicTableContentRequestFromJSONTyped(json, false);
}

export function CoreTableGetDynamicTableContentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTableGetDynamicTableContentRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'],
        'filters': json['filters'] == null ? undefined : ((json['filters'] as Array<any>).map(CoreTableGetDynamicTableContentRequestFiltersInnerFromJSON)),
        'firstinitial': json['firstinitial'],
        'handler': json['handler'],
        'hiddencolumns': json['hiddencolumns'],
        'jointype': json['jointype'],
        'lastinitial': json['lastinitial'],
        'pagenumber': json['pagenumber'],
        'pagesize': json['pagesize'],
        'resetpreferences': json['resetpreferences'],
        'sortdata': json['sortdata'] == null ? undefined : ((json['sortdata'] as Array<any>).map(CoreTableGetDynamicTableContentRequestSortdataInnerFromJSON)),
        'uniqueid': json['uniqueid'],
    };
}

export function CoreTableGetDynamicTableContentRequestToJSON(value?: CoreTableGetDynamicTableContentRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'filters': value['filters'] == null ? undefined : ((value['filters'] as Array<any>).map(CoreTableGetDynamicTableContentRequestFiltersInnerToJSON)),
        'firstinitial': value['firstinitial'],
        'handler': value['handler'],
        'hiddencolumns': value['hiddencolumns'],
        'jointype': value['jointype'],
        'lastinitial': value['lastinitial'],
        'pagenumber': value['pagenumber'],
        'pagesize': value['pagesize'],
        'resetpreferences': value['resetpreferences'],
        'sortdata': value['sortdata'] == null ? undefined : ((value['sortdata'] as Array<any>).map(CoreTableGetDynamicTableContentRequestSortdataInnerToJSON)),
        'uniqueid': value['uniqueid'],
    };
}

