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
pub struct ModFeedbackGetNonRespondents200Response {
    /// Total number of non respondents
    #[serde(rename = "total")]
    pub total: i32,
    #[serde(rename = "users")]
    pub users: Vec<models::ModFeedbackGetNonRespondents200ResponseUsersInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModFeedbackGetNonRespondents200Response {
    pub fn new(total: i32, users: Vec<models::ModFeedbackGetNonRespondents200ResponseUsersInner>) -> ModFeedbackGetNonRespondents200Response {
        ModFeedbackGetNonRespondents200Response {
            total,
            users,
            warnings: None,
        }
    }
}
