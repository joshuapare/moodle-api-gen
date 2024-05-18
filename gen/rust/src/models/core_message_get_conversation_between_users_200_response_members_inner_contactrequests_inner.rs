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
pub struct CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
    /// The id of the contact request
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The id of the user confirming the request
    #[serde(rename = "requesteduserid", skip_serializing_if = "Option::is_none")]
    pub requesteduserid: Option<i32>,
    /// The timecreated timestamp for the contact request
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// The id of the user who created the contact request
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
    pub fn new() -> CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
        CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner {
            id: None,
            requesteduserid: None,
            timecreated: None,
            userid: None,
        }
    }
}
