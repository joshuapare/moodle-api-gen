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
    'Coursecount': number = 0;
    /**
    * depth
    */
    'Depth': number = 0;
    /**
    * description
    */
    'Description'?: string;
    /**
    * id
    */
    'Id': number;
    /**
    * idnumber
    */
    'Idnumber': string;
    /**
    * name
    */
    'Name': string = '';
    /**
    * nestedname
    */
    'Nestedname': string;
    /**
    * parent
    */
    'Parent': number;
    /**
    * timemodified
    */
    'Timemodified': number = 0;
    /**
    * url
    */
    'Url': string;
    /**
    * visible
    */
    'Visible': number = 1;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Coursecount",
            "baseName": "coursecount",
            "type": "number"
        },
        {
            "name": "Depth",
            "baseName": "depth",
            "type": "number"
        },
        {
            "name": "Description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Nestedname",
            "baseName": "nestedname",
            "type": "string"
        },
        {
            "name": "Parent",
            "baseName": "parent",
            "type": "number"
        },
        {
            "name": "Timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "Url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "Visible",
            "baseName": "visible",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.attributeTypeMap;
    }
}

