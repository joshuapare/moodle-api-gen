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
pub struct ModForumGetDiscussionPost200ResponsePostAuthor {
    /// fullname
    #[serde(rename = "fullname", skip_serializing_if = "Option::is_none")]
    pub fullname: Option<String>,
    #[serde(rename = "groups", skip_serializing_if = "Option::is_none")]
    pub groups: Option<Vec<models::ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner>>,
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// isdeleted
    #[serde(rename = "isdeleted", skip_serializing_if = "Option::is_none")]
    pub isdeleted: Option<bool>,
    #[serde(rename = "urls")]
    pub urls: Box<models::ModForumGetDiscussionPost200ResponsePostAuthorUrls>,
}

impl ModForumGetDiscussionPost200ResponsePostAuthor {
    pub fn new(urls: models::ModForumGetDiscussionPost200ResponsePostAuthorUrls) -> ModForumGetDiscussionPost200ResponsePostAuthor {
        ModForumGetDiscussionPost200ResponsePostAuthor {
            fullname: None,
            groups: None,
            id: None,
            isdeleted: None,
            urls: Box::new(urls),
        }
    }
}

