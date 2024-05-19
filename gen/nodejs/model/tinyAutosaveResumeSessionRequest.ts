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

export class TinyAutosaveResumeSessionRequest {
    /**
    * The context id that owns the editor
    */
    'Contextid': number;
    /**
    * The new draft item id to resume files to
    */
    'Draftid': number = null;
    /**
    * The ID of the element
    */
    'Elementid': string;
    /**
    * The page hash
    */
    'Pagehash': string;
    /**
    * The page instance
    */
    'Pageinstance': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "Draftid",
            "baseName": "draftid",
            "type": "number"
        },
        {
            "name": "Elementid",
            "baseName": "elementid",
            "type": "string"
        },
        {
            "name": "Pagehash",
            "baseName": "pagehash",
            "type": "string"
        },
        {
            "name": "Pageinstance",
            "baseName": "pageinstance",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return TinyAutosaveResumeSessionRequest.attributeTypeMap;
    }
}

