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
pub struct ModForumGetDiscussionPosts200ResponsePostsInner {
    #[serde(rename = "attachments", skip_serializing_if = "Option::is_none")]
    pub attachments: Option<Vec<models::ModForumGetDiscussionPost200ResponsePostAttachmentsInner>>,
    #[serde(rename = "author", skip_serializing_if = "Option::is_none")]
    pub author: Option<Box<models::ModForumGetDiscussionPost200ResponsePostAuthor>>,
    #[serde(rename = "capabilities", skip_serializing_if = "Option::is_none")]
    pub capabilities: Option<Box<models::ModForumGetDiscussionPost200ResponsePostCapabilities>>,
    /// charcount
    #[serde(rename = "charcount", skip_serializing_if = "Option::is_none")]
    pub charcount: Option<i32>,
    /// discussionid
    #[serde(rename = "discussionid", skip_serializing_if = "Option::is_none")]
    pub discussionid: Option<i32>,
    /// hasparent
    #[serde(rename = "hasparent", skip_serializing_if = "Option::is_none")]
    pub hasparent: Option<bool>,
    /// haswordcount
    #[serde(rename = "haswordcount", skip_serializing_if = "Option::is_none")]
    pub haswordcount: Option<bool>,
    #[serde(rename = "html", skip_serializing_if = "Option::is_none")]
    pub html: Option<Box<models::ModForumGetDiscussionPost200ResponsePostHtml>>,
    /// id
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// isdeleted
    #[serde(rename = "isdeleted", skip_serializing_if = "Option::is_none")]
    pub isdeleted: Option<bool>,
    /// isprivatereply
    #[serde(rename = "isprivatereply", skip_serializing_if = "Option::is_none")]
    pub isprivatereply: Option<bool>,
    /// message
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
    /// message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    #[serde(rename = "messageformat", skip_serializing_if = "Option::is_none")]
    pub messageformat: Option<i32>,
    #[serde(rename = "messageinlinefiles", skip_serializing_if = "Option::is_none")]
    pub messageinlinefiles: Option<Vec<models::ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>>,
    /// parentid
    #[serde(rename = "parentid", skip_serializing_if = "Option::is_none")]
    pub parentid: Option<i32>,
    /// replysubject
    #[serde(rename = "replysubject", skip_serializing_if = "Option::is_none")]
    pub replysubject: Option<String>,
    /// subject
    #[serde(rename = "subject", skip_serializing_if = "Option::is_none")]
    pub subject: Option<String>,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<models::ModForumGetDiscussionPost200ResponsePostTagsInner>>,
    /// timecreated
    #[serde(rename = "timecreated", skip_serializing_if = "Option::is_none")]
    pub timecreated: Option<i32>,
    /// timemodified
    #[serde(rename = "timemodified", skip_serializing_if = "Option::is_none")]
    pub timemodified: Option<i32>,
    /// unread
    #[serde(rename = "unread", skip_serializing_if = "Option::is_none")]
    pub unread: Option<bool>,
    #[serde(rename = "urls", skip_serializing_if = "Option::is_none")]
    pub urls: Option<Box<models::ModForumGetDiscussionPost200ResponsePostUrls>>,
    /// wordcount
    #[serde(rename = "wordcount", skip_serializing_if = "Option::is_none")]
    pub wordcount: Option<i32>,
}

impl ModForumGetDiscussionPosts200ResponsePostsInner {
    pub fn new() -> ModForumGetDiscussionPosts200ResponsePostsInner {
        ModForumGetDiscussionPosts200ResponsePostsInner {
            attachments: None,
            author: None,
            capabilities: None,
            charcount: None,
            discussionid: None,
            hasparent: None,
            haswordcount: None,
            html: None,
            id: None,
            isdeleted: None,
            isprivatereply: None,
            message: None,
            messageformat: None,
            messageinlinefiles: None,
            parentid: None,
            replysubject: None,
            subject: None,
            tags: None,
            timecreated: None,
            timemodified: None,
            unread: None,
            urls: None,
            wordcount: None,
        }
    }
}
