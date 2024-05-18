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
pub struct CoreCourseGetContentsRequest {
    /// course id
    #[serde(rename = "courseid")]
    pub courseid: i32,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Vec<models::CoreCourseGetContentsRequestOptionsInner>>,
}

impl CoreCourseGetContentsRequest {
    pub fn new(courseid: i32) -> CoreCourseGetContentsRequest {
        CoreCourseGetContentsRequest {
            courseid,
            options: None,
        }
    }
}
