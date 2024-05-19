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
import type { CoreCalendarGetTimestampsRequestDataInner } from './CoreCalendarGetTimestampsRequestDataInner';
import {
    CoreCalendarGetTimestampsRequestDataInnerFromJSON,
    CoreCalendarGetTimestampsRequestDataInnerFromJSONTyped,
    CoreCalendarGetTimestampsRequestDataInnerToJSON,
} from './CoreCalendarGetTimestampsRequestDataInner';

/**
 * 
 * @export
 * @interface CoreCalendarGetTimestampsRequest
 */
export interface CoreCalendarGetTimestampsRequest {
    /**
     * 
     * @type {Array<CoreCalendarGetTimestampsRequestDataInner>}
     * @memberof CoreCalendarGetTimestampsRequest
     */
    Data: Array<CoreCalendarGetTimestampsRequestDataInner>;
}

/**
 * Check if a given object implements the CoreCalendarGetTimestampsRequest interface.
 */
export function instanceOfCoreCalendarGetTimestampsRequest(value: object): boolean {
    if (!('Data' in value)) return false;
    return true;
}

export function CoreCalendarGetTimestampsRequestFromJSON(json: any): CoreCalendarGetTimestampsRequest {
    return CoreCalendarGetTimestampsRequestFromJSONTyped(json, false);
}

export function CoreCalendarGetTimestampsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCalendarGetTimestampsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Data': ((json['data'] as Array<any>).map(CoreCalendarGetTimestampsRequestDataInnerFromJSON)),
    };
}

export function CoreCalendarGetTimestampsRequestToJSON(value?: CoreCalendarGetTimestampsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'data': ((value['Data'] as Array<any>).map(CoreCalendarGetTimestampsRequestDataInnerToJSON)),
    };
}

