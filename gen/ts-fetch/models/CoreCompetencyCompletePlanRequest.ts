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
 * @interface CoreCompetencyCompletePlanRequest
 */
export interface CoreCompetencyCompletePlanRequest {
    /**
     * The plan id
     * @type {number}
     * @memberof CoreCompetencyCompletePlanRequest
     */
    planid: number;
}

/**
 * Check if a given object implements the CoreCompetencyCompletePlanRequest interface.
 */
export function instanceOfCoreCompetencyCompletePlanRequest(value: object): boolean {
    if (!('planid' in value)) return false;
    return true;
}

export function CoreCompetencyCompletePlanRequestFromJSON(json: any): CoreCompetencyCompletePlanRequest {
    return CoreCompetencyCompletePlanRequestFromJSONTyped(json, false);
}

export function CoreCompetencyCompletePlanRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyCompletePlanRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'planid': json['planid'],
    };
}

export function CoreCompetencyCompletePlanRequestToJSON(value?: CoreCompetencyCompletePlanRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'planid': value['planid'],
    };
}

