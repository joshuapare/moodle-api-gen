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

export class ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata {
    'answers'?: Array<object>;
    /**
    * The response text.
    */
    'response': string = 'null';
    /**
    * response. format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'responseformat': number = null;
    /**
    * The score (text version).
    */
    'score': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "answers",
            "baseName": "answers",
            "type": "Array<object>"
        },
        {
            "name": "response",
            "baseName": "response",
            "type": "string"
        },
        {
            "name": "responseformat",
            "baseName": "responseformat",
            "type": "number"
        },
        {
            "name": "score",
            "baseName": "score",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.attributeTypeMap;
    }
}

