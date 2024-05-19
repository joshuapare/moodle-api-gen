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
 * @interface ModDataSearchEntriesRequestAdvsearchInner
 */
export interface ModDataSearchEntriesRequestAdvsearchInner {
    /**
     * Field key for search.
     *                                                             Use fn or ln for first or last name
     * @type {string}
     * @memberof ModDataSearchEntriesRequestAdvsearchInner
     */
    Name?: string;
    /**
     * JSON encoded value for search
     * @type {string}
     * @memberof ModDataSearchEntriesRequestAdvsearchInner
     */
    Value?: string;
}

/**
 * Check if a given object implements the ModDataSearchEntriesRequestAdvsearchInner interface.
 */
export function instanceOfModDataSearchEntriesRequestAdvsearchInner(value: object): boolean {
    return true;
}

export function ModDataSearchEntriesRequestAdvsearchInnerFromJSON(json: any): ModDataSearchEntriesRequestAdvsearchInner {
    return ModDataSearchEntriesRequestAdvsearchInnerFromJSONTyped(json, false);
}

export function ModDataSearchEntriesRequestAdvsearchInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataSearchEntriesRequestAdvsearchInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Value': json['value'] == null ? undefined : json['value'],
    };
}

export function ModDataSearchEntriesRequestAdvsearchInnerToJSON(value?: ModDataSearchEntriesRequestAdvsearchInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'value': value['Value'],
    };
}

