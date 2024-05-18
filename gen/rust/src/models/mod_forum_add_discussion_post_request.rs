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
pub struct ModForumAddDiscussionPostRequest {
    /// new post message (html assumed if messageformat is not provided)
    #[serde(rename = "message")]
    pub message: String,
    /// message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "messageformat", skip_serializing_if = "Option::is_none")]
    pub messageformat: Option<i32>,
    #[serde(rename = "options", skip_serializing_if = "Option::is_none")]
    pub options: Option<Vec<models::ModForumAddDiscussionPostRequestOptionsInner>>,
    /// the post id we are going to reply to                                                 (can be the initial discussion post
    #[serde(rename = "postid")]
    pub postid: i32,
    /// new post subject
    #[serde(rename = "subject")]
    pub subject: String,
}

impl ModForumAddDiscussionPostRequest {
    pub fn new(message: String, postid: i32, subject: String) -> ModForumAddDiscussionPostRequest {
        ModForumAddDiscussionPostRequest {
            message,
            messageformat: None,
            options: None,
            postid,
            subject,
        }
    }
}
