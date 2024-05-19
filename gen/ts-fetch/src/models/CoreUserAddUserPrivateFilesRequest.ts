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
 * @interface CoreUserAddUserPrivateFilesRequest
 */
export interface CoreUserAddUserPrivateFilesRequest {
    /**
     * draft area id
     * @type {number}
     * @memberof CoreUserAddUserPrivateFilesRequest
     */
    Draftid: number;
}

/**
 * Check if a given object implements the CoreUserAddUserPrivateFilesRequest interface.
 */
export function instanceOfCoreUserAddUserPrivateFilesRequest(value: object): boolean {
    if (!('Draftid' in value)) return false;
    return true;
}

export function CoreUserAddUserPrivateFilesRequestFromJSON(json: any): CoreUserAddUserPrivateFilesRequest {
    return CoreUserAddUserPrivateFilesRequestFromJSONTyped(json, false);
}

export function CoreUserAddUserPrivateFilesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserAddUserPrivateFilesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Draftid': json['draftid'],
    };
}

export function CoreUserAddUserPrivateFilesRequestToJSON(value?: CoreUserAddUserPrivateFilesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'draftid': value['Draftid'],
    };
}

