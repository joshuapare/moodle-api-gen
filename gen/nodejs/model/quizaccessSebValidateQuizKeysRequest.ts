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

export class QuizaccessSebValidateQuizKeysRequest {
    /**
    * SEB browser exam key
    */
    'browserexamkey'?: string = 'null';
    /**
    * Course module ID
    */
    'cmid': number = null;
    /**
    * SEB config key
    */
    'configkey'?: string = 'null';
    /**
    * Page URL to check
    */
    'url': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "browserexamkey",
            "baseName": "browserexamkey",
            "type": "string"
        },
        {
            "name": "cmid",
            "baseName": "cmid",
            "type": "number"
        },
        {
            "name": "configkey",
            "baseName": "configkey",
            "type": "string"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return QuizaccessSebValidateQuizKeysRequest.attributeTypeMap;
    }
}

