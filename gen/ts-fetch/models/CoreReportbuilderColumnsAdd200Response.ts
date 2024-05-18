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
import type { CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner } from './CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner';
import {
    CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerFromJSON,
    CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerFromJSONTyped,
    CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerToJSON,
} from './CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner';

/**
 * 
 * @export
 * @interface CoreReportbuilderColumnsAdd200Response
 */
export interface CoreReportbuilderColumnsAdd200Response {
    /**
     * hassortablecolumns
     * @type {boolean}
     * @memberof CoreReportbuilderColumnsAdd200Response
     */
    hassortablecolumns: boolean;
    /**
     * helpicon
     * @type {string}
     * @memberof CoreReportbuilderColumnsAdd200Response
     */
    helpicon: string;
    /**
     * 
     * @type {Array<CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner>}
     * @memberof CoreReportbuilderColumnsAdd200Response
     */
    sortablecolumns: Array<CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner>;
}

/**
 * Check if a given object implements the CoreReportbuilderColumnsAdd200Response interface.
 */
export function instanceOfCoreReportbuilderColumnsAdd200Response(value: object): boolean {
    if (!('hassortablecolumns' in value)) return false;
    if (!('helpicon' in value)) return false;
    if (!('sortablecolumns' in value)) return false;
    return true;
}

export function CoreReportbuilderColumnsAdd200ResponseFromJSON(json: any): CoreReportbuilderColumnsAdd200Response {
    return CoreReportbuilderColumnsAdd200ResponseFromJSONTyped(json, false);
}

export function CoreReportbuilderColumnsAdd200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderColumnsAdd200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'hassortablecolumns': json['hassortablecolumns'],
        'helpicon': json['helpicon'],
        'sortablecolumns': ((json['sortablecolumns'] as Array<any>).map(CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerFromJSON)),
    };
}

export function CoreReportbuilderColumnsAdd200ResponseToJSON(value?: CoreReportbuilderColumnsAdd200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'hassortablecolumns': value['hassortablecolumns'],
        'helpicon': value['helpicon'],
        'sortablecolumns': ((value['sortablecolumns'] as Array<any>).map(CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerToJSON)),
    };
}

