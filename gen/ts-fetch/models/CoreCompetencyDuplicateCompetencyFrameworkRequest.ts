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
 * @interface CoreCompetencyDuplicateCompetencyFrameworkRequest
 */
export interface CoreCompetencyDuplicateCompetencyFrameworkRequest {
    /**
     * Data base record id for the framework
     * @type {number}
     * @memberof CoreCompetencyDuplicateCompetencyFrameworkRequest
     */
    id: number;
}

/**
 * Check if a given object implements the CoreCompetencyDuplicateCompetencyFrameworkRequest interface.
 */
export function instanceOfCoreCompetencyDuplicateCompetencyFrameworkRequest(value: object): boolean {
    if (!('id' in value)) return false;
    return true;
}

export function CoreCompetencyDuplicateCompetencyFrameworkRequestFromJSON(json: any): CoreCompetencyDuplicateCompetencyFrameworkRequest {
    return CoreCompetencyDuplicateCompetencyFrameworkRequestFromJSONTyped(json, false);
}

export function CoreCompetencyDuplicateCompetencyFrameworkRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyDuplicateCompetencyFrameworkRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function CoreCompetencyDuplicateCompetencyFrameworkRequestToJSON(value?: CoreCompetencyDuplicateCompetencyFrameworkRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}

