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


export interface BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner { 
    /**
     * the company column to search, expected keys (value format) are:                                 \"id\" (int) matching company id,                                 \"name\" (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \"shortname\" (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \"code\" (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \"suspended\" (bool) company is suspended or not,                                 \"city\" (string) matching company city,                                 \"country\" (string) matching company country,                                 \"timezone\" (int) company timezone,                                 \"lang\" (string) matching company language setting
     */
    Key?: string;
    /**
     * the value to search
     */
    Value?: string;
}

