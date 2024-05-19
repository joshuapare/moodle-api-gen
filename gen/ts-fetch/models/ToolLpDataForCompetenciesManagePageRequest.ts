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
 * @interface ToolLpDataForCompetenciesManagePageRequest
 */
export interface ToolLpDataForCompetenciesManagePageRequest {
    /**
     * The competency framework id
     * @type {number}
     * @memberof ToolLpDataForCompetenciesManagePageRequest
     */
    competencyframeworkid: number;
    /**
     * A search string
     * @type {string}
     * @memberof ToolLpDataForCompetenciesManagePageRequest
     */
    search?: string;
}

/**
 * Check if a given object implements the ToolLpDataForCompetenciesManagePageRequest interface.
 */
export function instanceOfToolLpDataForCompetenciesManagePageRequest(value: object): boolean {
    if (!('competencyframeworkid' in value)) return false;
    return true;
}

export function ToolLpDataForCompetenciesManagePageRequestFromJSON(json: any): ToolLpDataForCompetenciesManagePageRequest {
    return ToolLpDataForCompetenciesManagePageRequestFromJSONTyped(json, false);
}

export function ToolLpDataForCompetenciesManagePageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForCompetenciesManagePageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'competencyframeworkid': json['competencyframeworkid'],
        'search': json['search'] == null ? undefined : json['search'],
    };
}

export function ToolLpDataForCompetenciesManagePageRequestToJSON(value?: ToolLpDataForCompetenciesManagePageRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyframeworkid': value['competencyframeworkid'],
        'search': value['search'],
    };
}

