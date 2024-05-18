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
pub struct ModQuizGetCombinedReviewOptionsRequest {
    /// quiz instance id
    #[serde(rename = "quizid")]
    pub quizid: i32,
    /// user id (empty for current user)
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModQuizGetCombinedReviewOptionsRequest {
    pub fn new(quizid: i32) -> ModQuizGetCombinedReviewOptionsRequest {
        ModQuizGetCombinedReviewOptionsRequest {
            quizid,
            userid: None,
        }
    }
}

