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
 * @interface ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner
 */
export interface ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner {
    /**
     * Dimension id.
     * @type {number}
     * @memberof ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner
     */
    Id?: number;
    /**
     * Maximum grade for the dimension.
     * @type {number}
     * @memberof ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner
     */
    Max?: number;
    /**
     * Minimum grade for the dimension.
     * @type {number}
     * @memberof ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner
     */
    Min?: number;
    /**
     * Scale items (if used).
     * @type {string}
     * @memberof ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner
     */
    Scale?: string;
    /**
     * The weight of the dimension.
     * @type {string}
     * @memberof ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner
     */
    Weight?: string;
}

/**
 * Check if a given object implements the ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner interface.
 */
export function instanceOfModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner(value: object): boolean {
    return true;
}

export function ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInnerFromJSON(json: any): ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner {
    return ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInnerFromJSONTyped(json, false);
}

export function ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'] == null ? undefined : json['id'],
        'Max': json['max'] == null ? undefined : json['max'],
        'Min': json['min'] == null ? undefined : json['min'],
        'Scale': json['scale'] == null ? undefined : json['scale'],
        'Weight': json['weight'] == null ? undefined : json['weight'],
    };
}

export function ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInnerToJSON(value?: ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
        'max': value['Max'],
        'min': value['Min'],
        'scale': value['Scale'],
        'weight': value['Weight'],
    };
}
