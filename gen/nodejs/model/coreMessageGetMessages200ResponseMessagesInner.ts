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

/**
* message
*/
export class CoreMessageGetMessages200ResponseMessagesInner {
    /**
    * The component that generated the notification
    */
    'component'?: string = 'null';
    /**
    * Context URL
    */
    'contexturl'?: string = 'null';
    /**
    * Context URL link name
    */
    'contexturlname'?: string = 'null';
    /**
    * Custom data to be passed to the message processor.                                 The data here is serialised using json_encode().
    */
    'customdata'?: string = 'null';
    /**
    * The type of notification
    */
    'eventtype'?: string = 'null';
    /**
    * The message
    */
    'fullmessage'?: string = 'null';
    /**
    * fullmessage format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'fullmessageformat'?: number = null;
    /**
    * The message in html
    */
    'fullmessagehtml'?: string = 'null';
    /**
    * URL for icon, only for notifications.
    */
    'iconurl'?: string = 'null';
    /**
    * Message id
    */
    'id'?: number;
    /**
    * Is a notification?
    */
    'notification'?: number = null;
    /**
    * The shorten message
    */
    'smallmessage'?: string = 'null';
    /**
    * The message subject
    */
    'subject'?: string = 'null';
    /**
    * The message text formated
    */
    'text'?: string = 'null';
    /**
    * Time created
    */
    'timecreated'?: number;
    /**
    * Time read
    */
    'timeread'?: number = null;
    /**
    * User from full name
    */
    'userfromfullname'?: string = 'null';
    /**
    * User from id
    */
    'useridfrom'?: number;
    /**
    * User to id
    */
    'useridto'?: number;
    /**
    * User to full name
    */
    'usertofullname'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "contexturl",
            "baseName": "contexturl",
            "type": "string"
        },
        {
            "name": "contexturlname",
            "baseName": "contexturlname",
            "type": "string"
        },
        {
            "name": "customdata",
            "baseName": "customdata",
            "type": "string"
        },
        {
            "name": "eventtype",
            "baseName": "eventtype",
            "type": "string"
        },
        {
            "name": "fullmessage",
            "baseName": "fullmessage",
            "type": "string"
        },
        {
            "name": "fullmessageformat",
            "baseName": "fullmessageformat",
            "type": "number"
        },
        {
            "name": "fullmessagehtml",
            "baseName": "fullmessagehtml",
            "type": "string"
        },
        {
            "name": "iconurl",
            "baseName": "iconurl",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "notification",
            "baseName": "notification",
            "type": "number"
        },
        {
            "name": "smallmessage",
            "baseName": "smallmessage",
            "type": "string"
        },
        {
            "name": "subject",
            "baseName": "subject",
            "type": "string"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "timeread",
            "baseName": "timeread",
            "type": "number"
        },
        {
            "name": "userfromfullname",
            "baseName": "userfromfullname",
            "type": "string"
        },
        {
            "name": "useridfrom",
            "baseName": "useridfrom",
            "type": "number"
        },
        {
            "name": "useridto",
            "baseName": "useridto",
            "type": "number"
        },
        {
            "name": "usertofullname",
            "baseName": "usertofullname",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageGetMessages200ResponseMessagesInner.attributeTypeMap;
    }
}
