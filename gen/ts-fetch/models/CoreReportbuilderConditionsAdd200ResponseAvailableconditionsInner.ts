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
import type { CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup } from './CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup';
import {
    CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupFromJSON,
    CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupFromJSONTyped,
    CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupToJSON,
} from './CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup';

/**
 * 
 * @export
 * @interface CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner
 */
export interface CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner {
    /**
     * 
     * @type {CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup}
     * @memberof CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner
     */
    optiongroup?: CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup;
}

/**
 * Check if a given object implements the CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner interface.
 */
export function instanceOfCoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner(value: object): boolean {
    return true;
}

export function CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerFromJSON(json: any): CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner {
    return CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerFromJSONTyped(json, false);
}

export function CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'optiongroup': json['optiongroup'] == null ? undefined : CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupFromJSON(json['optiongroup']),
    };
}

export function CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerToJSON(value?: CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'optiongroup': CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupToJSON(value['optiongroup']),
    };
}

