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
import { MessagePopupGetPopupNotifications200ResponseNotificationsInner } from './message-popup-get-popup-notifications200-response-notifications-inner';


export interface MessagePopupGetPopupNotifications200Response { 
    Notifications: Array<MessagePopupGetPopupNotifications200ResponseNotificationsInner>;
    /**
     * the number of unread message for the given user
     */
    Unreadcount: number;
}

