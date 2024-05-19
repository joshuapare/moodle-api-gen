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
 * @interface CoreCompetencyReorderCourseCompetencyRequest
 */
export interface CoreCompetencyReorderCourseCompetencyRequest {
    /**
     * The competency id we are moving
     * @type {number}
     * @memberof CoreCompetencyReorderCourseCompetencyRequest
     */
    Competencyidfrom: number;
    /**
     * The competency id we are moving to
     * @type {number}
     * @memberof CoreCompetencyReorderCourseCompetencyRequest
     */
    Competencyidto: number;
    /**
     * The course id
     * @type {number}
     * @memberof CoreCompetencyReorderCourseCompetencyRequest
     */
    Courseid: number;
}

/**
 * Check if a given object implements the CoreCompetencyReorderCourseCompetencyRequest interface.
 */
export function instanceOfCoreCompetencyReorderCourseCompetencyRequest(value: object): boolean {
    if (!('Competencyidfrom' in value)) return false;
    if (!('Competencyidto' in value)) return false;
    if (!('Courseid' in value)) return false;
    return true;
}

export function CoreCompetencyReorderCourseCompetencyRequestFromJSON(json: any): CoreCompetencyReorderCourseCompetencyRequest {
    return CoreCompetencyReorderCourseCompetencyRequestFromJSONTyped(json, false);
}

export function CoreCompetencyReorderCourseCompetencyRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyReorderCourseCompetencyRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Competencyidfrom': json['competencyidfrom'],
        'Competencyidto': json['competencyidto'],
        'Courseid': json['courseid'],
    };
}

export function CoreCompetencyReorderCourseCompetencyRequestToJSON(value?: CoreCompetencyReorderCourseCompetencyRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyidfrom': value['Competencyidfrom'],
        'competencyidto': value['Competencyidto'],
        'courseid': value['Courseid'],
    };
}

