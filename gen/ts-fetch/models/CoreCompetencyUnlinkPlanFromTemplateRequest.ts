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
 * @interface CoreCompetencyUnlinkPlanFromTemplateRequest
 */
export interface CoreCompetencyUnlinkPlanFromTemplateRequest {
    /**
     * Data base record id for the plan
     * @type {number}
     * @memberof CoreCompetencyUnlinkPlanFromTemplateRequest
     */
    planid: number;
}

/**
 * Check if a given object implements the CoreCompetencyUnlinkPlanFromTemplateRequest interface.
 */
export function instanceOfCoreCompetencyUnlinkPlanFromTemplateRequest(value: object): boolean {
    if (!('planid' in value)) return false;
    return true;
}

export function CoreCompetencyUnlinkPlanFromTemplateRequestFromJSON(json: any): CoreCompetencyUnlinkPlanFromTemplateRequest {
    return CoreCompetencyUnlinkPlanFromTemplateRequestFromJSONTyped(json, false);
}

export function CoreCompetencyUnlinkPlanFromTemplateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyUnlinkPlanFromTemplateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'planid': json['planid'],
    };
}

export function CoreCompetencyUnlinkPlanFromTemplateRequestToJSON(value?: CoreCompetencyUnlinkPlanFromTemplateRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'planid': value['planid'],
    };
}
