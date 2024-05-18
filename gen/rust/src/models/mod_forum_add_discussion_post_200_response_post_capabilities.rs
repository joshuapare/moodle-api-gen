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
pub struct ModForumAddDiscussionPost200ResponsePostCapabilities {
    /// Whether the user can post a private reply
    #[serde(rename = "canreplyprivately")]
    pub canreplyprivately: bool,
    /// Whether the user can control the read status of the post
    #[serde(rename = "controlreadstatus")]
    pub controlreadstatus: bool,
    /// Whether the user can delete the post
    #[serde(rename = "delete")]
    pub delete: bool,
    /// Whether the user can edit the post
    #[serde(rename = "edit")]
    pub edit: bool,
    /// Whether the user can export the post
    #[serde(rename = "export")]
    pub export: bool,
    /// Whether the user can reply to the post
    #[serde(rename = "reply")]
    pub reply: bool,
    /// Whether the user can self enrol into the course
    #[serde(rename = "selfenrol")]
    pub selfenrol: bool,
    /// Whether the user can split the post
    #[serde(rename = "split")]
    pub split: bool,
    /// Whether the user can view the post
    #[serde(rename = "view")]
    pub view: bool,
}

impl ModForumAddDiscussionPost200ResponsePostCapabilities {
    pub fn new(canreplyprivately: bool, controlreadstatus: bool, delete: bool, edit: bool, export: bool, reply: bool, selfenrol: bool, split: bool, view: bool) -> ModForumAddDiscussionPost200ResponsePostCapabilities {
        ModForumAddDiscussionPost200ResponsePostCapabilities {
            canreplyprivately,
            controlreadstatus,
            delete,
            edit,
            export,
            reply,
            selfenrol,
            split,
            view,
        }
    }
}
