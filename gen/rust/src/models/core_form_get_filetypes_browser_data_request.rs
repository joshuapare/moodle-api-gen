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
pub struct CoreFormGetFiletypesBrowserDataRequest {
    /// Allows to select All file types, does not apply with onlytypes are set.
    #[serde(rename = "allowall", skip_serializing_if = "Option::is_none")]
    pub allowall: Option<bool>,
    /// Current types that should be selected.
    #[serde(rename = "current", skip_serializing_if = "Option::is_none")]
    pub current: Option<String>,
    /// Limit the browser to the given groups and extensions
    #[serde(rename = "onlytypes", skip_serializing_if = "Option::is_none")]
    pub onlytypes: Option<String>,
}

impl CoreFormGetFiletypesBrowserDataRequest {
    pub fn new() -> CoreFormGetFiletypesBrowserDataRequest {
        CoreFormGetFiletypesBrowserDataRequest {
            allowall: None,
            current: None,
            onlytypes: None,
        }
    }
}
