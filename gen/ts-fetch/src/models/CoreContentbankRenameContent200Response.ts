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
 * @interface CoreContentbankRenameContent200Response
 */
export interface CoreContentbankRenameContent200Response {
    /**
     * The processing result
     * @type {boolean}
     * @memberof CoreContentbankRenameContent200Response
     */
    Result: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreContentbankRenameContent200Response
     */
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreContentbankRenameContent200Response interface.
 */
export function instanceOfCoreContentbankRenameContent200Response(value: object): boolean {
    if (!('Result' in value)) return false;
    return true;
}

export function CoreContentbankRenameContent200ResponseFromJSON(json: any): CoreContentbankRenameContent200Response {
    return CoreContentbankRenameContent200ResponseFromJSONTyped(json, false);
}

export function CoreContentbankRenameContent200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreContentbankRenameContent200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Result': json['result'],
        'Warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreContentbankRenameContent200ResponseToJSON(value?: CoreContentbankRenameContent200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'result': value['Result'],
        'warnings': value['Warnings'] == null ? undefined : ((value['Warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

