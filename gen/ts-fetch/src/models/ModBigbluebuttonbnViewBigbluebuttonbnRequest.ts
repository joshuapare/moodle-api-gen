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
 * @interface ModBigbluebuttonbnViewBigbluebuttonbnRequest
 */
export interface ModBigbluebuttonbnViewBigbluebuttonbnRequest {
    /**
     * bigbluebuttonbn instance id
     * @type {number}
     * @memberof ModBigbluebuttonbnViewBigbluebuttonbnRequest
     */
    Bigbluebuttonbnid: number;
}

/**
 * Check if a given object implements the ModBigbluebuttonbnViewBigbluebuttonbnRequest interface.
 */
export function instanceOfModBigbluebuttonbnViewBigbluebuttonbnRequest(value: object): boolean {
    if (!('Bigbluebuttonbnid' in value)) return false;
    return true;
}

export function ModBigbluebuttonbnViewBigbluebuttonbnRequestFromJSON(json: any): ModBigbluebuttonbnViewBigbluebuttonbnRequest {
    return ModBigbluebuttonbnViewBigbluebuttonbnRequestFromJSONTyped(json, false);
}

export function ModBigbluebuttonbnViewBigbluebuttonbnRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBigbluebuttonbnViewBigbluebuttonbnRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Bigbluebuttonbnid': json['bigbluebuttonbnid'],
    };
}

export function ModBigbluebuttonbnViewBigbluebuttonbnRequestToJSON(value?: ModBigbluebuttonbnViewBigbluebuttonbnRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'bigbluebuttonbnid': value['Bigbluebuttonbnid'],
    };
}

