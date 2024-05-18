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
import type { BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner } from './BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner';
import {
    BlockIomadCompanyAdminGetCompanies200ResponseWarningsInnerFromJSON,
    BlockIomadCompanyAdminGetCompanies200ResponseWarningsInnerFromJSONTyped,
    BlockIomadCompanyAdminGetCompanies200ResponseWarningsInnerToJSON,
} from './BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner';
import type { CoreGradesGetGradableUsers200ResponseUsersInner } from './CoreGradesGetGradableUsers200ResponseUsersInner';
import {
    CoreGradesGetGradableUsers200ResponseUsersInnerFromJSON,
    CoreGradesGetGradableUsers200ResponseUsersInnerFromJSONTyped,
    CoreGradesGetGradableUsers200ResponseUsersInnerToJSON,
} from './CoreGradesGetGradableUsers200ResponseUsersInner';

/**
 * 
 * @export
 * @interface CoreUserGetUsers200Response
 */
export interface CoreUserGetUsers200Response {
    /**
     * 
     * @type {Array<CoreGradesGetGradableUsers200ResponseUsersInner>}
     * @memberof CoreUserGetUsers200Response
     */
    users: Array<CoreGradesGetGradableUsers200ResponseUsersInner>;
    /**
     * 
     * @type {Array<BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner>}
     * @memberof CoreUserGetUsers200Response
     */
    warnings?: Array<BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner>;
}

/**
 * Check if a given object implements the CoreUserGetUsers200Response interface.
 */
export function instanceOfCoreUserGetUsers200Response(value: object): boolean {
    if (!('users' in value)) return false;
    return true;
}

export function CoreUserGetUsers200ResponseFromJSON(json: any): CoreUserGetUsers200Response {
    return CoreUserGetUsers200ResponseFromJSONTyped(json, false);
}

export function CoreUserGetUsers200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreUserGetUsers200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'users': ((json['users'] as Array<any>).map(CoreGradesGetGradableUsers200ResponseUsersInnerFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(BlockIomadCompanyAdminGetCompanies200ResponseWarningsInnerFromJSON)),
    };
}

export function CoreUserGetUsers200ResponseToJSON(value?: CoreUserGetUsers200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'users': ((value['users'] as Array<any>).map(CoreGradesGetGradableUsers200ResponseUsersInnerToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(BlockIomadCompanyAdminGetCompanies200ResponseWarningsInnerToJSON)),
    };
}
