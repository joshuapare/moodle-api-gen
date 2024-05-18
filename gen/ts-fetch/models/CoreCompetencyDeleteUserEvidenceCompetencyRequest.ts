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
 * @interface CoreCompetencyDeleteUserEvidenceCompetencyRequest
 */
export interface CoreCompetencyDeleteUserEvidenceCompetencyRequest {
    /**
     * The competency ID.
     * @type {number}
     * @memberof CoreCompetencyDeleteUserEvidenceCompetencyRequest
     */
    competencyid: number;
    /**
     * The user evidence ID.
     * @type {number}
     * @memberof CoreCompetencyDeleteUserEvidenceCompetencyRequest
     */
    userevidenceid: number;
}

/**
 * Check if a given object implements the CoreCompetencyDeleteUserEvidenceCompetencyRequest interface.
 */
export function instanceOfCoreCompetencyDeleteUserEvidenceCompetencyRequest(value: object): boolean {
    if (!('competencyid' in value)) return false;
    if (!('userevidenceid' in value)) return false;
    return true;
}

export function CoreCompetencyDeleteUserEvidenceCompetencyRequestFromJSON(json: any): CoreCompetencyDeleteUserEvidenceCompetencyRequest {
    return CoreCompetencyDeleteUserEvidenceCompetencyRequestFromJSONTyped(json, false);
}

export function CoreCompetencyDeleteUserEvidenceCompetencyRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyDeleteUserEvidenceCompetencyRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'competencyid': json['competencyid'],
        'userevidenceid': json['userevidenceid'],
    };
}

export function CoreCompetencyDeleteUserEvidenceCompetencyRequestToJSON(value?: CoreCompetencyDeleteUserEvidenceCompetencyRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyid': value['competencyid'],
        'userevidenceid': value['userevidenceid'],
    };
}

