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
/**
 * 
 * @export
 * @interface ToolPolicyGetPolicyVersion200ResponseResultPolicy
 */
export interface ToolPolicyGetPolicyVersion200ResponseResultPolicy {
    /**
     * The policy version content
     * @type {string}
     * @memberof ToolPolicyGetPolicyVersion200ResponseResultPolicy
     */
    Content?: string;
    /**
     * The policy version name
     * @type {string}
     * @memberof ToolPolicyGetPolicyVersion200ResponseResultPolicy
     */
    Name?: string;
    /**
     * The policy version id
     * @type {number}
     * @memberof ToolPolicyGetPolicyVersion200ResponseResultPolicy
     */
    Versionid?: number;
}

/**
 * Check if a given object implements the ToolPolicyGetPolicyVersion200ResponseResultPolicy interface.
 */
export function instanceOfToolPolicyGetPolicyVersion200ResponseResultPolicy(value: object): boolean {
    return true;
}

export function ToolPolicyGetPolicyVersion200ResponseResultPolicyFromJSON(json: any): ToolPolicyGetPolicyVersion200ResponseResultPolicy {
    return ToolPolicyGetPolicyVersion200ResponseResultPolicyFromJSONTyped(json, false);
}

export function ToolPolicyGetPolicyVersion200ResponseResultPolicyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolPolicyGetPolicyVersion200ResponseResultPolicy {
    if (json == null) {
        return json;
    }
    return {
        
        'Content': json['content'] == null ? undefined : json['content'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Versionid': json['versionid'] == null ? undefined : json['versionid'],
    };
}

export function ToolPolicyGetPolicyVersion200ResponseResultPolicyToJSON(value?: ToolPolicyGetPolicyVersion200ResponseResultPolicy | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'content': value['Content'],
        'name': value['Name'],
        'versionid': value['Versionid'],
    };
}

