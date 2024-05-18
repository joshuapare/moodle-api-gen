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
 * @interface AuthEmailSignupUserRequestCustomprofilefieldsInner
 */
export interface AuthEmailSignupUserRequestCustomprofilefieldsInner {
    /**
     * The name of the custom field
     * @type {string}
     * @memberof AuthEmailSignupUserRequestCustomprofilefieldsInner
     */
    name?: string;
    /**
     * The type of the custom field
     * @type {string}
     * @memberof AuthEmailSignupUserRequestCustomprofilefieldsInner
     */
    type?: string;
    /**
     * Custom field value, can be an encoded json if required
     * @type {string}
     * @memberof AuthEmailSignupUserRequestCustomprofilefieldsInner
     */
    value?: string;
}

/**
 * Check if a given object implements the AuthEmailSignupUserRequestCustomprofilefieldsInner interface.
 */
export function instanceOfAuthEmailSignupUserRequestCustomprofilefieldsInner(value: object): boolean {
    return true;
}

export function AuthEmailSignupUserRequestCustomprofilefieldsInnerFromJSON(json: any): AuthEmailSignupUserRequestCustomprofilefieldsInner {
    return AuthEmailSignupUserRequestCustomprofilefieldsInnerFromJSONTyped(json, false);
}

export function AuthEmailSignupUserRequestCustomprofilefieldsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): AuthEmailSignupUserRequestCustomprofilefieldsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'type': json['type'] == null ? undefined : json['type'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function AuthEmailSignupUserRequestCustomprofilefieldsInnerToJSON(value?: AuthEmailSignupUserRequestCustomprofilefieldsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'type': value['type'],
        'value': value['value'],
    };
}
