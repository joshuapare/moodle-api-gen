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
import type { ModWorkshopUpdateAssessmentRequestDataInner } from './ModWorkshopUpdateAssessmentRequestDataInner';
import {
    ModWorkshopUpdateAssessmentRequestDataInnerFromJSON,
    ModWorkshopUpdateAssessmentRequestDataInnerFromJSONTyped,
    ModWorkshopUpdateAssessmentRequestDataInnerToJSON,
} from './ModWorkshopUpdateAssessmentRequestDataInner';

/**
 * 
 * @export
 * @interface ModWorkshopUpdateAssessmentRequest
 */
export interface ModWorkshopUpdateAssessmentRequest {
    /**
     * Assessment id.
     * @type {number}
     * @memberof ModWorkshopUpdateAssessmentRequest
     */
    assessmentid: number;
    /**
     * 
     * @type {Array<ModWorkshopUpdateAssessmentRequestDataInner>}
     * @memberof ModWorkshopUpdateAssessmentRequest
     */
    data: Array<ModWorkshopUpdateAssessmentRequestDataInner>;
}

/**
 * Check if a given object implements the ModWorkshopUpdateAssessmentRequest interface.
 */
export function instanceOfModWorkshopUpdateAssessmentRequest(value: object): boolean {
    if (!('assessmentid' in value)) return false;
    if (!('data' in value)) return false;
    return true;
}

export function ModWorkshopUpdateAssessmentRequestFromJSON(json: any): ModWorkshopUpdateAssessmentRequest {
    return ModWorkshopUpdateAssessmentRequestFromJSONTyped(json, false);
}

export function ModWorkshopUpdateAssessmentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopUpdateAssessmentRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'assessmentid': json['assessmentid'],
        'data': ((json['data'] as Array<any>).map(ModWorkshopUpdateAssessmentRequestDataInnerFromJSON)),
    };
}

export function ModWorkshopUpdateAssessmentRequestToJSON(value?: ModWorkshopUpdateAssessmentRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assessmentid': value['assessmentid'],
        'data': ((value['data'] as Array<any>).map(ModWorkshopUpdateAssessmentRequestDataInnerToJSON)),
    };
}

