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
import type { AuthEmailSignupUser200ResponseWarningsInner } from './AuthEmailSignupUser200ResponseWarningsInner';
import {
    AuthEmailSignupUser200ResponseWarningsInnerFromJSON,
    AuthEmailSignupUser200ResponseWarningsInnerFromJSONTyped,
    AuthEmailSignupUser200ResponseWarningsInnerToJSON,
} from './AuthEmailSignupUser200ResponseWarningsInner';

/**
 * 
 * @export
 * @interface BlockIomadCompanyAdminSyncUsers200Response
 */
export interface BlockIomadCompanyAdminSyncUsers200Response {
    /**
     * Status: true only if token is valid
     * @type {boolean}
     * @memberof BlockIomadCompanyAdminSyncUsers200Response
     */
    status: boolean;
    /**
     * 
     * @type {Array<AuthEmailSignupUser200ResponseWarningsInner>}
     * @memberof BlockIomadCompanyAdminSyncUsers200Response
     */
    warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminSyncUsers200Response interface.
 */
export function instanceOfBlockIomadCompanyAdminSyncUsers200Response(value: object): boolean {
    if (!('status' in value)) return false;
    return true;
}

export function BlockIomadCompanyAdminSyncUsers200ResponseFromJSON(json: any): BlockIomadCompanyAdminSyncUsers200Response {
    return BlockIomadCompanyAdminSyncUsers200ResponseFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminSyncUsers200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminSyncUsers200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerFromJSON)),
    };
}

export function BlockIomadCompanyAdminSyncUsers200ResponseToJSON(value?: BlockIomadCompanyAdminSyncUsers200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': value['status'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(AuthEmailSignupUser200ResponseWarningsInnerToJSON)),
    };
}
