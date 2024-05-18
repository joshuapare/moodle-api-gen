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

/**
* note
*/
export class CoreNotesGetNotes200ResponseNotesInner {
    /**
    * course id of the note
    */
    'courseid'?: number = null;
    /**
    * text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'format'?: number = null;
    /**
    * id of the note
    */
    'noteid'?: number = null;
    /**
    * \'personal\', \'course\' or \'site\'
    */
    'publishstate'?: string;
    /**
    * the text of the message - text or HTML
    */
    'text'?: string;
    /**
    * id of the user the note is about
    */
    'userid'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        },
        {
            "name": "format",
            "baseName": "format",
            "type": "number"
        },
        {
            "name": "noteid",
            "baseName": "noteid",
            "type": "number"
        },
        {
            "name": "publishstate",
            "baseName": "publishstate",
            "type": "string"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreNotesGetNotes200ResponseNotesInner.attributeTypeMap;
    }
}

