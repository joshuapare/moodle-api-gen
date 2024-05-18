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
pub struct ToolMobileGetAutologinKey200Response {
    /// Auto-login URL.
    #[serde(rename = "autologinurl")]
    pub autologinurl: String,
    /// Auto-login key for a single usage with time expiration.
    #[serde(rename = "key")]
    pub key: String,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ToolMobileGetAutologinKey200Response {
    pub fn new(autologinurl: String, key: String) -> ToolMobileGetAutologinKey200Response {
        ToolMobileGetAutologinKey200Response {
            autologinurl,
            key,
            warnings: None,
        }
    }
}

