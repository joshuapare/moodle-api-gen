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
 * @interface CoreAuthIsMinorRequest
 */
export interface CoreAuthIsMinorRequest {
    /**
     * Age
     * @type {number}
     * @memberof CoreAuthIsMinorRequest
     */
    age: number;
    /**
     * Country of residence
     * @type {string}
     * @memberof CoreAuthIsMinorRequest
     */
    country: string;
}

/**
 * Check if a given object implements the CoreAuthIsMinorRequest interface.
 */
export function instanceOfCoreAuthIsMinorRequest(value: object): boolean {
    if (!('age' in value)) return false;
    if (!('country' in value)) return false;
    return true;
}

export function CoreAuthIsMinorRequestFromJSON(json: any): CoreAuthIsMinorRequest {
    return CoreAuthIsMinorRequestFromJSONTyped(json, false);
}

export function CoreAuthIsMinorRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreAuthIsMinorRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'age': json['age'],
        'country': json['country'],
    };
}

export function CoreAuthIsMinorRequestToJSON(value?: CoreAuthIsMinorRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'age': value['age'],
        'country': value['country'],
    };
}

