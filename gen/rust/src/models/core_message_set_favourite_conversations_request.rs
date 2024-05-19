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
pub struct CoreMessageSetFavouriteConversationsRequest {
    #[serde(rename = "conversations")]
    pub conversations: Vec<serde_json::Value>,
    /// id of the user, 0 for current user
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl CoreMessageSetFavouriteConversationsRequest {
    pub fn new(conversations: Vec<serde_json::Value>) -> CoreMessageSetFavouriteConversationsRequest {
        CoreMessageSetFavouriteConversationsRequest {
            conversations,
            userid: None,
        }
    }
}

