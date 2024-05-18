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
pub struct CoreCourseGetCourseModule200ResponseCmOutcomesInner {
    /// Outcome id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// Outcome full name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Scale items
    #[serde(rename = "scale", skip_serializing_if = "Option::is_none")]
    pub scale: Option<String>,
}

impl CoreCourseGetCourseModule200ResponseCmOutcomesInner {
    pub fn new() -> CoreCourseGetCourseModule200ResponseCmOutcomesInner {
        CoreCourseGetCourseModule200ResponseCmOutcomesInner {
            id: None,
            name: None,
            scale: None,
        }
    }
}

