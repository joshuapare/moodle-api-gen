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
 * @interface ModChatViewSessionsRequest
 */
export interface ModChatViewSessionsRequest {
    /**
     * Course module id
     * @type {number}
     * @memberof ModChatViewSessionsRequest
     */
    cmid: number;
    /**
     * Session end time
     * @type {number}
     * @memberof ModChatViewSessionsRequest
     */
    end?: number;
    /**
     * Session start time
     * @type {number}
     * @memberof ModChatViewSessionsRequest
     */
    start?: number;
}

/**
 * Check if a given object implements the ModChatViewSessionsRequest interface.
 */
export function instanceOfModChatViewSessionsRequest(value: object): boolean {
    if (!('cmid' in value)) return false;
    return true;
}

export function ModChatViewSessionsRequestFromJSON(json: any): ModChatViewSessionsRequest {
    return ModChatViewSessionsRequestFromJSONTyped(json, false);
}

export function ModChatViewSessionsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModChatViewSessionsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'cmid': json['cmid'],
        'end': json['end'] == null ? undefined : json['end'],
        'start': json['start'] == null ? undefined : json['start'],
    };
}

export function ModChatViewSessionsRequestToJSON(value?: ModChatViewSessionsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cmid': value['cmid'],
        'end': value['end'],
        'start': value['start'],
    };
}
