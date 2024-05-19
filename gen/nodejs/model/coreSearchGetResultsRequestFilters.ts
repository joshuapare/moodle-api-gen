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

export class CoreSearchGetResultsRequestFilters {
    'areaids'?: Array<object>;
    /**
    * category to filter areas
    */
    'cat'?: string = '';
    'contextids'?: Array<object>;
    'courseids'?: Array<object>;
    'groupids'?: Array<object>;
    /**
    * only results from my courses
    */
    'mycoursesonly'?: boolean = false;
    /**
    * how to order
    */
    'order'?: string = '';
    /**
    * docs modified before this date
    */
    'timeend'?: number = 0;
    /**
    * docs modified after this date
    */
    'timestart'?: number = 0;
    /**
    * result title
    */
    'title'?: string = 'null';
    'userids'?: Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "areaids",
            "baseName": "areaids",
            "type": "Array<object>"
        },
        {
            "name": "cat",
            "baseName": "cat",
            "type": "string"
        },
        {
            "name": "contextids",
            "baseName": "contextids",
            "type": "Array<object>"
        },
        {
            "name": "courseids",
            "baseName": "courseids",
            "type": "Array<object>"
        },
        {
            "name": "groupids",
            "baseName": "groupids",
            "type": "Array<object>"
        },
        {
            "name": "mycoursesonly",
            "baseName": "mycoursesonly",
            "type": "boolean"
        },
        {
            "name": "order",
            "baseName": "order",
            "type": "string"
        },
        {
            "name": "timeend",
            "baseName": "timeend",
            "type": "number"
        },
        {
            "name": "timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "userids",
            "baseName": "userids",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return CoreSearchGetResultsRequestFilters.attributeTypeMap;
    }
}

