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

export class CoreCompletionOverrideActivityCompletionStatusRequest {
    /**
    * course module id
    */
    'cmid': number = null;
    /**
    * the new activity completion state
    */
    'newstate': number = null;
    /**
    * user id
    */
    'userid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "cmid",
            "baseName": "cmid",
            "type": "number"
        },
        {
            "name": "newstate",
            "baseName": "newstate",
            "type": "number"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCompletionOverrideActivityCompletionStatusRequest.attributeTypeMap;
    }
}
