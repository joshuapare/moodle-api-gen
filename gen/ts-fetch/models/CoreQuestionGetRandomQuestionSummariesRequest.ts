/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CoreQuestionGetRandomQuestionSummariesRequest
 */
export interface CoreQuestionGetRandomQuestionSummariesRequest {
    /**
     * Category id to find random questions
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummariesRequest
     */
    categoryid: number;
    /**
     * Context id that the questions will be rendered in (used for exporting)
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummariesRequest
     */
    contextid: number;
    /**
     * Include the subcategories in the search
     * @type {boolean}
     * @memberof CoreQuestionGetRandomQuestionSummariesRequest
     */
    includesubcategories: boolean;
    /**
     * Maximum number of results to return
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummariesRequest
     */
    limit?: number;
    /**
     * Number of items to skip from the begging of the result set
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummariesRequest
     */
    offset?: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof CoreQuestionGetRandomQuestionSummariesRequest
     */
    tagids: Array<object>;
}

/**
 * Check if a given object implements the CoreQuestionGetRandomQuestionSummariesRequest interface.
 */
export function instanceOfCoreQuestionGetRandomQuestionSummariesRequest(value: object): boolean {
    if (!('categoryid' in value)) return false;
    if (!('contextid' in value)) return false;
    if (!('includesubcategories' in value)) return false;
    if (!('tagids' in value)) return false;
    return true;
}

export function CoreQuestionGetRandomQuestionSummariesRequestFromJSON(json: any): CoreQuestionGetRandomQuestionSummariesRequest {
    return CoreQuestionGetRandomQuestionSummariesRequestFromJSONTyped(json, false);
}

export function CoreQuestionGetRandomQuestionSummariesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreQuestionGetRandomQuestionSummariesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'categoryid': json['categoryid'],
        'contextid': json['contextid'],
        'includesubcategories': json['includesubcategories'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'offset': json['offset'] == null ? undefined : json['offset'],
        'tagids': json['tagids'],
    };
}

export function CoreQuestionGetRandomQuestionSummariesRequestToJSON(value?: CoreQuestionGetRandomQuestionSummariesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'categoryid': value['categoryid'],
        'contextid': value['contextid'],
        'includesubcategories': value['includesubcategories'],
        'limit': value['limit'],
        'offset': value['offset'],
        'tagids': value['tagids'],
    };
}
