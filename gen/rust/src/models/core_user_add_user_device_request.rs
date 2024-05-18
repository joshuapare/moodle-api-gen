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
pub struct CoreUserAddUserDeviceRequest {
    /// the app id, usually something like com.moodle.moodlemobile
    #[serde(rename = "appid")]
    pub appid: String,
    /// the device model 'Nexus4' or 'iPad1,1' etc.
    #[serde(rename = "model")]
    pub model: String,
    /// the device name, 'occam' or 'iPhone' etc.
    #[serde(rename = "name")]
    pub name: String,
    /// the device platform 'iOS' or 'Android' etc.
    #[serde(rename = "platform")]
    pub platform: String,
    /// the app generated public key
    #[serde(rename = "publickey", skip_serializing_if = "Option::is_none")]
    pub publickey: Option<String>,
    /// the device PUSH token/key/identifier/registration id
    #[serde(rename = "pushid")]
    pub pushid: String,
    /// the device UUID
    #[serde(rename = "uuid")]
    pub uuid: String,
    /// the device version '6.1.2' or '4.2.2' etc.
    #[serde(rename = "version")]
    pub version: String,
}

impl CoreUserAddUserDeviceRequest {
    pub fn new(appid: String, model: String, name: String, platform: String, pushid: String, uuid: String, version: String) -> CoreUserAddUserDeviceRequest {
        CoreUserAddUserDeviceRequest {
            appid,
            model,
            name,
            platform,
            publickey: None,
            pushid,
            uuid,
            version,
        }
    }
}

