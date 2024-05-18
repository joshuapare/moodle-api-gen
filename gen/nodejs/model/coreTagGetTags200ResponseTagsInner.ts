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

/**
* information about one tag
*/
export class CoreTagGetTags200ResponseTagsInner {
    /**
    * tag description
    */
    'description'?: string = 'null';
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number;
    /**
    * flag
    */
    'flag'?: number = null;
    /**
    * tag id
    */
    'id'?: number;
    /**
    * whether this flag is standard
    */
    'isstandard'?: number = null;
    /**
    * name
    */
    'name'?: string;
    /**
    * whether this flag is standard (deprecated, use isstandard)
    */
    'official'?: number = null;
    /**
    * tag raw name (may contain capital letters)
    */
    'rawname'?: string = 'null';
    /**
    * tag collection id
    */
    'tagcollid'?: number;
    /**
    * URL to view
    */
    'viewurl'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "descriptionformat",
            "baseName": "descriptionformat",
            "type": "number"
        },
        {
            "name": "flag",
            "baseName": "flag",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "isstandard",
            "baseName": "isstandard",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "official",
            "baseName": "official",
            "type": "number"
        },
        {
            "name": "rawname",
            "baseName": "rawname",
            "type": "string"
        },
        {
            "name": "tagcollid",
            "baseName": "tagcollid",
            "type": "number"
        },
        {
            "name": "viewurl",
            "baseName": "viewurl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreTagGetTags200ResponseTagsInner.attributeTypeMap;
    }
}
