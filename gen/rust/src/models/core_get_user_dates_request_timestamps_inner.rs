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
pub struct CoreGetUserDatesRequestTimestampsInner {
    /// Remove leading zero for day
    #[serde(rename = "fixday", skip_serializing_if = "Option::is_none")]
    pub fixday: Option<i32>,
    /// Remove leading zero for hour
    #[serde(rename = "fixhour", skip_serializing_if = "Option::is_none")]
    pub fixhour: Option<i32>,
    /// format string
    #[serde(rename = "format", skip_serializing_if = "Option::is_none")]
    pub format: Option<String>,
    /// unix timestamp
    #[serde(rename = "timestamp", skip_serializing_if = "Option::is_none")]
    pub timestamp: Option<i32>,
    /// The calendar type
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
}

impl CoreGetUserDatesRequestTimestampsInner {
    pub fn new() -> CoreGetUserDatesRequestTimestampsInner {
        CoreGetUserDatesRequestTimestampsInner {
            fixday: None,
            fixhour: None,
            format: None,
            timestamp: None,
            r#type: None,
        }
    }
}

