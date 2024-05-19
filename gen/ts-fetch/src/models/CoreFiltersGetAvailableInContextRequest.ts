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
import type { CoreFiltersGetAvailableInContextRequestContextsInner } from './CoreFiltersGetAvailableInContextRequestContextsInner';
import {
    CoreFiltersGetAvailableInContextRequestContextsInnerFromJSON,
    CoreFiltersGetAvailableInContextRequestContextsInnerFromJSONTyped,
    CoreFiltersGetAvailableInContextRequestContextsInnerToJSON,
} from './CoreFiltersGetAvailableInContextRequestContextsInner';

/**
 * 
 * @export
 * @interface CoreFiltersGetAvailableInContextRequest
 */
export interface CoreFiltersGetAvailableInContextRequest {
    /**
     * 
     * @type {Array<CoreFiltersGetAvailableInContextRequestContextsInner>}
     * @memberof CoreFiltersGetAvailableInContextRequest
     */
    Contexts: Array<CoreFiltersGetAvailableInContextRequestContextsInner>;
}

/**
 * Check if a given object implements the CoreFiltersGetAvailableInContextRequest interface.
 */
export function instanceOfCoreFiltersGetAvailableInContextRequest(value: object): boolean {
    if (!('Contexts' in value)) return false;
    return true;
}

export function CoreFiltersGetAvailableInContextRequestFromJSON(json: any): CoreFiltersGetAvailableInContextRequest {
    return CoreFiltersGetAvailableInContextRequestFromJSONTyped(json, false);
}

export function CoreFiltersGetAvailableInContextRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreFiltersGetAvailableInContextRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Contexts': ((json['contexts'] as Array<any>).map(CoreFiltersGetAvailableInContextRequestContextsInnerFromJSON)),
    };
}

export function CoreFiltersGetAvailableInContextRequestToJSON(value?: CoreFiltersGetAvailableInContextRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'contexts': ((value['Contexts'] as Array<any>).map(CoreFiltersGetAvailableInContextRequestContextsInnerToJSON)),
    };
}
