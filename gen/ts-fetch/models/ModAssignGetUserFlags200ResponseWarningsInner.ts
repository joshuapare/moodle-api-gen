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
 * @interface ModAssignGetUserFlags200ResponseWarningsInner
 */
export interface ModAssignGetUserFlags200ResponseWarningsInner {
    /**
     * item is always 'assignment'
     * @type {string}
     * @memberof ModAssignGetUserFlags200ResponseWarningsInner
     */
    item?: string;
    /**
     * when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id
     * @type {number}
     * @memberof ModAssignGetUserFlags200ResponseWarningsInner
     */
    itemid?: number;
    /**
     * untranslated english message to explain the warning
     * @type {string}
     * @memberof ModAssignGetUserFlags200ResponseWarningsInner
     */
    message?: string;
    /**
     * errorcode can be 3 (no user flags found) or 1 (no permission to get user flags)
     * @type {string}
     * @memberof ModAssignGetUserFlags200ResponseWarningsInner
     */
    warningcode?: string;
}

/**
 * Check if a given object implements the ModAssignGetUserFlags200ResponseWarningsInner interface.
 */
export function instanceOfModAssignGetUserFlags200ResponseWarningsInner(value: object): boolean {
    return true;
}

export function ModAssignGetUserFlags200ResponseWarningsInnerFromJSON(json: any): ModAssignGetUserFlags200ResponseWarningsInner {
    return ModAssignGetUserFlags200ResponseWarningsInnerFromJSONTyped(json, false);
}

export function ModAssignGetUserFlags200ResponseWarningsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModAssignGetUserFlags200ResponseWarningsInner {
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

export function ModAssignGetUserFlags200ResponseWarningsInnerToJSON(value?: ModAssignGetUserFlags200ResponseWarningsInner | null): any {
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

