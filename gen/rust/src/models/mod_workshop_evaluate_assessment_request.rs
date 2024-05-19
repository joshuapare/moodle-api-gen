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
pub struct ModWorkshopEvaluateAssessmentRequest {
    /// Assessment id.
    #[serde(rename = "assessmentid")]
    pub assessmentid: i32,
    /// The feedback format for text.
    #[serde(rename = "feedbackformat", skip_serializing_if = "Option::is_none")]
    pub feedbackformat: Option<i32>,
    /// The feedback for the reviewer.
    #[serde(rename = "feedbacktext", skip_serializing_if = "Option::is_none")]
    pub feedbacktext: Option<String>,
    /// The new grading grade.
    #[serde(rename = "gradinggradeover", skip_serializing_if = "Option::is_none")]
    pub gradinggradeover: Option<String>,
    /// The new weight for the assessment.
    #[serde(rename = "weight", skip_serializing_if = "Option::is_none")]
    pub weight: Option<i32>,
}

impl ModWorkshopEvaluateAssessmentRequest {
    pub fn new(assessmentid: i32) -> ModWorkshopEvaluateAssessmentRequest {
        ModWorkshopEvaluateAssessmentRequest {
            assessmentid,
            feedbackformat: None,
            feedbacktext: None,
            gradinggradeover: None,
            weight: None,
        }
    }
}

