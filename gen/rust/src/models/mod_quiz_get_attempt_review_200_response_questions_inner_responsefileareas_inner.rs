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
pub struct ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
    /// File area name
    #[serde(rename = "area", skip_serializing_if = "Option::is_none")]
    pub area: Option<String>,
    #[serde(rename = "files", skip_serializing_if = "Option::is_none")]
    pub files: Option<Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>>,
}

impl ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
    pub fn new() -> ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
        ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner {
            area: None,
            files: None,
        }
    }
}
