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

export class ToolAnalyticsPotentialContextsRequest {
    /**
    * The model id
    */
    'Modelid'?: number = null;
    /**
    * The model id
    */
    'Query'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Modelid",
            "baseName": "modelid",
            "type": "number"
        },
        {
            "name": "Query",
            "baseName": "query",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ToolAnalyticsPotentialContextsRequest.attributeTypeMap;
    }
}

