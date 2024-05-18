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

export class CoreBadgesGetUserBadgesRequest {
    /**
    * Filter badges by course id, empty all the courses
    */
    'courseid'?: number = 0;
    /**
    * Whether to return only public badges
    */
    'onlypublic'?: boolean = false;
    /**
    * The page of records to return.
    */
    'page'?: number = 0;
    /**
    * The number of records to return per page
    */
    'perpage'?: number = 0;
    /**
    * A simple string to search for
    */
    'search'?: string = '';
    /**
    * Badges only for this user id, empty for current user
    */
    'userid'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "onlypublic",
            "baseName": "onlypublic",
            "type": "boolean"
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
            "name": "search",
            "baseName": "search",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreBadgesGetUserBadgesRequest.attributeTypeMap;
    }
}
