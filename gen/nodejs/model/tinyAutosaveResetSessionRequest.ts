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

export class TinyAutosaveResetSessionRequest {
    /**
    * The context id that owns the editor
    */
    'contextid': number = null;
    /**
    * The ID of the element
    */
    'elementid': string = 'null';
    /**
    * The page hash
    */
    'pagehash': string = 'null';
    /**
    * The page instance
    */
    'pageinstance': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "elementid",
            "baseName": "elementid",
            "type": "string"
        },
        {
            "name": "pagehash",
            "baseName": "pagehash",
            "type": "string"
        },
        {
            "name": "pageinstance",
            "baseName": "pageinstance",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TinyAutosaveResetSessionRequest.attributeTypeMap;
    }
}
