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
 * @interface CoreCompetencyUserCompetencyViewedRequest
 */
export interface CoreCompetencyUserCompetencyViewedRequest {
    /**
     * The user competency id
     * @type {number}
     * @memberof CoreCompetencyUserCompetencyViewedRequest
     */
    Usercompetencyid: number;
}

/**
 * Check if a given object implements the CoreCompetencyUserCompetencyViewedRequest interface.
 */
export function instanceOfCoreCompetencyUserCompetencyViewedRequest(value: object): boolean {
    if (!('Usercompetencyid' in value)) return false;
    return true;
}

export function CoreCompetencyUserCompetencyViewedRequestFromJSON(json: any): CoreCompetencyUserCompetencyViewedRequest {
    return CoreCompetencyUserCompetencyViewedRequestFromJSONTyped(json, false);
}

export function CoreCompetencyUserCompetencyViewedRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyUserCompetencyViewedRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Usercompetencyid': json['usercompetencyid'],
    };
}

export function CoreCompetencyUserCompetencyViewedRequestToJSON(value?: CoreCompetencyUserCompetencyViewedRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'usercompetencyid': value['Usercompetencyid'],
    };
}
