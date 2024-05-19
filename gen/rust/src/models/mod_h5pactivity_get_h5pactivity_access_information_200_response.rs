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
pub struct ModH5pactivityGetH5pactivityAccessInformation200Response {
    /// Whether the user has the capability mod/h5pactivity:addinstance allowed.
    #[serde(rename = "canaddinstance", skip_serializing_if = "Option::is_none")]
    pub canaddinstance: Option<bool>,
    /// Whether the user has the capability mod/h5pactivity:reviewattempts allowed.
    #[serde(rename = "canreviewattempts", skip_serializing_if = "Option::is_none")]
    pub canreviewattempts: Option<bool>,
    /// Whether the user has the capability mod/h5pactivity:submit allowed.
    #[serde(rename = "cansubmit", skip_serializing_if = "Option::is_none")]
    pub cansubmit: Option<bool>,
    /// Whether the user has the capability mod/h5pactivity:view allowed.
    #[serde(rename = "canview", skip_serializing_if = "Option::is_none")]
    pub canview: Option<bool>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl ModH5pactivityGetH5pactivityAccessInformation200Response {
    pub fn new() -> ModH5pactivityGetH5pactivityAccessInformation200Response {
        ModH5pactivityGetH5pactivityAccessInformation200Response {
            canaddinstance: None,
            canreviewattempts: None,
            cansubmit: None,
            canview: None,
            warnings: None,
        }
    }
}

