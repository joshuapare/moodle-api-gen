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
import type { GradereportOverviewGetCourseGrades200ResponseGradesInner } from './GradereportOverviewGetCourseGrades200ResponseGradesInner';
import {
    GradereportOverviewGetCourseGrades200ResponseGradesInnerFromJSON,
    GradereportOverviewGetCourseGrades200ResponseGradesInnerFromJSONTyped,
    GradereportOverviewGetCourseGrades200ResponseGradesInnerToJSON,
} from './GradereportOverviewGetCourseGrades200ResponseGradesInner';

/**
 * 
 * @export
 * @interface GradereportOverviewGetCourseGrades200Response
 */
export interface GradereportOverviewGetCourseGrades200Response {
    /**
     * 
     * @type {Array<GradereportOverviewGetCourseGrades200ResponseGradesInner>}
     * @memberof GradereportOverviewGetCourseGrades200Response
     */
    grades: Array<GradereportOverviewGetCourseGrades200ResponseGradesInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof GradereportOverviewGetCourseGrades200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the GradereportOverviewGetCourseGrades200Response interface.
 */
export function instanceOfGradereportOverviewGetCourseGrades200Response(value: object): boolean {
    if (!('grades' in value)) return false;
    return true;
}

export function GradereportOverviewGetCourseGrades200ResponseFromJSON(json: any): GradereportOverviewGetCourseGrades200Response {
    return GradereportOverviewGetCourseGrades200ResponseFromJSONTyped(json, false);
}

export function GradereportOverviewGetCourseGrades200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradereportOverviewGetCourseGrades200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'grades': ((json['grades'] as Array<any>).map(GradereportOverviewGetCourseGrades200ResponseGradesInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function GradereportOverviewGetCourseGrades200ResponseToJSON(value?: GradereportOverviewGetCourseGrades200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'grades': ((value['grades'] as Array<any>).map(GradereportOverviewGetCourseGrades200ResponseGradesInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

