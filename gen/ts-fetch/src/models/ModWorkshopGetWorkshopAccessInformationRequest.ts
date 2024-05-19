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
 * @interface ModWorkshopGetWorkshopAccessInformationRequest
 */
export interface ModWorkshopGetWorkshopAccessInformationRequest {
    /**
     * Workshop instance id.
     * @type {number}
     * @memberof ModWorkshopGetWorkshopAccessInformationRequest
     */
    Workshopid: number;
}

/**
 * Check if a given object implements the ModWorkshopGetWorkshopAccessInformationRequest interface.
 */
export function instanceOfModWorkshopGetWorkshopAccessInformationRequest(value: object): boolean {
    if (!('Workshopid' in value)) return false;
    return true;
}

export function ModWorkshopGetWorkshopAccessInformationRequestFromJSON(json: any): ModWorkshopGetWorkshopAccessInformationRequest {
    return ModWorkshopGetWorkshopAccessInformationRequestFromJSONTyped(json, false);
}

export function ModWorkshopGetWorkshopAccessInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetWorkshopAccessInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Workshopid': json['workshopid'],
    };
}

export function ModWorkshopGetWorkshopAccessInformationRequestToJSON(value?: ModWorkshopGetWorkshopAccessInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'workshopid': value['Workshopid'],
    };
}

