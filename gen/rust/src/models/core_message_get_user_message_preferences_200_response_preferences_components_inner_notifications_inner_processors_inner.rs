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
pub struct CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
    /// Display name
    #[serde(rename = "displayname", skip_serializing_if = "Option::is_none")]
    pub displayname: Option<String>,
    /// Is enabled?
    #[serde(rename = "enabled", skip_serializing_if = "Option::is_none")]
    pub enabled: Option<bool>,
    /// Is locked by admin?
    #[serde(rename = "locked", skip_serializing_if = "Option::is_none")]
    pub locked: Option<bool>,
    /// Text to display if locked
    #[serde(rename = "lockedmessage", skip_serializing_if = "Option::is_none")]
    pub lockedmessage: Option<String>,
    #[serde(rename = "loggedin", skip_serializing_if = "Option::is_none")]
    pub loggedin: Option<Box<models::CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin>>,
    #[serde(rename = "loggedoff", skip_serializing_if = "Option::is_none")]
    pub loggedoff: Option<Box<models::CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff>>,
    /// Processor name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Is configured?
    #[serde(rename = "userconfigured", skip_serializing_if = "Option::is_none")]
    pub userconfigured: Option<i32>,
}

impl CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
    pub fn new() -> CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
        CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner {
            displayname: None,
            enabled: None,
            locked: None,
            lockedmessage: None,
            loggedin: None,
            loggedoff: None,
            name: None,
            userconfigured: None,
        }
    }
}
