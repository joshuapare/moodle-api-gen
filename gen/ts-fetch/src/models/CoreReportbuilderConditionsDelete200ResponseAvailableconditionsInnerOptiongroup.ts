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
import type { CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner } from './CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner';
import {
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInnerFromJSON,
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInnerFromJSONTyped,
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInnerToJSON,
} from './CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner';

/**
 * 
 * @export
 * @interface CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup
 */
export interface CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup {
    /**
     * text
     * @type {string}
     * @memberof CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup
     */
    Text: string;
    /**
     * 
     * @type {Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner>}
     * @memberof CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup
     */
    Values: Array<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner>;
}

/**
 * Check if a given object implements the CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup interface.
 */
export function instanceOfCoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup(value: object): boolean {
    if (!('Text' in value)) return false;
    if (!('Values' in value)) return false;
    return true;
}

export function CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupFromJSON(json: any): CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup {
    return CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupFromJSONTyped(json, false);
}

export function CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup {
    if (json == null) {
        return json;
    }
    return {
        
        'Text': json['text'],
        'Values': ((json['values'] as Array<any>).map(CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInnerFromJSON)),
    };
}

export function CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupToJSON(value?: CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'text': value['Text'],
        'values': ((value['Values'] as Array<any>).map(CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInnerToJSON)),
    };
}

