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
 * @interface CoreXapiDeleteStatesRequest
 */
export interface CoreXapiDeleteStatesRequest {
    /**
     * xAPI activity ID IRI
     * @type {string}
     * @memberof CoreXapiDeleteStatesRequest
     */
    ActivityId: string;
    /**
     * The xAPI agent json
     * @type {string}
     * @memberof CoreXapiDeleteStatesRequest
     */
    Agent: string;
    /**
     * Component name
     * @type {string}
     * @memberof CoreXapiDeleteStatesRequest
     */
    Component: string;
    /**
     * The xAPI registration UUID
     * @type {string}
     * @memberof CoreXapiDeleteStatesRequest
     */
    Registration?: string;
}

/**
 * Check if a given object implements the CoreXapiDeleteStatesRequest interface.
 */
export function instanceOfCoreXapiDeleteStatesRequest(value: object): boolean {
    if (!('ActivityId' in value)) return false;
    if (!('Agent' in value)) return false;
    if (!('Component' in value)) return false;
    return true;
}

export function CoreXapiDeleteStatesRequestFromJSON(json: any): CoreXapiDeleteStatesRequest {
    return CoreXapiDeleteStatesRequestFromJSONTyped(json, false);
}

export function CoreXapiDeleteStatesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreXapiDeleteStatesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'ActivityId': json['activityId'],
        'Agent': json['agent'],
        'Component': json['component'],
        'Registration': json['registration'] == null ? undefined : json['registration'],
    };
}

export function CoreXapiDeleteStatesRequestToJSON(value?: CoreXapiDeleteStatesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activityId': value['ActivityId'],
        'agent': value['Agent'],
        'component': value['Component'],
        'registration': value['Registration'],
    };
}

