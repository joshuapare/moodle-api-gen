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
 * @interface ModWorkshopGetReviewerAssessmentsRequest
 */
export interface ModWorkshopGetReviewerAssessmentsRequest {
    /**
     * User id who did the assessment review (empty or 0 for current user).
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessmentsRequest
     */
    Userid?: number;
    /**
     * Workshop instance id.
     * @type {number}
     * @memberof ModWorkshopGetReviewerAssessmentsRequest
     */
    Workshopid: number;
}

/**
 * Check if a given object implements the ModWorkshopGetReviewerAssessmentsRequest interface.
 */
export function instanceOfModWorkshopGetReviewerAssessmentsRequest(value: object): boolean {
    if (!('Workshopid' in value)) return false;
    return true;
}

export function ModWorkshopGetReviewerAssessmentsRequestFromJSON(json: any): ModWorkshopGetReviewerAssessmentsRequest {
    return ModWorkshopGetReviewerAssessmentsRequestFromJSONTyped(json, false);
}

export function ModWorkshopGetReviewerAssessmentsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetReviewerAssessmentsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Workshopid': json['workshopid'],
    };
}

export function ModWorkshopGetReviewerAssessmentsRequestToJSON(value?: ModWorkshopGetReviewerAssessmentsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'userid': value['Userid'],
        'workshopid': value['Workshopid'],
    };
}

