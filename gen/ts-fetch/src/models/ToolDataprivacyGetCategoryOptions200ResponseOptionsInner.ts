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
 * @interface ToolDataprivacyGetCategoryOptions200ResponseOptionsInner
 */
export interface ToolDataprivacyGetCategoryOptions200ResponseOptionsInner {
    /**
     * The category ID
     * @type {number}
     * @memberof ToolDataprivacyGetCategoryOptions200ResponseOptionsInner
     */
    Id?: number;
    /**
     * The category name
     * @type {string}
     * @memberof ToolDataprivacyGetCategoryOptions200ResponseOptionsInner
     */
    Name?: string;
}

/**
 * Check if a given object implements the ToolDataprivacyGetCategoryOptions200ResponseOptionsInner interface.
 */
export function instanceOfToolDataprivacyGetCategoryOptions200ResponseOptionsInner(value: object): boolean {
    return true;
}

export function ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerFromJSON(json: any): ToolDataprivacyGetCategoryOptions200ResponseOptionsInner {
    return ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerFromJSONTyped(json, false);
}

export function ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyGetCategoryOptions200ResponseOptionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'] == null ? undefined : json['id'],
        'Name': json['name'] == null ? undefined : json['name'],
    };
}

export function ToolDataprivacyGetCategoryOptions200ResponseOptionsInnerToJSON(value?: ToolDataprivacyGetCategoryOptions200ResponseOptionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
        'name': value['Name'],
    };
}
