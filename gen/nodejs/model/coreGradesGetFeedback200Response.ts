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

export class CoreGradesGetFeedback200Response {
    /**
    * Additional field for the user (email or ID number, for example)
    */
    'Additionalfield': string = 'null';
    /**
    * The full feedback text
    */
    'Feedbacktext': string = 'null';
    /**
    * Students name
    */
    'Fullname': string = 'null';
    /**
    * Students picture
    */
    'Picture': string = 'null';
    /**
    * Title of the grade item that the feedback is for
    */
    'Title': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Additionalfield",
            "baseName": "additionalfield",
            "type": "string"
        },
        {
            "name": "Feedbacktext",
            "baseName": "feedbacktext",
            "type": "string"
        },
        {
            "name": "Fullname",
            "baseName": "fullname",
            "type": "string"
        },
        {
            "name": "Picture",
            "baseName": "picture",
            "type": "string"
        },
        {
            "name": "Title",
            "baseName": "title",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreGradesGetFeedback200Response.attributeTypeMap;
    }
}

