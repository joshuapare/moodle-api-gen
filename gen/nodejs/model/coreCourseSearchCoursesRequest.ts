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

export class CoreCourseSearchCoursesRequest {
    /**
    * criteria name                                                         (search, modulelist (only admins), blocklist (only admins), tagid)
    */
    'criterianame': string = 'null';
    /**
    * criteria value
    */
    'criteriavalue': string = 'null';
    /**
    * limit to enrolled courses
    */
    'limittoenrolled'?: boolean = 0;
    /**
    * limit to courses where completion is enabled
    */
    'onlywithcompletion'?: boolean = 0;
    /**
    * page number (0 based)
    */
    'page'?: number = 0;
    /**
    * items per page
    */
    'perpage'?: number = 0;
    'requiredcapabilities'?: Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "criterianame",
            "baseName": "criterianame",
            "type": "string"
        },
        {
            "name": "criteriavalue",
            "baseName": "criteriavalue",
            "type": "string"
        },
        {
            "name": "limittoenrolled",
            "baseName": "limittoenrolled",
            "type": "boolean"
        },
        {
            "name": "onlywithcompletion",
            "baseName": "onlywithcompletion",
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
            "name": "requiredcapabilities",
            "baseName": "requiredcapabilities",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return CoreCourseSearchCoursesRequest.attributeTypeMap;
    }
}
