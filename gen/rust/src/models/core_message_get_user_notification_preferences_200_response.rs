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
pub struct CoreMessageGetUserNotificationPreferences200Response {
    #[serde(rename = "preferences")]
    pub preferences: Box<models::CoreMessageGetUserNotificationPreferences200ResponsePreferences>,
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::AuthEmailSignupUser200ResponseWarningsInner>>,
}

impl CoreMessageGetUserNotificationPreferences200Response {
    pub fn new(preferences: models::CoreMessageGetUserNotificationPreferences200ResponsePreferences) -> CoreMessageGetUserNotificationPreferences200Response {
        CoreMessageGetUserNotificationPreferences200Response {
            preferences: Box::new(preferences),
            warnings: None,
        }
    }
}
