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

export class CoreMessageMarkAllNotificationsAsReadRequest {
    /**
    * mark messages created before this time as read, 0 for all messages
    */
    'timecreatedto'?: number = 0;
    /**
    * the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user
    */
    'useridfrom'?: number = 0;
    /**
    * the user id who received the message, 0 for any user
    */
    'useridto': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "timecreatedto",
            "baseName": "timecreatedto",
            "type": "number"
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
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageMarkAllNotificationsAsReadRequest.attributeTypeMap;
    }
}
