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
pub struct ModBigbluebuttonbnMeetingInfoRequest {
    /// bigbluebuttonbn instance id
    #[serde(rename = "bigbluebuttonbnid")]
    pub bigbluebuttonbnid: i32,
    /// bigbluebuttonbn group id
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    /// update cache ?
    #[serde(rename = "updatecache", skip_serializing_if = "Option::is_none")]
    pub updatecache: Option<bool>,
}

impl ModBigbluebuttonbnMeetingInfoRequest {
    pub fn new(bigbluebuttonbnid: i32) -> ModBigbluebuttonbnMeetingInfoRequest {
        ModBigbluebuttonbnMeetingInfoRequest {
            bigbluebuttonbnid,
            groupid: None,
            updatecache: None,
        }
    }
}

