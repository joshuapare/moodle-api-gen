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
import type { ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner } from './ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner';
import {
    ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerFromJSON,
    ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerFromJSONTyped,
    ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerToJSON,
} from './ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner';

/**
 * 
 * @export
 * @interface ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
 */
export interface ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata {
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
     */
    Activity: string;
    /**
     * 
     * @type {Array<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner>}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
     */
    Columns: Array<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner>;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
     */
    Data: string;
    /**
     * 
     * @type {string}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
     */
    Locale: string;
    /**
     * 
     * @type {number}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
     */
    PingInterval: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
     */
    ProfileFeatures: Array<object>;
}

/**
 * Check if a given object implements the ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata interface.
 */
export function instanceOfModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata(value: object): boolean {
    if (!('Activity' in value)) return false;
    if (!('Columns' in value)) return false;
    if (!('Data' in value)) return false;
    if (!('Locale' in value)) return false;
    if (!('PingInterval' in value)) return false;
    if (!('ProfileFeatures' in value)) return false;
    return true;
}

export function ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataFromJSON(json: any): ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata {
    return ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataFromJSONTyped(json, false);
}

export function ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata {
    if (json == null) {
        return json;
    }
    return {
        
        'Activity': json['activity'],
        'Columns': ((json['columns'] as Array<any>).map(ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerFromJSON)),
        'Data': json['data'],
        'Locale': json['locale'],
        'PingInterval': json['ping_interval'],
        'ProfileFeatures': json['profile_features'],
    };
}

export function ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataToJSON(value?: ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activity': value['Activity'],
        'columns': ((value['Columns'] as Array<any>).map(ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInnerToJSON)),
        'data': value['Data'],
        'locale': value['Locale'],
        'ping_interval': value['PingInterval'],
        'profile_features': value['ProfileFeatures'],
    };
}

