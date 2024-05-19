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
 * @interface ModGlossaryViewGlossaryRequest
 */
export interface ModGlossaryViewGlossaryRequest {
    /**
     * Glossary instance ID
     * @type {number}
     * @memberof ModGlossaryViewGlossaryRequest
     */
    Id: number;
    /**
     * The mode in which the glossary is viewed
     * @type {string}
     * @memberof ModGlossaryViewGlossaryRequest
     */
    Mode: string;
}

/**
 * Check if a given object implements the ModGlossaryViewGlossaryRequest interface.
 */
export function instanceOfModGlossaryViewGlossaryRequest(value: object): boolean {
    if (!('Id' in value)) return false;
    if (!('Mode' in value)) return false;
    return true;
}

export function ModGlossaryViewGlossaryRequestFromJSON(json: any): ModGlossaryViewGlossaryRequest {
    return ModGlossaryViewGlossaryRequestFromJSONTyped(json, false);
}

export function ModGlossaryViewGlossaryRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModGlossaryViewGlossaryRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Id': json['id'],
        'Mode': json['mode'],
    };
}

export function ModGlossaryViewGlossaryRequestToJSON(value?: ModGlossaryViewGlossaryRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['Id'],
        'mode': value['Mode'],
    };
}
