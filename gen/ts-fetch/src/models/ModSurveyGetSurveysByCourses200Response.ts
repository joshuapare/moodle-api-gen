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
import type { ModSurveyGetSurveysByCourses200ResponseSurveysInner } from './ModSurveyGetSurveysByCourses200ResponseSurveysInner';
import {
    ModSurveyGetSurveysByCourses200ResponseSurveysInnerFromJSON,
    ModSurveyGetSurveysByCourses200ResponseSurveysInnerFromJSONTyped,
    ModSurveyGetSurveysByCourses200ResponseSurveysInnerToJSON,
} from './ModSurveyGetSurveysByCourses200ResponseSurveysInner';

/**
 * 
 * @export
 * @interface ModSurveyGetSurveysByCourses200Response
 */
export interface ModSurveyGetSurveysByCourses200Response {
    /**
     * 
     * @type {Array<ModSurveyGetSurveysByCourses200ResponseSurveysInner>}
     * @memberof ModSurveyGetSurveysByCourses200Response
     */
    Surveys: Array<ModSurveyGetSurveysByCourses200ResponseSurveysInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModSurveyGetSurveysByCourses200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModSurveyGetSurveysByCourses200Response interface.
 */
export function instanceOfModSurveyGetSurveysByCourses200Response(value: object): boolean {
    if (!('Surveys' in value)) return false;
    return true;
}

export function ModSurveyGetSurveysByCourses200ResponseFromJSON(json: any): ModSurveyGetSurveysByCourses200Response {
    return ModSurveyGetSurveysByCourses200ResponseFromJSONTyped(json, false);
}

export function ModSurveyGetSurveysByCourses200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModSurveyGetSurveysByCourses200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Surveys': ((json['surveys'] as Array<any>).map(ModSurveyGetSurveysByCourses200ResponseSurveysInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModSurveyGetSurveysByCourses200ResponseToJSON(value?: ModSurveyGetSurveysByCourses200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'surveys': ((value['Surveys'] as Array<any>).map(ModSurveyGetSurveysByCourses200ResponseSurveysInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

