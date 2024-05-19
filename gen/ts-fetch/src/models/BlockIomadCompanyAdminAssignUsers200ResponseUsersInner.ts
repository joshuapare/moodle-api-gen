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
 * 
 * @export
 * @interface BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
 */
export interface BlockIomadCompanyAdminAssignUsers200ResponseUsersInner {
    /**
     * Company ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
     */
    Companyid?: number;
    /**
     * Failure message
     * @type {string}
     * @memberof BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
     */
    Message?: string;
    /**
     * Success or failure
     * @type {boolean}
     * @memberof BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
     */
    Result?: boolean;
    /**
     * Department ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminAssignUsers200ResponseUsersInner interface.
 */
export function instanceOfBlockIomadCompanyAdminAssignUsers200ResponseUsersInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminAssignUsers200ResponseUsersInnerFromJSON(json: any): BlockIomadCompanyAdminAssignUsers200ResponseUsersInner {
    return BlockIomadCompanyAdminAssignUsers200ResponseUsersInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminAssignUsers200ResponseUsersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminAssignUsers200ResponseUsersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Companyid': json['companyid'] == null ? undefined : json['companyid'],
        'Message': json['message'] == null ? undefined : json['message'],
        'Result': json['result'] == null ? undefined : json['result'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function BlockIomadCompanyAdminAssignUsers200ResponseUsersInnerToJSON(value?: BlockIomadCompanyAdminAssignUsers200ResponseUsersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'companyid': value['Companyid'],
        'message': value['Message'],
        'result': value['Result'],
        'userid': value['Userid'],
    };
}
