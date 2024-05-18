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
import { CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon } from './coreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon';

export class CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner {
    /**
    * category
    */
    'category'?: number = null;
    'icon'?: CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon;
    /**
    * id
    */
    'id'?: number;
    /**
    * name
    */
    'name'?: string;
    /**
    * parent
    */
    'parent'?: number;
    /**
    * qtype
    */
    'qtype'?: string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "category",
            "baseName": "category",
            "type": "number"
        },
        {
            "name": "icon",
            "baseName": "icon",
            "type": "CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parent",
            "baseName": "parent",
            "type": "number"
        },
        {
            "name": "qtype",
            "baseName": "qtype",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.attributeTypeMap;
    }
}
