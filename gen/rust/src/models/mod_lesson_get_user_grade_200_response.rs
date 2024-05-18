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
pub struct ModLessonGetUserGrade200Response {
    /// The lesson final grade formatted
    #[serde(rename = "formattedgrade")]
    pub formattedgrade: String,
    /// The lesson final raw grade
    #[serde(rename = "grade")]
    pub grade: f64,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModLessonGetUserGrade200Response {
    pub fn new(formattedgrade: String, grade: f64) -> ModLessonGetUserGrade200Response {
        ModLessonGetUserGrade200Response {
            formattedgrade,
            grade,
            warnings: None,
        }
    }
}
