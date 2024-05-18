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

/// CoreMessageGetConversation200ResponseMembersInnerConversationsInner : information about conversation
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CoreMessageGetConversation200ResponseMembersInnerConversationsInner {
    /// Conversations id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Multilang compatible conversation name2
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// The timecreated timestamp for the conversation
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// Conversation type: private or public
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<i32>,
}

impl CoreMessageGetConversation200ResponseMembersInnerConversationsInner {
    /// information about conversation
    pub fn new() -> CoreMessageGetConversation200ResponseMembersInnerConversationsInner {
        CoreMessageGetConversation200ResponseMembersInnerConversationsInner {
            id: None,
            name: None,
            timecreated: None,
            r#type: None,
        }
    }
}
