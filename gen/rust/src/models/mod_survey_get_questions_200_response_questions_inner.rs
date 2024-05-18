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

/// ModSurveyGetQuestions200ResponseQuestionsInner : Questions
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ModSurveyGetQuestions200ResponseQuestionsInner {
    /// Question id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The question intro
    #[serde(rename = "intro", skip_serializing_if = "Option::is_none")]
    pub intro: Option<String>,
    /// Subquestions ids
    #[serde(rename = "multi", skip_serializing_if = "Option::is_none")]
    pub multi: Option<String>,
    /// Question options
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<String>,
    /// Parent question (for subquestions)
    #[serde(rename = "parent", skip_serializing_if = "Option::is_none")]
    pub parent: Option<i32>,
    /// Question short text
    #[serde(rename = "shorttext", skip_serializing_if = "Option::is_none")]
    pub shorttext: Option<String>,
    /// Question text
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
    /// Question type
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<i32>,
}

impl ModSurveyGetQuestions200ResponseQuestionsInner {
    /// Questions
    pub fn new() -> ModSurveyGetQuestions200ResponseQuestionsInner {
        ModSurveyGetQuestions200ResponseQuestionsInner {
            id: None,
            intro: None,
            multi: None,
            options: None,
            parent: None,
            shorttext: None,
            text: None,
            r#type: None,
        }
    }
}
