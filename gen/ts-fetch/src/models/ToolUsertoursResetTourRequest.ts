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
 * @interface ToolUsertoursResetTourRequest
 */
export interface ToolUsertoursResetTourRequest {
    /**
     * Context ID
     * @type {number}
     * @memberof ToolUsertoursResetTourRequest
     */
    Context: number;
    /**
     * Current page location
     * @type {string}
     * @memberof ToolUsertoursResetTourRequest
     */
    Pageurl: string;
    /**
     * Tour ID
     * @type {number}
     * @memberof ToolUsertoursResetTourRequest
     */
    Tourid: number;
}

/**
 * Check if a given object implements the ToolUsertoursResetTourRequest interface.
 */
export function instanceOfToolUsertoursResetTourRequest(value: object): boolean {
    if (!('Context' in value)) return false;
    if (!('Pageurl' in value)) return false;
    if (!('Tourid' in value)) return false;
    return true;
}

export function ToolUsertoursResetTourRequestFromJSON(json: any): ToolUsertoursResetTourRequest {
    return ToolUsertoursResetTourRequestFromJSONTyped(json, false);
}

export function ToolUsertoursResetTourRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolUsertoursResetTourRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Context': json['context'],
        'Pageurl': json['pageurl'],
        'Tourid': json['tourid'],
    };
}

export function ToolUsertoursResetTourRequestToJSON(value?: ToolUsertoursResetTourRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': value['Context'],
        'pageurl': value['Pageurl'],
        'tourid': value['Tourid'],
    };
}

