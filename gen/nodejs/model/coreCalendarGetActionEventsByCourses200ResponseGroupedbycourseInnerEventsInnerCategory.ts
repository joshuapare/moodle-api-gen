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

export class CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory {
    /**
    * coursecount
    */
    'coursecount': number = 0;
    /**
    * depth
    */
    'depth': number = 0;
    /**
    * description
    */
    'description'?: string;
    /**
    * id
    */
    'id': number;
    /**
    * idnumber
    */
    'idnumber': string;
    /**
    * name
    */
    'name': string = '';
    /**
    * nestedname
    */
    'nestedname': string;
    /**
    * parent
    */
    'parent': number;
    /**
    * timemodified
    */
    'timemodified': number = 0;
    /**
    * url
    */
    'url': string;
    /**
    * visible
    */
    'visible': number = 1;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "coursecount",
            "baseName": "coursecount",
            "type": "number"
        },
        {
            "name": "depth",
            "baseName": "depth",
            "type": "number"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "nestedname",
            "baseName": "nestedname",
            "type": "string"
        },
        {
            "name": "parent",
            "baseName": "parent",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.attributeTypeMap;
    }
}

