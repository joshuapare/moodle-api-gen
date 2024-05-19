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
    'Blockedbyprevious'?: boolean;
    /**
    * whether the question is flagged or not
    */
    'Flagged'?: boolean;
    /**
    * whether this question attempt has autosaved data
    */
    'Hasautosavedstep'?: boolean;
    /**
    * the question rendered
    */
    'Html'?: string;
    /**
    * the timestamp of the most recent step in this question attempt
    */
    'Lastactiontime'?: number;
    /**
    * the mark awarded.                     It will be returned only if the user is allowed to see it.
    */
    'Mark'?: string;
    /**
    * the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it.
    */
    'Maxmark'?: number;
    /**
    * DO NOT USE. Use questionnumber. Only retained for backwards compatibility.
    */
    'Number'?: number;
    /**
    * page of the quiz this question appears on
    */
    'Page'?: number;
    /**
    * The question number to display for this question, e.g. \"7\", \"i\" or \"Custom-B)\".
    */
    'Questionnumber'?: string;
    'Responsefileareas'?: Array<ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner>;
    /**
    * the number of real steps in this attempt
    */
    'Sequencecheck'?: number;
    /**
    * Question settings (JSON encoded).
    */
    'Settings'?: string;
    /**
    * slot number
    */
    'Slot'?: number;
    /**
    * the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings.
    */
    'State'?: string;
    /**
    * current formatted state of the question
    */
    'Status'?: string;
    /**
    * question type, i.e: multichoice
    */
    'Type'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Blockedbyprevious",
            "baseName": "blockedbyprevious",
            "type": "boolean"
        },
        {
            "name": "Flagged",
            "baseName": "flagged",
            "type": "boolean"
        },
        {
            "name": "Hasautosavedstep",
            "baseName": "hasautosavedstep",
            "type": "boolean"
        },
        {
            "name": "Html",
            "baseName": "html",
            "type": "string"
        },
        {
            "name": "Lastactiontime",
            "baseName": "lastactiontime",
            "type": "number"
        },
        {
            "name": "Mark",
            "baseName": "mark",
            "type": "string"
        },
        {
            "name": "Maxmark",
            "baseName": "maxmark",
            "type": "number"
        },
        {
            "name": "Number",
            "baseName": "number",
            "type": "number"
        },
        {
            "name": "Page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "Questionnumber",
            "baseName": "questionnumber",
            "type": "string"
        },
        {
            "name": "Responsefileareas",
            "baseName": "responsefileareas",
            "type": "Array<ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner>"
        },
        {
            "name": "Sequencecheck",
            "baseName": "sequencecheck",
            "type": "number"
        },
        {
            "name": "Settings",
            "baseName": "settings",
            "type": "string"
        },
        {
            "name": "Slot",
            "baseName": "slot",
            "type": "number"
        },
        {
            "name": "State",
            "baseName": "state",
            "type": "string"
        },
        {
            "name": "Status",
            "baseName": "status",
            "type": "string"
        },
        {
            "name": "Type",
            "baseName": "type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ModQuizGetAttemptReview200ResponseQuestionsInner.attributeTypeMap;
    }
}

