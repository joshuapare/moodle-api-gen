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
pub struct BlockIomadCompanyAdminGetCompanies200Response {
    #[serde(rename = "companies")]
    pub companies: Vec<models::BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner>>,
}

impl BlockIomadCompanyAdminGetCompanies200Response {
    pub fn new(companies: Vec<models::BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner>) -> BlockIomadCompanyAdminGetCompanies200Response {
        BlockIomadCompanyAdminGetCompanies200Response {
            companies,
            warnings: None,
        }
    }
}

