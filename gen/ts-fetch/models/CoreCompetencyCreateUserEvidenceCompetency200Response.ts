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
 * @interface CoreCompetencyCreateUserEvidenceCompetency200Response
 */
export interface CoreCompetencyCreateUserEvidenceCompetency200Response {
    /**
     * competencyid
     * @type {number}
     * @memberof CoreCompetencyCreateUserEvidenceCompetency200Response
     */
    competencyid: number;
    /**
     * id
     * @type {number}
     * @memberof CoreCompetencyCreateUserEvidenceCompetency200Response
     */
    id: number;
    /**
     * timecreated
     * @type {number}
     * @memberof CoreCompetencyCreateUserEvidenceCompetency200Response
     */
    timecreated: number;
    /**
     * timemodified
     * @type {number}
     * @memberof CoreCompetencyCreateUserEvidenceCompetency200Response
     */
    timemodified: number;
    /**
     * userevidenceid
     * @type {number}
     * @memberof CoreCompetencyCreateUserEvidenceCompetency200Response
     */
    userevidenceid: number;
    /**
     * usermodified
     * @type {number}
     * @memberof CoreCompetencyCreateUserEvidenceCompetency200Response
     */
    usermodified: number;
}

/**
 * Check if a given object implements the CoreCompetencyCreateUserEvidenceCompetency200Response interface.
 */
export function instanceOfCoreCompetencyCreateUserEvidenceCompetency200Response(value: object): boolean {
    if (!('competencyid' in value)) return false;
    if (!('id' in value)) return false;
    if (!('timecreated' in value)) return false;
    if (!('timemodified' in value)) return false;
    if (!('userevidenceid' in value)) return false;
    if (!('usermodified' in value)) return false;
    return true;
}

export function CoreCompetencyCreateUserEvidenceCompetency200ResponseFromJSON(json: any): CoreCompetencyCreateUserEvidenceCompetency200Response {
    return CoreCompetencyCreateUserEvidenceCompetency200ResponseFromJSONTyped(json, false);
}

export function CoreCompetencyCreateUserEvidenceCompetency200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyCreateUserEvidenceCompetency200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'competencyid': json['competencyid'],
        'id': json['id'],
        'timecreated': json['timecreated'],
        'timemodified': json['timemodified'],
        'userevidenceid': json['userevidenceid'],
        'usermodified': json['usermodified'],
    };
}

export function CoreCompetencyCreateUserEvidenceCompetency200ResponseToJSON(value?: CoreCompetencyCreateUserEvidenceCompetency200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyid': value['competencyid'],
        'id': value['id'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'userevidenceid': value['userevidenceid'],
        'usermodified': value['usermodified'],
    };
}
