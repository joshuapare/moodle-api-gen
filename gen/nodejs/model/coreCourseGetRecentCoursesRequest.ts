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

export class CoreCourseGetRecentCoursesRequest {
    /**
    * result set limit
    */
    'Limit'?: number = 0;
    /**
    * Result set offset
    */
    'Offset'?: number = 0;
    /**
    * Sort string
    */
    'Sort'?: string;
    /**
    * id of the user, default to current user
    */
    'Userid'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Limit",
            "baseName": "limit",
            "type": "number"
        },
        {
            "name": "Offset",
            "baseName": "offset",
            "type": "number"
        },
        {
            "name": "Sort",
            "baseName": "sort",
            "type": "string"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseGetRecentCoursesRequest.attributeTypeMap;
    }
}

