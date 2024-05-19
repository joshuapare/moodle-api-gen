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
 * @interface ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
 */
export interface ModLtiGetToolTypesAndProxies200ResponseTypesInnerState {
    /**
     * Is the state configured
     * @type {boolean}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
     */
    Configured: boolean;
    /**
     * Is the state pending
     * @type {boolean}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
     */
    Pending: boolean;
    /**
     * Is the state rejected
     * @type {boolean}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
     */
    Rejected: boolean;
    /**
     * Tool type state name string
     * @type {string}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
     */
    Text: string;
    /**
     * Is the state unknown
     * @type {boolean}
     * @memberof ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
     */
    Unknown: boolean;
}

/**
 * Check if a given object implements the ModLtiGetToolTypesAndProxies200ResponseTypesInnerState interface.
 */
export function instanceOfModLtiGetToolTypesAndProxies200ResponseTypesInnerState(value: object): boolean {
    if (!('Configured' in value)) return false;
    if (!('Pending' in value)) return false;
    if (!('Rejected' in value)) return false;
    if (!('Text' in value)) return false;
    if (!('Unknown' in value)) return false;
    return true;
}

export function ModLtiGetToolTypesAndProxies200ResponseTypesInnerStateFromJSON(json: any): ModLtiGetToolTypesAndProxies200ResponseTypesInnerState {
    return ModLtiGetToolTypesAndProxies200ResponseTypesInnerStateFromJSONTyped(json, false);
}

export function ModLtiGetToolTypesAndProxies200ResponseTypesInnerStateFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiGetToolTypesAndProxies200ResponseTypesInnerState {
    if (json == null) {
        return json;
    }
    return {
        
        'Configured': json['configured'],
        'Pending': json['pending'],
        'Rejected': json['rejected'],
        'Text': json['text'],
        'Unknown': json['unknown'],
    };
}

export function ModLtiGetToolTypesAndProxies200ResponseTypesInnerStateToJSON(value?: ModLtiGetToolTypesAndProxies200ResponseTypesInnerState | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'configured': value['Configured'],
        'pending': value['Pending'],
        'rejected': value['Rejected'],
        'text': value['Text'],
        'unknown': value['Unknown'],
    };
}
