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
 * @interface ModFeedbackProcessPageRequestResponsesInner
 */
export interface ModFeedbackProcessPageRequestResponsesInner {
    /**
     * The response name (usually type[index]_id).
     * @type {string}
     * @memberof ModFeedbackProcessPageRequestResponsesInner
     */
    Name?: string;
    /**
     * The response value.
     * @type {string}
     * @memberof ModFeedbackProcessPageRequestResponsesInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the ModFeedbackProcessPageRequestResponsesInner interface.
 */
export function instanceOfModFeedbackProcessPageRequestResponsesInner(value: object): boolean {
    return true;
}

export function ModFeedbackProcessPageRequestResponsesInnerFromJSON(json: any): ModFeedbackProcessPageRequestResponsesInner {
    return ModFeedbackProcessPageRequestResponsesInnerFromJSONTyped(json, false);
}

export function ModFeedbackProcessPageRequestResponsesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackProcessPageRequestResponsesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModFeedbackProcessPageRequestResponsesInnerToJSON(value?: ModFeedbackProcessPageRequestResponsesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'value': value['Value'],
    };
}
