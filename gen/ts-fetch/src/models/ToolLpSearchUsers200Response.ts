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
import type { ToolLpSearchUsers200ResponseUsersInner } from './ToolLpSearchUsers200ResponseUsersInner';
import {
    ToolLpSearchUsers200ResponseUsersInnerFromJSON,
    ToolLpSearchUsers200ResponseUsersInnerFromJSONTyped,
    ToolLpSearchUsers200ResponseUsersInnerToJSON,
} from './ToolLpSearchUsers200ResponseUsersInner';

/**
 * 
 * @export
 * @interface ToolLpSearchUsers200Response
 */
export interface ToolLpSearchUsers200Response {
    /**
     * Total number of results.
     * @type {number}
     * @memberof ToolLpSearchUsers200Response
     */
    Count: number;
    /**
     * 
     * @type {Array<ToolLpSearchUsers200ResponseUsersInner>}
     * @memberof ToolLpSearchUsers200Response
     */
    Users: Array<ToolLpSearchUsers200ResponseUsersInner>;
}

/**
 * Check if a given object implements the ToolLpSearchUsers200Response interface.
 */
export function instanceOfToolLpSearchUsers200Response(value: object): boolean {
    if (!('Count' in value)) return false;
    if (!('Users' in value)) return false;
    return true;
}

export function ToolLpSearchUsers200ResponseFromJSON(json: any): ToolLpSearchUsers200Response {
    return ToolLpSearchUsers200ResponseFromJSONTyped(json, false);
}

export function ToolLpSearchUsers200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpSearchUsers200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'Count': json['count'],
        'Users': ((json['users'] as Array<any>).map(ToolLpSearchUsers200ResponseUsersInnerFromJSON)),
    };
}

export function ToolLpSearchUsers200ResponseToJSON(value?: ToolLpSearchUsers200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'count': value['Count'],
        'users': ((value['Users'] as Array<any>).map(ToolLpSearchUsers200ResponseUsersInnerToJSON)),
    };
}
