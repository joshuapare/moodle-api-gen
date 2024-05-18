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
 * @interface CoreXapiDeleteStateRequest
 */
export interface CoreXapiDeleteStateRequest {
    /**
     * xAPI activity ID IRI
     * @type {string}
     * @memberof CoreXapiDeleteStateRequest
     */
    activityId: string;
    /**
     * The xAPI agent json
     * @type {string}
     * @memberof CoreXapiDeleteStateRequest
     */
    agent: string;
    /**
     * Component name
     * @type {string}
     * @memberof CoreXapiDeleteStateRequest
     */
    component: string;
    /**
     * The xAPI registration UUID
     * @type {string}
     * @memberof CoreXapiDeleteStateRequest
     */
    registration?: string;
    /**
     * The xAPI state ID
     * @type {string}
     * @memberof CoreXapiDeleteStateRequest
     */
    stateId: string;
}

/**
 * Check if a given object implements the CoreXapiDeleteStateRequest interface.
 */
export function instanceOfCoreXapiDeleteStateRequest(value: object): boolean {
    if (!('activityId' in value)) return false;
    if (!('agent' in value)) return false;
    if (!('component' in value)) return false;
    if (!('stateId' in value)) return false;
    return true;
}

export function CoreXapiDeleteStateRequestFromJSON(json: any): CoreXapiDeleteStateRequest {
    return CoreXapiDeleteStateRequestFromJSONTyped(json, false);
}

export function CoreXapiDeleteStateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreXapiDeleteStateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'activityId': json['activityId'],
        'agent': json['agent'],
        'component': json['component'],
        'registration': json['registration'] == null ? undefined : json['registration'],
        'stateId': json['stateId'],
    };
}

export function CoreXapiDeleteStateRequestToJSON(value?: CoreXapiDeleteStateRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activityId': value['activityId'],
        'agent': value['agent'],
        'component': value['component'],
        'registration': value['registration'],
        'stateId': value['stateId'],
    };
}
