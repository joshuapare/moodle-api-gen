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

export class CoreGradesGraderGradingpanelPointStoreRequest {
    /**
    * The name of the component
    */
    'Component': string;
    /**
    * The ID of the context being graded
    */
    'Contextid': number;
    /**
    * The serialised form data representing the grade
    */
    'Formdata': string = 'null';
    /**
    * The ID of the user show
    */
    'Gradeduserid': number;
    /**
    * The grade item itemname being graded
    */
    'Itemname': string;
    /**
    * Wheteher to notify the user or not
    */
    'Notifyuser'?: boolean = false;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "Formdata",
            "baseName": "formdata",
            "type": "string"
        },
        {
            "name": "Gradeduserid",
            "baseName": "gradeduserid",
            "type": "number"
        },
        {
            "name": "Itemname",
            "baseName": "itemname",
            "type": "string"
        },
        {
            "name": "Notifyuser",
            "baseName": "notifyuser",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return CoreGradesGraderGradingpanelPointStoreRequest.attributeTypeMap;
    }
}

