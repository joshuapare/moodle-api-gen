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

export class CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon {
    /**
    * component
    */
    'Component': string;
    /**
    * key
    */
    'Key': string;
    /**
    * title
    */
    'Title': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Key",
            "baseName": "key",
            "type": "string"
        },
        {
            "name": "Title",
            "baseName": "title",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon.attributeTypeMap;
    }
}

