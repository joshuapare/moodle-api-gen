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
pub struct CoreCompetencySetParentCompetencyRequest {
    /// The competency id
    #[serde(rename = "competencyid")]
    pub competencyid: i32,
    /// The new competency parent id
    #[serde(rename = "parentid")]
    pub parentid: i32,
}

impl CoreCompetencySetParentCompetencyRequest {
    pub fn new(competencyid: i32, parentid: i32) -> CoreCompetencySetParentCompetencyRequest {
        CoreCompetencySetParentCompetencyRequest {
            competencyid,
            parentid,
        }
    }
}
