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
 * @interface ToolUsertoursFetchAndStartTourRequest
 */
export interface ToolUsertoursFetchAndStartTourRequest {
    /**
     * Context ID
     * @type {number}
     * @memberof ToolUsertoursFetchAndStartTourRequest
     */
    Context: number;
    /**
     * Page URL
     * @type {string}
     * @memberof ToolUsertoursFetchAndStartTourRequest
     */
    Pageurl: string;
    /**
     * Tour ID
     * @type {number}
     * @memberof ToolUsertoursFetchAndStartTourRequest
     */
    Tourid: number;
}

/**
 * Check if a given object implements the ToolUsertoursFetchAndStartTourRequest interface.
 */
export function instanceOfToolUsertoursFetchAndStartTourRequest(value: object): boolean {
    if (!('Context' in value)) return false;
    if (!('Pageurl' in value)) return false;
    if (!('Tourid' in value)) return false;
    return true;
}

export function ToolUsertoursFetchAndStartTourRequestFromJSON(json: any): ToolUsertoursFetchAndStartTourRequest {
    return ToolUsertoursFetchAndStartTourRequestFromJSONTyped(json, false);
}

export function ToolUsertoursFetchAndStartTourRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolUsertoursFetchAndStartTourRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Context': json['context'],
        'Pageurl': json['pageurl'],
        'Tourid': json['tourid'],
    };
}

export function ToolUsertoursFetchAndStartTourRequestToJSON(value?: ToolUsertoursFetchAndStartTourRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': value['Context'],
        'pageurl': value['Pageurl'],
        'tourid': value['Tourid'],
    };
}

