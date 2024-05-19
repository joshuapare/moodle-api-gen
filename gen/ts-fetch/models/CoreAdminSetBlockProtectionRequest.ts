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
 * @interface CoreAdminSetBlockProtectionRequest
 */
export interface CoreAdminSetBlockProtectionRequest {
    /**
     * The name of the plugin
     * @type {string}
     * @memberof CoreAdminSetBlockProtectionRequest
     */
    plugin: string;
    /**
     * The target state
     * @type {number}
     * @memberof CoreAdminSetBlockProtectionRequest
     */
    state: number;
}

/**
 * Check if a given object implements the CoreAdminSetBlockProtectionRequest interface.
 */
export function instanceOfCoreAdminSetBlockProtectionRequest(value: object): boolean {
    if (!('plugin' in value)) return false;
    if (!('state' in value)) return false;
    return true;
}

export function CoreAdminSetBlockProtectionRequestFromJSON(json: any): CoreAdminSetBlockProtectionRequest {
    return CoreAdminSetBlockProtectionRequestFromJSONTyped(json, false);
}

export function CoreAdminSetBlockProtectionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAdminSetBlockProtectionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'plugin': json['plugin'],
        'state': json['state'],
    };
}

export function CoreAdminSetBlockProtectionRequestToJSON(value?: CoreAdminSetBlockProtectionRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'plugin': value['plugin'],
        'state': value['state'],
    };
}

