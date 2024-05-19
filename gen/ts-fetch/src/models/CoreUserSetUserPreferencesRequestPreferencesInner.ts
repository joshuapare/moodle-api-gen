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
 * @interface CoreUserSetUserPreferencesRequestPreferencesInner
 */
export interface CoreUserSetUserPreferencesRequestPreferencesInner {
    /**
     * The name of the preference
     * @type {string}
     * @memberof CoreUserSetUserPreferencesRequestPreferencesInner
     */
    Name?: string;
    /**
     * Id of the user to set the preference (default to current user)
     * @type {number}
     * @memberof CoreUserSetUserPreferencesRequestPreferencesInner
     */
    Userid?: number;
    /**
     * The value of the preference
     * @type {string}
     * @memberof CoreUserSetUserPreferencesRequestPreferencesInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the CoreUserSetUserPreferencesRequestPreferencesInner interface.
 */
export function instanceOfCoreUserSetUserPreferencesRequestPreferencesInner(value: object): boolean {
    return true;
}

export function CoreUserSetUserPreferencesRequestPreferencesInnerFromJSON(json: any): CoreUserSetUserPreferencesRequestPreferencesInner {
    return CoreUserSetUserPreferencesRequestPreferencesInnerFromJSONTyped(json, false);
}

export function CoreUserSetUserPreferencesRequestPreferencesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserSetUserPreferencesRequestPreferencesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreUserSetUserPreferencesRequestPreferencesInnerToJSON(value?: CoreUserSetUserPreferencesRequestPreferencesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'userid': value['Userid'],
        'value': value['Value'],
    };
}

