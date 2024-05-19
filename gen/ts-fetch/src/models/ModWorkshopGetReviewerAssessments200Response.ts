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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';
import type { ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner } from './ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner';
import {
    ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerFromJSON,
    ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerFromJSONTyped,
    ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerToJSON,
} from './ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner';

/**
 * 
 * @export
 * @interface ModWorkshopGetReviewerAssessments200Response
 */
export interface ModWorkshopGetReviewerAssessments200Response {
    /**
     * 
     * @type {Array<ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner>}
     * @memberof ModWorkshopGetReviewerAssessments200Response
     */
    Assessments: Array<ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModWorkshopGetReviewerAssessments200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModWorkshopGetReviewerAssessments200Response interface.
 */
export function instanceOfModWorkshopGetReviewerAssessments200Response(value: object): boolean {
    if (!('Assessments' in value)) return false;
    return true;
}

export function ModWorkshopGetReviewerAssessments200ResponseFromJSON(json: any): ModWorkshopGetReviewerAssessments200Response {
    return ModWorkshopGetReviewerAssessments200ResponseFromJSONTyped(json, false);
}

export function ModWorkshopGetReviewerAssessments200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetReviewerAssessments200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Assessments': ((json['assessments'] as Array<any>).map(ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModWorkshopGetReviewerAssessments200ResponseToJSON(value?: ModWorkshopGetReviewerAssessments200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assessments': ((value['Assessments'] as Array<any>).map(ModWorkshopGetReviewerAssessments200ResponseAssessmentsInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
