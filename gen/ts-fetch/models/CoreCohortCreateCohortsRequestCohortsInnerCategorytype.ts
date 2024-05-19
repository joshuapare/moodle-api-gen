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
 * @interface CoreCohortCreateCohortsRequestCohortsInnerCategorytype
 */
export interface CoreCohortCreateCohortsRequestCohortsInnerCategorytype {
    /**
     * the name of the field: id (numeric value
     *                                         of course category id) or idnumber (alphanumeric value of idnumber course category)
     *                                         or system (value ignored)
     * @type {string}
     * @memberof CoreCohortCreateCohortsRequestCohortsInnerCategorytype
     */
    type: string;
    /**
     * the value of the categorytype
     * @type {string}
     * @memberof CoreCohortCreateCohortsRequestCohortsInnerCategorytype
     */
    value: string;
}

/**
 * Check if a given object implements the CoreCohortCreateCohortsRequestCohortsInnerCategorytype interface.
 */
export function instanceOfCoreCohortCreateCohortsRequestCohortsInnerCategorytype(value: object): boolean {
    if (!('type' in value)) return false;
    if (!('value' in value)) return false;
    return true;
}

export function CoreCohortCreateCohortsRequestCohortsInnerCategorytypeFromJSON(json: any): CoreCohortCreateCohortsRequestCohortsInnerCategorytype {
    return CoreCohortCreateCohortsRequestCohortsInnerCategorytypeFromJSONTyped(json, false);
}

export function CoreCohortCreateCohortsRequestCohortsInnerCategorytypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCohortCreateCohortsRequestCohortsInnerCategorytype {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'],
        'value': json['value'],
    };
}

export function CoreCohortCreateCohortsRequestCohortsInnerCategorytypeToJSON(value?: CoreCohortCreateCohortsRequestCohortsInnerCategorytype | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': value['type'],
        'value': value['value'],
    };
}

