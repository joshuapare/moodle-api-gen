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
import type { CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup } from './CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup';
import {
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupFromJSON,
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupFromJSONTyped,
    CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupToJSON,
} from './CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup';

/**
 * 
 * @export
 * @interface CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner
 */
export interface CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
    /**
     * 
     * @type {CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup}
     * @memberof CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner
     */
    optiongroup?: CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup;
}

/**
 * Check if a given object implements the CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner interface.
 */
export function instanceOfCoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner(value: object): boolean {
    return true;
}

export function CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerFromJSON(json: any): CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
    return CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerFromJSONTyped(json, false);
}

export function CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'optiongroup': json['optiongroup'] == null ? undefined : CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupFromJSON(json['optiongroup']),
    };
}

export function CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerToJSON(value?: CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'optiongroup': CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupToJSON(value['optiongroup']),
    };
}

