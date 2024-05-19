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
pub struct ModForumGetForumAccessInformationRequest {
    /// Forum instance id.
    #[serde(rename = "forumid")]
    pub forumid: i32,
}

impl ModForumGetForumAccessInformationRequest {
    pub fn new(forumid: i32) -> ModForumGetForumAccessInformationRequest {
        ModForumGetForumAccessInformationRequest {
            forumid,
        }
    }
}

