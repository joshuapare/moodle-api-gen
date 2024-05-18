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
pub struct ModFeedbackGetPageItemsRequest {
    /// Course where user completes the feedback (for site feedbacks only).
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// Feedback instance id
    #[serde(rename = "feedbackid")]
    pub feedbackid: i32,
    /// The page to get starting by 0
    #[serde(rename = "page")]
    pub page: i32,
}

impl ModFeedbackGetPageItemsRequest {
    pub fn new(feedbackid: i32, page: i32) -> ModFeedbackGetPageItemsRequest {
        ModFeedbackGetPageItemsRequest {
            courseid: None,
            feedbackid,
            page,
        }
    }
}
