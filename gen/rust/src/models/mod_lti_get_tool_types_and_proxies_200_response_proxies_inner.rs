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
pub struct ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
    /// Tool proxy capabilities offered
    #[serde(rename = "capabilityoffered", skip_serializing_if = "Option::is_none")]
    pub capabilityoffered: Option<String>,
    /// Tool proxy globally unique identifier
    #[serde(rename = "guid", skip_serializing_if = "Option::is_none")]
    pub guid: Option<String>,
    /// Tool proxy id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Tool proxy name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Tool proxy registration URL
    #[serde(rename = "regurl", skip_serializing_if = "Option::is_none")]
    pub regurl: Option<String>,
    /// Tool proxy shared secret
    #[serde(rename = "secret", skip_serializing_if = "Option::is_none")]
    pub secret: Option<String>,
    /// Tool proxy services offered
    #[serde(rename = "serviceoffered", skip_serializing_if = "Option::is_none")]
    pub serviceoffered: Option<String>,
    /// Tool proxy state
    #[serde(rename = "state", skip_serializing_if = "Option::is_none")]
    pub state: Option<i32>,
    /// Tool proxy time created
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// Tool proxy modified
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// Tool proxy
    #[serde(rename = "toolproxy", skip_serializing_if = "Option::is_none")]
    pub toolproxy: Option<String>,
    /// Tool proxy consumer code
    #[serde(rename = "vendorcode", skip_serializing_if = "Option::is_none")]
    pub vendorcode: Option<String>,
}

impl ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
    pub fn new() -> ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
        ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
            capabilityoffered: None,
            guid: None,
            id: None,
            name: None,
            regurl: None,
            secret: None,
            serviceoffered: None,
            state: None,
            timecreated: None,
            timemodified: None,
            toolproxy: None,
            vendorcode: None,
        }
    }
}
