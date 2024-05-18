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
pub struct ModForumPrepareDraftAreaForPostRequest {
    /// Area to prepare: attachment or post.
    #[serde(rename = "area")]
    pub area: String,
    /// The draft item id to use. 0 to generate one.
    #[serde(rename = "draftitemid", skip_serializing_if = "Option::is_none")]
    pub draftitemid: Option<i32>,
    #[serde(rename = "filestokeep", skip_serializing_if = "Option::is_none")]
    pub filestokeep: Option<Vec<models::ModForumPrepareDraftAreaForPostRequestFilestokeepInner>>,
    /// Post to prepare the draft area for.
    #[serde(rename = "postid")]
    pub postid: i32,
}

impl ModForumPrepareDraftAreaForPostRequest {
    pub fn new(area: String, postid: i32) -> ModForumPrepareDraftAreaForPostRequest {
        ModForumPrepareDraftAreaForPostRequest {
            area,
            draftitemid: None,
            filestokeep: None,
            postid,
        }
    }
}

