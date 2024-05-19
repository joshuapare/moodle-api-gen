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
import { ToolLpDataForTemplatesManagePage200ResponseTemplatesInner } from './toolLpDataForTemplatesManagePage200ResponseTemplatesInner';

export class ToolLpDataForTemplatesManagePage200Response {
    /**
    * Whether the user manage the templates
    */
    'canmanage': boolean = null;
    'navigation': Array<object>;
    /**
    * The page context id
    */
    'pagecontextid': number;
    /**
    * Url to the tool_lp plugin folder on this Moodle site
    */
    'pluginbaseurl': string;
    'templates': Array<ToolLpDataForTemplatesManagePage200ResponseTemplatesInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "canmanage",
            "baseName": "canmanage",
            "type": "boolean"
        },
        {
            "name": "navigation",
            "baseName": "navigation",
            "type": "Array<object>"
        },
        {
            "name": "pagecontextid",
            "baseName": "pagecontextid",
            "type": "number"
        },
        {
            "name": "pluginbaseurl",
            "baseName": "pluginbaseurl",
            "type": "string"
        },
        {
            "name": "templates",
            "baseName": "templates",
            "type": "Array<ToolLpDataForTemplatesManagePage200ResponseTemplatesInner>"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForTemplatesManagePage200Response.attributeTypeMap;
    }
}

