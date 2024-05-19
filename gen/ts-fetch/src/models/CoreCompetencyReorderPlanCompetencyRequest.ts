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
 * @interface CoreCompetencyReorderPlanCompetencyRequest
 */
export interface CoreCompetencyReorderPlanCompetencyRequest {
    /**
     * The competency id we are moving
     * @type {number}
     * @memberof CoreCompetencyReorderPlanCompetencyRequest
     */
    Competencyidfrom: number;
    /**
     * The competency id we are moving to
     * @type {number}
     * @memberof CoreCompetencyReorderPlanCompetencyRequest
     */
    Competencyidto: number;
    /**
     * The plan id
     * @type {number}
     * @memberof CoreCompetencyReorderPlanCompetencyRequest
     */
    Planid: number;
}

/**
 * Check if a given object implements the CoreCompetencyReorderPlanCompetencyRequest interface.
 */
export function instanceOfCoreCompetencyReorderPlanCompetencyRequest(value: object): boolean {
    if (!('Competencyidfrom' in value)) return false;
    if (!('Competencyidto' in value)) return false;
    if (!('Planid' in value)) return false;
    return true;
}

export function CoreCompetencyReorderPlanCompetencyRequestFromJSON(json: any): CoreCompetencyReorderPlanCompetencyRequest {
    return CoreCompetencyReorderPlanCompetencyRequestFromJSONTyped(json, false);
}

export function CoreCompetencyReorderPlanCompetencyRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyReorderPlanCompetencyRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Competencyidfrom': json['competencyidfrom'],
        'Competencyidto': json['competencyidto'],
        'Planid': json['planid'],
    };
}

export function CoreCompetencyReorderPlanCompetencyRequestToJSON(value?: CoreCompetencyReorderPlanCompetencyRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyidfrom': value['Competencyidfrom'],
        'competencyidto': value['Competencyidto'],
        'planid': value['Planid'],
    };
}
