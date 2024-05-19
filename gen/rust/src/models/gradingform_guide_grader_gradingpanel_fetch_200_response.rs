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
pub struct GradingformGuideGraderGradingpanelFetch200Response {
    #[serde(rename = "grade")]
    pub grade: Box<models::GradingformGuideGraderGradingpanelFetch200ResponseGrade>,
    /// Does the user have a grade?
    #[serde(rename = "hasgrade")]
    pub hasgrade: bool,
    /// The template to use when rendering this data
    #[serde(rename = "templatename")]
    pub templatename: String,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl GradingformGuideGraderGradingpanelFetch200Response {
    pub fn new(grade: models::GradingformGuideGraderGradingpanelFetch200ResponseGrade, hasgrade: bool, templatename: String) -> GradingformGuideGraderGradingpanelFetch200Response {
        GradingformGuideGraderGradingpanelFetch200Response {
            grade: Box::new(grade),
            hasgrade,
            templatename,
            warnings: None,
        }
    }
}

