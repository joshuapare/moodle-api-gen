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
 * @interface CoreAuthConfirmUserRequest
 */
export interface CoreAuthConfirmUserRequest {
    /**
     * Confirmation secret
     * @type {string}
     * @memberof CoreAuthConfirmUserRequest
     */
    secret: string;
    /**
     * User name
     * @type {string}
     * @memberof CoreAuthConfirmUserRequest
     */
    username: string;
}

/**
 * Check if a given object implements the CoreAuthConfirmUserRequest interface.
 */
export function instanceOfCoreAuthConfirmUserRequest(value: object): boolean {
    if (!('secret' in value)) return false;
    if (!('username' in value)) return false;
    return true;
}

export function CoreAuthConfirmUserRequestFromJSON(json: any): CoreAuthConfirmUserRequest {
    return CoreAuthConfirmUserRequestFromJSONTyped(json, false);
}

export function CoreAuthConfirmUserRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAuthConfirmUserRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'secret': json['secret'],
        'username': json['username'],
    };
}

export function CoreAuthConfirmUserRequestToJSON(value?: CoreAuthConfirmUserRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'secret': value['secret'],
        'username': value['username'],
    };
}

