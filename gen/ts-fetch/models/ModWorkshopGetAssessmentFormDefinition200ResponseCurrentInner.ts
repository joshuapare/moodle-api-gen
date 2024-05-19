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
 * @interface ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner
 */
export interface ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner {
    /**
     * Field name.
     * @type {string}
     * @memberof ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner
     */
    name?: string;
    /**
     * Current field value.
     * @type {string}
     * @memberof ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner interface.
 */
export function instanceOfModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner(value: object): boolean {
    return true;
}

export function ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInnerFromJSON(json: any): ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner {
    return ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInnerFromJSONTyped(json, false);
}

export function ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInnerToJSON(value?: ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'value': value['value'],
    };
}

