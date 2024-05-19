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
pub struct ToolLpDataForRelatedCompetenciesSection200Response {
    #[serde(rename = "relatedcompetencies")]
    pub relatedcompetencies: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>,
    /// Whether to show the delete relation link or not
    #[serde(rename = "showdeleterelatedaction")]
    pub showdeleterelatedaction: bool,
}

impl ToolLpDataForRelatedCompetenciesSection200Response {
    pub fn new(relatedcompetencies: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>, showdeleterelatedaction: bool) -> ToolLpDataForRelatedCompetenciesSection200Response {
        ToolLpDataForRelatedCompetenciesSection200Response {
            relatedcompetencies,
            showdeleterelatedaction,
        }
    }
}

