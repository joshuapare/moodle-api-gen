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
import { CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner } from './coreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner';

export class CoreQuestionGetRandomQuestionSummaries200Response {
    'Questions': Array<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner>;
    /**
    * total number of questions in result set
    */
    'Totalcount': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Questions",
            "baseName": "questions",
            "type": "Array<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner>"
        },
        {
            "name": "Totalcount",
            "baseName": "totalcount",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreQuestionGetRandomQuestionSummaries200Response.attributeTypeMap;
    }
}

