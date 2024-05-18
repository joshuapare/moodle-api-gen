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
 * @interface CoreAdminSetPluginOrderRequest
 */
export interface CoreAdminSetPluginOrderRequest {
    /**
     * The direction to move
     * @type {number}
     * @memberof CoreAdminSetPluginOrderRequest
     */
    direction: number;
    /**
     * The name of the plugin
     * @type {string}
     * @memberof CoreAdminSetPluginOrderRequest
     */
    plugin: string;
}

/**
 * Check if a given object implements the CoreAdminSetPluginOrderRequest interface.
 */
export function instanceOfCoreAdminSetPluginOrderRequest(value: object): boolean {
    if (!('direction' in value)) return false;
    if (!('plugin' in value)) return false;
    return true;
}

export function CoreAdminSetPluginOrderRequestFromJSON(json: any): CoreAdminSetPluginOrderRequest {
    return CoreAdminSetPluginOrderRequestFromJSONTyped(json, false);
}

export function CoreAdminSetPluginOrderRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAdminSetPluginOrderRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'direction': json['direction'],
        'plugin': json['plugin'],
    };
}

export function CoreAdminSetPluginOrderRequestToJSON(value?: CoreAdminSetPluginOrderRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'direction': value['direction'],
        'plugin': value['plugin'],
    };
}
