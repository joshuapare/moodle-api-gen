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


export interface BlockIomadCompanyAdminAssignUsersRequestUsersInner { 
    /**
     * User company ID
     */
    Companyid?: number;
    /**
     * User company department ID
     */
    Departmentid?: number;
    /**
     * User educator 0 => No, 1 => Yes
     */
    Educator?: number;
    /**
     * User manager type 0 => User, 1 => company manager 2 => department manager, 3 => report only
     */
    Managertype?: number;
    /**
     * User ID
     */
    Userid?: number;
}

