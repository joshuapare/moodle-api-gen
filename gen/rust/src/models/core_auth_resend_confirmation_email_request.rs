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
pub struct CoreAuthResendConfirmationEmailRequest {
    /// Plain text password.
    #[serde(rename = "password")]
    pub password: String,
    /// Redirect the user to this site url after confirmation.
    #[serde(rename = "redirect", skip_serializing_if = "Option::is_none")]
    pub redirect: Option<String>,
    /// Username.
    #[serde(rename = "username")]
    pub username: String,
}

impl CoreAuthResendConfirmationEmailRequest {
    pub fn new(password: String, username: String) -> CoreAuthResendConfirmationEmailRequest {
        CoreAuthResendConfirmationEmailRequest {
            password,
            redirect: None,
            username,
        }
    }
}
