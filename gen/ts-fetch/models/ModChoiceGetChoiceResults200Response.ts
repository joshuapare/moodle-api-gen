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
import type { ModChoiceGetChoiceResults200ResponseOptionsInner } from './ModChoiceGetChoiceResults200ResponseOptionsInner';
import {
    ModChoiceGetChoiceResults200ResponseOptionsInnerFromJSON,
    ModChoiceGetChoiceResults200ResponseOptionsInnerFromJSONTyped,
    ModChoiceGetChoiceResults200ResponseOptionsInnerToJSON,
} from './ModChoiceGetChoiceResults200ResponseOptionsInner';

/**
 * 
 * @export
 * @interface ModChoiceGetChoiceResults200Response
 */
export interface ModChoiceGetChoiceResults200Response {
    /**
     * 
     * @type {Array<ModChoiceGetChoiceResults200ResponseOptionsInner>}
     * @memberof ModChoiceGetChoiceResults200Response
     */
    options: Array<ModChoiceGetChoiceResults200ResponseOptionsInner>;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ModChoiceGetChoiceResults200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ModChoiceGetChoiceResults200Response interface.
 */
export function instanceOfModChoiceGetChoiceResults200Response(value: object): boolean {
    if (!('options' in value)) return false;
    return true;
}

export function ModChoiceGetChoiceResults200ResponseFromJSON(json: any): ModChoiceGetChoiceResults200Response {
    return ModChoiceGetChoiceResults200ResponseFromJSONTyped(json, false);
}

export function ModChoiceGetChoiceResults200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChoiceGetChoiceResults200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'options': ((json['options'] as Array<any>).map(ModChoiceGetChoiceResults200ResponseOptionsInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ModChoiceGetChoiceResults200ResponseToJSON(value?: ModChoiceGetChoiceResults200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'options': ((value['options'] as Array<any>).map(ModChoiceGetChoiceResults200ResponseOptionsInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

