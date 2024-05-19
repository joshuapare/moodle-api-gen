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
 * @interface CoreAuthRequestPasswordReset200Response
 */
export interface CoreAuthRequestPasswordReset200Response {
    /**
     * Important information for the user about the process.
     * @type {string}
     * @memberof CoreAuthRequestPasswordReset200Response
     */
    notice: string;
    /**
     * The returned status of the process:
     *                     dataerror: Error in the sent data (username or email). More information in warnings field.
     *                     emailpasswordconfirmmaybesent: Email sent or not (depends on user found in database).
     *                     emailpasswordconfirmnotsent: Failure, user not found.
     *                     emailpasswordconfirmnoemail: Failure, email not found.
     *                     emailalreadysent: Email already sent.
     *                     emailpasswordconfirmsent: User pending confirmation.
     *                     emailresetconfirmsent: Email sent.
     *                 
     * @type {string}
     * @memberof CoreAuthRequestPasswordReset200Response
     */
    status: string;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof CoreAuthRequestPasswordReset200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreAuthRequestPasswordReset200Response interface.
 */
export function instanceOfCoreAuthRequestPasswordReset200Response(value: object): boolean {
    if (!('notice' in value)) return false;
    if (!('status' in value)) return false;
    return true;
}

export function CoreAuthRequestPasswordReset200ResponseFromJSON(json: any): CoreAuthRequestPasswordReset200Response {
    return CoreAuthRequestPasswordReset200ResponseFromJSONTyped(json, false);
}

export function CoreAuthRequestPasswordReset200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAuthRequestPasswordReset200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'notice': json['notice'],
        'status': json['status'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreAuthRequestPasswordReset200ResponseToJSON(value?: CoreAuthRequestPasswordReset200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'notice': value['notice'],
        'status': value['status'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

