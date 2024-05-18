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
import type { ToolDataprivacyCreatePurposeForm200ResponsePurpose } from './ToolDataprivacyCreatePurposeForm200ResponsePurpose';
import {
    ToolDataprivacyCreatePurposeForm200ResponsePurposeFromJSON,
    ToolDataprivacyCreatePurposeForm200ResponsePurposeFromJSONTyped,
    ToolDataprivacyCreatePurposeForm200ResponsePurposeToJSON,
} from './ToolDataprivacyCreatePurposeForm200ResponsePurpose';

/**
 * 
 * @export
 * @interface ToolDataprivacyCreatePurposeForm200Response
 */
export interface ToolDataprivacyCreatePurposeForm200Response {
    /**
     * 
     * @type {ToolDataprivacyCreatePurposeForm200ResponsePurpose}
     * @memberof ToolDataprivacyCreatePurposeForm200Response
     */
    purpose: ToolDataprivacyCreatePurposeForm200ResponsePurpose;
    /**
     * Were there validation errors
     * @type {boolean}
     * @memberof ToolDataprivacyCreatePurposeForm200Response
     */
    validationerrors: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof ToolDataprivacyCreatePurposeForm200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the ToolDataprivacyCreatePurposeForm200Response interface.
 */
export function instanceOfToolDataprivacyCreatePurposeForm200Response(value: object): boolean {
    if (!('purpose' in value)) return false;
    if (!('validationerrors' in value)) return false;
    return true;
}

export function ToolDataprivacyCreatePurposeForm200ResponseFromJSON(json: any): ToolDataprivacyCreatePurposeForm200Response {
    return ToolDataprivacyCreatePurposeForm200ResponseFromJSONTyped(json, false);
}

export function ToolDataprivacyCreatePurposeForm200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyCreatePurposeForm200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'purpose': ToolDataprivacyCreatePurposeForm200ResponsePurposeFromJSON(json['purpose']),
        'validationerrors': json['validationerrors'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function ToolDataprivacyCreatePurposeForm200ResponseToJSON(value?: ToolDataprivacyCreatePurposeForm200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'purpose': ToolDataprivacyCreatePurposeForm200ResponsePurposeToJSON(value['purpose']),
        'validationerrors': value['validationerrors'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}

