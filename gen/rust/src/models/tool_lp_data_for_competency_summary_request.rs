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
pub struct ToolLpDataForCompetencySummaryRequest {
    /// The competency id
    #[serde(rename = "competencyid")]
    pub competencyid: i32,
    /// Include or not competency courses
    #[serde(rename = "includecourses", skip_serializing_if = "Option::is_none")]
    pub includecourses: Option<bool>,
    /// Include or not related competencies
    #[serde(rename = "includerelated", skip_serializing_if = "Option::is_none")]
    pub includerelated: Option<bool>,
}

impl ToolLpDataForCompetencySummaryRequest {
    pub fn new(competencyid: i32) -> ToolLpDataForCompetencySummaryRequest {
        ToolLpDataForCompetencySummaryRequest {
            competencyid,
            includecourses: None,
            includerelated: None,
        }
    }
}

