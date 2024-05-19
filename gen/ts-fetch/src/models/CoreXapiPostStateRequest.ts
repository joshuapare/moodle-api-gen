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
 * @interface CoreXapiPostStateRequest
 */
export interface CoreXapiPostStateRequest {
    /**
     * xAPI activity ID IRI
     * @type {string}
     * @memberof CoreXapiPostStateRequest
     */
    ActivityId: string;
    /**
     * The xAPI agent json
     * @type {string}
     * @memberof CoreXapiPostStateRequest
     */
    Agent: string;
    /**
     * Component name
     * @type {string}
     * @memberof CoreXapiPostStateRequest
     */
    Component: string;
    /**
     * The xAPI registration UUID
     * @type {string}
     * @memberof CoreXapiPostStateRequest
     */
    Registration?: string;
    /**
     * JSON object with the state data
     * @type {string}
     * @memberof CoreXapiPostStateRequest
     */
    StateData: string;
    /**
     * The xAPI state ID
     * @type {string}
     * @memberof CoreXapiPostStateRequest
     */
    StateId: string;
}

/**
 * Check if a given object implements the CoreXapiPostStateRequest interface.
 */
export function instanceOfCoreXapiPostStateRequest(value: object): boolean {
    if (!('ActivityId' in value)) return false;
    if (!('Agent' in value)) return false;
    if (!('Component' in value)) return false;
    if (!('StateData' in value)) return false;
    if (!('StateId' in value)) return false;
    return true;
}

export function CoreXapiPostStateRequestFromJSON(json: any): CoreXapiPostStateRequest {
    return CoreXapiPostStateRequestFromJSONTyped(json, false);
}

export function CoreXapiPostStateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreXapiPostStateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'ActivityId': json['activityId'],
        'Agent': json['agent'],
        'Component': json['component'],
        'Registration': json['registration'] == null ? undefined : json['registration'],
        'StateData': json['stateData'],
        'StateId': json['stateId'],
    };
}

export function CoreXapiPostStateRequestToJSON(value?: CoreXapiPostStateRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'activityId': value['ActivityId'],
        'agent': value['Agent'],
        'component': value['Component'],
        'registration': value['Registration'],
        'stateData': value['StateData'],
        'stateId': value['StateId'],
    };
}

