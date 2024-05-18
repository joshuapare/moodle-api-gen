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
import type { CoreCohortAddCohortMembersRequestMembersInner } from './CoreCohortAddCohortMembersRequestMembersInner';
import {
    CoreCohortAddCohortMembersRequestMembersInnerFromJSON,
    CoreCohortAddCohortMembersRequestMembersInnerFromJSONTyped,
    CoreCohortAddCohortMembersRequestMembersInnerToJSON,
} from './CoreCohortAddCohortMembersRequestMembersInner';

/**
 * 
 * @export
 * @interface CoreCohortAddCohortMembersRequest
 */
export interface CoreCohortAddCohortMembersRequest {
    /**
     * 
     * @type {Array<CoreCohortAddCohortMembersRequestMembersInner>}
     * @memberof CoreCohortAddCohortMembersRequest
     */
    members: Array<CoreCohortAddCohortMembersRequestMembersInner>;
}

/**
 * Check if a given object implements the CoreCohortAddCohortMembersRequest interface.
 */
export function instanceOfCoreCohortAddCohortMembersRequest(value: object): boolean {
    if (!('members' in value)) return false;
    return true;
}

export function CoreCohortAddCohortMembersRequestFromJSON(json: any): CoreCohortAddCohortMembersRequest {
    return CoreCohortAddCohortMembersRequestFromJSONTyped(json, false);
}

export function CoreCohortAddCohortMembersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCohortAddCohortMembersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'members': ((json['members'] as Array<any>).map(CoreCohortAddCohortMembersRequestMembersInnerFromJSON)),
    };
}

export function CoreCohortAddCohortMembersRequestToJSON(value?: CoreCohortAddCohortMembersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'members': ((value['members'] as Array<any>).map(CoreCohortAddCohortMembersRequestMembersInnerToJSON)),
    };
}

