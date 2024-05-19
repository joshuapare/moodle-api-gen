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
    Id?: number;
    /**
     * Response name
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
     */
    Name?: string;
    /**
     * Response ready for output
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
     */
    Printval?: string;
    /**
     * Response raw value
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner
     */
    Rawval?: string;
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
        
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Printval': json['printval'] == null ? undefined : json['printval'],
        'Rawval': json['rawval'] == null ? undefined : json['rawval'],
    };
}

export function ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerToJSON(value?: ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
        'name': value['Name'],
        'printval': value['Printval'],
        'rawval': value['Rawval'],
    };
}
