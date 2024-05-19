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
import type { ModDataUpdateEntryRequestDataInner } from './ModDataUpdateEntryRequestDataInner';
import {
    ModDataUpdateEntryRequestDataInnerFromJSON,
    ModDataUpdateEntryRequestDataInnerFromJSONTyped,
    ModDataUpdateEntryRequestDataInnerToJSON,
} from './ModDataUpdateEntryRequestDataInner';

/**
 * 
 * @export
 * @interface ModDataUpdateEntryRequest
 */
export interface ModDataUpdateEntryRequest {
    /**
     * 
     * @type {Array<ModDataUpdateEntryRequestDataInner>}
     * @memberof ModDataUpdateEntryRequest
     */
    Data: Array<ModDataUpdateEntryRequestDataInner>;
    /**
     * The entry record id.
     * @type {number}
     * @memberof ModDataUpdateEntryRequest
     */
    Entryid: number;
}

/**
 * Check if a given object implements the ModDataUpdateEntryRequest interface.
 */
export function instanceOfModDataUpdateEntryRequest(value: object): boolean {
    if (!('Data' in value)) return false;
    if (!('Entryid' in value)) return false;
    return true;
}

export function ModDataUpdateEntryRequestFromJSON(json: any): ModDataUpdateEntryRequest {
    return ModDataUpdateEntryRequestFromJSONTyped(json, false);
}

export function ModDataUpdateEntryRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataUpdateEntryRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Data': ((json['data'] as Array<any>).map(ModDataUpdateEntryRequestDataInnerFromJSON)),
        'Entryid': json['entryid'],
    };
}

export function ModDataUpdateEntryRequestToJSON(value?: ModDataUpdateEntryRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'data': ((value['Data'] as Array<any>).map(ModDataUpdateEntryRequestDataInnerToJSON)),
        'entryid': value['Entryid'],
    };
}

