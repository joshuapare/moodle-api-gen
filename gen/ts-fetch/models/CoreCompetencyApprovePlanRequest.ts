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
 * @interface CoreCompetencyApprovePlanRequest
 */
export interface CoreCompetencyApprovePlanRequest {
    /**
     * The plan ID
     * @type {number}
     * @memberof CoreCompetencyApprovePlanRequest
     */
    id: number;
}

/**
 * Check if a given object implements the CoreCompetencyApprovePlanRequest interface.
 */
export function instanceOfCoreCompetencyApprovePlanRequest(value: object): boolean {
    if (!('id' in value)) return false;
    return true;
}

export function CoreCompetencyApprovePlanRequestFromJSON(json: any): CoreCompetencyApprovePlanRequest {
    return CoreCompetencyApprovePlanRequestFromJSONTyped(json, false);
}

export function CoreCompetencyApprovePlanRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyApprovePlanRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function CoreCompetencyApprovePlanRequestToJSON(value?: CoreCompetencyApprovePlanRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}
