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

export class ModWikiGetSubwikiPagesRequestOptions {
    /**
    * Include each page contents or just the contents size.
    */
    'includecontent'?: number = 1;
    /**
    * Field to sort by (id, title, ...).
    */
    'sortby'?: string = 'title';
    /**
    * Sort direction: ASC or DESC.
    */
    'sortdirection'?: string = 'ASC';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "includecontent",
            "baseName": "includecontent",
            "type": "number"
        },
        {
            "name": "sortby",
            "baseName": "sortby",
            "type": "string"
        },
        {
            "name": "sortdirection",
            "baseName": "sortdirection",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModWikiGetSubwikiPagesRequestOptions.attributeTypeMap;
    }
}

