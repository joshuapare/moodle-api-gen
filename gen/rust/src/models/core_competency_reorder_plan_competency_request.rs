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
pub struct CoreCompetencyReorderPlanCompetencyRequest {
    /// The competency id we are moving
    #[serde(rename = "competencyidfrom")]
    pub competencyidfrom: i32,
    /// The competency id we are moving to
    #[serde(rename = "competencyidto")]
    pub competencyidto: i32,
    /// The plan id
    #[serde(rename = "planid")]
    pub planid: i32,
}

impl CoreCompetencyReorderPlanCompetencyRequest {
    pub fn new(competencyidfrom: i32, competencyidto: i32, planid: i32) -> CoreCompetencyReorderPlanCompetencyRequest {
        CoreCompetencyReorderPlanCompetencyRequest {
            competencyidfrom,
            competencyidto,
            planid,
        }
    }
}

