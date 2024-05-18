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
 * @interface ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
 */
export interface ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner {
    /**
     * The id of the assessment.
     * @type {number}
     * @memberof ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
     */
    assessmentid?: number;
    /**
     * The grade for submission.
     * @type {number}
     * @memberof ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
     */
    grade?: number;
    /**
     * The grade for assessment.
     * @type {number}
     * @memberof ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
     */
    gradinggrade?: number;
    /**
     * The aggregated grade overrided.
     * @type {number}
     * @memberof ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
     */
    gradinggradeover?: number;
    /**
     * The id of the submission assessed.
     * @type {number}
     * @memberof ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
     */
    submissionid?: number;
    /**
     * The id of the user (0 when is configured to do not display names).
     * @type {number}
     * @memberof ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
     */
    userid?: number;
    /**
     * The weight of the assessment for aggregation.
     * @type {number}
     * @memberof ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner
     */
    weight?: number;
}

/**
 * Check if a given object implements the ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner interface.
 */
export function instanceOfModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner(value: object): boolean {
    return true;
}

export function ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInnerFromJSON(json: any): ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner {
    return ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInnerFromJSONTyped(json, false);
}

export function ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner {
    if (json == null) {
        return json;
    }
    return {
        
        'assessmentid': json['assessmentid'] == null ? undefined : json['assessmentid'],
        'grade': json['grade'] == null ? undefined : json['grade'],
        'gradinggrade': json['gradinggrade'] == null ? undefined : json['gradinggrade'],
        'gradinggradeover': json['gradinggradeover'] == null ? undefined : json['gradinggradeover'],
        'submissionid': json['submissionid'] == null ? undefined : json['submissionid'],
        'userid': json['userid'] == null ? undefined : json['userid'],
        'weight': json['weight'] == null ? undefined : json['weight'],
    };
}

export function ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInnerToJSON(value?: ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assessmentid': value['assessmentid'],
        'grade': value['grade'],
        'gradinggrade': value['gradinggrade'],
        'gradinggradeover': value['gradinggradeover'],
        'submissionid': value['submissionid'],
        'userid': value['userid'],
        'weight': value['weight'],
    };
}

