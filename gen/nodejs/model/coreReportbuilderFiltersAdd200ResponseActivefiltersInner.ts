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

export class CoreReportbuilderFiltersAdd200ResponseActivefiltersInner {
    /**
    * entityname
    */
    'entityname'?: string = 'null';
    /**
    * heading
    */
    'heading'?: string;
    /**
    * headingeditable
    */
    'headingeditable'?: string = 'null';
    /**
    * id
    */
    'id'?: number;
    /**
    * movetitle
    */
    'movetitle'?: string;
    /**
    * sortorder
    */
    'sortorder'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "entityname",
            "baseName": "entityname",
            "type": "string"
        },
        {
            "name": "heading",
            "baseName": "heading",
            "type": "string"
        },
        {
            "name": "headingeditable",
            "baseName": "headingeditable",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "movetitle",
            "baseName": "movetitle",
            "type": "string"
        },
        {
            "name": "sortorder",
            "baseName": "sortorder",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderFiltersAdd200ResponseActivefiltersInner.attributeTypeMap;
    }
}

