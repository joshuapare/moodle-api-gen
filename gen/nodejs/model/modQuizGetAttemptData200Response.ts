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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';
import { ModQuizGetAttemptData200ResponseAttempt } from './modQuizGetAttemptData200ResponseAttempt';
import { ModQuizGetAttemptData200ResponseQuestionsInner } from './modQuizGetAttemptData200ResponseQuestionsInner';

export class ModQuizGetAttemptData200Response {
    'Attempt': ModQuizGetAttemptData200ResponseAttempt;
    'Messages': Array<object>;
    /**
    * next page number
    */
    'Nextpage': number = null;
    'Questions': Array<ModQuizGetAttemptData200ResponseQuestionsInner>;
    'Warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Attempt",
            "baseName": "attempt",
            "type": "ModQuizGetAttemptData200ResponseAttempt"
        },
        {
            "name": "Messages",
            "baseName": "messages",
            "type": "Array<object>"
        },
        {
            "name": "Nextpage",
            "baseName": "nextpage",
            "type": "number"
        },
        {
            "name": "Questions",
            "baseName": "questions",
            "type": "Array<ModQuizGetAttemptData200ResponseQuestionsInner>"
        },
        {
            "name": "Warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizGetAttemptData200Response.attributeTypeMap;
    }
}

