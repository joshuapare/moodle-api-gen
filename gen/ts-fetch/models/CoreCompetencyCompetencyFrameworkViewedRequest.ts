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
 * @interface CoreCompetencyCompetencyFrameworkViewedRequest
 */
export interface CoreCompetencyCompetencyFrameworkViewedRequest {
    /**
     * The competency framework id
     * @type {number}
     * @memberof CoreCompetencyCompetencyFrameworkViewedRequest
     */
    id: number;
}

/**
 * Check if a given object implements the CoreCompetencyCompetencyFrameworkViewedRequest interface.
 */
export function instanceOfCoreCompetencyCompetencyFrameworkViewedRequest(value: object): boolean {
    if (!('id' in value)) return false;
    return true;
}

export function CoreCompetencyCompetencyFrameworkViewedRequestFromJSON(json: any): CoreCompetencyCompetencyFrameworkViewedRequest {
    return CoreCompetencyCompetencyFrameworkViewedRequestFromJSONTyped(json, false);
}

export function CoreCompetencyCompetencyFrameworkViewedRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyCompetencyFrameworkViewedRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function CoreCompetencyCompetencyFrameworkViewedRequestToJSON(value?: CoreCompetencyCompetencyFrameworkViewedRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}

