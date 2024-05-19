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
 * @interface CoreUserUpdateUserDevicePublicKeyRequest
 */
export interface CoreUserUpdateUserDevicePublicKeyRequest {
    /**
     * The app id, something like com.moodle.moodlemobile
     * @type {string}
     * @memberof CoreUserUpdateUserDevicePublicKeyRequest
     */
    Appid: string;
    /**
     * the app generated public key
     * @type {string}
     * @memberof CoreUserUpdateUserDevicePublicKeyRequest
     */
    Publickey: string;
    /**
     * the device UUID
     * @type {string}
     * @memberof CoreUserUpdateUserDevicePublicKeyRequest
     */
    Uuid: string;
}

/**
 * Check if a given object implements the CoreUserUpdateUserDevicePublicKeyRequest interface.
 */
export function instanceOfCoreUserUpdateUserDevicePublicKeyRequest(value: object): boolean {
    if (!('Appid' in value)) return false;
    if (!('Publickey' in value)) return false;
    if (!('Uuid' in value)) return false;
    return true;
}

export function CoreUserUpdateUserDevicePublicKeyRequestFromJSON(json: any): CoreUserUpdateUserDevicePublicKeyRequest {
    return CoreUserUpdateUserDevicePublicKeyRequestFromJSONTyped(json, false);
}

export function CoreUserUpdateUserDevicePublicKeyRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserUpdateUserDevicePublicKeyRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Appid': json['appid'],
        'Publickey': json['publickey'],
        'Uuid': json['uuid'],
    };
}

export function CoreUserUpdateUserDevicePublicKeyRequestToJSON(value?: CoreUserUpdateUserDevicePublicKeyRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'appid': value['Appid'],
        'publickey': value['Publickey'],
        'uuid': value['Uuid'],
    };
}

