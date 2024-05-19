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
 * @interface BlockIomadCompanyAdminAssignUsersRequestUsersInner
 */
export interface BlockIomadCompanyAdminAssignUsersRequestUsersInner {
    /**
     * User company ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAssignUsersRequestUsersInner
     */
    Companyid?: number;
    /**
     * User company department ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAssignUsersRequestUsersInner
     */
    Departmentid?: number;
    /**
     * User educator 0 => No, 1 => Yes
     * @type {number}
     * @memberof BlockIomadCompanyAdminAssignUsersRequestUsersInner
     */
    Educator?: number;
    /**
     * User manager type 0 => User, 1 => company manager 2 => department manager, 3 => report only
     * @type {number}
     * @memberof BlockIomadCompanyAdminAssignUsersRequestUsersInner
     */
    Managertype?: number;
    /**
     * User ID
     * @type {number}
     * @memberof BlockIomadCompanyAdminAssignUsersRequestUsersInner
     */
    Userid?: number;
}

/**
 * Check if a given object implements the BlockIomadCompanyAdminAssignUsersRequestUsersInner interface.
 */
export function instanceOfBlockIomadCompanyAdminAssignUsersRequestUsersInner(value: object): boolean {
    return true;
}

export function BlockIomadCompanyAdminAssignUsersRequestUsersInnerFromJSON(json: any): BlockIomadCompanyAdminAssignUsersRequestUsersInner {
    return BlockIomadCompanyAdminAssignUsersRequestUsersInnerFromJSONTyped(json, false);
}

export function BlockIomadCompanyAdminAssignUsersRequestUsersInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): BlockIomadCompanyAdminAssignUsersRequestUsersInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Companyid': json['companyid'] == null ? undefined : json['companyid'],
        'Departmentid': json['departmentid'] == null ? undefined : json['departmentid'],
        'Educator': json['educator'] == null ? undefined : json['educator'],
        'Managertype': json['managertype'] == null ? undefined : json['managertype'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
    };
}

export function BlockIomadCompanyAdminAssignUsersRequestUsersInnerToJSON(value?: BlockIomadCompanyAdminAssignUsersRequestUsersInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'companyid': value['Companyid'],
        'departmentid': value['Departmentid'],
        'educator': value['Educator'],
        'managertype': value['Managertype'],
        'userid': value['Userid'],
    };
}

