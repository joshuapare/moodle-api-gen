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
pub struct CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
    /// Context id
    #[serde(rename = "contextid", skip_serializing_if = "Option::is_none")]
    pub contextid: Option<i32>,
    /// Display name
    #[serde(rename = "displayname", skip_serializing_if = "Option::is_none")]
    pub displayname: Option<String>,
    /// Whether has settings
    #[serde(rename = "hassettings", skip_serializing_if = "Option::is_none")]
    pub hassettings: Option<bool>,
    /// Processor name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Whether is configured by the user
    #[serde(rename = "userconfigured", skip_serializing_if = "Option::is_none")]
    pub userconfigured: Option<i32>,
}

impl CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
    pub fn new() -> CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
        CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner {
            contextid: None,
            displayname: None,
            hassettings: None,
            name: None,
            userconfigured: None,
        }
    }
}

