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
import type { CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner } from './CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner';
import {
    CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerFromJSON,
    CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerFromJSONTyped,
    CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerToJSON,
} from './CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner';

/**
 * 
 * @export
 * @interface CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner
 */
export interface CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner {
    /**
     * Display name
     * @type {string}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner
     */
    displayname?: string;
    /**
     * Preference key
     * @type {string}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner
     */
    preferencekey?: string;
    /**
     * 
     * @type {Array<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner>}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner
     */
    processors?: Array<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner>;
}

/**
 * Check if a given object implements the CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner interface.
 */
export function instanceOfCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner(value: object): boolean {
    return true;
}

export function CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerFromJSON(json: any): CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner {
    return CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerFromJSONTyped(json, false);
}

export function CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'displayname': json['displayname'] == null ? undefined : json['displayname'],
        'preferencekey': json['preferencekey'] == null ? undefined : json['preferencekey'],
        'processors': json['processors'] == null ? undefined : ((json['processors'] as Array<any>).map(CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerFromJSON)),
    };
}

export function CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerToJSON(value?: CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'displayname': value['displayname'],
        'preferencekey': value['preferencekey'],
        'processors': value['processors'] == null ? undefined : ((value['processors'] as Array<any>).map(CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerToJSON)),
    };
}

