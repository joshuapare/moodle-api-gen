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
pub struct ToolLpDataForCourseCompetenciesPage200ResponseStatistics {
    /// canbegradedincourse
    #[serde(rename = "canbegradedincourse")]
    pub canbegradedincourse: bool,
    /// canmanagecoursecompetencies
    #[serde(rename = "canmanagecoursecompetencies")]
    pub canmanagecoursecompetencies: bool,
    /// competencycount
    #[serde(rename = "competencycount")]
    pub competencycount: i32,
    #[serde(rename = "leastproficient")]
    pub leastproficient: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>,
    /// leastproficientcount
    #[serde(rename = "leastproficientcount")]
    pub leastproficientcount: i32,
    /// proficientcompetencycount
    #[serde(rename = "proficientcompetencycount")]
    pub proficientcompetencycount: i32,
    /// proficientcompetencypercentage
    #[serde(rename = "proficientcompetencypercentage")]
    pub proficientcompetencypercentage: f64,
    /// proficientcompetencypercentageformatted
    #[serde(rename = "proficientcompetencypercentageformatted")]
    pub proficientcompetencypercentageformatted: String,
}

impl ToolLpDataForCourseCompetenciesPage200ResponseStatistics {
    pub fn new(canbegradedincourse: bool, canmanagecoursecompetencies: bool, competencycount: i32, leastproficient: Vec<models::CoreCompetencyReadUserEvidence200ResponseCompetenciesInner>, leastproficientcount: i32, proficientcompetencycount: i32, proficientcompetencypercentage: f64, proficientcompetencypercentageformatted: String) -> ToolLpDataForCourseCompetenciesPage200ResponseStatistics {
        ToolLpDataForCourseCompetenciesPage200ResponseStatistics {
            canbegradedincourse,
            canmanagecoursecompetencies,
            competencycount,
            leastproficient,
            leastproficientcount,
            proficientcompetencycount,
            proficientcompetencypercentage,
            proficientcompetencypercentageformatted,
        }
    }
}

