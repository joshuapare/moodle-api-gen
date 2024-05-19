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
pub struct CoreAuthIsAgeDigitalConsentVerificationEnabled200Response {
    /// True if digital consent verification is enabled,                     false otherwise.
    #[serde(rename = "status")]
    pub status: bool,
}

impl CoreAuthIsAgeDigitalConsentVerificationEnabled200Response {
    pub fn new(status: bool) -> CoreAuthIsAgeDigitalConsentVerificationEnabled200Response {
        CoreAuthIsAgeDigitalConsentVerificationEnabled200Response {
            status,
        }
    }
}

