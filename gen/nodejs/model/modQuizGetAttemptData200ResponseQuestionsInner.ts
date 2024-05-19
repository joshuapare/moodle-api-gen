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
import { ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner } from './modQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner';

/**
* The question data. Some fields may not be returned depending on the quiz display settings.
*/
export class ModQuizGetAttemptData200ResponseQuestionsInner {
    /**
    * whether the question is blocked by the previous question
    */
    'Blockedbyprevious'?: boolean = null;
    /**
    * whether the question is flagged or not
    */
    'Flagged'?: boolean = null;
    /**
    * whether this question attempt has autosaved data
    */
    'Hasautosavedstep'?: boolean = null;
    /**
    * the question rendered
    */
    'Html'?: string = 'null';
    /**
    * the timestamp of the most recent step in this question attempt
    */
    'Lastactiontime'?: number = null;
    /**
    * the mark awarded.                     It will be returned only if the user is allowed to see it.
    */
    'Mark'?: string = 'null';
    /**
    * the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it.
    */
    'Maxmark'?: number = null;
    /**
    * DO NOT USE. Use questionnumber. Only retained for backwards compatibility.
    */
    'Number'?: number = null;
    /**
    * page of the quiz this question appears on
    */
    'Page'?: number = null;
    /**
    * The question number to display for this question, e.g. \"7\", \"i\" or \"Custom-B)\".
    */
    'Questionnumber'?: string = 'null';
    'Responsefileareas'?: Array<ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner>;
    /**
    * the number of real steps in this attempt
    */
    'Sequencecheck'?: number = null;
    /**
    * Question settings (JSON encoded).
    */
    'Settings'?: string = 'null';
    /**
    * slot number
    */
    'Slot'?: number = null;
    /**
    * the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings.
    */
    'State'?: string = 'null';
    /**
    * current formatted state of the question
    */
    'Status'?: string = 'null';
    /**
    * question type, i.e: multichoice
    */
    'Type'?: string = 'null';

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
            "type": "Array<ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner>"
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
        return ModQuizGetAttemptData200ResponseQuestionsInner.attributeTypeMap;
    }
}

