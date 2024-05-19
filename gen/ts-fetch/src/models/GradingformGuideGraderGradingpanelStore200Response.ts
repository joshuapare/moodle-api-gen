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
import type { GradingformGuideGraderGradingpanelStore200ResponseGrade } from './GradingformGuideGraderGradingpanelStore200ResponseGrade';
import {
    GradingformGuideGraderGradingpanelStore200ResponseGradeFromJSON,
    GradingformGuideGraderGradingpanelStore200ResponseGradeFromJSONTyped,
    GradingformGuideGraderGradingpanelStore200ResponseGradeToJSON,
} from './GradingformGuideGraderGradingpanelStore200ResponseGrade';

/**
 * 
 * @export
 * @interface GradingformGuideGraderGradingpanelStore200Response
 */
export interface GradingformGuideGraderGradingpanelStore200Response {
    /**
     * 
     * @type {GradingformGuideGraderGradingpanelStore200ResponseGrade}
     * @memberof GradingformGuideGraderGradingpanelStore200Response
     */
    Grade: GradingformGuideGraderGradingpanelStore200ResponseGrade;
    /**
     * Does the user have a grade?
     * @type {boolean}
     * @memberof GradingformGuideGraderGradingpanelStore200Response
     */
    Hasgrade: boolean;
    /**
     * The template to use when rendering this data
     * @type {string}
     * @memberof GradingformGuideGraderGradingpanelStore200Response
     */
    Templatename: string;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof GradingformGuideGraderGradingpanelStore200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the GradingformGuideGraderGradingpanelStore200Response interface.
 */
export function instanceOfGradingformGuideGraderGradingpanelStore200Response(value: object): boolean {
    if (!('Grade' in value)) return false;
    if (!('Hasgrade' in value)) return false;
    if (!('Templatename' in value)) return false;
    return true;
}

export function GradingformGuideGraderGradingpanelStore200ResponseFromJSON(json: any): GradingformGuideGraderGradingpanelStore200Response {
    return GradingformGuideGraderGradingpanelStore200ResponseFromJSONTyped(json, false);
}

export function GradingformGuideGraderGradingpanelStore200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GradingformGuideGraderGradingpanelStore200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Grade': GradingformGuideGraderGradingpanelStore200ResponseGradeFromJSON(json['grade']),
        'Hasgrade': json['hasgrade'],
        'Templatename': json['templatename'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function GradingformGuideGraderGradingpanelStore200ResponseToJSON(value?: GradingformGuideGraderGradingpanelStore200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'grade': GradingformGuideGraderGradingpanelStore200ResponseGradeToJSON(value['Grade']),
        'hasgrade': value['Hasgrade'],
        'templatename': value['Templatename'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

