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

export class CoreMessageMarkNotificationReadRequest {
    /**
    * id of the notification
    */
    'notificationid': number = null;
    /**
    * timestamp for when the notification should be marked read
    */
    'timeread'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "notificationid",
            "baseName": "notificationid",
            "type": "number"
        },
        {
            "name": "timeread",
            "baseName": "timeread",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreMessageMarkNotificationReadRequest.attributeTypeMap;
    }
}

