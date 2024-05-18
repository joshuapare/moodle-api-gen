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
pub struct CoreMoodlenetGetShareInfoActivity200Response {
    /// MoodleNet issuer id
    #[serde(rename = "issuerid")]
    pub issuerid: i32,
    /// Activity name
    #[serde(rename = "name")]
    pub name: String,
    /// MoodleNet server
    #[serde(rename = "server")]
    pub server: String,
    /// status: true if success
    #[serde(rename = "status")]
    pub status: bool,
    /// Support page URL
    #[serde(rename = "supportpageurl")]
    pub supportpageurl: String,
    /// Activity type
    #[serde(rename = "type")]
    pub r#type: String,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl CoreMoodlenetGetShareInfoActivity200Response {
    pub fn new(issuerid: i32, name: String, server: String, status: bool, supportpageurl: String, r#type: String) -> CoreMoodlenetGetShareInfoActivity200Response {
        CoreMoodlenetGetShareInfoActivity200Response {
            issuerid,
            name,
            server,
            status,
            supportpageurl,
            r#type,
            warnings: None,
        }
    }
}

