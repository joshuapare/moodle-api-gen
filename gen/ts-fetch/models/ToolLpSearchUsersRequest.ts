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
 * @interface ToolLpSearchUsersRequest
 */
export interface ToolLpSearchUsersRequest {
    /**
     * Required capability
     * @type {string}
     * @memberof ToolLpSearchUsersRequest
     */
    capability: string;
    /**
     * Number of records to skip
     * @type {number}
     * @memberof ToolLpSearchUsersRequest
     */
    limitfrom?: number;
    /**
     * Number of records to fetch
     * @type {string}
     * @memberof ToolLpSearchUsersRequest
     */
    limitnum?: string;
    /**
     * Query string
     * @type {string}
     * @memberof ToolLpSearchUsersRequest
     */
    query: string;
}

/**
 * Check if a given object implements the ToolLpSearchUsersRequest interface.
 */
export function instanceOfToolLpSearchUsersRequest(value: object): boolean {
    if (!('capability' in value)) return false;
    if (!('query' in value)) return false;
    return true;
}

export function ToolLpSearchUsersRequestFromJSON(json: any): ToolLpSearchUsersRequest {
    return ToolLpSearchUsersRequestFromJSONTyped(json, false);
}

export function ToolLpSearchUsersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpSearchUsersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'capability': json['capability'],
        'limitfrom': json['limitfrom'] == null ? undefined : json['limitfrom'],
        'limitnum': json['limitnum'] == null ? undefined : json['limitnum'],
        'query': json['query'],
    };
}

export function ToolLpSearchUsersRequestToJSON(value?: ToolLpSearchUsersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'capability': value['capability'],
        'limitfrom': value['limitfrom'],
        'limitnum': value['limitnum'],
        'query': value['query'],
    };
}
