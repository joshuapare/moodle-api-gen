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
import type { CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner } from './CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner';
import {
    CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerFromJSON,
    CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerFromJSONTyped,
    CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerToJSON,
} from './CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner';

/**
 * 
 * @export
 * @interface CoreReportbuilderColumnsDelete200Response
 */
export interface CoreReportbuilderColumnsDelete200Response {
    /**
     * hassortablecolumns
     * @type {boolean}
     * @memberof CoreReportbuilderColumnsDelete200Response
     */
    Hassortablecolumns: boolean;
    /**
     * helpicon
     * @type {string}
     * @memberof CoreReportbuilderColumnsDelete200Response
     */
    Helpicon: string;
    /**
     * 
     * @type {Array<CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner>}
     * @memberof CoreReportbuilderColumnsDelete200Response
     */
    Sortablecolumns: Array<CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner>;
}

/**
 * Check if a given object implements the CoreReportbuilderColumnsDelete200Response interface.
 */
export function instanceOfCoreReportbuilderColumnsDelete200Response(value: object): boolean {
    if (!('Hassortablecolumns' in value)) return false;
    if (!('Helpicon' in value)) return false;
    if (!('Sortablecolumns' in value)) return false;
    return true;
}

export function CoreReportbuilderColumnsDelete200ResponseFromJSON(json: any): CoreReportbuilderColumnsDelete200Response {
    return CoreReportbuilderColumnsDelete200ResponseFromJSONTyped(json, false);
}

export function CoreReportbuilderColumnsDelete200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderColumnsDelete200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Hassortablecolumns': json['hassortablecolumns'],
        'Helpicon': json['helpicon'],
        'Sortablecolumns': ((json['sortablecolumns'] as Array<any>).map(CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerFromJSON)),
    };
}

export function CoreReportbuilderColumnsDelete200ResponseToJSON(value?: CoreReportbuilderColumnsDelete200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'hassortablecolumns': value['Hassortablecolumns'],
        'helpicon': value['Helpicon'],
        'sortablecolumns': ((value['Sortablecolumns'] as Array<any>).map(CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerToJSON)),
    };
}
