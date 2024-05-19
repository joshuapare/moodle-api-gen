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
import type { EnrolMetaDeleteInstancesRequestInstancesInner } from './EnrolMetaDeleteInstancesRequestInstancesInner';
import {
    EnrolMetaDeleteInstancesRequestInstancesInnerFromJSON,
    EnrolMetaDeleteInstancesRequestInstancesInnerFromJSONTyped,
    EnrolMetaDeleteInstancesRequestInstancesInnerToJSON,
} from './EnrolMetaDeleteInstancesRequestInstancesInner';

/**
 * 
 * @export
 * @interface EnrolMetaDeleteInstancesRequest
 */
export interface EnrolMetaDeleteInstancesRequest {
    /**
     * 
     * @type {Array<EnrolMetaDeleteInstancesRequestInstancesInner>}
     * @memberof EnrolMetaDeleteInstancesRequest
     */
    Instances?: Array<EnrolMetaDeleteInstancesRequestInstancesInner>;
}

/**
 * Check if a given object implements the EnrolMetaDeleteInstancesRequest interface.
 */
export function instanceOfEnrolMetaDeleteInstancesRequest(value: object): boolean {
    return true;
}

export function EnrolMetaDeleteInstancesRequestFromJSON(json: any): EnrolMetaDeleteInstancesRequest {
    return EnrolMetaDeleteInstancesRequestFromJSONTyped(json, false);
}

export function EnrolMetaDeleteInstancesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrolMetaDeleteInstancesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'Instances': json['instances'] == null ? undefined : ((json['instances'] as Array<any>).map(EnrolMetaDeleteInstancesRequestInstancesInnerFromJSON)),
    };
}

export function EnrolMetaDeleteInstancesRequestToJSON(value?: EnrolMetaDeleteInstancesRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'instances': value['Instances'] == null ? undefined : ((value['Instances'] as Array<any>).map(EnrolMetaDeleteInstancesRequestInstancesInnerToJSON)),
    };
}
