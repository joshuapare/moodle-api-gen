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
 * @interface CoreCompetencyCountCourseModuleCompetenciesRequest
 */
export interface CoreCompetencyCountCourseModuleCompetenciesRequest {
    /**
     * The course module id
     * @type {number}
     * @memberof CoreCompetencyCountCourseModuleCompetenciesRequest
     */
    cmid: number;
}

/**
 * Check if a given object implements the CoreCompetencyCountCourseModuleCompetenciesRequest interface.
 */
export function instanceOfCoreCompetencyCountCourseModuleCompetenciesRequest(value: object): boolean {
    if (!('cmid' in value)) return false;
    return true;
}

export function CoreCompetencyCountCourseModuleCompetenciesRequestFromJSON(json: any): CoreCompetencyCountCourseModuleCompetenciesRequest {
    return CoreCompetencyCountCourseModuleCompetenciesRequestFromJSONTyped(json, false);
}

export function CoreCompetencyCountCourseModuleCompetenciesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyCountCourseModuleCompetenciesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'cmid': json['cmid'],
    };
}

export function CoreCompetencyCountCourseModuleCompetenciesRequestToJSON(value?: CoreCompetencyCountCourseModuleCompetenciesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cmid': value['cmid'],
    };
}

