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

export class CoreNotesGetCourseNotes200ResponsePersonalnotesInner {
    /**
    * the content text formated
    */
    'Content'?: string;
    /**
    * id of the course
    */
    'Courseid'?: number;
    /**
    * time created (timestamp)
    */
    'Created'?: number;
    /**
    * content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Format'?: number;
    /**
    * id of this note
    */
    'Id'?: number;
    /**
    * time of last modification (timestamp)
    */
    'Lastmodified'?: number;
    /**
    * state of the note (i.e. draft, public, site) 
    */
    'Publishstate'?: string;
    /**
    * user id
    */
    'Userid'?: number;
    /**
    * user id of the creator of this note
    */
    'Usermodified'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "Courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "Created",
            "baseName": "created",
            "type": "number"
        },
        {
            "name": "Format",
            "baseName": "format",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Lastmodified",
            "baseName": "lastmodified",
            "type": "number"
        },
        {
            "name": "Publishstate",
            "baseName": "publishstate",
            "type": "string"
        },
        {
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "Usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreNotesGetCourseNotes200ResponsePersonalnotesInner.attributeTypeMap;
    }
}

