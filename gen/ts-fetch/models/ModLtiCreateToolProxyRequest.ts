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
 * @interface ModLtiCreateToolProxyRequest
 */
export interface ModLtiCreateToolProxyRequest {
    /**
     * 
     * @type {Array<object>}
     * @memberof ModLtiCreateToolProxyRequest
     */
    capabilityoffered?: Array<object>;
    /**
     * Tool proxy name
     * @type {string}
     * @memberof ModLtiCreateToolProxyRequest
     */
    name?: string;
    /**
     * Tool proxy registration URL
     * @type {string}
     * @memberof ModLtiCreateToolProxyRequest
     */
    regurl: string;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModLtiCreateToolProxyRequest
     */
    serviceoffered?: Array<object>;
}

/**
 * Check if a given object implements the ModLtiCreateToolProxyRequest interface.
 */
export function instanceOfModLtiCreateToolProxyRequest(value: object): boolean {
    if (!('regurl' in value)) return false;
    return true;
}

export function ModLtiCreateToolProxyRequestFromJSON(json: any): ModLtiCreateToolProxyRequest {
    return ModLtiCreateToolProxyRequestFromJSONTyped(json, false);
}

export function ModLtiCreateToolProxyRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiCreateToolProxyRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'capabilityoffered': json['capabilityoffered'] == null ? undefined : json['capabilityoffered'],
        'name': json['name'] == null ? undefined : json['name'],
        'regurl': json['regurl'],
        'serviceoffered': json['serviceoffered'] == null ? undefined : json['serviceoffered'],
    };
}

export function ModLtiCreateToolProxyRequestToJSON(value?: ModLtiCreateToolProxyRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'capabilityoffered': value['capabilityoffered'],
        'name': value['name'],
        'regurl': value['regurl'],
        'serviceoffered': value['serviceoffered'],
    };
}

