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

export class CoreUserUpdateUserDevicePublicKeyRequest {
    /**
    * The app id, something like com.moodle.moodlemobile
    */
    'Appid': string = 'null';
    /**
    * the app generated public key
    */
    'Publickey': string;
    /**
    * the device UUID
    */
    'Uuid': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Appid",
            "baseName": "appid",
            "type": "string"
        },
        {
            "name": "Publickey",
            "baseName": "publickey",
            "type": "string"
        },
        {
            "name": "Uuid",
            "baseName": "uuid",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreUserUpdateUserDevicePublicKeyRequest.attributeTypeMap;
    }
}

