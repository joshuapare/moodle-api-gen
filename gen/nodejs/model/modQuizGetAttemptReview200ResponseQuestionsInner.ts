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
import { ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner } from './modQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner';

/**
* The question data. Some fields may not be returned depending on the quiz display settings.
*/
export class ModQuizGetAttemptReview200ResponseQuestionsInner {
    /**
    * whether the question is blocked by the previous question
    */
    'blockedbyprevious'?: boolean;
    /**
    * whether the question is flagged or not
    */
    'flagged'?: boolean;
    /**
    * whether this question attempt has autosaved data
    */
    'hasautosavedstep'?: boolean;
    /**
    * the question rendered
    */
    'html'?: string;
    /**
    * the timestamp of the most recent step in this question attempt
    */
    'lastactiontime'?: number;
    /**
    * the mark awarded.                     It will be returned only if the user is allowed to see it.
    */
    'mark'?: string;
    /**
    * the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it.
    */
    'maxmark'?: number;
    /**
    * DO NOT USE. Use questionnumber. Only retained for backwards compatibility.
    */
    'number'?: number;
    /**
    * page of the quiz this question appears on
    */
    'page'?: number;
    /**
    * The question number to display for this question, e.g. \"7\", \"i\" or \"Custom-B)\".
    */
    'questionnumber'?: string;
    'responsefileareas'?: Array<ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner>;
    /**
    * the number of real steps in this attempt
    */
    'sequencecheck'?: number;
    /**
    * Question settings (JSON encoded).
    */
    'settings'?: string;
    /**
    * slot number
    */
    'slot'?: number;
    /**
    * the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings.
    */
    'state'?: string;
    /**
    * current formatted state of the question
    */
    'status'?: string;
    /**
    * question type, i.e: multichoice
    */
    'type'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "blockedbyprevious",
            "baseName": "blockedbyprevious",
            "type": "boolean"
        },
        {
            "name": "flagged",
            "baseName": "flagged",
            "type": "boolean"
        },
        {
            "name": "hasautosavedstep",
            "baseName": "hasautosavedstep",
            "type": "boolean"
        },
        {
            "name": "html",
            "baseName": "html",
            "type": "string"
        },
        {
            "name": "lastactiontime",
            "baseName": "lastactiontime",
            "type": "number"
        },
        {
            "name": "mark",
            "baseName": "mark",
            "type": "string"
        },
        {
            "name": "maxmark",
            "baseName": "maxmark",
            "type": "number"
        },
        {
            "name": "number",
            "baseName": "number",
            "type": "number"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "questionnumber",
            "baseName": "questionnumber",
            "type": "string"
        },
        {
            "name": "responsefileareas",
            "baseName": "responsefileareas",
            "type": "Array<ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner>"
        },
        {
            "name": "sequencecheck",
            "baseName": "sequencecheck",
            "type": "number"
        },
        {
            "name": "settings",
            "baseName": "settings",
            "type": "string"
        },
        {
            "name": "slot",
            "baseName": "slot",
            "type": "number"
        },
        {
            "name": "state",
            "baseName": "state",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizGetAttemptReview200ResponseQuestionsInner.attributeTypeMap;
    }
}
