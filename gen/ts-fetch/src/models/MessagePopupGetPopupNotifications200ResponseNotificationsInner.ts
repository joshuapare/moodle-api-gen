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
 * message
 * @export
 * @interface MessagePopupGetPopupNotifications200ResponseNotificationsInner
 */
export interface MessagePopupGetPopupNotifications200ResponseNotificationsInner {
    /**
     * The component that generated the notification
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Component?: string;
    /**
     * Context URL
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Contexturl?: string;
    /**
     * Context URL link name
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Contexturlname?: string;
    /**
     * Custom data to be passed to the message processor.
     *                                 The data here is serialised using json_encode().
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Customdata?: string;
    /**
     * notification deletion status
     * @type {boolean}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Deleted?: boolean;
    /**
     * The type of notification
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Eventtype?: string;
    /**
     * The message
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Fullmessage?: string;
    /**
     * fullmessage format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Fullmessageformat?: number;
    /**
     * The message in html
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Fullmessagehtml?: string;
    /**
     * URL for notification icon
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Iconurl?: string;
    /**
     * Notification id (this is not guaranteed to be unique
     *                                 within this result set)
     * @type {number}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Id?: number;
    /**
     * notification read status
     * @type {boolean}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Read?: boolean;
    /**
     * The notification subject shortened
     *                                 with ellipsis
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Shortenedsubject?: string;
    /**
     * The shorten message
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Smallmessage?: string;
    /**
     * The notification subject
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Subject?: string;
    /**
     * The message text formated
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Text?: string;
    /**
     * Time created
     * @type {number}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Timecreated?: number;
    /**
     * Time created in a pretty format
     * @type {string}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Timecreatedpretty?: string;
    /**
     * Time read
     * @type {number}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Timeread?: number;
    /**
     * User from id
     * @type {number}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Useridfrom?: number;
    /**
     * User to id
     * @type {number}
     * @memberof MessagePopupGetPopupNotifications200ResponseNotificationsInner
     */
    Useridto?: number;
}

/**
 * Check if a given object implements the MessagePopupGetPopupNotifications200ResponseNotificationsInner interface.
 */
export function instanceOfMessagePopupGetPopupNotifications200ResponseNotificationsInner(value: object): boolean {
    return true;
}

export function MessagePopupGetPopupNotifications200ResponseNotificationsInnerFromJSON(json: any): MessagePopupGetPopupNotifications200ResponseNotificationsInner {
    return MessagePopupGetPopupNotifications200ResponseNotificationsInnerFromJSONTyped(json, false);
}

export function MessagePopupGetPopupNotifications200ResponseNotificationsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessagePopupGetPopupNotifications200ResponseNotificationsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Component': json['component'] == null ? undefined : json['component'],
        'Contexturl': json['contexturl'] == null ? undefined : json['contexturl'],
        'Contexturlname': json['contexturlname'] == null ? undefined : json['contexturlname'],
        'Customdata': json['customdata'] == null ? undefined : json['customdata'],
        'Deleted': json['deleted'] == null ? undefined : json['deleted'],
        'Eventtype': json['eventtype'] == null ? undefined : json['eventtype'],
        'Fullmessage': json['fullmessage'] == null ? undefined : json['fullmessage'],
        'Fullmessageformat': json['fullmessageformat'] == null ? undefined : json['fullmessageformat'],
        'Fullmessagehtml': json['fullmessagehtml'] == null ? undefined : json['fullmessagehtml'],
        'Iconurl': json['iconurl'] == null ? undefined : json['iconurl'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Read': json['read'] == null ? undefined : json['read'],
        'Shortenedsubject': json['shortenedsubject'] == null ? undefined : json['shortenedsubject'],
        'Smallmessage': json['smallmessage'] == null ? undefined : json['smallmessage'],
        'Subject': json['subject'] == null ? undefined : json['subject'],
        'Text': json['text'] == null ? undefined : json['text'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timecreatedpretty': json['timecreatedpretty'] == null ? undefined : json['timecreatedpretty'],
        'Timeread': json['timeread'] == null ? undefined : json['timeread'],
        'Useridfrom': json['useridfrom'] == null ? undefined : json['useridfrom'],
        'Useridto': json['useridto'] == null ? undefined : json['useridto'],
    };
}

export function MessagePopupGetPopupNotifications200ResponseNotificationsInnerToJSON(value?: MessagePopupGetPopupNotifications200ResponseNotificationsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['Component'],
        'contexturl': value['Contexturl'],
        'contexturlname': value['Contexturlname'],
        'customdata': value['Customdata'],
        'deleted': value['Deleted'],
        'eventtype': value['Eventtype'],
        'fullmessage': value['Fullmessage'],
        'fullmessageformat': value['Fullmessageformat'],
        'fullmessagehtml': value['Fullmessagehtml'],
        'iconurl': value['Iconurl'],
        'id': value['Id'],
        'read': value['Read'],
        'shortenedsubject': value['Shortenedsubject'],
        'smallmessage': value['Smallmessage'],
        'subject': value['Subject'],
        'text': value['Text'],
        'timecreated': value['Timecreated'],
        'timecreatedpretty': value['Timecreatedpretty'],
        'timeread': value['Timeread'],
        'useridfrom': value['Useridfrom'],
        'useridto': value['Useridto'],
    };
}

