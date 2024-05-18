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
 * @interface ModDataDeleteSavedPresetRequest
 */
export interface ModDataDeleteSavedPresetRequest {
    /**
     * Id of the data activity
     * @type {number}
     * @memberof ModDataDeleteSavedPresetRequest
     */
    dataid: number;
    /**
     * 
     * @type {Array<object>}
     * @memberof ModDataDeleteSavedPresetRequest
     */
    presetnames: Array<object>;
}

/**
 * Check if a given object implements the ModDataDeleteSavedPresetRequest interface.
 */
export function instanceOfModDataDeleteSavedPresetRequest(value: object): boolean {
    if (!('dataid' in value)) return false;
    if (!('presetnames' in value)) return false;
    return true;
}

export function ModDataDeleteSavedPresetRequestFromJSON(json: any): ModDataDeleteSavedPresetRequest {
    return ModDataDeleteSavedPresetRequestFromJSONTyped(json, false);
}

export function ModDataDeleteSavedPresetRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataDeleteSavedPresetRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'dataid': json['dataid'],
        'presetnames': json['presetnames'],
    };
}

export function ModDataDeleteSavedPresetRequestToJSON(value?: ModDataDeleteSavedPresetRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'dataid': value['dataid'],
        'presetnames': value['presetnames'],
    };
}

