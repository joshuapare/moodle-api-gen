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
 * @interface ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner
 */
export interface ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner {
    /**
     * description
     * @type {string}
     * @memberof ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner
     */
    Description?: string;
    /**
     * name
     * @type {string}
     * @memberof ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner
     */
    Name?: string;
}

/**
 * Check if a given object implements the ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner interface.
 */
export function instanceOfToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner(value: object): boolean {
    return true;
}

export function ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInnerFromJSON(json: any): ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner {
    return ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInnerFromJSONTyped(json, false);
}

export function ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'] == null ? undefined : json['description'],
        'Name': json['name'] == null ? undefined : json['name'],
    };
}

export function ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInnerToJSON(value?: ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'name': value['Name'],
    };
}

