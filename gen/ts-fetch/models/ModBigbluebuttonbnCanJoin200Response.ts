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
 * @interface ModBigbluebuttonbnCanJoin200Response
 */
export interface ModBigbluebuttonbnCanJoin200Response {
    /**
     * Can join session
     * @type {boolean}
     * @memberof ModBigbluebuttonbnCanJoin200Response
     */
    canJoin: boolean;
    /**
     * course module id
     * @type {number}
     * @memberof ModBigbluebuttonbnCanJoin200Response
     */
    cmid: number;
}

/**
 * Check if a given object implements the ModBigbluebuttonbnCanJoin200Response interface.
 */
export function instanceOfModBigbluebuttonbnCanJoin200Response(value: object): boolean {
    if (!('canJoin' in value)) return false;
    if (!('cmid' in value)) return false;
    return true;
}

export function ModBigbluebuttonbnCanJoin200ResponseFromJSON(json: any): ModBigbluebuttonbnCanJoin200Response {
    return ModBigbluebuttonbnCanJoin200ResponseFromJSONTyped(json, false);
}

export function ModBigbluebuttonbnCanJoin200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBigbluebuttonbnCanJoin200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'canJoin': json['can_join'],
        'cmid': json['cmid'],
    };
}

export function ModBigbluebuttonbnCanJoin200ResponseToJSON(value?: ModBigbluebuttonbnCanJoin200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'can_join': value['canJoin'],
        'cmid': value['cmid'],
    };
}
