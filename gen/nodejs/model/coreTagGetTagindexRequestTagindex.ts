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
    'Ctx'?: number = 0;
    /**
    * exlusive mode for this tag area
    */
    'Excl'?: boolean = 0;
    /**
    * context id where the link was displayed
    */
    'From'?: number = 0;
    /**
    * page number (0-based)
    */
    'Page'?: number = 0;
    /**
    * search in the context recursive
    */
    'Rec'?: number = 1;
    /**
    * tag area id
    */
    'Ta': number = null;
    /**
    * tag name
    */
    'Tag': string = 'null';
    /**
    * tag collection id
    */
    'Tc': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Ctx",
            "baseName": "ctx",
            "type": "number"
        },
        {
            "name": "Excl",
            "baseName": "excl",
            "type": "boolean"
        },
        {
            "name": "From",
            "baseName": "from",
            "type": "number"
        },
        {
            "name": "Page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "Rec",
            "baseName": "rec",
            "type": "number"
        },
        {
            "name": "Ta",
            "baseName": "ta",
            "type": "number"
        },
        {
            "name": "Tag",
            "baseName": "tag",
            "type": "string"
        },
        {
            "name": "Tc",
            "baseName": "tc",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreTagGetTagindexRequestTagindex.attributeTypeMap;
    }
}

