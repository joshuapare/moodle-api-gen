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
/**
 * 
 * @export
 * @interface CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner
 */
export interface CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner {
    /**
     * value
     * @type {string}
     * @memberof CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner
     */
    value?: string;
    /**
     * visiblename
     * @type {string}
     * @memberof CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner
     */
    visiblename?: string;
}

/**
 * Check if a given object implements the CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner interface.
 */
export function instanceOfCoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner(value: object): boolean {
    return true;
}

export function CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInnerFromJSON(json: any): CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner {
    return CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInnerFromJSONTyped(json, false);
}

export function CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'value': json['value'] == null ? undefined : json['value'],
        'visiblename': json['visiblename'] == null ? undefined : json['visiblename'],
    };
}

export function CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInnerToJSON(value?: CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'value': value['value'],
        'visiblename': value['visiblename'],
    };
}
