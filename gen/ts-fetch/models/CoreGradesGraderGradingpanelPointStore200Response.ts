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
import type { CoreGradesGraderGradingpanelPointStore200ResponseGrade } from './CoreGradesGraderGradingpanelPointStore200ResponseGrade';
import {
    CoreGradesGraderGradingpanelPointStore200ResponseGradeFromJSON,
    CoreGradesGraderGradingpanelPointStore200ResponseGradeFromJSONTyped,
    CoreGradesGraderGradingpanelPointStore200ResponseGradeToJSON,
} from './CoreGradesGraderGradingpanelPointStore200ResponseGrade';

/**
 * 
 * @export
 * @interface CoreGradesGraderGradingpanelPointStore200Response
 */
export interface CoreGradesGraderGradingpanelPointStore200Response {
    /**
     * 
     * @type {CoreGradesGraderGradingpanelPointStore200ResponseGrade}
     * @memberof CoreGradesGraderGradingpanelPointStore200Response
     */
    grade: CoreGradesGraderGradingpanelPointStore200ResponseGrade;
    /**
     * Does the user have a grade?
     * @type {boolean}
     * @memberof CoreGradesGraderGradingpanelPointStore200Response
     */
    hasgrade: boolean;
    /**
     * The template to use when rendering this data
     * @type {string}
     * @memberof CoreGradesGraderGradingpanelPointStore200Response
     */
    templatename: string;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreGradesGraderGradingpanelPointStore200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreGradesGraderGradingpanelPointStore200Response interface.
 */
export function instanceOfCoreGradesGraderGradingpanelPointStore200Response(value: object): boolean {
    if (!('grade' in value)) return false;
    if (!('hasgrade' in value)) return false;
    if (!('templatename' in value)) return false;
    return true;
}

export function CoreGradesGraderGradingpanelPointStore200ResponseFromJSON(json: any): CoreGradesGraderGradingpanelPointStore200Response {
    return CoreGradesGraderGradingpanelPointStore200ResponseFromJSONTyped(json, false);
}

export function CoreGradesGraderGradingpanelPointStore200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradesGraderGradingpanelPointStore200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'grade': CoreGradesGraderGradingpanelPointStore200ResponseGradeFromJSON(json['grade']),
        'hasgrade': json['hasgrade'],
        'templatename': json['templatename'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreGradesGraderGradingpanelPointStore200ResponseToJSON(value?: CoreGradesGraderGradingpanelPointStore200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'grade': CoreGradesGraderGradingpanelPointStore200ResponseGradeToJSON(value['grade']),
        'hasgrade': value['hasgrade'],
        'templatename': value['templatename'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
