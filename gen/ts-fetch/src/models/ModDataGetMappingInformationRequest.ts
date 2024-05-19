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
 * @interface ModDataGetMappingInformationRequest
 */
export interface ModDataGetMappingInformationRequest {
    /**
     * Id of the data activity
     * @type {number}
     * @memberof ModDataGetMappingInformationRequest
     */
    Cmid: number;
    /**
     * Preset to be imported
     * @type {string}
     * @memberof ModDataGetMappingInformationRequest
     */
    Importedpreset: string;
}

/**
 * Check if a given object implements the ModDataGetMappingInformationRequest interface.
 */
export function instanceOfModDataGetMappingInformationRequest(value: object): boolean {
    if (!('Cmid' in value)) return false;
    if (!('Importedpreset' in value)) return false;
    return true;
}

export function ModDataGetMappingInformationRequestFromJSON(json: any): ModDataGetMappingInformationRequest {
    return ModDataGetMappingInformationRequestFromJSONTyped(json, false);
}

export function ModDataGetMappingInformationRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataGetMappingInformationRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Cmid': json['cmid'],
        'Importedpreset': json['importedpreset'],
    };
}

export function ModDataGetMappingInformationRequestToJSON(value?: ModDataGetMappingInformationRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cmid': value['Cmid'],
        'importedpreset': value['Importedpreset'],
    };
}
