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

export class ModQuizUpdateFilterConditionRequest {
    /**
    * The cmid of the quiz
    */
    'Cmid': number;
    /**
    * Filter condition
    */
    'Filtercondition': string = 'null';
    /**
    * The quiz slot ID for the random question.
    */
    'Slotid': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Cmid",
            "baseName": "cmid",
            "type": "number"
        },
        {
            "name": "Filtercondition",
            "baseName": "filtercondition",
            "type": "string"
        },
        {
            "name": "Slotid",
            "baseName": "slotid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizUpdateFilterConditionRequest.attributeTypeMap;
    }
}

