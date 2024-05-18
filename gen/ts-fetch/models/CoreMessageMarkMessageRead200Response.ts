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
 * @interface CoreMessageMarkMessageRead200Response
 */
export interface CoreMessageMarkMessageRead200Response {
    /**
     * the id of the message in the messages table
     * @type {number}
     * @memberof CoreMessageMarkMessageRead200Response
     */
    messageid: number;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreMessageMarkMessageRead200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreMessageMarkMessageRead200Response interface.
 */
export function instanceOfCoreMessageMarkMessageRead200Response(value: object): boolean {
    if (!('messageid' in value)) return false;
    return true;
}

export function CoreMessageMarkMessageRead200ResponseFromJSON(json: any): CoreMessageMarkMessageRead200Response {
    return CoreMessageMarkMessageRead200ResponseFromJSONTyped(json, false);
}

export function CoreMessageMarkMessageRead200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreMessageMarkMessageRead200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'messageid': json['messageid'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreMessageMarkMessageRead200ResponseToJSON(value?: CoreMessageMarkMessageRead200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'messageid': value['messageid'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
