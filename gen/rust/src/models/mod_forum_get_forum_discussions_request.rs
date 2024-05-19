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
pub struct ModForumGetForumDiscussionsRequest {
    /// forum instance id
    #[serde(rename = "forumid")]
    pub forumid: i32,
    /// group id
    #[serde(rename = "groupid", skip_serializing_if = "Option::is_none")]
    pub groupid: Option<i32>,
    /// current page
    #[serde(rename = "page", skip_serializing_if = "Option::is_none")]
    pub page: Option<i32>,
    /// items per page
    #[serde(rename = "perpage", skip_serializing_if = "Option::is_none")]
    pub perpage: Option<i32>,
    /// sort by this element: numreplies, , created or timemodified
    #[serde(rename = "sortorder", skip_serializing_if = "Option::is_none")]
    pub sortorder: Option<i32>,
}

impl ModForumGetForumDiscussionsRequest {
    pub fn new(forumid: i32) -> ModForumGetForumDiscussionsRequest {
        ModForumGetForumDiscussionsRequest {
            forumid,
            groupid: None,
            page: None,
            perpage: None,
            sortorder: None,
        }
    }
}

