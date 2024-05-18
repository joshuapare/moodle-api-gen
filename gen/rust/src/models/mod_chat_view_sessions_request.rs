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
pub struct ModChatViewSessionsRequest {
    /// Course module id
    #[serde(rename = "cmid")]
    pub cmid: i32,
    /// Session end time
    #[serde(rename = "end", skip_serializing_if = "Option::is_none")]
    pub end: Option<i32>,
    /// Session start time
    #[serde(rename = "start", skip_serializing_if = "Option::is_none")]
    pub start: Option<i32>,
}

impl ModChatViewSessionsRequest {
    pub fn new(cmid: i32) -> ModChatViewSessionsRequest {
        ModChatViewSessionsRequest {
            cmid,
            end: None,
            start: None,
        }
    }
}
