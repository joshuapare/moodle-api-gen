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
import type { CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon } from './CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon';
import {
    CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIconFromJSON,
    CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIconFromJSONTyped,
    CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIconToJSON,
} from './CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon';

/**
 * 
 * @export
 * @interface CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
 */
export interface CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner {
    /**
     * category
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
     */
    Category?: number;
    /**
     * 
     * @type {CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon}
     * @memberof CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
     */
    Icon?: CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon;
    /**
     * id
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
     */
    Id?: number;
    /**
     * name
     * @type {string}
     * @memberof CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
     */
    Name?: string;
    /**
     * parent
     * @type {number}
     * @memberof CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
     */
    Parent?: number;
    /**
     * qtype
     * @type {string}
     * @memberof CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner
     */
    Qtype?: string;
}

/**
 * Check if a given object implements the CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner interface.
 */
export function instanceOfCoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner(value: object): boolean {
    return true;
}

export function CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerFromJSON(json: any): CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner {
    return CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerFromJSONTyped(json, false);
}

export function CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Category': json['category'] == null ? undefined : json['category'],
        'Icon': json['icon'] == null ? undefined : CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIconFromJSON(json['icon']),
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Parent': json['parent'] == null ? undefined : json['parent'],
        'Qtype': json['qtype'] == null ? undefined : json['qtype'],
    };
}

export function CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerToJSON(value?: CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'category': value['Category'],
        'icon': CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIconToJSON(value['Icon']),
        'id': value['Id'],
        'name': value['Name'],
        'parent': value['Parent'],
        'qtype': value['Qtype'],
    };
}

