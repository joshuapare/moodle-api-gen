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
 * @interface ModFolderViewFolderRequest
 */
export interface ModFolderViewFolderRequest {
    /**
     * folder instance id
     * @type {number}
     * @memberof ModFolderViewFolderRequest
     */
    Folderid: number;
}

/**
 * Check if a given object implements the ModFolderViewFolderRequest interface.
 */
export function instanceOfModFolderViewFolderRequest(value: object): boolean {
    if (!('Folderid' in value)) return false;
    return true;
}

export function ModFolderViewFolderRequestFromJSON(json: any): ModFolderViewFolderRequest {
    return ModFolderViewFolderRequestFromJSONTyped(json, false);
}

export function ModFolderViewFolderRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModFolderViewFolderRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Folderid': json['folderid'],
    };
}

export function ModFolderViewFolderRequestToJSON(value?: ModFolderViewFolderRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'folderid': value['Folderid'],
    };
}
