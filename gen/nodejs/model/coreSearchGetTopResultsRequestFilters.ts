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

export class CoreSearchGetTopResultsRequestFilters {
    'Areaids'?: Array<object>;
    /**
    * category to filter areas
    */
    'Cat'?: string = '';
    'Contextids'?: Array<object>;
    'Courseids'?: Array<object>;
    'Groupids'?: Array<object>;
    /**
    * only results from my courses
    */
    'Mycoursesonly'?: boolean = false;
    /**
    * how to order
    */
    'Order'?: string = '';
    /**
    * docs modified before this date
    */
    'Timeend'?: number = 0;
    /**
    * docs modified after this date
    */
    'Timestart'?: number = 0;
    /**
    * result title
    */
    'Title'?: string;
    'Userids'?: Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Areaids",
            "baseName": "areaids",
            "type": "Array<object>"
        },
        {
            "name": "Cat",
            "baseName": "cat",
            "type": "string"
        },
        {
            "name": "Contextids",
            "baseName": "contextids",
            "type": "Array<object>"
        },
        {
            "name": "Courseids",
            "baseName": "courseids",
            "type": "Array<object>"
        },
        {
            "name": "Groupids",
            "baseName": "groupids",
            "type": "Array<object>"
        },
        {
            "name": "Mycoursesonly",
            "baseName": "mycoursesonly",
            "type": "boolean"
        },
        {
            "name": "Order",
            "baseName": "order",
            "type": "string"
        },
        {
            "name": "Timeend",
            "baseName": "timeend",
            "type": "number"
        },
        {
            "name": "Timestart",
            "baseName": "timestart",
            "type": "number"
        },
        {
            "name": "Title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "Userids",
            "baseName": "userids",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return CoreSearchGetTopResultsRequestFilters.attributeTypeMap;
    }
}

