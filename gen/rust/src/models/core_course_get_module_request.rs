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
pub struct CoreCourseGetModuleRequest {
    /// course module id
    #[serde(rename = "id")]
    pub id: i32,
    /// section to return to
    #[serde(rename = "sectionreturn", skip_serializing_if = "Option::is_none")]
    pub sectionreturn: Option<i32>,
}

impl CoreCourseGetModuleRequest {
    pub fn new(id: i32) -> CoreCourseGetModuleRequest {
        CoreCourseGetModuleRequest {
            id,
            sectionreturn: None,
        }
    }
}
