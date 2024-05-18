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
 * @interface CoreCompetencyReorderTemplateCompetencyRequest
 */
export interface CoreCompetencyReorderTemplateCompetencyRequest {
    /**
     * The competency id we are moving
     * @type {number}
     * @memberof CoreCompetencyReorderTemplateCompetencyRequest
     */
    competencyidfrom: number;
    /**
     * The competency id we are moving to
     * @type {number}
     * @memberof CoreCompetencyReorderTemplateCompetencyRequest
     */
    competencyidto: number;
    /**
     * The template id
     * @type {number}
     * @memberof CoreCompetencyReorderTemplateCompetencyRequest
     */
    templateid: number;
}

/**
 * Check if a given object implements the CoreCompetencyReorderTemplateCompetencyRequest interface.
 */
export function instanceOfCoreCompetencyReorderTemplateCompetencyRequest(value: object): boolean {
    if (!('competencyidfrom' in value)) return false;
    if (!('competencyidto' in value)) return false;
    if (!('templateid' in value)) return false;
    return true;
}

export function CoreCompetencyReorderTemplateCompetencyRequestFromJSON(json: any): CoreCompetencyReorderTemplateCompetencyRequest {
    return CoreCompetencyReorderTemplateCompetencyRequestFromJSONTyped(json, false);
}

export function CoreCompetencyReorderTemplateCompetencyRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyReorderTemplateCompetencyRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'competencyidfrom': json['competencyidfrom'],
        'competencyidto': json['competencyidto'],
        'templateid': json['templateid'],
    };
}

export function CoreCompetencyReorderTemplateCompetencyRequestToJSON(value?: CoreCompetencyReorderTemplateCompetencyRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyidfrom': value['competencyidfrom'],
        'competencyidto': value['competencyidto'],
        'templateid': value['templateid'],
    };
}
