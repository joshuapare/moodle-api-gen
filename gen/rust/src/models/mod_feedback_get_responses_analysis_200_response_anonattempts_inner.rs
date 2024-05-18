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
pub struct ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner {
    /// Course id
    #[serde(rename = "courseid", skip_serializing_if = "Option::is_none")]
    pub courseid: Option<i32>,
    /// Completed id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Response number
    #[serde(rename = "number", skip_serializing_if = "Option::is_none")]
    pub number: Option<i32>,
    #[serde(rename = "responses", skip_serializing_if = "Option::is_none")]
    pub responses: Option<Vec<models::ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner>>,
}

impl ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner {
    pub fn new() -> ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner {
        ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner {
            courseid: None,
            id: None,
            number: None,
            responses: None,
        }
    }
}

