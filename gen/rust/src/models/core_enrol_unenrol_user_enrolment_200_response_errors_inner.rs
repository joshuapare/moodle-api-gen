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
pub struct CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner {
    /// The data that failed the validation
    #[serde(rename = "key", skip_serializing_if = "Option::is_none")]
    pub key: Option<String>,
    /// The error message
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
}

impl CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner {
    pub fn new() -> CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner {
        CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner {
            key: None,
            message: None,
        }
    }
}

