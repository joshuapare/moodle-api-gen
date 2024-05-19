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
import { CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner } from './coreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner';

export class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner {
    /**
    * Display name
    */
    'Displayname'?: string = 'null';
    'Notifications'?: Array<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Displayname",
            "baseName": "displayname",
            "type": "string"
        },
        {
            "name": "Notifications",
            "baseName": "notifications",
            "type": "Array<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner>"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.attributeTypeMap;
    }
}

