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
pub struct ModLtiGetToolTypesAndProxies200Response {
    /// Limit of how many tool types to show
    #[serde(rename = "limit", skip_serializing_if = "Option::is_none")]
    pub limit: Option<i32>,
    /// Offset of tool types
    #[serde(rename = "offset", skip_serializing_if = "Option::is_none")]
    pub offset: Option<i32>,
    #[serde(rename = "proxies")]
    pub proxies: Vec<models::ModLtiGetToolTypesAndProxies200ResponseProxiesInner>,
    #[serde(rename = "types")]
    pub types: Vec<models::ModLtiGetToolTypesAndProxies200ResponseTypesInner>,
}

impl ModLtiGetToolTypesAndProxies200Response {
    pub fn new(proxies: Vec<models::ModLtiGetToolTypesAndProxies200ResponseProxiesInner>, types: Vec<models::ModLtiGetToolTypesAndProxies200ResponseTypesInner>) -> ModLtiGetToolTypesAndProxies200Response {
        ModLtiGetToolTypesAndProxies200Response {
            limit: None,
            offset: None,
            proxies,
            types,
        }
    }
}

