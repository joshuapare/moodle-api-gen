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
pub struct ToolMobileCallExternalFunctions200ResponseResponsesInner {
    /// JSON-encoded response data
    #[serde(rename = "data", skip_serializing_if = "Option::is_none")]
    pub data: Option<String>,
    /// Whether an exception was thrown.
    #[serde(rename = "error", skip_serializing_if = "Option::is_none")]
    pub error: Option<bool>,
    /// JSON-encoed exception info
    #[serde(rename = "exception", skip_serializing_if = "Option::is_none")]
    pub exception: Option<String>,
}

impl ToolMobileCallExternalFunctions200ResponseResponsesInner {
    pub fn new() -> ToolMobileCallExternalFunctions200ResponseResponsesInner {
        ToolMobileCallExternalFunctions200ResponseResponsesInner {
            data: None,
            error: None,
            exception: None,
        }
    }
}

