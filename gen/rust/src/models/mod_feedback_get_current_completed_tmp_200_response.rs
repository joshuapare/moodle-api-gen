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
pub struct ModFeedbackGetCurrentCompletedTmp200Response {
    #[serde(rename = "feedback")]
    pub feedback: Box<models::ModFeedbackGetCurrentCompletedTmp200ResponseFeedback>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModFeedbackGetCurrentCompletedTmp200Response {
    pub fn new(feedback: models::ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) -> ModFeedbackGetCurrentCompletedTmp200Response {
        ModFeedbackGetCurrentCompletedTmp200Response {
            feedback: Box::new(feedback),
            warnings: None,
        }
    }
}

