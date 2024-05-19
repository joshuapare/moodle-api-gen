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
import type { ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner } from './ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner';
import {
    ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerFromJSON,
    ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerFromJSONTyped,
    ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerToJSON,
} from './ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner';

/**
 * 
 * @export
 * @interface ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response
 */
export interface ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response {
    /**
     * 
     * @type {Array<ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner>}
     * @memberof ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response
     */
    Bigbluebuttonbns: Array<ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response interface.
 */
export function instanceOfModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response(value: object): boolean {
    if (!('Bigbluebuttonbns' in value)) return false;
    return true;
}

export function ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseFromJSON(json: any): ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response {
    return ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseFromJSONTyped(json, false);
}

export function ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Bigbluebuttonbns': ((json['bigbluebuttonbns'] as Array<any>).map(ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerFromJSON)),
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseToJSON(value?: ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'bigbluebuttonbns': ((value['Bigbluebuttonbns'] as Array<any>).map(ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInnerToJSON)),
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

