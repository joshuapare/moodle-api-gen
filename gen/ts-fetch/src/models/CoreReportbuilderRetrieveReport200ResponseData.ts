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
import type { CoreReportbuilderRetrieveReport200ResponseDataRowsInner } from './CoreReportbuilderRetrieveReport200ResponseDataRowsInner';
import {
    CoreReportbuilderRetrieveReport200ResponseDataRowsInnerFromJSON,
    CoreReportbuilderRetrieveReport200ResponseDataRowsInnerFromJSONTyped,
    CoreReportbuilderRetrieveReport200ResponseDataRowsInnerToJSON,
} from './CoreReportbuilderRetrieveReport200ResponseDataRowsInner';

/**
 * 
 * @export
 * @interface CoreReportbuilderRetrieveReport200ResponseData
 */
export interface CoreReportbuilderRetrieveReport200ResponseData {
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreReportbuilderRetrieveReport200ResponseData
     */
    Headers: Array<object>;
    /**
     * 
     * @type {Array<CoreReportbuilderRetrieveReport200ResponseDataRowsInner>}
     * @memberof CoreReportbuilderRetrieveReport200ResponseData
     */
    Rows: Array<CoreReportbuilderRetrieveReport200ResponseDataRowsInner>;
    /**
     * totalrowcount
     * @type {number}
     * @memberof CoreReportbuilderRetrieveReport200ResponseData
     */
    Totalrowcount: number;
}

/**
 * Check if a given object implements the CoreReportbuilderRetrieveReport200ResponseData interface.
 */
export function instanceOfCoreReportbuilderRetrieveReport200ResponseData(value: object): boolean {
    if (!('Headers' in value)) return false;
    if (!('Rows' in value)) return false;
    if (!('Totalrowcount' in value)) return false;
    return true;
}

export function CoreReportbuilderRetrieveReport200ResponseDataFromJSON(json: any): CoreReportbuilderRetrieveReport200ResponseData {
    return CoreReportbuilderRetrieveReport200ResponseDataFromJSONTyped(json, false);
}

export function CoreReportbuilderRetrieveReport200ResponseDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderRetrieveReport200ResponseData {
    if (json == null) {
        return json;
    }
    return {
        
        'Headers': json['headers'],
        'Rows': ((json['rows'] as Array<any>).map(CoreReportbuilderRetrieveReport200ResponseDataRowsInnerFromJSON)),
        'Totalrowcount': json['totalrowcount'],
    };
}

export function CoreReportbuilderRetrieveReport200ResponseDataToJSON(value?: CoreReportbuilderRetrieveReport200ResponseData | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'headers': value['Headers'],
        'rows': ((value['Rows'] as Array<any>).map(CoreReportbuilderRetrieveReport200ResponseDataRowsInnerToJSON)),
        'totalrowcount': value['Totalrowcount'],
    };
}
