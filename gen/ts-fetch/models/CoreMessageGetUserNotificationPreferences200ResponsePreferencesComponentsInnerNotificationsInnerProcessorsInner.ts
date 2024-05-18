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
import type { CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff } from './CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff';
import {
    CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoffFromJSON,
    CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoffFromJSONTyped,
    CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoffToJSON,
} from './CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff';

/**
 * 
 * @export
 * @interface CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
 */
export interface CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
    /**
     * Display name
     * @type {string}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    displayname?: string;
    /**
     * Is enabled?
     * @type {boolean}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    enabled?: boolean;
    /**
     * Is locked by admin?
     * @type {boolean}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    locked?: boolean;
    /**
     * Text to display if locked
     * @type {string}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    lockedmessage?: string;
    /**
     * 
     * @type {CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    loggedin?: CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff;
    /**
     * 
     * @type {CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    loggedoff?: CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff;
    /**
     * Processor name
     * @type {string}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    name?: string;
    /**
     * Is configured?
     * @type {number}
     * @memberof CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner
     */
    userconfigured?: number;
}

/**
 * Check if a given object implements the CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner interface.
 */
export function instanceOfCoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner(value: object): boolean {
    return true;
}

export function CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerFromJSON(json: any): CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
    return CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerFromJSONTyped(json, false);
}

export function CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'displayname': json['displayname'] == null ? undefined : json['displayname'],
        'enabled': json['enabled'] == null ? undefined : json['enabled'],
        'locked': json['locked'] == null ? undefined : json['locked'],
        'lockedmessage': json['lockedmessage'] == null ? undefined : json['lockedmessage'],
        'loggedin': json['loggedin'] == null ? undefined : CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoffFromJSON(json['loggedin']),
        'loggedoff': json['loggedoff'] == null ? undefined : CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoffFromJSON(json['loggedoff']),
        'name': json['name'] == null ? undefined : json['name'],
        'userconfigured': json['userconfigured'] == null ? undefined : json['userconfigured'],
    };
}

export function CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerToJSON(value?: CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'displayname': value['displayname'],
        'enabled': value['enabled'],
        'locked': value['locked'],
        'lockedmessage': value['lockedmessage'],
        'loggedin': CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoffToJSON(value['loggedin']),
        'loggedoff': CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoffToJSON(value['loggedoff']),
        'name': value['name'],
        'userconfigured': value['userconfigured'],
    };
}

