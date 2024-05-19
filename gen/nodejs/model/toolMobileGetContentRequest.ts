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
import { ToolMobileGetContentRequestArgsInner } from './toolMobileGetContentRequestArgsInner';

export class ToolMobileGetContentRequest {
    'args'?: Array<ToolMobileGetContentRequestArgsInner>;
    /**
    * Component where the class is e.g. mod_assign.
    */
    'component': string = 'null';
    /**
    * Method to execute in class \\$component\\output\\mobile.
    */
    'method': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "args",
            "baseName": "args",
            "type": "Array<ToolMobileGetContentRequestArgsInner>"
        },
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "method",
            "baseName": "method",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ToolMobileGetContentRequest.attributeTypeMap;
    }
}

