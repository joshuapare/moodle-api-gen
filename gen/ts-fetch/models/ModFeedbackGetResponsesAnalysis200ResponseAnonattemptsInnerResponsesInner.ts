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
 * @interface ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner
 */
export interface ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner {
    /**
     * Response id
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner
     */
    id?: number;
    /**
     * Response name
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner
     */
    name?: string;
    /**
     * Response ready for output
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner
     */
    printval?: string;
    /**
     * Response raw value
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner
     */
    rawval?: string;
}

/**
 * Check if a given object implements the ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner interface.
 */
export function instanceOfModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner(value: object): boolean {
    return true;
}

export function ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInnerFromJSON(json: any): ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner {
    return ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInnerFromJSONTyped(json, false);
}

export function ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner {
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

export function ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInnerToJSON(value?: ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner | null): any {
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
