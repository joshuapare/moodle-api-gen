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
pub struct ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
    /// Attempt time ended.
    #[serde(rename = "end", skip_serializing_if = "Option::is_none")]
    pub end: Option<i32>,
    /// Attempt grade.
    #[serde(rename = "grade", skip_serializing_if = "Option::is_none")]
    pub grade: Option<f64>,
    /// Attempt last time continued.
    #[serde(rename = "timeend", skip_serializing_if = "Option::is_none")]
    pub timeend: Option<i32>,
    /// Attempt time started.
    #[serde(rename = "timestart", skip_serializing_if = "Option::is_none")]
    pub timestart: Option<i32>,
    /// Attempt number.
    #[serde(rename = "try", skip_serializing_if = "Option::is_none")]
    pub r#try: Option<i32>,
}

impl ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
    pub fn new() -> ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
        ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner {
            end: None,
            grade: None,
            timeend: None,
            timestart: None,
            r#try: None,
        }
    }
}
