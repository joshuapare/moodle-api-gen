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
pub struct CoreEnrolSubmitUserEnrolmentForm200Response {
    /// True if the user's enrolment was successfully updated
    #[serde(rename = "result")]
    pub result: bool,
    /// Indicates invalid form data
    #[serde(rename = "validationerror", skip_serializing_if = "Option::is_none")]
    pub validationerror: Option<bool>,
}

impl CoreEnrolSubmitUserEnrolmentForm200Response {
    pub fn new(result: bool) -> CoreEnrolSubmitUserEnrolmentForm200Response {
        CoreEnrolSubmitUserEnrolmentForm200Response {
            result,
            validationerror: None,
        }
    }
}

