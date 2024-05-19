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
 * @interface CoreCompetencyListUserPlansRequest
 */
export interface CoreCompetencyListUserPlansRequest {
    /**
     * The user ID
     * @type {number}
     * @memberof CoreCompetencyListUserPlansRequest
     */
    userid: number;
}

/**
 * Check if a given object implements the CoreCompetencyListUserPlansRequest interface.
 */
export function instanceOfCoreCompetencyListUserPlansRequest(value: object): boolean {
    if (!('userid' in value)) return false;
    return true;
}

export function CoreCompetencyListUserPlansRequestFromJSON(json: any): CoreCompetencyListUserPlansRequest {
    return CoreCompetencyListUserPlansRequestFromJSONTyped(json, false);
}

export function CoreCompetencyListUserPlansRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyListUserPlansRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'userid': json['userid'],
    };
}

export function CoreCompetencyListUserPlansRequestToJSON(value?: CoreCompetencyListUserPlansRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'userid': value['userid'],
    };
}

