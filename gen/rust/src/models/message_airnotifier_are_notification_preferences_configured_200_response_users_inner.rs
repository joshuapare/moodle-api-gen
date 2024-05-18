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
pub struct MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner {
    /// 1 if the user preferences have been configured and 0 if not
    #[serde(rename = "configured", skip_serializing_if = "Option::is_none")]
    pub configured: Option<i32>,
    /// userid id
    #[serde(rename = "userid", skip_serializing_if = "Option::is_none")]
    pub userid: Option<i32>,
}

impl MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner {
    pub fn new() -> MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner {
        MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner {
            configured: None,
            userid: None,
        }
    }
}
