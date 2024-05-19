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
pub struct ModFeedbackGetItems200Response {
    #[serde(rename = "items")]
    pub items: Vec<models::ModFeedbackGetItems200ResponseItemsInner>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModFeedbackGetItems200Response {
    pub fn new(items: Vec<models::ModFeedbackGetItems200ResponseItemsInner>) -> ModFeedbackGetItems200Response {
        ModFeedbackGetItems200Response {
            items,
            warnings: None,
        }
    }
}

