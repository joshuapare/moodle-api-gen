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

export class CoreQuestionGetRandomQuestionSummariesRequest {
    /**
    * Category id to find random questions
    */
    'categoryid': number = null;
    /**
    * Context id that the questions will be rendered in (used for exporting)
    */
    'contextid': number = null;
    /**
    * Include the subcategories in the search
    */
    'includesubcategories': boolean = null;
    /**
    * Maximum number of results to return
    */
    'limit'?: number = 0;
    /**
    * Number of items to skip from the begging of the result set
    */
    'offset'?: number = 0;
    'tagids': Array<object>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "categoryid",
            "baseName": "categoryid",
            "type": "number"
        },
        {
            "name": "contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "includesubcategories",
            "baseName": "includesubcategories",
            "type": "boolean"
        },
        {
            "name": "limit",
            "baseName": "limit",
            "type": "number"
        },
        {
            "name": "offset",
            "baseName": "offset",
            "type": "number"
        },
        {
            "name": "tagids",
            "baseName": "tagids",
            "type": "Array<object>"
        }    ];

    static getAttributeTypeMap() {
        return CoreQuestionGetRandomQuestionSummariesRequest.attributeTypeMap;
    }
}
