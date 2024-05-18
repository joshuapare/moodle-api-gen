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

export class ToolMobileCallExternalFunctions200ResponseResponsesInner {
    /**
    * JSON-encoded response data
    */
    'data'?: string = 'null';
    /**
    * Whether an exception was thrown.
    */
    'error'?: boolean = null;
    /**
    * JSON-encoed exception info
    */
    'exception'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "string"
        },
        {
            "name": "error",
            "baseName": "error",
            "type": "boolean"
        },
        {
            "name": "exception",
            "baseName": "exception",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ToolMobileCallExternalFunctions200ResponseResponsesInner.attributeTypeMap;
    }
}
