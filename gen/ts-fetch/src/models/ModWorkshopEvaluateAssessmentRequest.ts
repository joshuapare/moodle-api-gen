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
 * @interface ModWorkshopEvaluateAssessmentRequest
 */
export interface ModWorkshopEvaluateAssessmentRequest {
    /**
     * Assessment id.
     * @type {number}
     * @memberof ModWorkshopEvaluateAssessmentRequest
     */
    Assessmentid: number;
    /**
     * The feedback format for text.
     * @type {number}
     * @memberof ModWorkshopEvaluateAssessmentRequest
     */
    Feedbackformat?: number;
    /**
     * The feedback for the reviewer.
     * @type {string}
     * @memberof ModWorkshopEvaluateAssessmentRequest
     */
    Feedbacktext?: string;
    /**
     * The new grading grade.
     * @type {string}
     * @memberof ModWorkshopEvaluateAssessmentRequest
     */
    Gradinggradeover?: string;
    /**
     * The new weight for the assessment.
     * @type {number}
     * @memberof ModWorkshopEvaluateAssessmentRequest
     */
    Weight?: number;
}

/**
 * Check if a given object implements the ModWorkshopEvaluateAssessmentRequest interface.
 */
export function instanceOfModWorkshopEvaluateAssessmentRequest(value: object): boolean {
    if (!('Assessmentid' in value)) return false;
    return true;
}

export function ModWorkshopEvaluateAssessmentRequestFromJSON(json: any): ModWorkshopEvaluateAssessmentRequest {
    return ModWorkshopEvaluateAssessmentRequestFromJSONTyped(json, false);
}

export function ModWorkshopEvaluateAssessmentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopEvaluateAssessmentRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Assessmentid': json['assessmentid'],
        'Feedbackformat': json['feedbackformat'] == null ? undefined : json['feedbackformat'],
        'Feedbacktext': json['feedbacktext'] == null ? undefined : json['feedbacktext'],
        'Gradinggradeover': json['gradinggradeover'] == null ? undefined : json['gradinggradeover'],
        'Weight': json['weight'] == null ? undefined : json['weight'],
    };
}

export function ModWorkshopEvaluateAssessmentRequestToJSON(value?: ModWorkshopEvaluateAssessmentRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assessmentid': value['Assessmentid'],
        'feedbackformat': value['Feedbackformat'],
        'feedbacktext': value['Feedbacktext'],
        'gradinggradeover': value['Gradinggradeover'],
        'weight': value['Weight'],
    };
}

