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
pub struct BlockIomadCompanyAdminSyncUsers200Response {
    /// Status: true only if token is valid
    #[serde(rename = "status")]
    pub status: bool,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl BlockIomadCompanyAdminSyncUsers200Response {
    pub fn new(status: bool) -> BlockIomadCompanyAdminSyncUsers200Response {
        BlockIomadCompanyAdminSyncUsers200Response {
            status,
            warnings: None,
        }
    }
}

