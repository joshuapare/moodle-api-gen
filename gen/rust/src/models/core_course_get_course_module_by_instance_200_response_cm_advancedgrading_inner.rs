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
pub struct CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner {
    /// Gradable area name
    #[serde(rename = "area", skip_serializing_if = "Option::is_none")]
    pub area: Option<String>,
    /// Grading method
    #[serde(rename = "method", skip_serializing_if = "Option::is_none")]
    pub method: Option<String>,
}

impl CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner {
    pub fn new() -> CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner {
        CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner {
            area: None,
            method: None,
        }
    }
}

