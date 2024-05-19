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

import { RequestFile } from './models';
import { CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff } from './coreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff';

export class CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
    /**
    * Display name
    */
    'Displayname'?: string;
    /**
    * Is enabled?
    */
    'Enabled'?: boolean;
    /**
    * Is locked by admin?
    */
    'Locked'?: boolean;
    /**
    * Text to display if locked
    */
    'Lockedmessage'?: string;
    'Loggedin'?: CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff;
    'Loggedoff'?: CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff;
    /**
    * Processor name
    */
    'Name'?: string;
    /**
    * Is configured?
    */
    'Userconfigured'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Displayname",
            "baseName": "displayname",
            "type": "string"
        },
        {
            "name": "Enabled",
            "baseName": "enabled",
            "type": "boolean"
        },
        {
            "name": "Locked",
            "baseName": "locked",
            "type": "boolean"
        },
        {
            "name": "Lockedmessage",
            "baseName": "lockedmessage",
            "type": "string"
        },
        {
            "name": "Loggedin",
            "baseName": "loggedin",
            "type": "CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff"
        },
        {
            "name": "Loggedoff",
            "baseName": "loggedoff",
            "type": "CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Userconfigured",
            "baseName": "userconfigured",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.attributeTypeMap;
    }
}

