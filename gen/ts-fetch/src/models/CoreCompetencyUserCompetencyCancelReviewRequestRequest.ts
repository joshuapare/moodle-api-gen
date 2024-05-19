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
 * @interface CoreCompetencyUserCompetencyCancelReviewRequestRequest
 */
export interface CoreCompetencyUserCompetencyCancelReviewRequestRequest {
    /**
     * The competency ID
     * @type {number}
     * @memberof CoreCompetencyUserCompetencyCancelReviewRequestRequest
     */
    Competencyid: number;
    /**
     * The user ID
     * @type {number}
     * @memberof CoreCompetencyUserCompetencyCancelReviewRequestRequest
     */
    Userid: number;
}

/**
 * Check if a given object implements the CoreCompetencyUserCompetencyCancelReviewRequestRequest interface.
 */
export function instanceOfCoreCompetencyUserCompetencyCancelReviewRequestRequest(value: object): boolean {
    if (!('Competencyid' in value)) return false;
    if (!('Userid' in value)) return false;
    return true;
}

export function CoreCompetencyUserCompetencyCancelReviewRequestRequestFromJSON(json: any): CoreCompetencyUserCompetencyCancelReviewRequestRequest {
    return CoreCompetencyUserCompetencyCancelReviewRequestRequestFromJSONTyped(json, false);
}

export function CoreCompetencyUserCompetencyCancelReviewRequestRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyUserCompetencyCancelReviewRequestRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Competencyid': json['competencyid'],
        'Userid': json['userid'],
    };
}

export function CoreCompetencyUserCompetencyCancelReviewRequestRequestToJSON(value?: CoreCompetencyUserCompetencyCancelReviewRequestRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyid': value['Competencyid'],
        'userid': value['Userid'],
    };
}
