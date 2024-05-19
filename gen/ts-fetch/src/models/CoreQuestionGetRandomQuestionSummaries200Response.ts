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
import type { CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner } from './CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner';
import {
    CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerFromJSON,
    CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerFromJSONTyped,
    CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerToJSON,
} from './CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner';

/**
 * 
 * @export
 * @interface CoreQuestionGetRandomQuestionSummaries200Response
 */
export interface CoreQuestionGetRandomQuestionSummaries200Response {
    /**
     * 
     * @type {Array<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner>}
     * @memberof CoreQuestionGetRandomQuestionSummaries200Response
     */
    Questions: Array<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner>;
    /**
     * total number of questions in result set
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummaries200Response
     */
    Totalcount: number;
}

/**
 * Check if a given object implements the CoreQuestionGetRandomQuestionSummaries200Response interface.
 */
export function instanceOfCoreQuestionGetRandomQuestionSummaries200Response(value: object): boolean {
    if (!('Questions' in value)) return false;
    if (!('Totalcount' in value)) return false;
    return true;
}

export function CoreQuestionGetRandomQuestionSummaries200ResponseFromJSON(json: any): CoreQuestionGetRandomQuestionSummaries200Response {
    return CoreQuestionGetRandomQuestionSummaries200ResponseFromJSONTyped(json, false);
}

export function CoreQuestionGetRandomQuestionSummaries200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreQuestionGetRandomQuestionSummaries200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Questions': ((json['questions'] as Array<any>).map(CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerFromJSON)),
        'Totalcount': json['totalcount'],
    };
}

export function CoreQuestionGetRandomQuestionSummaries200ResponseToJSON(value?: CoreQuestionGetRandomQuestionSummaries200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'questions': ((value['Questions'] as Array<any>).map(CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerToJSON)),
        'totalcount': value['Totalcount'],
    };
}

