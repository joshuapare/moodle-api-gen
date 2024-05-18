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
 * @interface ModScormGetScormAttemptCountRequest
 */
export interface ModScormGetScormAttemptCountRequest {
    /**
     * Ignores attempts that haven't reported a grade/completion
     * @type {boolean}
     * @memberof ModScormGetScormAttemptCountRequest
     */
    ignoremissingcompletion?: boolean;
    /**
     * SCORM instance id
     * @type {number}
     * @memberof ModScormGetScormAttemptCountRequest
     */
    scormid: number;
    /**
     * User id
     * @type {number}
     * @memberof ModScormGetScormAttemptCountRequest
     */
    userid: number;
}

/**
 * Check if a given object implements the ModScormGetScormAttemptCountRequest interface.
 */
export function instanceOfModScormGetScormAttemptCountRequest(value: object): boolean {
    if (!('scormid' in value)) return false;
    if (!('userid' in value)) return false;
    return true;
}

export function ModScormGetScormAttemptCountRequestFromJSON(json: any): ModScormGetScormAttemptCountRequest {
    return ModScormGetScormAttemptCountRequestFromJSONTyped(json, false);
}

export function ModScormGetScormAttemptCountRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormAttemptCountRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'ignoremissingcompletion': json['ignoremissingcompletion'] == null ? undefined : json['ignoremissingcompletion'],
        'scormid': json['scormid'],
        'userid': json['userid'],
    };
}

export function ModScormGetScormAttemptCountRequestToJSON(value?: ModScormGetScormAttemptCountRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ignoremissingcompletion': value['ignoremissingcompletion'],
        'scormid': value['scormid'],
        'userid': value['userid'],
    };
}

