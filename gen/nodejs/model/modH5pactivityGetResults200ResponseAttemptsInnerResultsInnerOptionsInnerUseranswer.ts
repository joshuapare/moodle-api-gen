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

export class ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer {
    /**
    * Option text value
    */
    'Answer'?: string;
    /**
    * If has to be displayed as a checked option
    */
    'Checked'?: boolean;
    /**
    * If has to be displayed as correct
    */
    'Correct'?: boolean;
    /**
    * If has to be displayed as failed
    */
    'Fail'?: boolean;
    /**
    * If has to be displayed as incorrect
    */
    'Incorrect'?: boolean;
    /**
    * If has to be displayed as passed
    */
    'Pass'?: boolean;
    /**
    * If has to be displayed as simple text
    */
    'Text'?: boolean;
    /**
    * If has to be displayed as a unchecked option
    */
    'Unchecked'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Answer",
            "baseName": "answer",
            "type": "string"
        },
        {
            "name": "Checked",
            "baseName": "checked",
            "type": "boolean"
        },
        {
            "name": "Correct",
            "baseName": "correct",
            "type": "boolean"
        },
        {
            "name": "Fail",
            "baseName": "fail",
            "type": "boolean"
        },
        {
            "name": "Incorrect",
            "baseName": "incorrect",
            "type": "boolean"
        },
        {
            "name": "Pass",
            "baseName": "pass",
            "type": "boolean"
        },
        {
            "name": "Text",
            "baseName": "text",
            "type": "boolean"
        },
        {
            "name": "Unchecked",
            "baseName": "unchecked",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer.attributeTypeMap;
    }
}

