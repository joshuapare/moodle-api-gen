/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {
    /// the company column to search, expected keys (value format) are:                                 \"id\" (int) matching company id,                                 \"name\" (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \"shortname\" (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \"code\" (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \"suspended\" (bool) company is suspended or not,                                 \"city\" (string) matching company city,                                 \"country\" (string) matching company country,                                 \"timezone\" (int) company timezone,                                 \"lang\" (string) matching company language setting
    #[serde(rename = "key", skip_serializing_if = "Option::is_none")]
    pub key: Option<String>,
    /// the value to search
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {
    pub fn new() -> BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {
        BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {
            key: None,
            value: None,
        }
    }
}
