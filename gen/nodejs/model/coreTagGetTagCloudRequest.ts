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

export class CoreTagGetTagCloudRequest {
    /**
    * Only retrieve tag instances in this context.
    */
    'ctx'?: number = 0;
    /**
    * Context id where this tag cloud is displayed.
    */
    'fromctx'?: number = 0;
    /**
    * Whether to return only standard tags.
    */
    'isstandard'?: boolean = false;
    /**
    * Maximum number of tags to retrieve.
    */
    'limit'?: number = 150;
    /**
    * Retrieve tag instances in the $ctx context and it\'s children.
    */
    'rec'?: number = 1;
    /**
    * Search string.
    */
    'search'?: string = '';
    /**
    * Sort order for display                     (id, name, rawname, count, flag, isstandard, tagcollid).
    */
    'sort'?: string = 'name';
    /**
    * Tag collection id.
    */
    'tagcollid'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "ctx",
            "baseName": "ctx",
            "type": "number"
        },
        {
            "name": "fromctx",
            "baseName": "fromctx",
            "type": "number"
        },
        {
            "name": "isstandard",
            "baseName": "isstandard",
            "type": "boolean"
        },
        {
            "name": "limit",
            "baseName": "limit",
            "type": "number"
        },
        {
            "name": "rec",
            "baseName": "rec",
            "type": "number"
        },
        {
            "name": "search",
            "baseName": "search",
            "type": "string"
        },
        {
            "name": "sort",
            "baseName": "sort",
            "type": "string"
        },
        {
            "name": "tagcollid",
            "baseName": "tagcollid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreTagGetTagCloudRequest.attributeTypeMap;
    }
}
