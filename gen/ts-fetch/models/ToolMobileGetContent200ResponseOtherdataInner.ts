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
 * @interface ToolMobileGetContent200ResponseOtherdataInner
 */
export interface ToolMobileGetContent200ResponseOtherdataInner {
    /**
     * Field name.
     * @type {string}
     * @memberof ToolMobileGetContent200ResponseOtherdataInner
     */
    name?: string;
    /**
     * Field value.
     * @type {string}
     * @memberof ToolMobileGetContent200ResponseOtherdataInner
     */
    value?: string;
}

/**
 * Check if a given object implements the ToolMobileGetContent200ResponseOtherdataInner interface.
 */
export function instanceOfToolMobileGetContent200ResponseOtherdataInner(value: object): boolean {
    return true;
}

export function ToolMobileGetContent200ResponseOtherdataInnerFromJSON(json: any): ToolMobileGetContent200ResponseOtherdataInner {
    return ToolMobileGetContent200ResponseOtherdataInnerFromJSONTyped(json, false);
}

export function ToolMobileGetContent200ResponseOtherdataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolMobileGetContent200ResponseOtherdataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function ToolMobileGetContent200ResponseOtherdataInnerToJSON(value?: ToolMobileGetContent200ResponseOtherdataInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'value': value['value'],
    };
}
