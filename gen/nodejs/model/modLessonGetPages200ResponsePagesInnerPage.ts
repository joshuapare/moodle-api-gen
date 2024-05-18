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

export class ModLessonGetPages200ResponsePagesInnerPage {
    /**
    * The contents of this page
    */
    'contents'?: string;
    /**
    * contents format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'contentsformat'?: number;
    /**
    * Used to record page specific display selections
    */
    'display': number;
    /**
    * Toggles display in the left menu block
    */
    'displayinmenublock': boolean;
    /**
    * The id of this lesson page
    */
    'id': number;
    /**
    * Used to record page specific layout selections
    */
    'layout': number;
    /**
    * The id of the lesson this page belongs to
    */
    'lessonid': number;
    /**
    * The id of the next page in the page sequence
    */
    'nextpageid': number;
    /**
    * The id of the page before this one
    */
    'prevpageid': number;
    /**
    * Used to record page type specific options
    */
    'qoption': number;
    /**
    * Identifies the page type of this page
    */
    'qtype': number;
    /**
    * Timestamp for when the page was created
    */
    'timecreated': number;
    /**
    * Timestamp for when the page was last modified
    */
    'timemodified': number;
    /**
    * The title of this page
    */
    'title'?: string;
    /**
    * The type of the page [question | structure]
    */
    'type': number;
    /**
    * The unique identifier for the page type
    */
    'typeid': number;
    /**
    * The string that describes this page type
    */
    'typestring': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "contents",
            "baseName": "contents",
            "type": "string"
        },
        {
            "name": "contentsformat",
            "baseName": "contentsformat",
            "type": "number"
        },
        {
            "name": "display",
            "baseName": "display",
            "type": "number"
        },
        {
            "name": "displayinmenublock",
            "baseName": "displayinmenublock",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "layout",
            "baseName": "layout",
            "type": "number"
        },
        {
            "name": "lessonid",
            "baseName": "lessonid",
            "type": "number"
        },
        {
            "name": "nextpageid",
            "baseName": "nextpageid",
            "type": "number"
        },
        {
            "name": "prevpageid",
            "baseName": "prevpageid",
            "type": "number"
        },
        {
            "name": "qoption",
            "baseName": "qoption",
            "type": "number"
        },
        {
            "name": "qtype",
            "baseName": "qtype",
            "type": "number"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "number"
        },
        {
            "name": "typeid",
            "baseName": "typeid",
            "type": "number"
        },
        {
            "name": "typestring",
            "baseName": "typestring",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonGetPages200ResponsePagesInnerPage.attributeTypeMap;
    }
}

