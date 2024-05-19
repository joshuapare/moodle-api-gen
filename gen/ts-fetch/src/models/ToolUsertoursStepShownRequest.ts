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
 * @interface ToolUsertoursStepShownRequest
 */
export interface ToolUsertoursStepShownRequest {
    /**
     * Context ID
     * @type {number}
     * @memberof ToolUsertoursStepShownRequest
     */
    Context: number;
    /**
     * Page URL
     * @type {string}
     * @memberof ToolUsertoursStepShownRequest
     */
    Pageurl: string;
    /**
     * Step ID
     * @type {number}
     * @memberof ToolUsertoursStepShownRequest
     */
    Stepid: number;
    /**
     * Step Number
     * @type {number}
     * @memberof ToolUsertoursStepShownRequest
     */
    Stepindex: number;
    /**
     * Tour ID
     * @type {number}
     * @memberof ToolUsertoursStepShownRequest
     */
    Tourid: number;
}

/**
 * Check if a given object implements the ToolUsertoursStepShownRequest interface.
 */
export function instanceOfToolUsertoursStepShownRequest(value: object): boolean {
    if (!('Context' in value)) return false;
    if (!('Pageurl' in value)) return false;
    if (!('Stepid' in value)) return false;
    if (!('Stepindex' in value)) return false;
    if (!('Tourid' in value)) return false;
    return true;
}

export function ToolUsertoursStepShownRequestFromJSON(json: any): ToolUsertoursStepShownRequest {
    return ToolUsertoursStepShownRequestFromJSONTyped(json, false);
}

export function ToolUsertoursStepShownRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolUsertoursStepShownRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Context': json['context'],
        'Pageurl': json['pageurl'],
        'Stepid': json['stepid'],
        'Stepindex': json['stepindex'],
        'Tourid': json['tourid'],
    };
}

export function ToolUsertoursStepShownRequestToJSON(value?: ToolUsertoursStepShownRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': value['Context'],
        'pageurl': value['Pageurl'],
        'stepid': value['Stepid'],
        'stepindex': value['Stepindex'],
        'tourid': value['Tourid'],
    };
}

