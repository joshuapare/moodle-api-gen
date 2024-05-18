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
pub struct GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
    /// The description of the criterion
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// The description of the criterion for markers
    #[serde(rename = "descriptionmarkers", skip_serializing_if = "Option::is_none")]
    pub descriptionmarkers: Option<String>,
    /// The id of the criterion
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The maximum score for this criterion
    #[serde(rename = "maxscore", skip_serializing_if = "Option::is_none")]
    pub maxscore: Option<f64>,
    /// The name of the criterion
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Any remarks for this criterion for the user being assessed
    #[serde(rename = "remark", skip_serializing_if = "Option::is_none")]
    pub remark: Option<String>,
    /// The current score for user being assessed
    #[serde(rename = "score", skip_serializing_if = "Option::is_none")]
    pub score: Option<f64>,
}

impl GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
    pub fn new() -> GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
        GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
            description: None,
            descriptionmarkers: None,
            id: None,
            maxscore: None,
            name: None,
            remark: None,
            score: None,
        }
    }
}

