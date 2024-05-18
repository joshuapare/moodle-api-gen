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
import { CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner } from './core-message-get-user-notification-preferences200-response-preferences-components-inner-notifications-inner';


export interface CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner { 
    /**
     * Display name
     */
    Displayname?: string;
    Notifications?: Array<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner>;
}
