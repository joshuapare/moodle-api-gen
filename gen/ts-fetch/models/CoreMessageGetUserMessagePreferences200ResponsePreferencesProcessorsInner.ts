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
 * @interface CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner
 */
export interface CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
    /**
     * Context id
     * @type {number}
     * @memberof CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner
     */
    contextid?: number;
    /**
     * Display name
     * @type {string}
     * @memberof CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner
     */
    displayname?: string;
    /**
     * Whether has settings
     * @type {boolean}
     * @memberof CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner
     */
    hassettings?: boolean;
    /**
     * Processor name
     * @type {string}
     * @memberof CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner
     */
    name?: string;
    /**
     * Whether is configured by the user
     * @type {number}
     * @memberof CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner
     */
    userconfigured?: number;
}

/**
 * Check if a given object implements the CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner interface.
 */
export function instanceOfCoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner(value: object): boolean {
    return true;
}

export function CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInnerFromJSON(json: any): CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
    return CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInnerFromJSONTyped(json, false);
}

export function CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'contextid': json['contextid'] == null ? undefined : json['contextid'],
        'displayname': json['displayname'] == null ? undefined : json['displayname'],
        'hassettings': json['hassettings'] == null ? undefined : json['hassettings'],
        'name': json['name'] == null ? undefined : json['name'],
        'userconfigured': json['userconfigured'] == null ? undefined : json['userconfigured'],
    };
}

export function CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInnerToJSON(value?: CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'contextid': value['contextid'],
        'displayname': value['displayname'],
        'hassettings': value['hassettings'],
        'name': value['name'],
        'userconfigured': value['userconfigured'],
    };
}
