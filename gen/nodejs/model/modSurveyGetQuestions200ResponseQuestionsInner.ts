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

/**
* Questions
*/
export class ModSurveyGetQuestions200ResponseQuestionsInner {
    /**
    * Question id
    */
    'id'?: number = null;
    /**
    * The question intro
    */
    'intro'?: string = 'null';
    /**
    * Subquestions ids
    */
    'multi'?: string = 'null';
    /**
    * Question options
    */
    'options'?: string = 'null';
    /**
    * Parent question (for subquestions)
    */
    'parent'?: number = null;
    /**
    * Question short text
    */
    'shorttext'?: string = 'null';
    /**
    * Question text
    */
    'text'?: string = 'null';
    /**
    * Question type
    */
    'type'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "intro",
            "baseName": "intro",
            "type": "string"
        },
        {
            "name": "multi",
            "baseName": "multi",
            "type": "string"
        },
        {
            "name": "options",
            "baseName": "options",
            "type": "string"
        },
        {
            "name": "parent",
            "baseName": "parent",
            "type": "number"
        },
        {
            "name": "shorttext",
            "baseName": "shorttext",
            "type": "string"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModSurveyGetQuestions200ResponseQuestionsInner.attributeTypeMap;
    }
}

