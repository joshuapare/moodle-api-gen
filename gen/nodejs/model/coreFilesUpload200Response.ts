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

export class CoreFilesUpload200Response {
    'Component': string;
    'Contextid': number;
    'Filearea': string;
    'Filename': string;
    'Filepath': string;
    'Itemid': number;
    'Url': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "Filearea",
            "baseName": "filearea",
            "type": "string"
        },
        {
            "name": "Filename",
            "baseName": "filename",
            "type": "string"
        },
        {
            "name": "Filepath",
            "baseName": "filepath",
            "type": "string"
        },
        {
            "name": "Itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "Url",
            "baseName": "url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreFilesUpload200Response.attributeTypeMap;
    }
}

