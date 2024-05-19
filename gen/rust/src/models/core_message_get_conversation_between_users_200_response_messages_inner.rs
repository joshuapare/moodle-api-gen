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
pub struct CoreMessageGetConversationBetweenUsers200ResponseMessagesInner {
    /// The id of the message
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The text of the message
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
    /// The timecreated timestamp for the message
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// The id of the user who sent the message
    #[serde(rename = "useridfrom", skip_serializing_if = "Option::is_none")]
    pub useridfrom: Option<i32>,
}

impl CoreMessageGetConversationBetweenUsers200ResponseMessagesInner {
    pub fn new() -> CoreMessageGetConversationBetweenUsers200ResponseMessagesInner {
        CoreMessageGetConversationBetweenUsers200ResponseMessagesInner {
            id: None,
            text: None,
            timecreated: None,
            useridfrom: None,
        }
    }
}

