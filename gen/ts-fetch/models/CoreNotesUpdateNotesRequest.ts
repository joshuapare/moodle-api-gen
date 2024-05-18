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
import type { CoreNotesUpdateNotesRequestNotesInner } from './CoreNotesUpdateNotesRequestNotesInner';
import {
    CoreNotesUpdateNotesRequestNotesInnerFromJSON,
    CoreNotesUpdateNotesRequestNotesInnerFromJSONTyped,
    CoreNotesUpdateNotesRequestNotesInnerToJSON,
} from './CoreNotesUpdateNotesRequestNotesInner';

/**
 * 
 * @export
 * @interface CoreNotesUpdateNotesRequest
 */
export interface CoreNotesUpdateNotesRequest {
    /**
     * 
     * @type {Array<CoreNotesUpdateNotesRequestNotesInner>}
     * @memberof CoreNotesUpdateNotesRequest
     */
    notes?: Array<CoreNotesUpdateNotesRequestNotesInner>;
}

/**
 * Check if a given object implements the CoreNotesUpdateNotesRequest interface.
 */
export function instanceOfCoreNotesUpdateNotesRequest(value: object): boolean {
    return true;
}

export function CoreNotesUpdateNotesRequestFromJSON(json: any): CoreNotesUpdateNotesRequest {
    return CoreNotesUpdateNotesRequestFromJSONTyped(json, false);
}

export function CoreNotesUpdateNotesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreNotesUpdateNotesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'notes': json['notes'] == null ? undefined : ((json['notes'] as Array<any>).map(CoreNotesUpdateNotesRequestNotesInnerFromJSON)),
    };
}

export function CoreNotesUpdateNotesRequestToJSON(value?: CoreNotesUpdateNotesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'notes': value['notes'] == null ? undefined : ((value['notes'] as Array<any>).map(CoreNotesUpdateNotesRequestNotesInnerToJSON)),
    };
}
