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
 * @interface CoreUserAddUserDeviceRequest
 */
export interface CoreUserAddUserDeviceRequest {
    /**
     * the app id, usually something like com.moodle.moodlemobile
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Appid: string;
    /**
     * the device model 'Nexus4' or 'iPad1,1' etc.
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Model: string;
    /**
     * the device name, 'occam' or 'iPhone' etc.
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Name: string;
    /**
     * the device platform 'iOS' or 'Android' etc.
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Platform: string;
    /**
     * the app generated public key
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Publickey?: string;
    /**
     * the device PUSH token/key/identifier/registration id
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Pushid: string;
    /**
     * the device UUID
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Uuid: string;
    /**
     * the device version '6.1.2' or '4.2.2' etc.
     * @type {string}
     * @memberof CoreUserAddUserDeviceRequest
     */
    Version: string;
}

/**
 * Check if a given object implements the CoreUserAddUserDeviceRequest interface.
 */
export function instanceOfCoreUserAddUserDeviceRequest(value: object): boolean {
    if (!('Appid' in value)) return false;
    if (!('Model' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Platform' in value)) return false;
    if (!('Pushid' in value)) return false;
    if (!('Uuid' in value)) return false;
    if (!('Version' in value)) return false;
    return true;
}

export function CoreUserAddUserDeviceRequestFromJSON(json: any): CoreUserAddUserDeviceRequest {
    return CoreUserAddUserDeviceRequestFromJSONTyped(json, false);
}

export function CoreUserAddUserDeviceRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserAddUserDeviceRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Appid': json['appid'],
        'Model': json['model'],
        'Name': json['name'],
        'Platform': json['platform'],
        'Publickey': json['publickey'] == null ? undefined : json['publickey'],
        'Pushid': json['pushid'],
        'Uuid': json['uuid'],
        'Version': json['version'],
    };
}

export function CoreUserAddUserDeviceRequestToJSON(value?: CoreUserAddUserDeviceRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'appid': value['Appid'],
        'model': value['Model'],
        'name': value['Name'],
        'platform': value['Platform'],
        'publickey': value['Publickey'],
        'pushid': value['Pushid'],
        'uuid': value['Uuid'],
        'version': value['Version'],
    };
}

