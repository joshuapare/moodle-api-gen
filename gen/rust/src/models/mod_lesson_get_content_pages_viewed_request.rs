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
pub struct ModLessonGetContentPagesViewedRequest {
    /// lesson attempt number
    #[serde(rename = "lessonattempt")]
    pub lessonattempt: i32,
    /// lesson instance id
    #[serde(rename = "lessonid")]
    pub lessonid: i32,
    /// the user id (empty for current user)
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl ModLessonGetContentPagesViewedRequest {
    pub fn new(lessonattempt: i32, lessonid: i32) -> ModLessonGetContentPagesViewedRequest {
        ModLessonGetContentPagesViewedRequest {
            lessonattempt,
            lessonid,
            userid: None,
        }
    }
}

