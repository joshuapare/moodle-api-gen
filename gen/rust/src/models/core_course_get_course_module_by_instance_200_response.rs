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
pub struct CoreCourseGetCourseModuleByInstance200Response {
    #[serde(rename = "cm")]
    pub cm: Box<models::CoreCourseGetCourseModuleByInstance200ResponseCm>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl CoreCourseGetCourseModuleByInstance200Response {
    pub fn new(cm: models::CoreCourseGetCourseModuleByInstance200ResponseCm) -> CoreCourseGetCourseModuleByInstance200Response {
        CoreCourseGetCourseModuleByInstance200Response {
            cm: Box::new(cm),
            warnings: None,
        }
    }
}
