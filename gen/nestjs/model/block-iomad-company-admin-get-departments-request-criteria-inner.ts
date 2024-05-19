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


export interface BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner { 
    /**
     * the user column to search, expected keys (value format) are:                                 \"id\" (int) matching department id,                                 \"name\" (string) department name (Note: you can use % for searching but it may be considerably slower!),                                 \"shortname\" (string) department short name (Note: you can use % for searching but it may be considerably slower!),                                 \"company\" (int) matching company id,                                 \"parent\" (int) matching department parent id
     */
    Key?: string;
    /**
     * the value to search
     */
    Value?: string;
}

