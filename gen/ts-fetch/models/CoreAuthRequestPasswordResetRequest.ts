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
 * @interface CoreAuthRequestPasswordResetRequest
 */
export interface CoreAuthRequestPasswordResetRequest {
    /**
     * User email
     * @type {string}
     * @memberof CoreAuthRequestPasswordResetRequest
     */
    email?: string;
    /**
     * User name
     * @type {string}
     * @memberof CoreAuthRequestPasswordResetRequest
     */
    username?: string;
}

/**
 * Check if a given object implements the CoreAuthRequestPasswordResetRequest interface.
 */
export function instanceOfCoreAuthRequestPasswordResetRequest(value: object): boolean {
    return true;
}

export function CoreAuthRequestPasswordResetRequestFromJSON(json: any): CoreAuthRequestPasswordResetRequest {
    return CoreAuthRequestPasswordResetRequestFromJSONTyped(json, false);
}

export function CoreAuthRequestPasswordResetRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAuthRequestPasswordResetRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'email': json['email'] == null ? undefined : json['email'],
        'username': json['username'] == null ? undefined : json['username'],
    };
}

export function CoreAuthRequestPasswordResetRequestToJSON(value?: CoreAuthRequestPasswordResetRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'email': value['email'],
        'username': value['username'],
    };
}

