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
pub struct ModChatGetChatLatestMessages200ResponseMessagesInner {
    /// message id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// message text
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
    /// true if is a system message (like user joined)
    #[serde(rename = "system", skip_serializing_if = "Option::is_none")]
    pub system: Option<bool>,
    /// timestamp for the message
    #[serde(rename = "timestamp", skip_serializing_if = "Option::is_none")]
    pub timestamp: Option<i32>,
    /// user id
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModChatGetChatLatestMessages200ResponseMessagesInner {
    pub fn new() -> ModChatGetChatLatestMessages200ResponseMessagesInner {
        ModChatGetChatLatestMessages200ResponseMessagesInner {
            id: None,
            message: None,
            system: None,
            timestamp: None,
            userid: None,
        }
    }
}
