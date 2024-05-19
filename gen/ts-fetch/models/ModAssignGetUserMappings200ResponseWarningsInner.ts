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
 * warning
 * @export
 * @interface ModAssignGetUserMappings200ResponseWarningsInner
 */
export interface ModAssignGetUserMappings200ResponseWarningsInner {
    /**
     * item is always 'assignment'
     * @type {string}
     * @memberof ModAssignGetUserMappings200ResponseWarningsInner
     */
    item?: string;
    /**
     * when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id
     * @type {number}
     * @memberof ModAssignGetUserMappings200ResponseWarningsInner
     */
    itemid?: number;
    /**
     * untranslated english message to explain the warning
     * @type {string}
     * @memberof ModAssignGetUserMappings200ResponseWarningsInner
     */
    message?: string;
    /**
     * errorcode can be 3 (no user mappings found) or 1 (no permission to get user mappings)
     * @type {string}
     * @memberof ModAssignGetUserMappings200ResponseWarningsInner
     */
    warningcode?: string;
}

/**
 * Check if a given object implements the ModAssignGetUserMappings200ResponseWarningsInner interface.
 */
export function instanceOfModAssignGetUserMappings200ResponseWarningsInner(value: object): boolean {
    return true;
}

export function ModAssignGetUserMappings200ResponseWarningsInnerFromJSON(json: any): ModAssignGetUserMappings200ResponseWarningsInner {
    return ModAssignGetUserMappings200ResponseWarningsInnerFromJSONTyped(json, false);
}

export function ModAssignGetUserMappings200ResponseWarningsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetUserMappings200ResponseWarningsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'item': json['item'] == null ? undefined : json['item'],
        'itemid': json['itemid'] == null ? undefined : json['itemid'],
        'message': json['message'] == null ? undefined : json['message'],
        'warningcode': json['warningcode'] == null ? undefined : json['warningcode'],
    };
}

export function ModAssignGetUserMappings200ResponseWarningsInnerToJSON(value?: ModAssignGetUserMappings200ResponseWarningsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'item': value['item'],
        'itemid': value['itemid'],
        'message': value['message'],
        'warningcode': value['warningcode'],
    };
}

