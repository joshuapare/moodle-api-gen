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
pub struct ModFeedbackViewFeedbackRequest {
    /// Course where user completes the feedback (for site feedbacks only).
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// Feedback instance id
    #[serde(rename = "feedbackid")]
    pub feedbackid: i32,
    /// If we need to mark the module as viewed for completion
    #[serde(rename = "moduleviewed", skip_serializing_if = "Option::is_none")]
    pub moduleviewed: Option<bool>,
}

impl ModFeedbackViewFeedbackRequest {
    pub fn new(feedbackid: i32) -> ModFeedbackViewFeedbackRequest {
        ModFeedbackViewFeedbackRequest {
            courseid: None,
            feedbackid,
            moduleviewed: None,
        }
    }
}
