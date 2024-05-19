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
 * @interface ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy
 */
export interface ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
    /**
     * The iomadpolicy version content
     * @type {string}
     * @memberof ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy
     */
    content?: string;
    /**
     * The iomadpolicy version name
     * @type {string}
     * @memberof ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy
     */
    name?: string;
    /**
     * The iomadpolicy version id
     * @type {number}
     * @memberof ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy
     */
    versionid?: number;
}

/**
 * Check if a given object implements the ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy interface.
 */
export function instanceOfToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy(value: object): boolean {
    return true;
}

export function ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicyFromJSON(json: any): ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
    return ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicyFromJSONTyped(json, false);
}

export function ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy {
    if (json == null) {
        return json;
    }
    return {
        
        'content': json['content'] == null ? undefined : json['content'],
        'name': json['name'] == null ? undefined : json['name'],
        'versionid': json['versionid'] == null ? undefined : json['versionid'],
    };
}

export function ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicyToJSON(value?: ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'content': value['content'],
        'name': value['name'],
        'versionid': value['versionid'],
    };
}

