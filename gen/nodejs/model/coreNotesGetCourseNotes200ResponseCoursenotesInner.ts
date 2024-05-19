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

export class CoreNotesGetCourseNotes200ResponseCoursenotesInner {
    /**
    * the content text formated
    */
    'content'?: string = 'null';
    /**
    * id of the course
    */
    'courseid'?: number;
    /**
    * time created (timestamp)
    */
    'created'?: number = null;
    /**
    * content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'format'?: number;
    /**
    * id of this note
    */
    'id'?: number = null;
    /**
    * time of last modification (timestamp)
    */
    'lastmodified'?: number = null;
    /**
    * state of the note (i.e. draft, public, site) 
    */
    'publishstate'?: string = 'null';
    /**
    * user id
    */
    'userid'?: number;
    /**
    * user id of the creator of this note
    */
    'usermodified'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "created",
            "baseName": "created",
            "type": "number"
        },
        {
            "name": "format",
            "baseName": "format",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "lastmodified",
            "baseName": "lastmodified",
            "type": "number"
        },
        {
            "name": "publishstate",
            "baseName": "publishstate",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreNotesGetCourseNotes200ResponseCoursenotesInner.attributeTypeMap;
    }
}

