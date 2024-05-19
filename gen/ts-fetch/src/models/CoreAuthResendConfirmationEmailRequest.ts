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
 * @interface CoreAuthResendConfirmationEmailRequest
 */
export interface CoreAuthResendConfirmationEmailRequest {
    /**
     * Plain text password.
     * @type {string}
     * @memberof CoreAuthResendConfirmationEmailRequest
     */
    Password: string;
    /**
     * Redirect the user to this site url after confirmation.
     * @type {string}
     * @memberof CoreAuthResendConfirmationEmailRequest
     */
    Redirect?: string;
    /**
     * Username.
     * @type {string}
     * @memberof CoreAuthResendConfirmationEmailRequest
     */
    Username: string;
}

/**
 * Check if a given object implements the CoreAuthResendConfirmationEmailRequest interface.
 */
export function instanceOfCoreAuthResendConfirmationEmailRequest(value: object): boolean {
    if (!('Password' in value)) return false;
    if (!('Username' in value)) return false;
    return true;
}

export function CoreAuthResendConfirmationEmailRequestFromJSON(json: any): CoreAuthResendConfirmationEmailRequest {
    return CoreAuthResendConfirmationEmailRequestFromJSONTyped(json, false);
}

export function CoreAuthResendConfirmationEmailRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAuthResendConfirmationEmailRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Password': json['password'],
        'Redirect': json['redirect'] == null ? undefined : json['redirect'],
        'Username': json['username'],
    };
}

export function CoreAuthResendConfirmationEmailRequestToJSON(value?: CoreAuthResendConfirmationEmailRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'password': value['Password'],
        'redirect': value['Redirect'],
        'username': value['Username'],
    };
}

