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
pub struct ModResourceGetResourcesByCourses200Response {
    #[serde(rename = "resources")]
    pub resources: Vec<models::ModResourceGetResourcesByCourses200ResponseResourcesInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModResourceGetResourcesByCourses200Response {
    pub fn new(resources: Vec<models::ModResourceGetResourcesByCourses200ResponseResourcesInner>) -> ModResourceGetResourcesByCourses200Response {
        ModResourceGetResourcesByCourses200Response {
            resources,
            warnings: None,
        }
    }
}

