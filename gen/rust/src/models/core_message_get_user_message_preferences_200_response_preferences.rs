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
pub struct CoreMessageGetUserMessagePreferences200ResponsePreferences {
    #[serde(rename = "components")]
    pub components: Vec<models::CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner>,
    /// Whether all the preferences are disabled
    #[serde(rename = "disableall")]
    pub disableall: i32,
    #[serde(rename = "processors")]
    pub processors: Vec<models::CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner>,
    /// User id
    #[serde(rename = "userid")]
    pub userid: i32,
}

impl CoreMessageGetUserMessagePreferences200ResponsePreferences {
    pub fn new(components: Vec<models::CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner>, disableall: i32, processors: Vec<models::CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner>, userid: i32) -> CoreMessageGetUserMessagePreferences200ResponsePreferences {
        CoreMessageGetUserMessagePreferences200ResponsePreferences {
            components,
            disableall,
            processors,
            userid,
        }
    }
}
