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
 * @interface CoreFormGetFiletypesBrowserDataRequest
 */
export interface CoreFormGetFiletypesBrowserDataRequest {
    /**
     * Allows to select All file types, does not apply with onlytypes are set.
     * @type {boolean}
     * @memberof CoreFormGetFiletypesBrowserDataRequest
     */
    Allowall?: boolean;
    /**
     * Current types that should be selected.
     * @type {string}
     * @memberof CoreFormGetFiletypesBrowserDataRequest
     */
    Current?: string;
    /**
     * Limit the browser to the given groups and extensions
     * @type {string}
     * @memberof CoreFormGetFiletypesBrowserDataRequest
     */
    Onlytypes?: string;
}

/**
 * Check if a given object implements the CoreFormGetFiletypesBrowserDataRequest interface.
 */
export function instanceOfCoreFormGetFiletypesBrowserDataRequest(value: object): boolean {
    return true;
}

export function CoreFormGetFiletypesBrowserDataRequestFromJSON(json: any): CoreFormGetFiletypesBrowserDataRequest {
    return CoreFormGetFiletypesBrowserDataRequestFromJSONTyped(json, false);
}

export function CoreFormGetFiletypesBrowserDataRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreFormGetFiletypesBrowserDataRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Allowall': json['allowall'] == null ? undefined : json['allowall'],
        'Current': json['current'] == null ? undefined : json['current'],
        'Onlytypes': json['onlytypes'] == null ? undefined : json['onlytypes'],
    };
}

export function CoreFormGetFiletypesBrowserDataRequestToJSON(value?: CoreFormGetFiletypesBrowserDataRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'allowall': value['Allowall'],
        'current': value['Current'],
        'onlytypes': value['Onlytypes'],
    };
}
