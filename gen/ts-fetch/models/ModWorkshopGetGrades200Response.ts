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

/**
 * 
 * @export
 * @interface ModWorkshopGetGrades200Response
 */
export interface ModWorkshopGetGrades200Response {
    /**
     * Whether the grade is hidden or not.
     * @type {boolean}
     * @memberof ModWorkshopGetGrades200Response
     */
    assessmentgradehidden?: boolean;
    /**
     * The assessment string grade.
     * @type {string}
     * @memberof ModWorkshopGetGrades200Response
     */
    assessmentlongstrgrade?: string;
    /**
     * The assessment raw (numeric) grade.
     * @type {number}
     * @memberof ModWorkshopGetGrades200Response
     */
    assessmentrawgrade?: number;
    /**
     * Whether the grade is hidden or not.
     * @type {boolean}
     * @memberof ModWorkshopGetGrades200Response
     */
    submissiongradehidden?: boolean;
    /**
     * The submission string grade.
     * @type {string}
     * @memberof ModWorkshopGetGrades200Response
     */
    submissionlongstrgrade?: string;
    /**
     * The submission raw (numeric) grade.
     * @type {number}
     * @memberof ModWorkshopGetGrades200Response
     */
    submissionrawgrade?: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModWorkshopGetGrades200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModWorkshopGetGrades200Response interface.
 */
export function instanceOfModWorkshopGetGrades200Response(value: object): boolean {
    return true;
}

export function ModWorkshopGetGrades200ResponseFromJSON(json: any): ModWorkshopGetGrades200Response {
    return ModWorkshopGetGrades200ResponseFromJSONTyped(json, false);
}

export function ModWorkshopGetGrades200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetGrades200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'assessmentgradehidden': json['assessmentgradehidden'] == null ? undefined : json['assessmentgradehidden'],
        'assessmentlongstrgrade': json['assessmentlongstrgrade'] == null ? undefined : json['assessmentlongstrgrade'],
        'assessmentrawgrade': json['assessmentrawgrade'] == null ? undefined : json['assessmentrawgrade'],
        'submissiongradehidden': json['submissiongradehidden'] == null ? undefined : json['submissiongradehidden'],
        'submissionlongstrgrade': json['submissionlongstrgrade'] == null ? undefined : json['submissionlongstrgrade'],
        'submissionrawgrade': json['submissionrawgrade'] == null ? undefined : json['submissionrawgrade'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModWorkshopGetGrades200ResponseToJSON(value?: ModWorkshopGetGrades200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assessmentgradehidden': value['assessmentgradehidden'],
        'assessmentlongstrgrade': value['assessmentlongstrgrade'],
        'assessmentrawgrade': value['assessmentrawgrade'],
        'submissiongradehidden': value['submissiongradehidden'],
        'submissionlongstrgrade': value['submissionlongstrgrade'],
        'submissionrawgrade': value['submissionrawgrade'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

