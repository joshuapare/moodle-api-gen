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
import { MessagePopupGetPopupNotifications200ResponseNotificationsInner } from './messagePopupGetPopupNotifications200ResponseNotificationsInner';

export class MessagePopupGetPopupNotifications200Response {
    'notifications': Array<MessagePopupGetPopupNotifications200ResponseNotificationsInner>;
    /**
    * the number of unread message for the given user
    */
    'unreadcount': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "notifications",
            "baseName": "notifications",
            "type": "Array<MessagePopupGetPopupNotifications200ResponseNotificationsInner>"
        },
        {
            "name": "unreadcount",
            "baseName": "unreadcount",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return MessagePopupGetPopupNotifications200Response.attributeTypeMap;
    }
}
