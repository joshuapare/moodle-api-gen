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
pub struct ModWorkshopGetAssessmentFormDefinitionRequest {
    /// Assessment id
    #[serde(rename = "assessmentid")]
    pub assessmentid: i32,
    /// The form mode (assessment or preview)
    #[serde(rename = "mode", skip_serializing_if = "Option::is_none")]
    pub mode: Option<String>,
}

impl ModWorkshopGetAssessmentFormDefinitionRequest {
    pub fn new(assessmentid: i32) -> ModWorkshopGetAssessmentFormDefinitionRequest {
        ModWorkshopGetAssessmentFormDefinitionRequest {
            assessmentid,
            mode: None,
        }
    }
}

