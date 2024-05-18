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
 * @interface CoreGroupDeleteGroupMembersRequestMembersInner
 */
export interface CoreGroupDeleteGroupMembersRequestMembersInner {
    /**
     * group record id
     * @type {number}
     * @memberof CoreGroupDeleteGroupMembersRequestMembersInner
     */
    groupid?: number;
    /**
     * user id
     * @type {number}
     * @memberof CoreGroupDeleteGroupMembersRequestMembersInner
     */
    userid?: number;
}

/**
 * Check if a given object implements the CoreGroupDeleteGroupMembersRequestMembersInner interface.
 */
export function instanceOfCoreGroupDeleteGroupMembersRequestMembersInner(value: object): boolean {
    return true;
}

export function CoreGroupDeleteGroupMembersRequestMembersInnerFromJSON(json: any): CoreGroupDeleteGroupMembersRequestMembersInner {
    return CoreGroupDeleteGroupMembersRequestMembersInnerFromJSONTyped(json, false);
}

export function CoreGroupDeleteGroupMembersRequestMembersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGroupDeleteGroupMembersRequestMembersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'groupid': json['groupid'] == null ? undefined : json['groupid'],
        'userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function CoreGroupDeleteGroupMembersRequestMembersInnerToJSON(value?: CoreGroupDeleteGroupMembersRequestMembersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'groupid': value['groupid'],
        'userid': value['userid'],
    };
}

