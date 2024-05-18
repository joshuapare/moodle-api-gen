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
pub struct ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {
    /// competencycount
    #[serde(rename = "competencycount")]
    pub competencycount: i32,
    /// completedplancount
    #[serde(rename = "completedplancount")]
    pub completedplancount: i32,
    /// completedplanpercentage
    #[serde(rename = "completedplanpercentage")]
    pub completedplanpercentage: f64,
    /// completedplanpercentageformatted
    #[serde(rename = "completedplanpercentageformatted")]
    pub completedplanpercentageformatted: String,
    #[serde(rename = "leastproficient")]
    pub leastproficient: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>,
    /// leastproficientcount
    #[serde(rename = "leastproficientcount")]
    pub leastproficientcount: i32,
    /// linkedcompetencycount
    #[serde(rename = "linkedcompetencycount")]
    pub linkedcompetencycount: i32,
    /// linkedcompetencypercentage
    #[serde(rename = "linkedcompetencypercentage")]
    pub linkedcompetencypercentage: f64,
    /// linkedcompetencypercentageformatted
    #[serde(rename = "linkedcompetencypercentageformatted")]
    pub linkedcompetencypercentageformatted: String,
    /// plancount
    #[serde(rename = "plancount")]
    pub plancount: i32,
    /// proficientusercompetencyplancount
    #[serde(rename = "proficientusercompetencyplancount")]
    pub proficientusercompetencyplancount: i32,
    /// proficientusercompetencyplanpercentage
    #[serde(rename = "proficientusercompetencyplanpercentage")]
    pub proficientusercompetencyplanpercentage: f64,
    /// proficientusercompetencyplanpercentageformatted
    #[serde(rename = "proficientusercompetencyplanpercentageformatted")]
    pub proficientusercompetencyplanpercentageformatted: String,
    /// unlinkedcompetencycount
    #[serde(rename = "unlinkedcompetencycount")]
    pub unlinkedcompetencycount: i32,
    /// usercompetencyplancount
    #[serde(rename = "usercompetencyplancount")]
    pub usercompetencyplancount: i32,
}

impl ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {
    pub fn new(competencycount: i32, completedplancount: i32, completedplanpercentage: f64, completedplanpercentageformatted: String, leastproficient: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>, leastproficientcount: i32, linkedcompetencycount: i32, linkedcompetencypercentage: f64, linkedcompetencypercentageformatted: String, plancount: i32, proficientusercompetencyplancount: i32, proficientusercompetencyplanpercentage: f64, proficientusercompetencyplanpercentageformatted: String, unlinkedcompetencycount: i32, usercompetencyplancount: i32) -> ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {
        ToolLpDataForTemplateCompetenciesPage200ResponseStatistics {
            competencycount,
            completedplancount,
            completedplanpercentage,
            completedplanpercentageformatted,
            leastproficient,
            leastproficientcount,
            linkedcompetencycount,
            linkedcompetencypercentage,
            linkedcompetencypercentageformatted,
            plancount,
            proficientusercompetencyplancount,
            proficientusercompetencyplanpercentage,
            proficientusercompetencyplanpercentageformatted,
            unlinkedcompetencycount,
            usercompetencyplancount,
        }
    }
}

