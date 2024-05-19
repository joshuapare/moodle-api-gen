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
 * @interface CoreMessageGetMessages200ResponseMessagesInner
 */
export interface CoreMessageGetMessages200ResponseMessagesInner {
    /**
     * The component that generated the notification
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    component?: string;
    /**
     * Context URL
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    contexturl?: string;
    /**
     * Context URL link name
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    contexturlname?: string;
    /**
     * Custom data to be passed to the message processor.
     *                                 The data here is serialised using json_encode().
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    customdata?: string;
    /**
     * The type of notification
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    eventtype?: string;
    /**
     * The message
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    fullmessage?: string;
    /**
     * fullmessage format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    fullmessageformat?: number;
    /**
     * The message in html
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    fullmessagehtml?: string;
    /**
     * URL for icon, only for notifications.
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    iconurl?: string;
    /**
     * Message id
     * @type {number}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    id?: number;
    /**
     * Is a notification?
     * @type {number}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    notification?: number;
    /**
     * The shorten message
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    smallmessage?: string;
    /**
     * The message subject
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    subject?: string;
    /**
     * The message text formated
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    text?: string;
    /**
     * Time created
     * @type {number}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    timecreated?: number;
    /**
     * Time read
     * @type {number}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    timeread?: number;
    /**
     * User from full name
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    userfromfullname?: string;
    /**
     * User from id
     * @type {number}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    useridfrom?: number;
    /**
     * User to id
     * @type {number}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    useridto?: number;
    /**
     * User to full name
     * @type {string}
     * @memberof CoreMessageGetMessages200ResponseMessagesInner
     */
    usertofullname?: string;
}

/**
 * Check if a given object implements the CoreMessageGetMessages200ResponseMessagesInner interface.
 */
export function instanceOfCoreMessageGetMessages200ResponseMessagesInner(value: object): boolean {
    return true;
}

export function CoreMessageGetMessages200ResponseMessagesInnerFromJSON(json: any): CoreMessageGetMessages200ResponseMessagesInner {
    return CoreMessageGetMessages200ResponseMessagesInnerFromJSONTyped(json, false);
}

export function CoreMessageGetMessages200ResponseMessagesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageGetMessages200ResponseMessagesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'component': json['component'] == null ? undefined : json['component'],
        'contexturl': json['contexturl'] == null ? undefined : json['contexturl'],
        'contexturlname': json['contexturlname'] == null ? undefined : json['contexturlname'],
        'customdata': json['customdata'] == null ? undefined : json['customdata'],
        'eventtype': json['eventtype'] == null ? undefined : json['eventtype'],
        'fullmessage': json['fullmessage'] == null ? undefined : json['fullmessage'],
        'fullmessageformat': json['fullmessageformat'] == null ? undefined : json['fullmessageformat'],
        'fullmessagehtml': json['fullmessagehtml'] == null ? undefined : json['fullmessagehtml'],
        'iconurl': json['iconurl'] == null ? undefined : json['iconurl'],
        'id': json['id'] == null ? undefined : json['id'],
        'notification': json['notification'] == null ? undefined : json['notification'],
        'smallmessage': json['smallmessage'] == null ? undefined : json['smallmessage'],
        'subject': json['subject'] == null ? undefined : json['subject'],
        'text': json['text'] == null ? undefined : json['text'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timeread': json['timeread'] == null ? undefined : json['timeread'],
        'userfromfullname': json['userfromfullname'] == null ? undefined : json['userfromfullname'],
        'useridfrom': json['useridfrom'] == null ? undefined : json['useridfrom'],
        'useridto': json['useridto'] == null ? undefined : json['useridto'],
        'usertofullname': json['usertofullname'] == null ? undefined : json['usertofullname'],
    };
}

export function CoreMessageGetMessages200ResponseMessagesInnerToJSON(value?: CoreMessageGetMessages200ResponseMessagesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'component': value['component'],
        'contexturl': value['contexturl'],
        'contexturlname': value['contexturlname'],
        'customdata': value['customdata'],
        'eventtype': value['eventtype'],
        'fullmessage': value['fullmessage'],
        'fullmessageformat': value['fullmessageformat'],
        'fullmessagehtml': value['fullmessagehtml'],
        'iconurl': value['iconurl'],
        'id': value['id'],
        'notification': value['notification'],
        'smallmessage': value['smallmessage'],
        'subject': value['subject'],
        'text': value['text'],
        'timecreated': value['timecreated'],
        'timeread': value['timeread'],
        'userfromfullname': value['userfromfullname'],
        'useridfrom': value['useridfrom'],
        'useridto': value['useridto'],
        'usertofullname': value['usertofullname'],
    };
}

