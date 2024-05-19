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
 * @interface CoreCustomfieldDeleteFieldRequest
 */
export interface CoreCustomfieldDeleteFieldRequest {
    /**
     * Custom field ID to delete
     * @type {number}
     * @memberof CoreCustomfieldDeleteFieldRequest
     */
    Id: number;
}

/**
 * Check if a given object implements the CoreCustomfieldDeleteFieldRequest interface.
 */
export function instanceOfCoreCustomfieldDeleteFieldRequest(value: object): boolean {
    if (!('Id' in value)) return false;
    return true;
}

export function CoreCustomfieldDeleteFieldRequestFromJSON(json: any): CoreCustomfieldDeleteFieldRequest {
    return CoreCustomfieldDeleteFieldRequestFromJSONTyped(json, false);
}

export function CoreCustomfieldDeleteFieldRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCustomfieldDeleteFieldRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'],
    };
}

export function CoreCustomfieldDeleteFieldRequestToJSON(value?: CoreCustomfieldDeleteFieldRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
    };
}

