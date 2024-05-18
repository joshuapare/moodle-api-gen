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
import type { ModLessonGetAttemptsOverview200ResponseData } from './ModLessonGetAttemptsOverview200ResponseData';
import {
    ModLessonGetAttemptsOverview200ResponseDataFromJSON,
    ModLessonGetAttemptsOverview200ResponseDataFromJSONTyped,
    ModLessonGetAttemptsOverview200ResponseDataToJSON,
} from './ModLessonGetAttemptsOverview200ResponseData';

/**
 * 
 * @export
 * @interface ModLessonGetAttemptsOverview200Response
 */
export interface ModLessonGetAttemptsOverview200Response {
    /**
     * 
     * @type {ModLessonGetAttemptsOverview200ResponseData}
     * @memberof ModLessonGetAttemptsOverview200Response
     */
    data?: ModLessonGetAttemptsOverview200ResponseData;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModLessonGetAttemptsOverview200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModLessonGetAttemptsOverview200Response interface.
 */
export function instanceOfModLessonGetAttemptsOverview200Response(value: object): boolean {
    return true;
}

export function ModLessonGetAttemptsOverview200ResponseFromJSON(json: any): ModLessonGetAttemptsOverview200Response {
    return ModLessonGetAttemptsOverview200ResponseFromJSONTyped(json, false);
}

export function ModLessonGetAttemptsOverview200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLessonGetAttemptsOverview200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'data': json['data'] == null ? undefined : ModLessonGetAttemptsOverview200ResponseDataFromJSON(json['data']),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModLessonGetAttemptsOverview200ResponseToJSON(value?: ModLessonGetAttemptsOverview200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'data': ModLessonGetAttemptsOverview200ResponseDataToJSON(value['data']),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

