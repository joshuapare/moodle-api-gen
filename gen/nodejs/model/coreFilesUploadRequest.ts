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

export class CoreFilesUploadRequest {
    /**
    * component
    */
    'Component': string;
    /**
    * context id
    */
    'Contextid'?: number = null;
    /**
    * The context level to put the file in,                         (block, course, coursecat, system, user, module)
    */
    'Contextlevel'?: string = 'null';
    /**
    * file area
    */
    'Filearea': string;
    /**
    * file content
    */
    'Filecontent': string = 'null';
    /**
    * file name
    */
    'Filename': string;
    /**
    * file path
    */
    'Filepath': string;
    /**
    * The Instance id of item associated                          with the context level
    */
    'Instanceid'?: number = null;
    /**
    * associated id
    */
    'Itemid': number;

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
            "name": "Contextlevel",
            "baseName": "contextlevel",
            "type": "string"
        },
        {
            "name": "Filearea",
            "baseName": "filearea",
            "type": "string"
        },
        {
            "name": "Filecontent",
            "baseName": "filecontent",
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
            "name": "Instanceid",
            "baseName": "instanceid",
            "type": "number"
        },
        {
            "name": "Itemid",
            "baseName": "itemid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreFilesUploadRequest.attributeTypeMap;
    }
}

