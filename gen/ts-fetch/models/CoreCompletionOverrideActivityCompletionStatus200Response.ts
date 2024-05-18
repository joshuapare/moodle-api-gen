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
 * @interface CoreCompletionOverrideActivityCompletionStatus200Response
 */
export interface CoreCompletionOverrideActivityCompletionStatus200Response {
    /**
     * The course module id
     * @type {number}
     * @memberof CoreCompletionOverrideActivityCompletionStatus200Response
     */
    cmid: number;
    /**
     * The user id who has overriden the status, or null
     * @type {number}
     * @memberof CoreCompletionOverrideActivityCompletionStatus200Response
     */
    overrideby: number;
    /**
     * The current completion state.
     * @type {number}
     * @memberof CoreCompletionOverrideActivityCompletionStatus200Response
     */
    state: number;
    /**
     * time of completion
     * @type {number}
     * @memberof CoreCompletionOverrideActivityCompletionStatus200Response
     */
    timecompleted: number;
    /**
     * type of tracking:
     *                                                                     0 means none, 1 manual, 2 automatic
     * @type {number}
     * @memberof CoreCompletionOverrideActivityCompletionStatus200Response
     */
    tracking: number;
    /**
     * The user id to which the completion info belongs
     * @type {number}
     * @memberof CoreCompletionOverrideActivityCompletionStatus200Response
     */
    userid: number;
}

/**
 * Check if a given object implements the CoreCompletionOverrideActivityCompletionStatus200Response interface.
 */
export function instanceOfCoreCompletionOverrideActivityCompletionStatus200Response(value: object): boolean {
    if (!('cmid' in value)) return false;
    if (!('overrideby' in value)) return false;
    if (!('state' in value)) return false;
    if (!('timecompleted' in value)) return false;
    if (!('tracking' in value)) return false;
    if (!('userid' in value)) return false;
    return true;
}

export function CoreCompletionOverrideActivityCompletionStatus200ResponseFromJSON(json: any): CoreCompletionOverrideActivityCompletionStatus200Response {
    return CoreCompletionOverrideActivityCompletionStatus200ResponseFromJSONTyped(json, false);
}

export function CoreCompletionOverrideActivityCompletionStatus200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompletionOverrideActivityCompletionStatus200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'cmid': json['cmid'],
        'overrideby': json['overrideby'],
        'state': json['state'],
        'timecompleted': json['timecompleted'],
        'tracking': json['tracking'],
        'userid': json['userid'],
    };
}

export function CoreCompletionOverrideActivityCompletionStatus200ResponseToJSON(value?: CoreCompletionOverrideActivityCompletionStatus200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cmid': value['cmid'],
        'overrideby': value['overrideby'],
        'state': value['state'],
        'timecompleted': value['timecompleted'],
        'tracking': value['tracking'],
        'userid': value['userid'],
    };
}

