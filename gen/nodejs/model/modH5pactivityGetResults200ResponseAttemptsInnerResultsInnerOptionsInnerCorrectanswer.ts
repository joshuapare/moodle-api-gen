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

export class ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer {
    /**
    * Option text value
    */
    'answer'?: string = 'null';
    /**
    * If has to be displayed as a checked option
    */
    'checked'?: boolean = null;
    /**
    * If has to be displayed as correct
    */
    'correct'?: boolean = null;
    /**
    * If has to be displayed as failed
    */
    'fail'?: boolean = null;
    /**
    * If has to be displayed as incorrect
    */
    'incorrect'?: boolean = null;
    /**
    * If has to be displayed as passed
    */
    'pass'?: boolean = null;
    /**
    * If has to be displayed as simple text
    */
    'text'?: boolean = null;
    /**
    * If has to be displayed as a unchecked option
    */
    'unchecked'?: boolean = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "answer",
            "baseName": "answer",
            "type": "string"
        },
        {
            "name": "checked",
            "baseName": "checked",
            "type": "boolean"
        },
        {
            "name": "correct",
            "baseName": "correct",
            "type": "boolean"
        },
        {
            "name": "fail",
            "baseName": "fail",
            "type": "boolean"
        },
        {
            "name": "incorrect",
            "baseName": "incorrect",
            "type": "boolean"
        },
        {
            "name": "pass",
            "baseName": "pass",
            "type": "boolean"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "boolean"
        },
        {
            "name": "unchecked",
            "baseName": "unchecked",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer.attributeTypeMap;
    }
}
