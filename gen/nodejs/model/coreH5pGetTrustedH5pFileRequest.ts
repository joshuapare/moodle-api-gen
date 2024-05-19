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

export class CoreH5pGetTrustedH5pFileRequest {
    /**
    * The copyright option
    */
    'Copyright'?: number = 0;
    /**
    * The embed allow to copy the code to your site
    */
    'Embed'?: number = 0;
    /**
    * The export allow to download the package
    */
    'Export'?: number = 0;
    /**
    * The frame allow to show the bar options below the content
    */
    'Frame'?: number = 0;
    /**
    * H5P file url.
    */
    'Url': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Copyright",
            "baseName": "copyright",
            "type": "number"
        },
        {
            "name": "Embed",
            "baseName": "embed",
            "type": "number"
        },
        {
            "name": "Export",
            "baseName": "export",
            "type": "number"
        },
        {
            "name": "Frame",
            "baseName": "frame",
            "type": "number"
        },
        {
            "name": "Url",
            "baseName": "url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreH5pGetTrustedH5pFileRequest.attributeTypeMap;
    }
}

