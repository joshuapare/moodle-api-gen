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
import type { CoreUserSearchIdentity200ResponseListInner } from './CoreUserSearchIdentity200ResponseListInner';
import {
    CoreUserSearchIdentity200ResponseListInnerFromJSON,
    CoreUserSearchIdentity200ResponseListInnerFromJSONTyped,
    CoreUserSearchIdentity200ResponseListInnerToJSON,
} from './CoreUserSearchIdentity200ResponseListInner';

/**
 * 
 * @export
 * @interface CoreUserSearchIdentity200Response
 */
export interface CoreUserSearchIdentity200Response {
    /**
     * 
     * @type {Array<CoreUserSearchIdentity200ResponseListInner>}
     * @memberof CoreUserSearchIdentity200Response
     */
    list: Array<CoreUserSearchIdentity200ResponseListInner>;
    /**
     * Configured maximum users per page.
     * @type {number}
     * @memberof CoreUserSearchIdentity200Response
     */
    maxusersperpage: number;
    /**
     * Were there more records than maxusersperpage found?
     * @type {boolean}
     * @memberof CoreUserSearchIdentity200Response
     */
    overflow: boolean;
}

/**
 * Check if a given object implements the CoreUserSearchIdentity200Response interface.
 */
export function instanceOfCoreUserSearchIdentity200Response(value: object): boolean {
    if (!('list' in value)) return false;
    if (!('maxusersperpage' in value)) return false;
    if (!('overflow' in value)) return false;
    return true;
}

export function CoreUserSearchIdentity200ResponseFromJSON(json: any): CoreUserSearchIdentity200Response {
    return CoreUserSearchIdentity200ResponseFromJSONTyped(json, false);
}

export function CoreUserSearchIdentity200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserSearchIdentity200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'list': ((json['list'] as Array<any>).map(CoreUserSearchIdentity200ResponseListInnerFromJSON)),
        'maxusersperpage': json['maxusersperpage'],
        'overflow': json['overflow'],
    };
}

export function CoreUserSearchIdentity200ResponseToJSON(value?: CoreUserSearchIdentity200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'list': ((value['list'] as Array<any>).map(CoreUserSearchIdentity200ResponseListInnerToJSON)),
        'maxusersperpage': value['maxusersperpage'],
        'overflow': value['overflow'],
    };
}

