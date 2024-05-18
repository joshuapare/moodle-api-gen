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
 * @interface CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner
 */
export interface CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner {
    /**
     * Name of the filter option
     * @type {string}
     * @memberof CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner
     */
    name?: string;
    /**
     * Value of the filter option
     * @type {string}
     * @memberof CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner
     */
    value?: string;
}

/**
 * Check if a given object implements the CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner interface.
 */
export function instanceOfCoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner(value: object): boolean {
    return true;
}

export function CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInnerFromJSON(json: any): CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner {
    return CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInnerFromJSONTyped(json, false);
}

export function CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInnerToJSON(value?: CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'value': value['value'],
    };
}
