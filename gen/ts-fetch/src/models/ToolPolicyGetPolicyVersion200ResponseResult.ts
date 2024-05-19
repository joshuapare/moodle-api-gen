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
import type { ToolPolicyGetPolicyVersion200ResponseResultPolicy } from './ToolPolicyGetPolicyVersion200ResponseResultPolicy';
import {
    ToolPolicyGetPolicyVersion200ResponseResultPolicyFromJSON,
    ToolPolicyGetPolicyVersion200ResponseResultPolicyFromJSONTyped,
    ToolPolicyGetPolicyVersion200ResponseResultPolicyToJSON,
} from './ToolPolicyGetPolicyVersion200ResponseResultPolicy';

/**
 * 
 * @export
 * @interface ToolPolicyGetPolicyVersion200ResponseResult
 */
export interface ToolPolicyGetPolicyVersion200ResponseResult {
    /**
     * 
     * @type {ToolPolicyGetPolicyVersion200ResponseResultPolicy}
     * @memberof ToolPolicyGetPolicyVersion200ResponseResult
     */
    Policy?: ToolPolicyGetPolicyVersion200ResponseResultPolicy;
}

/**
 * Check if a given object implements the ToolPolicyGetPolicyVersion200ResponseResult interface.
 */
export function instanceOfToolPolicyGetPolicyVersion200ResponseResult(value: object): boolean {
    return true;
}

export function ToolPolicyGetPolicyVersion200ResponseResultFromJSON(json: any): ToolPolicyGetPolicyVersion200ResponseResult {
    return ToolPolicyGetPolicyVersion200ResponseResultFromJSONTyped(json, false);
}

export function ToolPolicyGetPolicyVersion200ResponseResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolPolicyGetPolicyVersion200ResponseResult {
    if (json == null) {
        return json;
    }
    return {
        
        'Policy': json['policy'] == null ? undefined : ToolPolicyGetPolicyVersion200ResponseResultPolicyFromJSON(json['policy']),
    };
}

export function ToolPolicyGetPolicyVersion200ResponseResultToJSON(value?: ToolPolicyGetPolicyVersion200ResponseResult | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'policy': ToolPolicyGetPolicyVersion200ResponseResultPolicyToJSON(value['Policy']),
    };
}

