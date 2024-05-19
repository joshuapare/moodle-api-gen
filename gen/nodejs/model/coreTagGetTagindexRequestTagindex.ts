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

export class CoreTagGetTagindexRequestTagindex {
    /**
    * context id where to search for items
    */
    'ctx'?: number = 0;
    /**
    * exlusive mode for this tag area
    */
    'excl'?: boolean = 0;
    /**
    * context id where the link was displayed
    */
    'from'?: number = 0;
    /**
    * page number (0-based)
    */
    'page'?: number = 0;
    /**
    * search in the context recursive
    */
    'rec'?: number = 1;
    /**
    * tag area id
    */
    'ta': number = null;
    /**
    * tag name
    */
    'tag': string = 'null';
    /**
    * tag collection id
    */
    'tc': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "ctx",
            "baseName": "ctx",
            "type": "number"
        },
        {
            "name": "excl",
            "baseName": "excl",
            "type": "boolean"
        },
        {
            "name": "from",
            "baseName": "from",
            "type": "number"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "rec",
            "baseName": "rec",
            "type": "number"
        },
        {
            "name": "ta",
            "baseName": "ta",
            "type": "number"
        },
        {
            "name": "tag",
            "baseName": "tag",
            "type": "string"
        },
        {
            "name": "tc",
            "baseName": "tc",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreTagGetTagindexRequestTagindex.attributeTypeMap;
    }
}

