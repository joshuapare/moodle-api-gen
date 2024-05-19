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
pub struct ModForumUpdateDiscussionPostRequestOptionsInner {
    /// The allowed keys (value format) are:                                 pinned (bool); (only for discussions) whether to pin this discussion or not                                 discussionsubscribe (bool); whether to subscribe to the post or not                                 inlineattachmentsid (int); the draft file area id for inline attachments in the text                                 attachmentsid (int); the draft file area id for attachments
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// The value of the option.
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
}

impl ModForumUpdateDiscussionPostRequestOptionsInner {
    pub fn new() -> ModForumUpdateDiscussionPostRequestOptionsInner {
        ModForumUpdateDiscussionPostRequestOptionsInner {
            name: None,
            value: None,
        }
    }
}

