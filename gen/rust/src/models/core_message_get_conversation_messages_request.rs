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
pub struct CoreMessageGetConversationMessagesRequest {
    /// The conversation id
    #[serde(rename = "convid")]
    pub convid: i32,
    /// The current user's id
    #[serde(rename = "currentuserid")]
    pub currentuserid: i32,
    /// Limit from
    #[serde(rename = "limitfrom", skip_serializing_if = "Option::is_none")]
    pub limitfrom: Option<i32>,
    /// Limit number
    #[serde(rename = "limitnum", skip_serializing_if = "Option::is_none")]
    pub limitnum: Option<i32>,
    /// Newest first?
    #[serde(rename = "newest", skip_serializing_if = "Option::is_none")]
    pub newest: Option<bool>,
    /// The timestamp from which the messages were created
    #[serde(rename = "timefrom", skip_serializing_if = "Option::is_none")]
    pub timefrom: Option<i32>,
}

impl CoreMessageGetConversationMessagesRequest {
    pub fn new(convid: i32, currentuserid: i32) -> CoreMessageGetConversationMessagesRequest {
        CoreMessageGetConversationMessagesRequest {
            convid,
            currentuserid,
            limitfrom: None,
            limitnum: None,
            newest: None,
            timefrom: None,
        }
    }
}

