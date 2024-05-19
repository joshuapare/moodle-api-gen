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
import type { CoreGetStringsRequestStringsInner } from './CoreGetStringsRequestStringsInner';
import {
    CoreGetStringsRequestStringsInnerFromJSON,
    CoreGetStringsRequestStringsInnerFromJSONTyped,
    CoreGetStringsRequestStringsInnerToJSON,
} from './CoreGetStringsRequestStringsInner';

/**
 * 
 * @export
 * @interface CoreGetStringsRequest
 */
export interface CoreGetStringsRequest {
    /**
     * 
     * @type {Array<CoreGetStringsRequestStringsInner>}
     * @memberof CoreGetStringsRequest
     */
    strings: Array<CoreGetStringsRequestStringsInner>;
}

/**
 * Check if a given object implements the CoreGetStringsRequest interface.
 */
export function instanceOfCoreGetStringsRequest(value: object): boolean {
    if (!('strings' in value)) return false;
    return true;
}

export function CoreGetStringsRequestFromJSON(json: any): CoreGetStringsRequest {
    return CoreGetStringsRequestFromJSONTyped(json, false);
}

export function CoreGetStringsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGetStringsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'strings': ((json['strings'] as Array<any>).map(CoreGetStringsRequestStringsInnerFromJSON)),
    };
}

export function CoreGetStringsRequestToJSON(value?: CoreGetStringsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'strings': ((value['strings'] as Array<any>).map(CoreGetStringsRequestStringsInnerToJSON)),
    };
}

