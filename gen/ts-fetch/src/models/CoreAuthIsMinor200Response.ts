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
 * @interface CoreAuthIsMinor200Response
 */
export interface CoreAuthIsMinor200Response {
    /**
     * True if the user is considered to be a digital minor,
     *                     false if not
     * @type {boolean}
     * @memberof CoreAuthIsMinor200Response
     */
    Status: boolean;
}

/**
 * Check if a given object implements the CoreAuthIsMinor200Response interface.
 */
export function instanceOfCoreAuthIsMinor200Response(value: object): boolean {
    if (!('Status' in value)) return false;
    return true;
}

export function CoreAuthIsMinor200ResponseFromJSON(json: any): CoreAuthIsMinor200Response {
    return CoreAuthIsMinor200ResponseFromJSONTyped(json, false);
}

export function CoreAuthIsMinor200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAuthIsMinor200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Status': json['status'],
    };
}

export function CoreAuthIsMinor200ResponseToJSON(value?: CoreAuthIsMinor200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': value['Status'],
    };
}

