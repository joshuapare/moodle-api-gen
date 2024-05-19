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
 * @interface ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner
 */
export interface ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner {
    /**
     * option name
     * @type {string}
     * @memberof ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner
     */
    Name?: string;
    /**
     * option value
     * @type {number}
     * @memberof ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner
     */
    Value?: number;
}

/**
 * Check if a given object implements the ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner interface.
 */
export function instanceOfModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner(value: object): boolean {
    return true;
}

export function ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInnerFromJSON(json: any): ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner {
    return ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInnerFromJSONTyped(json, false);
}

export function ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInnerToJSON(value?: ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'value': value['Value'],
    };
}

