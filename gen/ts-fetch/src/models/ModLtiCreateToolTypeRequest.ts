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
 * @interface ModLtiCreateToolTypeRequest
 */
export interface ModLtiCreateToolTypeRequest {
    /**
     * URL to cardridge to load tool information
     * @type {string}
     * @memberof ModLtiCreateToolTypeRequest
     */
    Cartridgeurl?: string;
    /**
     * Consumer key
     * @type {string}
     * @memberof ModLtiCreateToolTypeRequest
     */
    Key?: string;
    /**
     * Shared secret
     * @type {string}
     * @memberof ModLtiCreateToolTypeRequest
     */
    Secret?: string;
}

/**
 * Check if a given object implements the ModLtiCreateToolTypeRequest interface.
 */
export function instanceOfModLtiCreateToolTypeRequest(value: object): boolean {
    return true;
}

export function ModLtiCreateToolTypeRequestFromJSON(json: any): ModLtiCreateToolTypeRequest {
    return ModLtiCreateToolTypeRequestFromJSONTyped(json, false);
}

export function ModLtiCreateToolTypeRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiCreateToolTypeRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Cartridgeurl': json['cartridgeurl'] == null ? undefined : json['cartridgeurl'],
        'Key': json['key'] == null ? undefined : json['key'],
        'Secret': json['secret'] == null ? undefined : json['secret'],
    };
}

export function ModLtiCreateToolTypeRequestToJSON(value?: ModLtiCreateToolTypeRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cartridgeurl': value['Cartridgeurl'],
        'key': value['Key'],
        'secret': value['Secret'],
    };
}
