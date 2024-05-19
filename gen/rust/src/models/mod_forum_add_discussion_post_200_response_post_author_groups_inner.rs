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
pub struct ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// name
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "urls", skip_serializing_if = "Option::is_none")]
    pub urls: Option<Box<models::ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls>>,
}

impl ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
    pub fn new() -> ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
        ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {
            id: None,
            name: None,
            urls: None,
        }
    }
}

