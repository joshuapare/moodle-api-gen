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
import type { CoreGroupDeleteGroupMembersRequestMembersInner } from './CoreGroupDeleteGroupMembersRequestMembersInner';
import {
    CoreGroupDeleteGroupMembersRequestMembersInnerFromJSON,
    CoreGroupDeleteGroupMembersRequestMembersInnerFromJSONTyped,
    CoreGroupDeleteGroupMembersRequestMembersInnerToJSON,
} from './CoreGroupDeleteGroupMembersRequestMembersInner';

/**
 * 
 * @export
 * @interface CoreGroupDeleteGroupMembersRequest
 */
export interface CoreGroupDeleteGroupMembersRequest {
    /**
     * 
     * @type {Array<CoreGroupDeleteGroupMembersRequestMembersInner>}
     * @memberof CoreGroupDeleteGroupMembersRequest
     */
    Members: Array<CoreGroupDeleteGroupMembersRequestMembersInner>;
}

/**
 * Check if a given object implements the CoreGroupDeleteGroupMembersRequest interface.
 */
export function instanceOfCoreGroupDeleteGroupMembersRequest(value: object): boolean {
    if (!('Members' in value)) return false;
    return true;
}

export function CoreGroupDeleteGroupMembersRequestFromJSON(json: any): CoreGroupDeleteGroupMembersRequest {
    return CoreGroupDeleteGroupMembersRequestFromJSONTyped(json, false);
}

export function CoreGroupDeleteGroupMembersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGroupDeleteGroupMembersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Members': ((json['members'] as Array<any>).map(CoreGroupDeleteGroupMembersRequestMembersInnerFromJSON)),
    };
}

export function CoreGroupDeleteGroupMembersRequestToJSON(value?: CoreGroupDeleteGroupMembersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'members': ((value['Members'] as Array<any>).map(CoreGroupDeleteGroupMembersRequestMembersInnerToJSON)),
    };
}

