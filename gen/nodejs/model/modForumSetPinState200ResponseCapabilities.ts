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

export class ModForumSetPinState200ResponseCapabilities {
    /**
    * favourite
    */
    'favourite': boolean = null;
    /**
    * manage
    */
    'manage': boolean = null;
    /**
    * move
    */
    'move': boolean = null;
    /**
    * pin
    */
    'pin': boolean = null;
    /**
    * post
    */
    'post': boolean = null;
    /**
    * subscribe
    */
    'subscribe': boolean = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "favourite",
            "baseName": "favourite",
            "type": "boolean"
        },
        {
            "name": "manage",
            "baseName": "manage",
            "type": "boolean"
        },
        {
            "name": "move",
            "baseName": "move",
            "type": "boolean"
        },
        {
            "name": "pin",
            "baseName": "pin",
            "type": "boolean"
        },
        {
            "name": "post",
            "baseName": "post",
            "type": "boolean"
        },
        {
            "name": "subscribe",
            "baseName": "subscribe",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModForumSetPinState200ResponseCapabilities.attributeTypeMap;
    }
}
