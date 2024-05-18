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
pub struct ModLtiDeleteToolProxy200Response {
    /// Tool proxy capabilities offered
    #[serde(rename = "capabilityoffered")]
    pub capabilityoffered: String,
    /// Tool proxy globally unique identifier
    #[serde(rename = "guid")]
    pub guid: String,
    /// Tool proxy id
    #[serde(rename = "id")]
    pub id: i32,
    /// Tool proxy name
    #[serde(rename = "name")]
    pub name: String,
    /// Tool proxy registration URL
    #[serde(rename = "regurl")]
    pub regurl: String,
    /// Tool proxy shared secret
    #[serde(rename = "secret")]
    pub secret: String,
    /// Tool proxy services offered
    #[serde(rename = "serviceoffered")]
    pub serviceoffered: String,
    /// Tool proxy state
    #[serde(rename = "state")]
    pub state: i32,
    /// Tool proxy time created
    #[serde(rename = "timecreated")]
    pub timecreated: i32,
    /// Tool proxy modified
    #[serde(rename = "timemodified")]
    pub timemodified: i32,
    /// Tool proxy
    #[serde(rename = "toolproxy")]
    pub toolproxy: String,
    /// Tool proxy consumer code
    #[serde(rename = "vendorcode")]
    pub vendorcode: String,
}

impl ModLtiDeleteToolProxy200Response {
    pub fn new(capabilityoffered: String, guid: String, id: i32, name: String, regurl: String, secret: String, serviceoffered: String, state: i32, timecreated: i32, timemodified: i32, toolproxy: String, vendorcode: String) -> ModLtiDeleteToolProxy200Response {
        ModLtiDeleteToolProxy200Response {
            capabilityoffered,
            guid,
            id,
            name,
            regurl,
            secret,
            serviceoffered,
            state,
            timecreated,
            timemodified,
            toolproxy,
            vendorcode,
        }
    }
}
