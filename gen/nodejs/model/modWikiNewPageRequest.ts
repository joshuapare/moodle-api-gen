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

export class ModWikiNewPageRequest {
    /**
    * Page contents.
    */
    'content': string;
    /**
    * Page contents format. If an invalid format is provided, default                     wiki format is used.
    */
    'contentformat'?: string = 'null';
    /**
    * Subwiki\'s group ID. Used if subwiki does not exists.
    */
    'groupid'?: number = null;
    /**
    * Page\'s subwiki ID.
    */
    'subwikiid'?: number;
    /**
    * New page title.
    */
    'title': string = 'null';
    /**
    * Subwiki\'s user ID. Used if subwiki does not exists.
    */
    'userid'?: number = null;
    /**
    * Page\'s wiki ID. Used if subwiki does not exists.
    */
    'wikiid'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "contentformat",
            "baseName": "contentformat",
            "type": "string"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "subwikiid",
            "baseName": "subwikiid",
            "type": "number"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "wikiid",
            "baseName": "wikiid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModWikiNewPageRequest.attributeTypeMap;
    }
}
