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

export class CoreBlogGetEntries200ResponseEntriesInnerTagsInner {
    /**
    * Whether the tag is flagged as inappropriate.
    */
    'flag'?: number = 0;
    /**
    * Tag id.
    */
    'id'?: number = null;
    /**
    * Whether this tag is standard.
    */
    'isstandard'?: boolean = false;
    /**
    * Id of the record tagged.
    */
    'itemid'?: number = null;
    /**
    * Tag name.
    */
    'name'?: string = 'null';
    /**
    * Tag ordering.
    */
    'ordering'?: number = null;
    /**
    * The raw, unnormalised name for the tag as entered by users.
    */
    'rawname'?: string = 'null';
    /**
    * Tag collection id.
    */
    'tagcollid'?: number = null;
    /**
    * Context the tag instance belongs to.
    */
    'taginstancecontextid'?: number = null;
    /**
    * Tag instance id.
    */
    'taginstanceid'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
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
            "type": "boolean"
        },
        {
            "name": "itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "ordering",
            "baseName": "ordering",
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
            "name": "taginstancecontextid",
            "baseName": "taginstancecontextid",
            "type": "number"
        },
        {
            "name": "taginstanceid",
            "baseName": "taginstanceid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreBlogGetEntries200ResponseEntriesInnerTagsInner.attributeTypeMap;
    }
}
