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
 * @interface ModFeedbackLaunchFeedback200Response
 */
export interface ModFeedbackLaunchFeedback200Response {
    /**
     * The next page to go (-1 if we were already in the last page). 0 for first page.
     * @type {number}
     * @memberof ModFeedbackLaunchFeedback200Response
     */
    Gopage: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModFeedbackLaunchFeedback200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModFeedbackLaunchFeedback200Response interface.
 */
export function instanceOfModFeedbackLaunchFeedback200Response(value: object): boolean {
    if (!('Gopage' in value)) return false;
    return true;
}

export function ModFeedbackLaunchFeedback200ResponseFromJSON(json: any): ModFeedbackLaunchFeedback200Response {
    return ModFeedbackLaunchFeedback200ResponseFromJSONTyped(json, false);
}

export function ModFeedbackLaunchFeedback200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackLaunchFeedback200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Gopage': json['gopage'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModFeedbackLaunchFeedback200ResponseToJSON(value?: ModFeedbackLaunchFeedback200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'gopage': value['Gopage'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
