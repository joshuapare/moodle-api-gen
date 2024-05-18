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

export class ModAssignListParticipantsRequest {
    /**
    * assign instance id
    */
    'assignid': number;
    /**
    * search string to filter the results
    */
    'filter': string = 'null';
    /**
    * group id
    */
    'groupid': number;
    /**
    * Do return courses where the user is enrolled
    */
    'includeenrolments'?: boolean = true;
    /**
    * maximum number of records to return
    */
    'limit'?: number = 0;
    /**
    * Do not return all user fields
    */
    'onlyids'?: boolean = false;
    /**
    * number of records to skip
    */
    'skip'?: number = 0;
    /**
    * Apply current user table sorting preferences.
    */
    'tablesort'?: boolean = false;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "assignid",
            "baseName": "assignid",
            "type": "number"
        },
        {
            "name": "filter",
            "baseName": "filter",
            "type": "string"
        },
        {
            "name": "groupid",
            "baseName": "groupid",
            "type": "number"
        },
        {
            "name": "includeenrolments",
            "baseName": "includeenrolments",
            "type": "boolean"
        },
        {
            "name": "limit",
            "baseName": "limit",
            "type": "number"
        },
        {
            "name": "onlyids",
            "baseName": "onlyids",
            "type": "boolean"
        },
        {
            "name": "skip",
            "baseName": "skip",
            "type": "number"
        },
        {
            "name": "tablesort",
            "baseName": "tablesort",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignListParticipantsRequest.attributeTypeMap;
    }
}
