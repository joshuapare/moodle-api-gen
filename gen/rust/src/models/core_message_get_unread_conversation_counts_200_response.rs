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
pub struct CoreMessageGetUnreadConversationCounts200Response {
    /// Total number of unread favourite conversations
    #[serde(rename = "favourites")]
    pub favourites: i32,
    #[serde(rename = "types")]
    pub types: Box<models::CoreMessageGetUnreadConversationCounts200ResponseTypes>,
}

impl CoreMessageGetUnreadConversationCounts200Response {
    pub fn new(favourites: i32, types: models::CoreMessageGetUnreadConversationCounts200ResponseTypes) -> CoreMessageGetUnreadConversationCounts200Response {
        CoreMessageGetUnreadConversationCounts200Response {
            favourites,
            types: Box::new(types),
        }
    }
}
