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
pub struct CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner {
    /// Badge id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Language
    #[serde(rename = "language", skip_serializing_if = "Option::is_none")]
    pub language: Option<String>,
    /// Badge name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Type
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<i32>,
    /// Version
    #[serde(rename = "version", skip_serializing_if = "Option::is_none")]
    pub version: Option<String>,
}

impl CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner {
    pub fn new() -> CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner {
        CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner {
            id: None,
            language: None,
            name: None,
            r#type: None,
            version: None,
        }
    }
}
