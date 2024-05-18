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
pub struct CoreCompetencyCreateUserEvidenceCompetencyRequest {
    /// The competency ID.
    #[serde(rename = "competencyid")]
    pub competencyid: i32,
    /// The user evidence ID.
    #[serde(rename = "userevidenceid")]
    pub userevidenceid: i32,
}

impl CoreCompetencyCreateUserEvidenceCompetencyRequest {
    pub fn new(competencyid: i32, userevidenceid: i32) -> CoreCompetencyCreateUserEvidenceCompetencyRequest {
        CoreCompetencyCreateUserEvidenceCompetencyRequest {
            competencyid,
            userevidenceid,
        }
    }
}

