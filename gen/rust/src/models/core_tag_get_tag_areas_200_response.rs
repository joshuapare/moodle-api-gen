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
pub struct CoreTagGetTagAreas200Response {
    #[serde(rename = "areas")]
    pub areas: Vec<models::CoreTagGetTagAreas200ResponseAreasInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl CoreTagGetTagAreas200Response {
    pub fn new(areas: Vec<models::CoreTagGetTagAreas200ResponseAreasInner>) -> CoreTagGetTagAreas200Response {
        CoreTagGetTagAreas200Response {
            areas,
            warnings: None,
        }
    }
}

