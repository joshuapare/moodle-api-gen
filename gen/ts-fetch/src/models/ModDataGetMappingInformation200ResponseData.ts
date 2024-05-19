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
 * @interface ModDataGetMappingInformation200ResponseData
 */
export interface ModDataGetMappingInformation200ResponseData {
    /**
     * List of field names to create
     * @type {string}
     * @memberof ModDataGetMappingInformation200ResponseData
     */
    Fieldstocreate: string;
    /**
     * List of field names to remove
     * @type {string}
     * @memberof ModDataGetMappingInformation200ResponseData
     */
    Fieldstoremove: string;
    /**
     * Whether the importing needs mapping or not
     * @type {boolean}
     * @memberof ModDataGetMappingInformation200ResponseData
     */
    Needsmapping: boolean;
    /**
     * Name of the applied preset
     * @type {string}
     * @memberof ModDataGetMappingInformation200ResponseData
     */
    Presetname: string;
}

/**
 * Check if a given object implements the ModDataGetMappingInformation200ResponseData interface.
 */
export function instanceOfModDataGetMappingInformation200ResponseData(value: object): boolean {
    if (!('Fieldstocreate' in value)) return false;
    if (!('Fieldstoremove' in value)) return false;
    if (!('Needsmapping' in value)) return false;
    if (!('Presetname' in value)) return false;
    return true;
}

export function ModDataGetMappingInformation200ResponseDataFromJSON(json: any): ModDataGetMappingInformation200ResponseData {
    return ModDataGetMappingInformation200ResponseDataFromJSONTyped(json, false);
}

export function ModDataGetMappingInformation200ResponseDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModDataGetMappingInformation200ResponseData {
    if (json == null) {
        return json;
    }
    return {
        
        'Fieldstocreate': json['fieldstocreate'],
        'Fieldstoremove': json['fieldstoremove'],
        'Needsmapping': json['needsmapping'],
        'Presetname': json['presetname'],
    };
}

export function ModDataGetMappingInformation200ResponseDataToJSON(value?: ModDataGetMappingInformation200ResponseData | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'fieldstocreate': value['Fieldstocreate'],
        'fieldstoremove': value['Fieldstoremove'],
        'needsmapping': value['Needsmapping'],
        'presetname': value['Presetname'],
    };
}

