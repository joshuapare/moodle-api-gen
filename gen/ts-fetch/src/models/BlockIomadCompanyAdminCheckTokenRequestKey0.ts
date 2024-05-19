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
 * @interface BlockIomadCompanyAdminCheckTokenRequestKey0
 */
export interface BlockIomadCompanyAdminCheckTokenRequestKey0 {
    /**
     * The user moodle session key
     * @type {string}
     * @memberof BlockIomadCompanyAdminCheckTokenRequestKey0
     */
    Token: string;
    /**
     * The user that is going to be enrolled
     * @type {string}
     * @memberof BlockIomadCompanyAdminCheckTokenRequestKey0
     */
    Username: string;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminCheckTokenRequestKey0 interface.
 */
export function instanceOfBlockIomadCompanyAdminCheckTokenRequestKey0(value: object): boolean {
    if (!('Token' in value)) return false;
    if (!('Username' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminCheckTokenRequestKey0FromJSON(json: any): BlockIomadCompanyAdminCheckTokenRequestKey0 {
    return BlockIomadCompanyAdminCheckTokenRequestKey0FromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminCheckTokenRequestKey0FromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminCheckTokenRequestKey0 {
    if (json == null) {
        return json;
    }
    return {
        
        'Token': json['token'],
        'Username': json['username'],
    };
}

export function BlockIomadCompanyAdminCheckTokenRequestKey0ToJSON(value?: BlockIomadCompanyAdminCheckTokenRequestKey0 | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'token': value['Token'],
        'username': value['Username'],
    };
}

