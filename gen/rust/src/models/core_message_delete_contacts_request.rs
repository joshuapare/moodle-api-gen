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
pub struct CoreMessageDeleteContactsRequest {
    /// The id of the user we are deleting the contacts for, 0 for the                     current user
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
    #[serde(rename = "userids")]
    pub userids: Vec<serde_json::Value>,
}

impl CoreMessageDeleteContactsRequest {
    pub fn new(userids: Vec<serde_json::Value>) -> CoreMessageDeleteContactsRequest {
        CoreMessageDeleteContactsRequest {
            userid: None,
            userids,
        }
    }
}

