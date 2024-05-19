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
import type { ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner } from './ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner';
import {
    ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerFromJSON,
    ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerFromJSONTyped,
    ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerToJSON,
} from './ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner';

/**
 * 
 * @export
 * @interface ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
 */
export interface ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner {
    /**
     * Course id
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
     */
    Courseid?: number;
    /**
     * User full name
     * @type {string}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
     */
    Fullname?: string;
    /**
     * Completed id
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
     */
    Id?: number;
    /**
     * 
     * @type {Array<ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner>}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
     */
    Responses?: Array<ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner>;
    /**
     * Time modified for the response
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
     */
    Timemodified?: number;
    /**
     * User who responded
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner interface.
 */
export function instanceOfModFeedbackGetResponsesAnalysis200ResponseAttemptsInner(value: object): boolean {
    return true;
}

export function ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerFromJSON(json: any): ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner {
    return ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerFromJSONTyped(json, false);
}

export function ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Courseid': json['courseid'] == null ? undefined : json['courseid'],
        'Fullname': json['fullname'] == null ? undefined : json['fullname'],
        'Id': json['id'] == null ? undefined : json['id'],
        'Responses': json['responses'] == null ? undefined : ((json['responses'] as Array<any>).map(ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerFromJSON)),
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerToJSON(value?: ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'courseid': value['Courseid'],
        'fullname': value['Fullname'],
        'id': value['Id'],
        'responses': value['Responses'] == null ? undefined : ((value['Responses'] as Array<any>).map(ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInnerToJSON)),
        'timemodified': value['Timemodified'],
        'userid': value['Userid'],
    };
}

