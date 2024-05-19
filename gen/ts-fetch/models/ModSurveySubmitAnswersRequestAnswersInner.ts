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
 * @interface ModSurveySubmitAnswersRequestAnswersInner
 */
export interface ModSurveySubmitAnswersRequestAnswersInner {
    /**
     * Answer key
     * @type {string}
     * @memberof ModSurveySubmitAnswersRequestAnswersInner
     */
    key?: string;
    /**
     * Answer value
     * @type {string}
     * @memberof ModSurveySubmitAnswersRequestAnswersInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModSurveySubmitAnswersRequestAnswersInner interface.
 */
export function instanceOfModSurveySubmitAnswersRequestAnswersInner(value: object): boolean {
    return true;
}

export function ModSurveySubmitAnswersRequestAnswersInnerFromJSON(json: any): ModSurveySubmitAnswersRequestAnswersInner {
    return ModSurveySubmitAnswersRequestAnswersInnerFromJSONTyped(json, false);
}

export function ModSurveySubmitAnswersRequestAnswersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModSurveySubmitAnswersRequestAnswersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'key': json['key'] == null ? undefined : json['key'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModSurveySubmitAnswersRequestAnswersInnerToJSON(value?: ModSurveySubmitAnswersRequestAnswersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'key': value['key'],
        'value': value['value'],
    };
}

