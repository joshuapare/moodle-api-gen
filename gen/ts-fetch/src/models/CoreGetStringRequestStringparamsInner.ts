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
 * @interface CoreGetStringRequestStringparamsInner
 */
export interface CoreGetStringRequestStringparamsInner {
    /**
     * param name
     *                             - if the string expect only one $a parameter then don't send this field, just send the value.
     * @type {string}
     * @memberof CoreGetStringRequestStringparamsInner
     */
    Name?: string;
    /**
     * param value
     * @type {string}
     * @memberof CoreGetStringRequestStringparamsInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the CoreGetStringRequestStringparamsInner interface.
 */
export function instanceOfCoreGetStringRequestStringparamsInner(value: object): boolean {
    return true;
}

export function CoreGetStringRequestStringparamsInnerFromJSON(json: any): CoreGetStringRequestStringparamsInner {
    return CoreGetStringRequestStringparamsInnerFromJSONTyped(json, false);
}

export function CoreGetStringRequestStringparamsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGetStringRequestStringparamsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function CoreGetStringRequestStringparamsInnerToJSON(value?: CoreGetStringRequestStringparamsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'value': value['Value'],
    };
}
