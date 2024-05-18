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
pub struct CoreCompetencyGetScaleValuesRequest {
    /// The scale id
    #[serde(rename = "scaleid")]
    pub scaleid: i32,
}

impl CoreCompetencyGetScaleValuesRequest {
    pub fn new(scaleid: i32) -> CoreCompetencyGetScaleValuesRequest {
        CoreCompetencyGetScaleValuesRequest {
            scaleid,
        }
    }
}
