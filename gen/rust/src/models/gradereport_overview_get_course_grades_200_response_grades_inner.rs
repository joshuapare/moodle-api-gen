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
pub struct GradereportOverviewGetCourseGrades200ResponseGradesInner {
    /// Course id
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// Grade formatted
    #[serde(rename = "grade", skip_serializing_if = "Option::is_none")]
    pub grade: Option<String>,
    /// Your rank in the course
    #[serde(rename = "rank", skip_serializing_if = "Option::is_none")]
    pub rank: Option<i32>,
    /// Raw grade, not formatted
    #[serde(rename = "rawgrade", skip_serializing_if = "Option::is_none")]
    pub rawgrade: Option<String>,
}

impl GradereportOverviewGetCourseGrades200ResponseGradesInner {
    pub fn new() -> GradereportOverviewGetCourseGrades200ResponseGradesInner {
        GradereportOverviewGetCourseGrades200ResponseGradesInner {
            courseid: None,
            grade: None,
            rank: None,
            rawgrade: None,
        }
    }
}
