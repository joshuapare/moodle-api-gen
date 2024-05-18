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
 * @interface ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
 */
export interface ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner {
    /**
     * Response id
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
     */
    id?: number;
    /**
     * Response name
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
     */
    name?: string;
    /**
     * Response ready for output
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
     */
    printval?: string;
    /**
     * Response raw value
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
     */
    rawval?: string;
}

/**
 * Check if a given object implements the ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner interface.
 */
export function instanceOfModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner(value: object): boolean {
    return true;
}

export function ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerFromJSON(json: any): ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner {
    return ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerFromJSONTyped(json, false);
}

export function ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'name': json['name'] == null ? undefined : json['name'],
        'printval': json['printval'] == null ? undefined : json['printval'],
        'rawval': json['rawval'] == null ? undefined : json['rawval'],
    };
}

export function ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerToJSON(value?: ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'name': value['name'],
        'printval': value['printval'],
        'rawval': value['rawval'],
    };
}
