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
 * @interface CoreCustomfieldMoveFieldRequest
 */
export interface CoreCustomfieldMoveFieldRequest {
    /**
     * Id of the field before which it needs to be moved
     * @type {number}
     * @memberof CoreCustomfieldMoveFieldRequest
     */
    beforeid?: number;
    /**
     * New parent category id
     * @type {number}
     * @memberof CoreCustomfieldMoveFieldRequest
     */
    categoryid: number;
    /**
     * Id of the field to move
     * @type {number}
     * @memberof CoreCustomfieldMoveFieldRequest
     */
    id: number;
}

/**
 * Check if a given object implements the CoreCustomfieldMoveFieldRequest interface.
 */
export function instanceOfCoreCustomfieldMoveFieldRequest(value: object): boolean {
    if (!('categoryid' in value)) return false;
    if (!('id' in value)) return false;
    return true;
}

export function CoreCustomfieldMoveFieldRequestFromJSON(json: any): CoreCustomfieldMoveFieldRequest {
    return CoreCustomfieldMoveFieldRequestFromJSONTyped(json, false);
}

export function CoreCustomfieldMoveFieldRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCustomfieldMoveFieldRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'beforeid': json['beforeid'] == null ? undefined : json['beforeid'],
        'categoryid': json['categoryid'],
        'id': json['id'],
    };
}

export function CoreCustomfieldMoveFieldRequestToJSON(value?: CoreCustomfieldMoveFieldRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'beforeid': value['beforeid'],
        'categoryid': value['categoryid'],
        'id': value['id'],
    };
}

