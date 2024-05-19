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
import type { ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner } from './ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner';
import {
    ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerFromJSON,
    ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerFromJSONTyped,
    ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerToJSON,
} from './ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner';
import type { ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner } from './ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner';
import {
    ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerFromJSON,
    ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerFromJSONTyped,
    ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerToJSON,
} from './ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner';

/**
 * 
 * @export
 * @interface ModFeedbackGetResponsesAnalysis200Response
 */
export interface ModFeedbackGetResponsesAnalysis200Response {
    /**
     * 
     * @type {Array<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner>}
     * @memberof ModFeedbackGetResponsesAnalysis200Response
     */
    Anonattempts: Array<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner>;
    /**
     * 
     * @type {Array<ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner>}
     * @memberof ModFeedbackGetResponsesAnalysis200Response
     */
    Attempts: Array<ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner>;
    /**
     * Total anonymous responses count.
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200Response
     */
    Totalanonattempts: number;
    /**
     * Total responses count.
     * @type {number}
     * @memberof ModFeedbackGetResponsesAnalysis200Response
     */
    Totalattempts: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModFeedbackGetResponsesAnalysis200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModFeedbackGetResponsesAnalysis200Response interface.
 */
export function instanceOfModFeedbackGetResponsesAnalysis200Response(value: object): boolean {
    if (!('Anonattempts' in value)) return false;
    if (!('Attempts' in value)) return false;
    if (!('Totalanonattempts' in value)) return false;
    if (!('Totalattempts' in value)) return false;
    return true;
}

export function ModFeedbackGetResponsesAnalysis200ResponseFromJSON(json: any): ModFeedbackGetResponsesAnalysis200Response {
    return ModFeedbackGetResponsesAnalysis200ResponseFromJSONTyped(json, false);
}

export function ModFeedbackGetResponsesAnalysis200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFeedbackGetResponsesAnalysis200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Anonattempts': ((json['anonattempts'] as Array<any>).map(ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerFromJSON)),
        'Attempts': ((json['attempts'] as Array<any>).map(ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerFromJSON)),
        'Totalanonattempts': json['totalanonattempts'],
        'Totalattempts': json['totalattempts'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModFeedbackGetResponsesAnalysis200ResponseToJSON(value?: ModFeedbackGetResponsesAnalysis200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'anonattempts': ((value['Anonattempts'] as Array<any>).map(ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerToJSON)),
        'attempts': ((value['Attempts'] as Array<any>).map(ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerToJSON)),
        'totalanonattempts': value['Totalanonattempts'],
        'totalattempts': value['Totalattempts'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
