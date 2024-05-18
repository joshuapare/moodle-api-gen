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

export class ToolUsertoursResetTourRequest {
    /**
    * Context ID
    */
    'context': number;
    /**
    * Current page location
    */
    'pageurl': string = 'null';
    /**
    * Tour ID
    */
    'tourid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "context",
            "baseName": "context",
            "type": "number"
        },
        {
            "name": "pageurl",
            "baseName": "pageurl",
            "type": "string"
        },
        {
            "name": "tourid",
            "baseName": "tourid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ToolUsertoursResetTourRequest.attributeTypeMap;
    }
}

