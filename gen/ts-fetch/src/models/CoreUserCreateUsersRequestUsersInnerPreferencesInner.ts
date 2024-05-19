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
 * @interface CoreUserCreateUsersRequestUsersInnerPreferencesInner
 */
export interface CoreUserCreateUsersRequestUsersInnerPreferencesInner {
    /**
     * The name of the preference
     * @type {string}
     * @memberof CoreUserCreateUsersRequestUsersInnerPreferencesInner
     */
    Type?: string;
    /**
     * The value of the preference
     * @type {string}
     * @memberof CoreUserCreateUsersRequestUsersInnerPreferencesInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the CoreUserCreateUsersRequestUsersInnerPreferencesInner interface.
 */
export function instanceOfCoreUserCreateUsersRequestUsersInnerPreferencesInner(value: object): boolean {
    return true;
}

export function CoreUserCreateUsersRequestUsersInnerPreferencesInnerFromJSON(json: any): CoreUserCreateUsersRequestUsersInnerPreferencesInner {
    return CoreUserCreateUsersRequestUsersInnerPreferencesInnerFromJSONTyped(json, false);
}

export function CoreUserCreateUsersRequestUsersInnerPreferencesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserCreateUsersRequestUsersInnerPreferencesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Type': json['type'] == null ? undefined : json['type'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreUserCreateUsersRequestUsersInnerPreferencesInnerToJSON(value?: CoreUserCreateUsersRequestUsersInnerPreferencesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': value['Type'],
        'value': value['Value'],
    };
}
