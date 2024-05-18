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
import { ModDataSearchEntriesRequestAdvsearchInner } from './modDataSearchEntriesRequestAdvsearchInner';

export class ModDataSearchEntriesRequest {
    'advsearch'?: Array<ModDataSearchEntriesRequestAdvsearchInner>;
    /**
    * data instance id
    */
    'databaseid': number;
    /**
    * Group id, 0 means that the function will determine the user group
    */
    'groupid'?: number = 0;
    /**
    * The direction of the sorting: \'ASC\' or \'DESC\'.                                                 Empty for using the default database setting.
    */
    'order'?: string;
    /**
    * The page of records to return.
    */
    'page'?: number = 0;
    /**
    * The number of records to return per page
    */
    'perpage'?: number = 0;
    /**
    * Whether to return contents or not.
    */
    'returncontents'?: boolean = false;
    /**
    * search string (empty when using advanced)
    */
    'search'?: string = '';
    /**
    * Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting.
    */
    'sort'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "advsearch",
            "baseName": "advsearch",
            "type": "Array<ModDataSearchEntriesRequestAdvsearchInner>"
        },
        {
            "name": "databaseid",
            "baseName": "databaseid",
            "type": "number"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "string"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "perpage",
            "baseName": "perpage",
            "type": "number"
        },
        {
            "name": "returncontents",
            "baseName": "returncontents",
            "type": "boolean"
        },
        {
            "name": "search",
            "baseName": "search",
            "type": "string"
        },
        {
            "name": "sort",
            "baseName": "sort",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModDataSearchEntriesRequest.attributeTypeMap;
    }
}
