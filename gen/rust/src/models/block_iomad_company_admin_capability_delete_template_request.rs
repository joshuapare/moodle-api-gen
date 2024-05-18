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
pub struct BlockIomadCompanyAdminCapabilityDeleteTemplateRequest {
    /// Template ID.
    #[serde(rename = "templateid")]
    pub templateid: i32,
}

impl BlockIomadCompanyAdminCapabilityDeleteTemplateRequest {
    pub fn new(templateid: i32) -> BlockIomadCompanyAdminCapabilityDeleteTemplateRequest {
        BlockIomadCompanyAdminCapabilityDeleteTemplateRequest {
            templateid,
        }
    }
}
